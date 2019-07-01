package com.expedia.homeaway.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.annotation.AnimRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.util.Pair;

import com.expedia.homeaway.App;
import com.expedia.homeaway.R;
import com.expedia.homeaway.manager.NetworkConnectivityObserver;

import java.util.LinkedList;
import java.util.List;

import io.reactivex.annotations.NonNull;


public class BaseAppCompatActivity extends AppCompatActivity implements NetworkConnectivityObserver.NetworkConnectivityChangeListener {
    //Activity stack, holding only class not the activity references (No leak issue)
    private static final LinkedList<Class> activityClassStack = new LinkedList<>();
    private final SparseArray<Long> viewClickTimeStampSparseArray = new SparseArray<>();
    protected ProgressDialog progressDialog;
    private ViewGroup contentRootView; //root inflated view as base
    private View activityRootView; //activity layout inflated inside contentRootView.
    private Handler uiHandler;

    /**
     * @param clazz Activity class to be check in stack
     * @return true if Activity class is present in current stack.
     */
    public static boolean isActivityClassInStack(Class clazz) {
        int index = activityClassStack.indexOf(clazz);
        return index != -1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        preOnCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        uiHandler = new Handler(Looper.getMainLooper());
        if (shouldOverrideRootView()) {
            super.setContentView(R.layout.base_activity_abstract_layout);
            contentRootView = findViewById(R.id.base_activity_content_layout);
        } else {
            contentRootView = findViewById(android.R.id.content); //default android one.
        }
        if (shouldOverrideDefaultPendingTransition()) {
            overridePendingTransition(getPreEnterAnim(), getPreExitAnim());
        }

        initProgressDialog();//Init common progress dialog.
        onActivityCreatedPushToStack();
    }


    public Handler getUiHandler() {
        return uiHandler;
    }

    private Animation getBlinkAnimation() {
        Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(1000);
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE);
        animation.setRepeatMode(Animation.REVERSE);
        return animation;
    }

    @SuppressWarnings("SameReturnValue")
    protected boolean shouldOverrideDefaultPendingTransition() {
        return true;
    }

    private void onActivityCreatedPushToStack() { //stack
        Class peek = activityClassStack.peek();
        Class clazz = getClass();
        if (peek == null || peek != clazz) { /*Avoid double push of same, its hack, may fail in case of multiple instances*/
            activityClassStack.push(clazz);
            //log.debug("activityClassStack pushed "+clazz.getSimpleName());
        }
    }

    @Override
    public final void setContentView(@LayoutRes int layoutResID) {
        if (shouldOverrideRootView()) { //Override default method and add child layout in content container layout.
            activityRootView = getLayoutInflater().inflate(layoutResID, contentRootView, true); //last param must be true to add it as child.
        } else {
            super.setContentView(layoutResID);
            activityRootView = contentRootView.getChildAt(0);
        }

    }


    @Override
    public void setContentView(View view) {
        if (shouldOverrideRootView()) {
            contentRootView.addView(view);
        } else {
            super.setContentView(view);
        }
        activityRootView = view;
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        if (shouldOverrideRootView()) {
            contentRootView.addView(view, params);
        } else {
            super.setContentView(view, params);
        }
        activityRootView = view;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        App.getDelegate().getNetworkConnectivityObserver().registerCallbackListener(this);

    }

    @Override
    protected void onStop() {
        super.onStop();
        App.getDelegate().getNetworkConnectivityObserver().unregisterCallbackListener(this);
    }

    @Override
    protected void onDestroy() {
        hideProgressDialog();
        super.onDestroy();
        onActivityDestroyedPopStack();
    }

    private void onActivityDestroyedPopStack() {
        Class peek = activityClassStack.peek();
        Class clazz = getClass();
        if (peek != null) {
            if (peek == clazz) {
                Class popped = activityClassStack.pop();
                //log.debug("activityClassStack popped " + popped.getSimpleName());
            } else {
                int index = activityClassStack.indexOf(clazz);
                if (index != -1) {
                    Class removed = activityClassStack.remove(index);
                    //log.debug("activityClassStack removed " + removed.getSimpleName());
                }
            }
        }
        /*if (activityClassStack.size() == 0) {
            ModuleApp.getDelegate().onAppClosingCallback();
        }*/
    }


    public void hideSoftKeyboard() {
        try {
            InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
            //Find the currently focused view, so we can grab the correct window token from it.
            View view = getCurrentFocus();
            //If no view currently has focus, create a new one, just so we can grab a window token from it
            if (view == null) {
                view = new View(this);
            }
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        } catch (Exception ignore) {
        }
    }


    /**
     * Method invoked before onCreate super call (Android)
     *
     * @param savedInstanceState bundle
     */
    protected void preOnCreate(Bundle savedInstanceState) {
    }

    /**
     * @return true (Default) to use our custom abstract root layout,
     * false to use direct setContent View one with android default.
     */
    @SuppressWarnings("SameReturnValue")
    protected boolean shouldOverrideRootView() {
        return true;
    }

    /**
     * @return true (Default) if toolbar required, otherwise false to hide.
     */
    protected boolean toolbarNeeded() {
        return true;
    }

    /**
     * Preventing multiple clicks.
     *
     * @param view        need to prevent multiple clicks on.
     * @param delayMillis millis delta to validate multiple click events
     */
    @SuppressWarnings("SameParameterValue")
    protected boolean isTooEarlyMultipleClicks(@NonNull View view, int delayMillis) {
        long lastClickTime = viewClickTimeStampSparseArray.get(view.getId(), 0L);
        long timeStamp = System.currentTimeMillis();
        if (lastClickTime + delayMillis > timeStamp) {
            return true;
        }
        viewClickTimeStampSparseArray.put(view.getId(), timeStamp);
        return false;
    }

    /**
     * Preventing multiple clicks. (validate within 1000 millis)
     *
     * @param view need to prevent multiple clicks on.
     */
    protected boolean isTooEarlyMultipleClicks(@NonNull View view) {
        return isTooEarlyMultipleClicks(view, 1000); //default 1 sec
    }

    /**
     * Show short Toast
     *
     * @param message string message
     */
    public final void showShortToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * Show short Toast
     *
     * @param message string message
     */
    public final void showLongToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    /**
     * Show short Toast
     *
     * @param resId string resource id for message
     */
    public final void showShortToast(@StringRes int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    }

    /**
     * Show short Toast
     *
     * @param resId string resource id for message
     */
    public final void showLongToast(@StringRes int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_LONG).show();
    }

    /**
     * To allow automatic shared element handling above lollipop.
     *
     * @return true in case automatic shared element activity transition required, otherwise false.
     */
    @SuppressWarnings("SameReturnValue")
    protected boolean isAutoSharedElementSupported() {
        return false;
    }

    /**
     * Prepare shared element pair list which are having transition name attribute defined in Layout xml.
     *
     * @param view  Parent/View
     * @param pairs list of pairs.
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void recursiveCreatePairFromSharedElement(@NonNull View view, @NonNull List<Pair<View, String>> pairs) {
        if (!TextUtils.isEmpty(view.getTransitionName())) {
            pairs.add(Pair.create(view, view.getTransitionName()));
        }
        if (view instanceof ViewGroup) {
            ViewGroup parent = (ViewGroup) view;
            for (int i = parent.getChildCount() - 1; i >= 0; i--) {
                final View child = parent.getChildAt(i);
                recursiveCreatePairFromSharedElement(child, pairs);
            }
        }
    }

    /**
     * Progress Dialog Init
     */
    private void initProgressDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(getString(R.string.progress_dialog_default_message));
    }

    /**
     * Show Progress Dialog
     *
     * @param message     message to show
     * @param cancellable dialog cancellable
     */
    @SuppressWarnings("SameParameterValue")
    public void showProgressDialog(String message, boolean cancellable) {
        try {
            if (progressDialog != null) {
                if (!TextUtils.isEmpty(message)) {
                    progressDialog.setMessage(message);
                }
                progressDialog.setCancelable(cancellable);
                if (!progressDialog.isShowing()) {
                    progressDialog.show();
                }
            }
        } catch (Throwable ignore) {
        }
    }

    //Progress Dialog only with message
    @SuppressWarnings("SameParameterValue")
    public void showProgressDialog(String message) {
        showProgressDialog(message, false);
    }

    public void showDefaultProgressDialog() {
        showProgressDialog(null);
    }

    //Hide progress dialog.
    public void hideProgressDialog() {
        try {
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
        } catch (Throwable ignore) {
        }
    }

    /**
     * finish Activity with transitions
     */
    public void finishWithTransition() {
        finish();
    }

    /**
     * Utility method to check internet connection in activity
     *
     * @return Internet connectivity flag
     */
    public final boolean isInternetAvailable() {
        return App.getDelegate().getNetworkConnectivityObserver().isInternetAvailable();
    }

    public @AnimRes
    int getPreEnterAnim() {
        return R.anim.anim_enter_from_right;
    }

    public @AnimRes
    int getPreExitAnim() {
        return R.anim.anim_exit_to_left;
    }

    public @AnimRes
    int getPostEnterAnim() {
        return R.anim.anim_enter_from_left;
    }

    public @AnimRes
    int getPostExitAnim() {
        return R.anim.anim_exit_to_right;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Check if we need app minimize on the right side
     *
     * @return Flag to
     */
    protected boolean needAppMinimizeInHeader() {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    /**
     * App minimise callback for handling UI and other behavior based on specific activities.
     */
    protected void onAppMinimize() {
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void onInternetConnectivityChanged(boolean internetAvailable) {
        internetConnectivityChanged(internetAvailable);
    }

    /**
     * Callback for the activity which can be used to change activity specific behavior
     *
     * @param internetAvailable flag for internet connectivity
     */
    public void internetConnectivityChanged(boolean internetAvailable) {
    }

}

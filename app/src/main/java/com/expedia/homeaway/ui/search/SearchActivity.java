package com.expedia.homeaway.ui.search;

import android.os.Bundle;

import androidx.appcompat.widget.SearchView;

import com.expedia.homeaway.R;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.ui.BaseAppCompatActivity;
import com.expedia.homeaway.ui.placesListing.PlacesListingActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchActivity extends BaseAppCompatActivity implements SearchViewInterface {

    @BindView(R.id.searchView)
    SearchView searchView;

    private String TAG = "SearchActivity";
    SearchPlacePresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);
        ButterKnife.bind(this);

        setupMVP();
        setupViews();

    }


    private void setupMVP() {
        mainPresenter = new SearchPlacePresenter(this);
    }

    private void setupViews() {
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(true);
        searchView.setIconified(false);
        searchView.requestFocusFromTouch();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                getPlacesList(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                return false;
            }
        });
    }

    private void getPlacesList(String query) {
        if (isInternetAvailable()) {
            showProgressDialog(getString(R.string.progress_dialog_default_message));
            mainPresenter.getPlaces(query);
        } else {
            showLongToast("No internet Connection");
        }

    }


    @Override
    public void showToast(String str) {
        showLongToast(str);
    }

    @Override
    public void displayPlaces(SearchPlacesResponse placesResponse) {
        hideProgressDialog();
        if (placesResponse != null && placesResponse.getMeta() != null && placesResponse.getMeta().getCode() == 200) {
            startActivity(PlacesListingActivity.getIntent(SearchActivity.this, placesResponse.getResponse()));
        } else {
            showLongToast("Error finding places!");
        }
    }

    @Override
    public void displayError(String e) {
        hideProgressDialog();
        showToast(e);
    }


}

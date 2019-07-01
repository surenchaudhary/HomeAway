package com.expedia.homeaway.ui.search;

import android.util.Log;

import com.expedia.homeaway.BuildConfig;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.network.APIInterface;
import com.expedia.homeaway.network.places.NetworkClient;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class SearchPlacePresenter implements SearchPresenterInterface {

    SearchViewInterface seachViewInterface;
    private String TAG = "SearchPlacePresenter";
    private static final String NEAR = "Seattle,+WA";
    private static final String V = "20180401";
    private static final int LIMIT = 20;
    private String searchQuery = "";

    public SearchPlacePresenter(SearchViewInterface svi) {
        this.seachViewInterface = svi;
    }

    @Override
    public void getPlaces(String query) {
        this.searchQuery = query;
        getObservable().subscribeWith(getObserver());
    }

    public Observable<SearchPlacesResponse> getObservable() {
        return NetworkClient.getRetrofit().create(APIInterface.class)
                .getPlaces(BuildConfig.CLIENT_ID,
                        BuildConfig.CLIENT_SECRET,
                        NEAR,
                        searchQuery,
                        V,
                        LIMIT
                )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public DisposableObserver<SearchPlacesResponse> getObserver() {
        return new DisposableObserver<SearchPlacesResponse>() {

            @Override
            public void onNext(@NonNull SearchPlacesResponse placesResponse) {
                Log.d(TAG, "Response-" + placesResponse.toString());
                seachViewInterface.displayPlaces(placesResponse);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG, "Error" + e);
                e.printStackTrace();
                seachViewInterface.displayError("Error fetching Places Data");
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "Completed");
            }
        };
    }


}

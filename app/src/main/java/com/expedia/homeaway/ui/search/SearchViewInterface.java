package com.expedia.homeaway.ui.search;

import com.expedia.homeaway.models.SearchPlacesResponse;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public interface SearchViewInterface {
    void showToast(String s);

    void displayPlaces(SearchPlacesResponse placesResponse);

    void displayError(String s);
}

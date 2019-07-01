package com.expedia.homeaway.callbacks;

import com.expedia.homeaway.models.SearchPlacesResponse;

/**
 * Created by Surendra Singh on 6/30/2019.
 */
public interface OnPlaceClickListener {
    void onClick(SearchPlacesResponse.ResponseBean.VenuesBean item);
}

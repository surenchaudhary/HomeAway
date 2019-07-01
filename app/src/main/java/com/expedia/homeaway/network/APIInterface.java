package com.expedia.homeaway.network;


import com.expedia.homeaway.models.SearchPlacesResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("search/?")
    Observable<SearchPlacesResponse> getPlaces(@Query("client_id") String clientId,
                                                     @Query("client_secret") String clientSecret,
                                                     @Query("near") String near,
                                                     @Query("query") String query,
                                                     @Query("v") String v,
                                                     @Query("limit") int limit);
}

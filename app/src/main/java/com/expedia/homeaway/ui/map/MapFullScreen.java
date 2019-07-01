package com.expedia.homeaway.ui.map;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.expedia.homeaway.R;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.ui.BaseAppCompatActivity;
import com.expedia.homeaway.ui.detailscreen.DetailScreenActivity;
import com.expedia.homeaway.utils.Constants;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.List;

import butterknife.ButterKnife;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class MapFullScreen extends BaseAppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private static final String EXTRA_VENUES = "venue";
    private SearchPlacesResponse.ResponseBean venueResponse;
    private List<SearchPlacesResponse.ResponseBean.VenuesBean> venueData;
    private HashMap<Marker, SearchPlacesResponse.ResponseBean.VenuesBean> mappedData = new HashMap<>();
    private String TAG = "MapFullScreen";
    private LatLng SOURCE_LOCATION = new LatLng(Constants.SEATLE_CENTER_LAT, Constants.SEATLE_CENTER_LANG);

    public static Intent getIntent(Context context, SearchPlacesResponse.ResponseBean venueData) {
        Intent intent = new Intent(context, MapFullScreen.class);
        intent.putExtra(EXTRA_VENUES, venueData);
        return intent;
    }

    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullscreen_map_activity);
        ButterKnife.bind(this);
        venueResponse = getIntent().getParcelableExtra(EXTRA_VENUES);
        if (venueResponse != null) {
            venueData = venueResponse.getVenues();
        }
        addGoogleMap();

    }


    private void addGoogleMap() {
        // check if we have got the googleMap already
        if (googleMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map1);
            mapFragment.getMapAsync(this);
        }
    }

    private void addMarkers() {
        for (int i = 0; i < venueData.size(); i++) {
            SearchPlacesResponse.ResponseBean.VenuesBean.LocationBean locationBean = venueData.get(i).getLocation();
            Marker marker = createMarker(locationBean.getLat(), locationBean.getLng(), venueData.get(i).getName());
            mappedData.put(marker, venueData.get(i));
        }

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                SOURCE_LOCATION, 13));

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        this.googleMap = googleMap;
        if (googleMap != null) {
            googleMap.setOnMarkerClickListener(this);
            addMarkers();
            setupInfoWindowClickListeneer();
        }
    }

    private void setupInfoWindowClickListeneer() {
        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                if (marker != null && mappedData.containsKey(marker)) {
                    startActivity(DetailScreenActivity.getIntent(MapFullScreen.this, mappedData.get(marker)));
                }
            }
        });
    }

    protected Marker createMarker(double latitude, double longitude, String title) {
        return googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(latitude, longitude))
                .anchor(0.5f, 0.5f)
                .title(title)
                .icon(BitmapDescriptorFactory
                        .defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
    }
}



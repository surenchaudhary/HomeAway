package com.expedia.homeaway.ui.detailscreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.expedia.homeaway.R;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.ui.BaseAppCompatActivity;
import com.expedia.homeaway.utils.Constants;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.appbar.AppBarLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class DetailScreenActivity extends BaseAppCompatActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private static final String EXTRA_VENUES = "venue";
    private SearchPlacesResponse.ResponseBean.VenuesBean venueData;

    @BindView(R.id.toolbar1)
    Toolbar toolbar;
    @BindView(R.id.tvAddress)
    TextView tvAddress;
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.tvTotalVisits)
    TextView tvVisits;
    @BindView(R.id.tvTotalCheckins)
    TextView tvCheckins;
    @BindView(R.id.tvTips)
    TextView tvTips;
    @BindView(R.id.app_bar)
    AppBarLayout appbar;

    private String TAG = "DetailScreenActivity";
    RecyclerView.Adapter adapter;
    private LatLng SOURCE_LOCATION = new LatLng(Constants.SEATLE_CENTER_LAT, Constants.SEATLE_CENTER_LANG);
    private LatLng DESTINATION_LOCATION;


    public static Intent getIntent(Context context, SearchPlacesResponse.ResponseBean.VenuesBean venueData) {
        Intent intent = new Intent(context, DetailScreenActivity.class);
        intent.putExtra(EXTRA_VENUES, venueData);
        return intent;
    }

    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);
        ButterKnife.bind(this);
        venueData = getIntent().getParcelableExtra(EXTRA_VENUES);
        setupViews();
        bindData();
        addGoogleMap();

    }

    private void setupViews() {
        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) appbar.getLayoutParams();
        AppBarLayout.Behavior behavior = new AppBarLayout.Behavior();
        behavior.setDragCallback(new AppBarLayout.Behavior.DragCallback() {
            @Override
            public boolean canDrag(AppBarLayout appBarLayout) {
                return false;
            }
        });
        params.setBehavior(behavior);
    }

    private void bindData() {
        tvTitle.setText(venueData.getName());
        SearchPlacesResponse.ResponseBean.VenuesBean.LocationBean locationBean = venueData.getLocation();
        if (locationBean != null) {
            DESTINATION_LOCATION = new LatLng(locationBean.getLat(), locationBean.getLng());
        }
        if (locationBean != null && locationBean.getFormattedAddress().size() > 0) {
            String address = "";
            for (String addr : locationBean.getFormattedAddress()) {
                address = address + addr + "\n";
            }
            tvAddress.setText(address.replaceFirst("\n", ""));
        }

        SearchPlacesResponse.ResponseBean.VenuesBean.StatsBean statsBean = venueData.getStats();

        if (statsBean != null) {
            tvVisits.setText(statsBean.getUsersCount() + " Users visited here");
            tvCheckins.setText(statsBean.getCheckinsCount() + " Users checked-in here");
            tvTips.setText(statsBean.getTipCount() + " Tips");
        }
    }


    private void addGoogleMap() {
        // check if we have got the googleMap already
        if (googleMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
        }

    }

    private void addMarkers() {
        if (googleMap != null && SOURCE_LOCATION != null && DESTINATION_LOCATION != null) {

            LatLngBounds.Builder builder = new LatLngBounds.Builder();

            Marker markerSource = googleMap.addMarker(new MarkerOptions()
                    .position(SOURCE_LOCATION)
                    .title("Center Seattle")
                    .icon(BitmapDescriptorFactory
                            .defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

            Marker markerDestination = googleMap.addMarker(new MarkerOptions()
                    .position(DESTINATION_LOCATION)
                    .title(venueData.getName())
                    .icon(BitmapDescriptorFactory
                            .defaultMarker(BitmapDescriptorFactory.HUE_RED)));


            builder.include(markerSource.getPosition());
            builder.include(markerDestination.getPosition());
            LatLngBounds bounds = builder.build();

            int width = getResources().getDisplayMetrics().widthPixels;
            int height = getResources().getDisplayMetrics().heightPixels;
            CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds, width / 4, height / 4, 0);
            googleMap.animateCamera(cu);

           /* googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
                    DESTINATION_LOCATION, 13));*/

        }
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
        }

    }
}


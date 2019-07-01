package com.expedia.homeaway.ui.placesListing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.expedia.homeaway.R;
import com.expedia.homeaway.callbacks.OnPlaceClickListener;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.ui.BaseAppCompatActivity;
import com.expedia.homeaway.ui.detailscreen.DetailScreenActivity;
import com.expedia.homeaway.ui.map.MapFullScreen;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class PlacesListingActivity extends BaseAppCompatActivity implements OnPlaceClickListener {

    private static final String EXTRA_VENUES = "venues";
    private SearchPlacesResponse.ResponseBean placesData;

    @BindView(R.id.rvPlaces)
    RecyclerView rvPlaces;

    @BindView(R.id.fabMap)
    FloatingActionButton fabMap;
    private String TAG = "PlacesListingActivity";
    RecyclerView.Adapter adapter;

    public static Intent getIntent(Context context, SearchPlacesResponse.ResponseBean placesResponse) {
        Intent intent = new Intent(context, PlacesListingActivity.class);
        intent.putExtra(EXTRA_VENUES, placesResponse);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);
        ButterKnife.bind(this);
        placesData = getIntent().getParcelableExtra(EXTRA_VENUES);
        setupViews();
    }


    private void setupViews() {
        rvPlaces.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterPlaces(placesData.getVenues(), PlacesListingActivity.this);
        rvPlaces.setAdapter(adapter);
    }

    @OnClick(R.id.fabMap)
    void onFabMapClick() {
        startActivity(MapFullScreen.getIntent(PlacesListingActivity.this, placesData));
    }

    @Override
    public void onClick(SearchPlacesResponse.ResponseBean.VenuesBean item) {
        startActivity(DetailScreenActivity.getIntent(PlacesListingActivity.this, item));

    }
}


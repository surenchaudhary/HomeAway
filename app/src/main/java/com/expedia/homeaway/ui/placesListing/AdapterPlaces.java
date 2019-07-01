package com.expedia.homeaway.ui.placesListing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.expedia.homeaway.R;
import com.expedia.homeaway.callbacks.OnPlaceClickListener;
import com.expedia.homeaway.models.SearchPlacesResponse;
import com.expedia.homeaway.utils.Constants;
import com.expedia.homeaway.utils.Utils;

import java.util.List;

/**
 * Created by Surendra Singh on 7/1/2019.
 */
public class AdapterPlaces extends RecyclerView.Adapter<AdapterPlaces.PlacesHolder> {

    List<SearchPlacesResponse.ResponseBean.VenuesBean> placesList;
    Context context;
    OnPlaceClickListener onPlaceClickListener;

    public AdapterPlaces(List<SearchPlacesResponse.ResponseBean.VenuesBean> placeList, Context context) {
        this.placesList = placeList;
        this.context = context;
        if (context instanceof OnPlaceClickListener) {
            onPlaceClickListener = (OnPlaceClickListener) context;
        }

    }

    @Override
    public PlacesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_places, parent, false);
        PlacesHolder placesHolder = new PlacesHolder(v);
        return placesHolder;
    }

    @Override
    public void onBindViewHolder(PlacesHolder holder, int position) {

        holder.tvTitle.setText(placesList.get(position).getName());
        List<SearchPlacesResponse.ResponseBean.VenuesBean.CategoriesBean> category = placesList.get(position).getCategories();
        if (category != null && category.size() > 0) {
            holder.tvCategory.setText(category.get(0).getShortName());

            SearchPlacesResponse.ResponseBean.VenuesBean.CategoriesBean.IconBean iconBean = category.get(0).getIcon();
            if (iconBean != null) {
                Glide.with(holder.ivPlace.getContext()).
                        load(iconBean.getPrefix() + iconBean.getSuffix())
                        .placeholder(R.mipmap.ic_launcher_round)
                        .into(holder.ivPlace);
            }
        }
        SearchPlacesResponse.ResponseBean.VenuesBean.LocationBean location = placesList.get(position).getLocation();
        if (location != null) {
            holder.tvDistance.setText(Utils.getDistance(Constants.SEATLE_CENTER_LAT, Constants.SEATLE_CENTER_LANG,
                    location.getLat(), location.getLng()) + " mile");
        } else {
            holder.tvDistance.setText("--");
        }

    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public class PlacesHolder extends RecyclerView.ViewHolder {

        TextView tvTitle, tvCategory, tvDistance;
        ImageView ivPlace;

        public PlacesHolder(View v) {
            super(v);
            tvTitle = (TextView) v.findViewById(R.id.tvTitle);
            tvCategory = (TextView) v.findViewById(R.id.tvCategory);
            tvDistance = (TextView) v.findViewById(R.id.tvDistance);
            ivPlace = (ImageView) v.findViewById(R.id.ivPlacePicture);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onPlaceClickListener != null) {
                        onPlaceClickListener.onClick(placesList.get(getAdapterPosition()));
                    }
                }
            });
        }
    }
}
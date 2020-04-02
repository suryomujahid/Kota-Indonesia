package com.example.kotaindonesia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewCityAdapter extends RecyclerView.Adapter<CardViewCityAdapter.CardViewViewHolder> {
    private Context context;
    private OnItemClickCallback onItemClickCallback;
    private Activity activity;
    private ArrayList<City> listCity;
    void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }
//    public CardViewCityAdapter(Context context){
//        this.context = context;
//    }
    public CardViewCityAdapter(ArrayList<City> list){
        this.listCity = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_city, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        City city = listCity.get(position);
        Glide.with(holder.itemView.getContext())
                .load(city.getPhoto())
                .into(holder.imgPhoto);
            holder.tvName.setText(city.getName());
            holder.tvPop.setText(city.getPopulation());
            holder.tvProvince.setText(city.getProvince());
            holder.btnMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listCity.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listCity.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        City kota;
        ImageView imgPhoto;
        TextView tvName, tvPop, tvDetail, tvProvince;
        Button btnMore, btnLocation;
        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPop = itemView.findViewById(R.id.tv_item_pop);
            tvProvince = itemView.findViewById(R.id.tv_item_province);
            btnMore = itemView.findViewById(R.id.btn_more);
            btnLocation = itemView.findViewById(R.id.btn_location);

        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(City data);
    }
}

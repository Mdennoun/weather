package com.weather.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.weather.R;
import com.weather.model.Weather;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WeatherAdapter  extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {

    private List<Weather> weatherList = new ArrayList<>();

    private ItemClickListener itemClickListener;

    public void setWeatherList(List<Weather> weatherList) {
        this.weatherList = weatherList;
        notifyDataSetChanged();
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.weather_list_cel, viewGroup, false);
        return new WeatherViewHolder(view);
    }

    @Override public void onBindViewHolder(@NonNull WeatherViewHolder weatherViewHolder, int i) {
        Weather weather = weatherList.get(i);
        weatherViewHolder.nameTv.setText(Float.toString(weather.getTemperature().getSol()));
        weatherViewHolder.idTv.setText(Float.toString(weather.getHumidite().get2m()));
        Glide.with(weatherViewHolder.itemView).load("https://www.wallpaperup.com/uploads/wallpapers/2013/03/14/52086/dec60201a1cb72b01f284966942dc7d0.jpg").into(weatherViewHolder.pictureImv);
        if (itemClickListener != null) {
            Log.d("test","test");
            //weatherViewHolder.itemView.setOnClickListener(v -> itemClickListener.onClick(weather));
        }
    }

    @Override public int getItemCount() {
        return weatherList != null ? weatherList.size() : 0;
    }

    class WeatherViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.item_weather_picture_imv)
        ImageView pictureImv;
        @BindView(R.id.item_weather_name_tv)
        TextView nameTv;
        @BindView(R.id.item_weather_id_tv) TextView idTv;

        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface ItemClickListener {
        void onClick(Weather weather);
    }
}

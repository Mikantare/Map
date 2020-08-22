package com.example.map.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.map.R;

public class adapter extends RecyclerView.Adapter<adapter.CountryViewHolder> {

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class CountryViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewCardCountry;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewCardCountry = itemView.findViewById(R.id.textViewCardCountry);
        }
    }
}

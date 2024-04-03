package com.example.navdrawerrizzal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_list_team extends RecyclerView.Adapter<adapter_list_team.dataViewHolder> {
    private List<data_list_team> dataList;

    public adapter_list_team(List<data_list_team> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public dataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View dataView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_team, parent, false);
        return new dataViewHolder(dataView);
    }

    @Override
    public void onBindViewHolder(@NonNull dataViewHolder holder, int position) {
        data_list_team dataListTeam = dataList.get(position);
        holder.imageView.setImageResource(dataListTeam.getImageView());
        holder.textView.setText(dataListTeam.getTextView());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class dataViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public dataViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}

package com.example.navdrawerrizzal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter_leaderboard extends RecyclerView.Adapter<adapter_leaderboard.leaderboardViewHolder> {

    private List<data_leaderboard> leaderboardsList;

    public adapter_leaderboard(List<data_leaderboard> leaderboardsList) {
        this.leaderboardsList = leaderboardsList;
    }

    @NonNull
    @Override
    public leaderboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View leaderboardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_leaderboard,parent,false);
        return new leaderboardViewHolder(leaderboardView);
    }

    @Override
    public void onBindViewHolder(@NonNull leaderboardViewHolder holder, int position) {
        data_leaderboard dataLeaderboard = leaderboardsList.get(position);
        holder.imgClub.setImageResource(dataLeaderboard.getImgClub());
        holder.txtPOS.setText(dataLeaderboard.getTxtPOS());
        holder.txtClub.setText((dataLeaderboard.getTxtClub()));
        holder.txtPL.setText(dataLeaderboard.getTxtPL());
        holder.txtGD.setText(dataLeaderboard.getTxtGD());
        holder.txtPTS.setText(dataLeaderboard.getTxtPTS());
    }

    @Override
    public int getItemCount() {
        return leaderboardsList.size();
    }

    public static class leaderboardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgClub;
        TextView txtPOS;
        TextView txtClub;
        TextView txtPL;
        TextView txtGD;
        TextView txtPTS;

        public leaderboardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgClub = itemView.findViewById(R.id.imgClub);
            txtPOS = itemView.findViewById(R.id.txtPOS);
            txtClub = itemView.findViewById(R.id.txtClub);
            txtPL = itemView.findViewById(R.id.txtPL);
            txtGD = itemView.findViewById(R.id.txtGD);
            txtPTS = itemView.findViewById(R.id.txtPTS);
        }
    }
}


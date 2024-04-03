package com.example.navdrawerrizzal.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerrizzal.R;
import com.example.navdrawerrizzal.adapter_leaderboard;
import com.example.navdrawerrizzal.data_leaderboard;

import java.util.ArrayList;
import java.util.List;


public class leaderboardFragment extends Fragment {

    private List<data_leaderboard>leaderboardList;
    private RecyclerView homeRecyclerView;
    private adapter_leaderboard adapterList;

    public leaderboardFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_leaderboard, container, false);

        leaderboardList = generateLeaderboards();

        homeRecyclerView = rootView.findViewById(R.id.recylerview);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterList = new adapter_leaderboard(leaderboardList);
        homeRecyclerView.setAdapter(adapterList);

        return rootView;
    }

    private List<data_leaderboard> generateLeaderboards(){
        List<data_leaderboard> dataLeaderboards = new ArrayList<>();
        dataLeaderboards.add(new data_leaderboard(R.drawable.manchestercity, "1","Manchester City", "38","61","89"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.arsenal, "2","Arsenal", "38","45","84"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.manchesterunited, "3","Manchester United", "38","15","75"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.newcastleunited, "4","Newcastle United", "38","35","71"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.liverpool, "5","Liverpool", "38","28","67"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.brighton, "6","Brighton", "38","19","62"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.astonvilla, "7","Aston Villa", "38","5","61"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.tottenhamhotspur, "8","Tottenham Hotspur", "38","7","60"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.brentford, "9","Brentford", "38","12","59"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.fulham, "10","Fulham", "38","2","52"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.crystalpalace, "11","Crystal Palace", "38","-9","45"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.chelsea, "12","Chelsea", "38","-9","42"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.wolverhamptonwanderers, "13","Wolves", "38","-27","41"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.westhamunited, "14","West Ham", "38","-13","40"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.bournemouth, "15","Bournemouth", "38","-34","39"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.nottinghamforest, "16","Nottingham Forest", "38","-30","38"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.everton, "17","Everton", "38","-23","36"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.leicestercity, "18","Leicester City", "38","-17","34"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.leeds, "19","Leeds", "38","-30","31"));
        dataLeaderboards.add(new data_leaderboard(R.drawable.southampton, "20","Southhampton", "38","-37","25"));
        return dataLeaderboards;
    }
}
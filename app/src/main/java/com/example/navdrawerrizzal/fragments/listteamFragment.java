package com.example.navdrawerrizzal.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawerrizzal.R;
import com.example.navdrawerrizzal.adapter_list_team;
import com.example.navdrawerrizzal.data_list_team;

import java.util.ArrayList;
import java.util.List;

public class listteamFragment extends Fragment {
    private List<data_list_team> dataList;
    private RecyclerView homeRecyclerView;
    private adapter_list_team adapterlist;

    public listteamFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_recycler_list_team, container, false);

        dataList = generateDataList();

        homeRecyclerView = rootView.findViewById(R.id.recylerview);
        homeRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapterlist = new adapter_list_team(dataList);
        homeRecyclerView.setAdapter(adapterlist);

        return rootView;
    }

    private List<data_list_team> generateDataList() {
        List<data_list_team> dataItems = new ArrayList<>();
        dataItems.add(new data_list_team(R.drawable.arsenal,"Arsenal"));
        dataItems.add(new data_list_team(R.drawable.astonvilla,"Aston Villa"));
        dataItems.add(new data_list_team(R.drawable.bournemouth,"Bournemouth"));
        dataItems.add(new data_list_team(R.drawable.brentford,"Brentford"));
        dataItems.add(new data_list_team(R.drawable.brighton,"Brighton"));
        dataItems.add(new data_list_team(R.drawable.chelsea,"Chelsea"));
        dataItems.add(new data_list_team(R.drawable.crystalpalace,"Crystal Palace"));
        dataItems.add(new data_list_team(R.drawable.everton,"Everton"));
        dataItems.add(new data_list_team(R.drawable.fulham,"Fulham"));
        dataItems.add(new data_list_team(R.drawable.leeds,"Leeds"));
        dataItems.add(new data_list_team(R.drawable.leicestercity,"Leicester"));
        dataItems.add(new data_list_team(R.drawable.liverpool,"Liverpool"));
        dataItems.add(new data_list_team(R.drawable.manchestercity,"Manchester City"));
        dataItems.add(new data_list_team(R.drawable.manchesterunited,"Manchester United"));
        dataItems.add(new data_list_team(R.drawable.newcastleunited,"Newscastle United"));
        dataItems.add(new data_list_team(R.drawable.nottinghamforest,"Nottingham Forest"));
        dataItems.add(new data_list_team(R.drawable.southampton,"Southampton"));
        dataItems.add(new data_list_team(R.drawable.tottenhamhotspur,"Tottenham Hotspur"));
        dataItems.add(new data_list_team(R.drawable.westhamunited,"Westham United"));
        dataItems.add(new data_list_team(R.drawable.wolverhamptonwanderers,"Wolves"));
        return dataItems;
    }
}

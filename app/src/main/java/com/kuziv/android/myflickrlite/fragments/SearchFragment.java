package com.kuziv.android.myflickrlite.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kuziv.android.myflickrlite.R;
import com.kuziv.android.myflickrlite.adapters.ImageAdapter;

/**
 * Created by kuziv on 2/27/2016.
 */
public class SearchFragment extends Fragment {

    private RecyclerView recyclerView;

    public SearchFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mock_search_fragment, container, false);

        //initializing RecyclerView
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        //creating LinearLayoutManager and setting it to RecyclerView
        LinearLayoutManager linearManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearManager);

        //setting RVAdapter
        recyclerView.setAdapter(new ImageAdapter(getContext()));

        return view;
    }

}

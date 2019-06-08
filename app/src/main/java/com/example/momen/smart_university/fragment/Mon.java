package com.example.momen.smart_university.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.momen.smart_university.R;
import com.example.momen.smart_university.Adapter.table_adapter;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Mon extends Fragment {


    public Mon() {
        // Required empty public constructor
    }
    List<String> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sun, container, false);
        list=new ArrayList<>();
        list.add("Network");
        list.add("Data Structure");
        list.add("Computer Science");
        list.add("image processing");
        list.add("OPP");
        list.add("Math");

        RecyclerView recyclerView=view.findViewById(R.id.Recycler_table);
        table_adapter table_adapter = new table_adapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(table_adapter);

        return view;
    }

}

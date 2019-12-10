package com.example.scoutingappframework;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.scoutingappframework.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CoverTab extends Fragment {


    public CoverTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cover_tab, container, false);
    }

}

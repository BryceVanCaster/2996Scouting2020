package com.example.scoutingappframework;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class EndgameTab extends Fragment {

    public static final String[] endPositionArray = {"Please Select", "1", "2", "3"};
    private static Spinner endLevelSpinner;
    private static View view;

    public EndgameTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_endgame_tab, container, false);
        getSpinnerValues(view);
        sets(view);
        return view;
    }

    public void getSpinnerValues(View view) {
        endLevelSpinner = view.findViewById(R.id.endLevelSpinner);
        endLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivity.endLevel = endLevelSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void sets(View view) {
        endLevelSpinner = view.findViewById(R.id.endLevelSpinner);
        ArrayAdapter<CharSequence> endLevelSpinnerAdapter = new ArrayAdapter<CharSequence>(this.getActivity(), android.R.layout.simple_spinner_item, endPositionArray);
        endLevelSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        endLevelSpinner.setAdapter(endLevelSpinnerAdapter);
    }

}

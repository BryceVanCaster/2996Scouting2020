package com.example.scoutingappframework;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeleopTab extends Fragment {

    private static TextView teleScore1ScoreTextView;
    private static Button teleScore1PlusButton;
    private static Button teleScore1MinusButton;
    private static TextView teleScore2ScoreTextView;
    private static Button teleScore2PlusButton;
    private static Button teleScore2MinusButton;

    public TeleopTab() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teleop_tab, container, false);
    }

}
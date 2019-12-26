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
    private static TextView teleScore3ScoreTextView;
    private static Button teleScore3PlusButton;
    private static Button teleScore3MinusButton;
    private static TextView teleScore4ScoreTextView;
    private static Button teleScore4PlusButton;
    private static Button teleScore4MinusButton;
    private static View view;

    public TeleopTab() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_teleop_tab, container, false); //creates view
        sets(view);
        return view;
    }

    public void enterData (final View view) {
        //This enters all variable data from this class into the mainActivity variables except
        //for the score variables. Those are entered through the mainActivity button methods
    }

    public void sets(final View view) {
        //This sets all text boxes and score values to the saved variables so they don't
        //Disappear when switching between tabs
        //If statements are for setting the text boxes to 0 initially, otherwise they begin blank
        teleScore1ScoreTextView = view.findViewById(R.id.teleScore1ScoreTextView);
        if (MainActivity.teleScore1Num == 0) {
            teleScore1ScoreTextView.setText("0");
        } else {
            teleScore1ScoreTextView.setText(MainActivity.teleScore1Text);
        }

        teleScore2ScoreTextView = view.findViewById(R.id.teleScore2ScoreTextView);
        if (MainActivity.teleScore2Num == 0) {
            teleScore2ScoreTextView.setText("0");
        } else {
            teleScore2ScoreTextView.setText(MainActivity.teleScore2Text);
        }

        teleScore3ScoreTextView = view.findViewById(R.id.teleScore3ScoreTextView);
        if (MainActivity.teleScore3Num == 0) {
            teleScore3ScoreTextView.setText("0");
        } else {
            teleScore3ScoreTextView.setText(MainActivity.teleScore3Text);
        }

        teleScore4ScoreTextView = view.findViewById(R.id.teleScore4ScoreTextView);
        if (MainActivity.teleScore4Num == 0) {
            teleScore4ScoreTextView.setText("0");
        } else {
            teleScore4ScoreTextView.setText(MainActivity.teleScore4Text);
        }
    }

    public static void reset (View view) {
        //Resets all variables and text boxes, called by submitButton in EndgameTab class
        teleScore1ScoreTextView = view.findViewById(R.id.teleScore1TextView);
        teleScore1ScoreTextView.setText("");
        MainActivity.teleScore1Num = 0;
        MainActivity.teleScore1Text = "";

        teleScore2ScoreTextView = view.findViewById(R.id.teleScore2TextView);
        teleScore2ScoreTextView.setText("");
        MainActivity.teleScore2Num = 0;
        MainActivity.teleScore2Text = "";

        teleScore3ScoreTextView = view.findViewById(R.id.teleScore3TextView);
        teleScore3ScoreTextView.setText("");
        MainActivity.teleScore3Num = 0;
        MainActivity.teleScore3Text = "";

        teleScore4ScoreTextView = view.findViewById(R.id.teleScore4TextView);
        teleScore4ScoreTextView.setText("");
        MainActivity.teleScore4Num = 0;
        MainActivity.teleScore4Text = "";
    }
}
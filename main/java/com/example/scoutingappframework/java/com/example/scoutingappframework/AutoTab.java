package com.example.scoutingappframework;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class AutoTab extends Fragment {


    public static String[] startLevelArray = {"Please Select", "1", "2", "3", "Did Not Move"};

    private static Spinner startLevelSpinner;
    private static EditText scoutNameEditText;
    private static EditText teamNumEditText;
    private static TextView autoScore1TextView;
    private static Button autoScore1MinusButton;
    private static Button autoScore1PlusButton;
    private static TextView autoScore2TextView;
    private static Button autoScore2MinusButton;
    private static Button autoScore2PlusButton;
    private static View view;



    public AutoTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = inflater.inflate(R.layout.fragment_auto_tab, container, false); //creates view
        sets(view);
        getSpinnerValues(view);
        enterData(view);

        return view;
    }


    public void getSpinnerValues(View view) {
        startLevelSpinner = view.findViewById(R.id.startLevelSpinner);
        startLevelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivity.startingLevel = startLevelSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public static void enterData(View view) {
        //This enters all variable data from this class into the mainActivity variables except
        //for the score variables. Those are entered through the mainActivity button methods
        scoutNameEditText = view.findViewById(R.id.scout_name_editText);
        teamNumEditText = view.findViewById(R.id.team_number_editText);
        MainActivity.scoutName = scoutNameEditText.getText().toString();
        MainActivity.teamNum = teamNumEditText.getText().toString();
    }

    public void sets (View view) {
        //This sets text boxes and scores to the saved variables so they don't disappear when
        //switching between tabs
        //If statements for setting text views to 0 initially, otherwise they start blank
        scoutNameEditText = view.findViewById(R.id.scout_name_editText);
        scoutNameEditText.setText(MainActivity.scoutName);

        teamNumEditText = view.findViewById(R.id.team_number_editText);
        teamNumEditText.setText(MainActivity.teamNum);

        autoScore1TextView = view.findViewById(R.id.score1_textView);
        if (MainActivity.autoScore1Num == 0) {
            autoScore1TextView.setText("0");
        } else {
            autoScore1TextView.setText(MainActivity.autoScore1Text);
        }

        autoScore2TextView = view.findViewById(R.id.score2_textView);
        if (MainActivity.autoScore2Num == 0) {
            autoScore2TextView.setText("0");
        } else {
            autoScore2TextView.setText(MainActivity.autoScore2Text);
        }
        //This does the spinner stuff
        startLevelSpinner = view.findViewById(R.id.startLevelSpinner);
        ArrayAdapter<CharSequence> startLevelSpinnerAdapter = new ArrayAdapter<CharSequence>(this.getActivity(), android.R.layout.simple_spinner_item, startLevelArray);
        startLevelSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        startLevelSpinner.setAdapter(startLevelSpinnerAdapter);
    }

    public static void reset (View view) {
        //Resets all textViews and textBoxes and variables, called from submitButton in EndgameTab
        scoutNameEditText = view.findViewById(R.id.scout_name_editText);
        scoutNameEditText.setText("");

        teamNumEditText = view.findViewById(R.id.team_number_editText);
        teamNumEditText.setText("");

        autoScore1TextView = view.findViewById(R.id.score1_textView);
        autoScore1TextView.setText("");

        autoScore2TextView = view.findViewById(R.id.score2_textView);
        autoScore2TextView.setText("");

        MainActivity.teamNum = "";
        MainActivity.scoutName = "";
        MainActivity.autoScore1Num = 0;
        MainActivity.autoScore1Text = "";
        MainActivity.autoScore2Num = 0;
        MainActivity.autoScore2Text = "";
    }
}
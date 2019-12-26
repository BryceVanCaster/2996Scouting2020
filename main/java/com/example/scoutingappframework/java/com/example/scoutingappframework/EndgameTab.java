package com.example.scoutingappframework;


import android.os.Bundle;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class EndgameTab extends Fragment {

    public static final String[] endPositionArray = {"Please Select", "1", "2", "3"};
    private static Spinner endLevelSpinner;
    private static EditText finalScore;
    //private static EditText commentBox;
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
        submitButton(view);
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

    public static void reset(View view) {
        endLevelSpinner.setSelection(0);
        EditText finalScore = view.findViewById(R.id.finalScoreEditText);
        finalScore.setText("");
        MainActivity.finalScore = "";
        EditText comments = view.findViewById(R.id.commentsEditText);
        comments.setText("");
        MainActivity.comments = "";

    }

    public void sets(View view) {
        endLevelSpinner = view.findViewById(R.id.endLevelSpinner);
        ArrayAdapter<CharSequence> endLevelSpinnerAdapter = new ArrayAdapter<CharSequence>(this.getActivity(), android.R.layout.simple_spinner_item, endPositionArray);
        endLevelSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        endLevelSpinner.setAdapter(endLevelSpinnerAdapter);
    }

    public void enterData(View view) {
        //finalScore = view.findViewById(R.id.finalScoreEditText);
        //MainActivity.finalScore = String.valueOf(finalScore.getText());

        EditText commentBox = view.findViewById(R.id.commentsEditText);
        MainActivity.comments = commentBox.getText().toString();

        //AutoTab.enterData(view);

    }

    public void submitButton(final View view) {
        Button submitButton = view.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enterData(view);
                MainActivity.setDataArray();
                try {
                    writeData();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void finalSubmit(View view) {
        /*int numEmpty = 0;
        for (int i = 0; i < MainActivity.all_data_array.length; i++) {
            if (MainActivity.all_data_array[i].equals("") || MainActivity.all_data_array[i].equals("Please Select")) {
                numEmpty++;
            }
        }
        if (numEmpty > 0) {
            //int duration = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(getContext(),"You haven't filled everything out", duration);
            //toast.show();
        }
        else {
            //int duration = Toast.LENGTH_SHORT;
            //Toast toast = Toast.makeText(getContext(), "Submitting...", duration);
            //toast.show();
        }*/
    }
    public void writeData() throws FileNotFoundException {

        final File path = getActivity().getApplicationContext().getExternalFilesDir(null);
        final File file = new File(path, "data.txt");

        final FileOutputStream output_stream = new FileOutputStream(file, true);
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(output_stream));

        for (int i = 0; i < MainActivity.all_data_array.length; i++) {
            if (i != 12) {
                writer.print(MainActivity.all_data_array[i] + ",");
            } else {
                writer.print(MainActivity.all_data_array[i]);
            }
        }
        writer.println();
        //prints to Android/data/com.example.scoutingappframework/files
        writer.flush();
        writer.close();

    }

}

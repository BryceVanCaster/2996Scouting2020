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

    private static EditText scoutNameEditText;
    private static EditText teamNumEditText;
    private static TextView autoScore1TextView;
    private static Button autoScore1MinusButton;
    private static Button autoScore1PlusButton;
    private static TextView autoScore2TextView;
    private static Button autoScore2MinusButton;
    private static Button autoScore2PlusButton;


    public AutoTab() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.fragment_auto_tab, container, false);
    }

}

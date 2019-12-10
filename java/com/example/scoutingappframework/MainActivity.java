package com.example.scoutingappframework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.scoutingappframework.R;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    //Auto Array Variables
    public static String scoutName = "";
    public static String teamNum = "";
    public static String matchNum = "";
    public static String autoScore1Text = "";
    public static String autoScore2Text = "";
    public static String startingLevel = "";
    public static int autoScore1Num = 0;
    public static int autoScore2Num = 0;

    //Teleop Array Variables
    public static String teleScore1Text;
    public static int teleScore1Num;
    public static String teleScore2Text;
    public static int teleScore2Num;
    public static String teleScore3Text;
    public static int teleScore3Num;
    public static String teleScore4Text;
    public static int teleScore4Num;

    //Endgame Array Variables
    public static String endLevel;

    //All data array
    public static String[] all_data_array = new String[11];




    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem CoverTab, AutoTab, TeleopTab, EndgameTab;
    public PagerAdapter PageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        CoverTab = (TabItem) findViewById((R.id.TabOne));
        AutoTab = (TabItem) findViewById((R.id.TabTwo));
        TeleopTab = (TabItem) findViewById((R.id.TabThree));
        EndgameTab = (TabItem) findViewById((R.id.TabFour));
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        PageAdapter = new com.example.scoutingappframework.PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(PageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0) {
                    PageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 1) {
                    PageAdapter.notifyDataSetChanged();
                }
                else if (tab.getPosition() == 2) {
                    PageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }
    public void autoScore1MinusButton(View view) {
        TextView autoScore1TV = findViewById(R.id.score1_textView);
        if (autoScore1Num > 0) {
            autoScore1Num--;
            autoScore1Text = String.valueOf(autoScore1Num);
            autoScore1TV.setText(autoScore1Text);
        }
    }

    public void autoScore1PlusButton(View view){
        TextView autoScore1TV = findViewById(R.id.score1_textView);
        autoScore1Num ++;
        autoScore1Text = String.valueOf(autoScore1Num);
        autoScore1TV.setText(autoScore1Text);
    }

    public void autoScore2MinusButton(View view) {
        TextView autoScore2TV = findViewById(R.id.score2_textView);
        if (autoScore2Num > 0) {
            autoScore2Num--;
            autoScore2Text = String.valueOf(autoScore2Num);
            autoScore2TV.setText(autoScore2Text);
        }
    }

    public void autoScore2PlusButton(View view){
        TextView autoScore2TV = findViewById(R.id.score2_textView);
        autoScore2Num ++;
        autoScore2Text = String.valueOf(autoScore2Num);
        autoScore2TV.setText(autoScore2Text);
    }

    public void teleScore1MinusButton(View view) {
        TextView teleScore1TV = findViewById(R.id.teleScore1ScoreTextView);
        if (teleScore1Num > 0) {
            teleScore1Num--;
            teleScore1Text = String.valueOf(teleScore1Num);
            teleScore1TV.setText(teleScore1Text);
        }
    }

    public void teleScore1PlusButton(View view) {
        TextView teleScore1TV = findViewById(R.id.teleScore1ScoreTextView);
        teleScore1Num++;
        teleScore1Text = String.valueOf(teleScore1Num);
        teleScore1TV.setText(teleScore1Text);
    }

    public void teleScore2MinusButton(View view) {
        TextView teleScore2TV = findViewById(R.id.teleScore2ScoreTextView);
        if (teleScore2Num > 0) {
            teleScore2Num--;
            teleScore2Text = String.valueOf(teleScore2Num);
            teleScore2TV.setText(teleScore2Text);
        }
    }

    public void teleScore2PlusButton(View view) {
        TextView teleScore2TV = findViewById(R.id.teleScore2ScoreTextView);
        teleScore2Num++;
        teleScore2Text = String.valueOf(teleScore2Num);
        teleScore2TV.setText(teleScore2Text);
    }

    public void teleScore3MinusButton(View view) {
        TextView teleScore3TV = findViewById(R.id.teleScore3ScoreTextView);
        if (teleScore3Num > 0) {
            teleScore3Num--;
            teleScore3Text = String.valueOf(teleScore3Num);
            teleScore3TV.setText(teleScore3Text);
        }
    }

    public void teleScore3PlusButton(View view) {
        TextView teleScore3TV = findViewById(R.id.teleScore3ScoreTextView);
        teleScore3Num++;
        teleScore3Text = String.valueOf(teleScore3Num);
        teleScore3TV.setText(teleScore3Text);
    }

    public void teleScore4MinusButton(View view) {
        TextView teleScore4TV = findViewById(R.id.teleScore4ScoreTextView);
        if (teleScore4Num > 0) {
            teleScore4Num--;
            teleScore4Text = String.valueOf(teleScore4Num);
            teleScore4TV.setText(teleScore4Text);
        }
    }

    public void teleScore4PlusButton(View view) {
        TextView teleScore4TV = findViewById(R.id.teleScore4ScoreTextView);
        teleScore4Num++;
        teleScore4Text = String.valueOf(teleScore4Num);
        teleScore4TV.setText(teleScore4Text);
    }


    //Set all data array
    public static void setDataArray() {
        all_data_array[0] = scoutName;
        all_data_array[1] = teamNum;
        all_data_array[2] = matchNum;
        all_data_array[3] = startingLevel;
        all_data_array[4] = autoScore1Text;
        all_data_array[5] = autoScore2Text;
        all_data_array[6] = teleScore1Text;
        all_data_array[7] = teleScore2Text;
        all_data_array[8] = teleScore3Text;
        all_data_array[9] = teleScore4Text;
        all_data_array[10] = endLevel;
    }
}

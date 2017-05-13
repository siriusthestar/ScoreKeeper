package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Team A.
     */
    int scoreTeamA = 0;

    public void addRunForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    int outsTeamA = 0;

    public void addOutForTeamA(View v) {
        outsTeamA = outsTeamA + 1;
        displayOutsForTeamA(outsTeamA);
    }

    /**
     * Team B.
     */
    int scoreTeamB = 0;

    public void addRunForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    int outsTeamB = 0;

    public void addOutForTeamB(View v) {
        outsTeamB = outsTeamB + 1;
        displayOutsForTeamB(outsTeamB);
    }


    /**
     * Reset.
     */

    public void resetScore (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        outsTeamA = 0;
        outsTeamB = 0;
        displayOutsForTeamA(outsTeamA);
        displayOutsForTeamB(outsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given outs for Team A.
     */
    public void displayOutsForTeamA(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_outs);
        scoreView.setText(String.valueOf(outs));
    }
    /**
     * Displays the given outs for Team B
     */
    public void displayOutsForTeamB(int outs) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_outs);
        scoreView.setText(String.valueOf(outs));
    }
}
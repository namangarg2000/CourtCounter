package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_TeamA = 0;
    int score_TeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teamA_1(View view){
        score_TeamA+=1;
        displayForTeamA(score_TeamA);
    }
    public void teamA_2(View view){
        score_TeamA+=2;
        displayForTeamA(score_TeamA);
    }
    public void teamA_3(View view){
        score_TeamA+=3;
        displayForTeamA(score_TeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    //For team B

    public void teamB_1(View view){
        score_TeamB+=1;
        displayForTeamB(score_TeamB);
    }
    public void teamB_2(View view){
        score_TeamB+=2;
        displayForTeamB(score_TeamB);
    }
    public void teamB_3(View view){
        score_TeamB+=3;
        displayForTeamB(score_TeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
package com.example.android.football;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int flypigscore = 0;
    int fbreakrules = 0;
    int angrybirdscore = 0;
    int abreakrules = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Resetall(View view) {
        flypigscore = 0;
        fbreakrules = 0;
        angrybirdscore = 0;
        abreakrules = 0;
        displayForflypigscore(flypigscore);
        displayForfbreakrules(fbreakrules);
        displayForabreakrules(abreakrules);
        displayForangrybirdscore(angrybirdscore);
    }

    /**
     * flypig
     * \
     */
    public void add6pointsforfp(View view) {
        flypigscore = flypigscore + 6;
        displayForflypigscore(flypigscore);
    }

    public void add3pointsforfp(View view) {
        flypigscore = flypigscore + 3;
        displayForflypigscore(flypigscore);
    }

    public void add2pointsforfp(View view) {
        flypigscore = flypigscore + 2;
        displayForflypigscore(flypigscore);
    }

    public void add1pointsforfp(View view) {
        flypigscore = flypigscore + 1;
        displayForflypigscore(flypigscore);
    }

    public void fpbreakrules(View view) {
        fbreakrules = fbreakrules + 1;
        displayForfbreakrules(fbreakrules);
    }

    /**
     * Displays the given score for flypig
     */
    public void displayForflypigscore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_flypig_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * break the rules for flypig
     */
    public void displayForfbreakrules(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fbreak_rules);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * angry bird
     */
    public void add6pointsforab(View view) {
        angrybirdscore = angrybirdscore + 6;
        displayForangrybirdscore(angrybirdscore);
    }

    public void add3pointsforab(View view) {
        angrybirdscore = angrybirdscore + 3;
        displayForangrybirdscore(angrybirdscore);
    }

    public void add2pointsforab(View view) {
        angrybirdscore = angrybirdscore + 2;
        displayForangrybirdscore(angrybirdscore);
    }

    public void add1pointsforab(View view) {
        angrybirdscore = angrybirdscore + 1;
        displayForangrybirdscore(angrybirdscore);
    }

    public void abreakrules(View view) {
        abreakrules = abreakrules + 1;
        displayForabreakrules(abreakrules);
    }

    /**
     * Displays the given score for angrybird.
     */
    public void displayForangrybirdscore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_angrybird_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * break the rules for angrybird
     */
    public void displayForabreakrules(int score) {
        TextView scoreView = (TextView) findViewById(R.id.abreak_rules);
        scoreView.setText(String.valueOf(score));
    }


}

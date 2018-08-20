package com.example.dobrev.belotcountingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScoreKeeperActivity extends AppCompatActivity {

    ScoreKeeperFragment mScoreKeeperFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_keeper);

        mScoreKeeperFragment = ScoreKeeperFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mScoreKeeperFragment)
                .commit();
    }
}

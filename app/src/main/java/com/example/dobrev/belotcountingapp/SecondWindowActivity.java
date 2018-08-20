package com.example.dobrev.belotcountingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondWindowActivity extends AppCompatActivity {

    SecondWindowFragment mSecondWindowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_window);

        mSecondWindowFragment = SecondWindowFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mSecondWindowFragment)
                .commit();
    }
}

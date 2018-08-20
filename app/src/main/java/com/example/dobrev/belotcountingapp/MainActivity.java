package com.example.dobrev.belotcountingapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MainFragment mMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainFragment = MainFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mMainFragment)
                .commit();
    }
}

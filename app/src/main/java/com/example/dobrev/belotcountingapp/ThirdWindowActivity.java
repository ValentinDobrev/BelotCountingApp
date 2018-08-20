package com.example.dobrev.belotcountingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdWindowActivity extends AppCompatActivity {

    ThirdWindowFragment mThirdWindowFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_window);

        mThirdWindowFragment = ThirdWindowFragment.newInstance();

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content, mThirdWindowFragment)
                .commit();
    }
}

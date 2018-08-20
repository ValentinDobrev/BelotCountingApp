package com.example.dobrev.belotcountingapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class ScoreKeeperFragment extends Fragment {

    ListView mListViewFirstTeam;
    ListView mListViewSecondTeam;
    EditText mEditTextT1;
    EditText mEditTextT2;
    Button mButton1;
    Button mButton2;

    public ScoreKeeperFragment() {
        // Required empty public constructor
    }

    ArrayAdapter<Integer> mAdapter1;
    ArrayAdapter<Integer> mAdapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_score_keeper, container, false);

        mListViewFirstTeam = view.findViewById(R.id.List_View_Team1);
        mListViewSecondTeam = view.findViewById(R.id.List_View_Team2);
        mEditTextT1 = view.findViewById(R.id.EditText_F1);
        mEditTextT2 = view.findViewById(R.id.EditText_F2);
        mButton1 = view.findViewById(R.id.Button1);
        mButton2 = view.findViewById(R.id.Button2);

        mAdapter1 = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1);
        mAdapter2 = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1);

        mListViewFirstTeam.setAdapter(mAdapter1);
        mListViewSecondTeam.setAdapter(mAdapter2);

        mAdapter1.add(0);
        mAdapter2.add(0);

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newScoreString = mEditTextT1.getText().toString();
                int newScore = Integer.parseInt(newScoreString);
                int lastScore = mAdapter1.getItem(mAdapter1.getCount()-1);
                mAdapter1.add(newScore + lastScore);
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newScoreString = mEditTextT2.getText().toString();
                int newScore = Integer.parseInt(newScoreString);
                int lastScore = mAdapter2.getItem(mAdapter2.getCount()-1);
                mAdapter2.add(newScore + lastScore);
            }
        });


        return view;
    }

    public static ScoreKeeperFragment newInstance(){
        return new ScoreKeeperFragment();
    }

}

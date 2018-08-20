package com.example.dobrev.belotcountingapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;


public class SecondWindowFragment extends Fragment {


    private Button mCreatePlayer;
    public ArrayList<String> players = new ArrayList<>();
    EditText mEditText;

    public SecondWindowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_window, container, false);

        mCreatePlayer = view.findViewById(R.id.createPlayer_Button);
        mCreatePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEditText = view.findViewById(R.id.playerName_EditText);
                String newName = mEditText.getText().toString();
                players.add(newName);
            }
        });

        return view;
    }

    public static SecondWindowFragment newInstance(){
        return new SecondWindowFragment();
    }
}

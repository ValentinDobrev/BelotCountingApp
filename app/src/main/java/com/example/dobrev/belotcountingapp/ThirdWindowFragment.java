package com.example.dobrev.belotcountingapp;


import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

import static android.support.constraint.Constraints.TAG;


public class ThirdWindowFragment extends SecondWindowFragment {


    private Button mStartGame;
    Spinner mSpinnerTeamOnePlayerOne;
    Spinner mSpinnerTeamOnePlayerTwo;
    Spinner mSpinnerTeamTwoPlayerOne;
    Spinner mSpinnerTeamTwoPlayerTwo;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public ThirdWindowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third_window, container, false);




        // Create a new user with a first and last name


        players.add("Gosho");
        players.add("Tosho");
        players.add("Pesho");
        players.add("Mesho");


//
//        // Add a new document with a generated ID
//        db.collection("users")
//                .add(players)
//                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
//                    @Override
//                    public void onSuccess(DocumentReference documentReference) {
//                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
//                    }
//                })
//                .addOnFailureListener(new OnFailureListener() {
//                    @Override
//                    public void onFailure(@NonNull Exception e) {
//                        Log.w(TAG, "Error adding document", e);
//                    }
//                });





        mStartGame = view.findViewById(R.id.StartGame_Button);
        mStartGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ScoreKeeperActivity.class);
                startActivity(i);
            }
        });

//        ArrayList<String> players = new ArrayList<>();


        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, players);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mSpinnerTeamOnePlayerOne = view.findViewById(R.id.Spinner_Team1_Player1);
        mSpinnerTeamOnePlayerOne.setAdapter(adapter);

        mSpinnerTeamOnePlayerTwo = view.findViewById(R.id.Spinner_Team1_Player2);
        mSpinnerTeamOnePlayerTwo.setAdapter(adapter);

        mSpinnerTeamTwoPlayerOne = view.findViewById(R.id.Spinner_Team2_Player1);
        mSpinnerTeamTwoPlayerOne.setAdapter(adapter);

        mSpinnerTeamTwoPlayerTwo = view.findViewById(R.id.Spinner_Team2_Player2);
        mSpinnerTeamTwoPlayerTwo.setAdapter(adapter);

        return view;
    }

    public static ThirdWindowFragment newInstance(){
        return new ThirdWindowFragment();
    }

}

package com.example.dobrev.belotcountingapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
//import android.support.v4.app.Fragment;
import android.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FirstWindowFragment extends Fragment {

    private Button mChoosePlayersButton;

    public FirstWindowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first_window, container, false);

        mChoosePlayersButton = view.findViewById(R.id.choosePlayers_Button);
        mChoosePlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ThirdWindowActivity.class);
                startActivity(i);
            }
        });

        return view;
    }

    public static FirstWindowFragment newInstance(){
        return new FirstWindowFragment();
    }
}

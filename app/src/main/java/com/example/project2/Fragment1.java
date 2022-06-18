package com.example.project2;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {
    androidx.appcompat.widget.Toolbar toolbar;

    public Fragment1 () {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_1, container, false);

        Button btn5 = rootView.findViewById(R.id.btn5);


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getActivity(),second.class);
                startActivity(intent5);
                return;

            }
        });

        return rootView;
    }
}
package com.ajayam.p30_practice.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.ajayam.p30_practice.R;


public class FragmentOne extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button btn_one = view.findViewById(R.id.btn_one);

        makeNotification(btn_one);

        return view;
    }

    public void makeNotification(Button btn_one) {
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "this is fragment button cliecked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
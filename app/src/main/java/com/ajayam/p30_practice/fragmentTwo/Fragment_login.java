package com.ajayam.p30_practice.fragmentTwo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ajayam.p30_practice.R;

public class Fragment_login extends Fragment {

    View view;
    TextView register_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_login2, container, false);

        register_btn = view.findViewById(R.id.register_btn);

        goRegister(register_btn);

        // Inflate the layout for this fragment
        return view;
    }

    public void goRegister(TextView register_btn) {
        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout_tow, new Fragment_register());
                fragmentTransaction.commit();
            }
        });
    }
}
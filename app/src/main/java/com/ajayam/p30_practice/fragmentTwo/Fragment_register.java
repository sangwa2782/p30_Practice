package com.ajayam.p30_practice.fragmentTwo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ajayam.p30_practice.R;


public class Fragment_register extends Fragment {

    View view;
    TextView login_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_register2, container, false);

        login_btn = view.findViewById(R.id.login_btn);

        goLogin(login_btn);




        return view;
    }









    public void goLogin(TextView login_btn){
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getParentFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frameLayout_tow, new Fragment_login());
                fragmentTransaction.commit();
            }
        });
    }
}
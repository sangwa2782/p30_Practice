package com.ajayam.p30_practice.fragmentTwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ajayam.p30_practice.R;

public class MainActivityTwo extends AppCompatActivity {

    FrameLayout frameLayout_tow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        frameLayout_tow = findViewById(R.id.frameLayout_tow);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout_tow, new Fragment_login());
        fragmentTransaction.commit();

    }
}
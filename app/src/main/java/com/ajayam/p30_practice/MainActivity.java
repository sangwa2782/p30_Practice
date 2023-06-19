package com.ajayam.p30_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ajayam.p30_practice.fragment.FragmentOne;

public class MainActivity extends AppCompatActivity {

    FrameLayout framelayout_one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        framelayout_one = findViewById(R.id.framelayout_one);

        attachFragment();


    }

    public void attachFragment() {
//      Create refrence form fragment manager
        FragmentManager fragmentManager = getSupportFragmentManager();

//      for getting object from fragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//      All the methods declared on FragmentTransaction object, such as .add(), .attach() etc.
        fragmentTransaction.add(R.id.framelayout_one, new FragmentOne());
        fragmentTransaction.commit();


//        method chaining
//        getSupportFragmentManager().beginTransaction().add(R.id.framelayout_one, new FragmentOne()).commit();
    }
}
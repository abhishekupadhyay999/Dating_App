package com.example.dating_app_lucky;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class Home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.replace(R.id.container, new Post_Frag());

        ft.commit();
    }
}
package com.example.notesapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.notesapp.fragments.composeFragment;
import com.example.notesapp.fragments.homeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        final FragmentManager manager = getSupportFragmentManager();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        Fragment fragmentHome;
                        fragmentHome = new homeFragment();
                        manager.beginTransaction().replace(R.id.fragmentArea,fragmentHome).commit();
                    case R.id.compose:
                        Fragment composeFragment;
                        composeFragment = new composeFragment();
                        manager.beginTransaction().replace(R.id.fragmentArea, composeFragment).commit();
                        return true;
                    default: return true;
                }

            }
        });
    }
}

package com.example.androserv2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment = new HomeFragment();
    SettingsFragment settingsFragment = new SettingsFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    RedeemFragment redeemFragment = new RedeemFragment();

    TextView main_sliderVal;
    Slider main_slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(R.layout.action_bar);



        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();


        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                if (item.getItemId() == R.id.home) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                    return true;
                }
                if (item.getItemId() == R.id.profile) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, profileFragment).commit();
                    return true;
                }
                if (item.getItemId() == R.id.settings) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, settingsFragment).commit();
                    return true;
                }
                if (item.getItemId() == R.id.redeem) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, redeemFragment).commit();
                    return true;
                }

                return false;
            }
        });

    }


}
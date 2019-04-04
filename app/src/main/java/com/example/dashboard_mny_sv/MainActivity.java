package com.example.dashboard_mny_sv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bttm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment()).commit();

//        initTransactionInfo();
    }

//    private void initTransactionInfo(){
//
//        initRecyclerView();
//    }
//    private void initRecyclerView(){
//
//    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){
                        case R.id.nav_account:
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.fragment_container, new AccountFragment()).commit();

                            break;
                        case R.id.nav_settings:
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.fragment_container, new SettingsFragment()).commit();

                            break;
                        case R.id.nav_home:
//                            selectedFragment = new HomeFragment();
//                            break;
                            getSupportFragmentManager().beginTransaction()
                                    .replace(R.id.fragment_container, new HomeFragment()).commit();

                        default:
                            selectedFragment = new HomeFragment();
                            break;
                    }

                    return true;
                }
            };
}

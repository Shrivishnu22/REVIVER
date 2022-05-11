package com.huawei.reviver;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    ActionFragment actionFragment = new ActionFragment();
    TrackerFragment trackerFragment = new TrackerFragment();
    AccountFragment accountFragment = new AccountFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home)
                    getSupportFragmentManager().beginTransaction().replace(R.id.NullContainer,homeFragment).commit();
                if (item.getItemId() == R.id.action)
                    getSupportFragmentManager().beginTransaction().replace(R.id.NullContainer,actionFragment).commit();
                if (item.getItemId() == R.id.tracker)
                    getSupportFragmentManager().beginTransaction().replace(R.id.NullContainer,trackerFragment).commit();
                if (item.getItemId() == R.id.account)
                    getSupportFragmentManager().beginTransaction().replace(R.id.NullContainer,accountFragment).commit();
                return true;
            }
        });
    }
}
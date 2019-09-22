package com.example.septtest02.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.septtest02.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        BottomNavigationView main_bottom_nav=(BottomNavigationView)findViewById(R.id.main_bottomNavigationView);
        main_bottom_nav.getMenu().getItem(2).setChecked(true);
        main_bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_game:
                        Intent intent_game=new Intent(TasksActivity.this,MainActivity.class);
                        startActivity(intent_game);
                        return true;
                    case R.id.menu_timer:
                        Intent intent_timer=new Intent(TasksActivity.this,TimerActivity.class);
                        startActivity(intent_timer);
                        return true;
                    case R.id.menu_tasks:
                        return true;
                    case R.id.menu_user:
                        Intent intent_user=new Intent(TasksActivity.this,UserActivity.class);
                        startActivity(intent_user);
                        return true;
                }
                return true;
            }
        });
    }
}

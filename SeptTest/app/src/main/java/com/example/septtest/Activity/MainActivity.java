package com.example.septtest.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.septtest.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            /*switch (item.getItemId()) {
                case R.id.action_game:
                    mTextMessage.setText(R.string.title_game);
                    return true;
                case R.id.action_timer:
                    mTextMessage.setText(R.string.title_timer);
                   // Intent intent=new Intent(MainActivity.this,TimerActivity.class);
                   // startActivity(intent);
                    return true;
                case R.id.action_tasks:
                    mTextMessage.setText(R.string.title_tasks);
                    return true;
                case R.id.action_user:
                    mTextMessage.setText(R.string.title_user);
                    return true;
            }*/
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }



}

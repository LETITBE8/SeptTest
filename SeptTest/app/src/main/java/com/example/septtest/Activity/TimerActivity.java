package com.example.septtest.Activity;

import android.os.Build;
import android.os.Bundle;

import com.example.septtest.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Timer;

public class TimerActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.action_game:
                    mTextMessage.setText(R.string.title_game);
                    return true;
                case R.id.action_timer:
                    mTextMessage.setText(R.string.title_timer);
                    return true;
                case R.id.action_tasks:
                    mTextMessage.setText(R.string.title_tasks);
                    return true;
                case R.id.action_user:
                    mTextMessage.setText(R.string.title_user);
                    return true;
            }
            return false;
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //Toolbar
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar_timer);
        toolbar.inflateMenu(R.menu.toolbar_menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_favorite:
                        Toast.makeText(TimerActivity.this,"Favorited",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.action_search:
                        Toast.makeText(TimerActivity.this,"Searched",Toast.LENGTH_SHORT).show();
                        return  true;

                }
                return true;
            }
        });
    }

}

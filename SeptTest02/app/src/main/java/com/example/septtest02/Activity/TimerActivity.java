package com.example.septtest02.Activity;
//import android.support.v7.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.septtest02.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TimerActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        View view = getWindow().getDecorView();
        BottomNavigationView main_bottom_nav=(BottomNavigationView)findViewById(R.id.main_bottomNavigationView);

        //set the bottom representing the page appear selected
        main_bottom_nav.getMenu().getItem(1).setChecked(true);


        //inflate the toolbar menu

        getSupportActionBar().hide();
      //  MenuInflater inflater=getMenuInflater();
       // inflater.inflate(R.id.timer_toolbar, );
       Toolbar toolbar=(Toolbar) view.findViewById(R.id.timer_toolbar_id);

       //set the button of turning back
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
//        toolbar.setTitle("Title");
//        toolbar.setSubtitle("SubTitle");
//              setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.drawable.ic_launcher_foreground);


        if(toolbar==null)
        {
            Log.d("TimerActivity", "toolbar is null");
        }else
        {
            Log.d("TimerActivity","right");
        }

        toolbar.inflateMenu(R.menu.toolbar);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_tb_favorite:
                        Toast.makeText(TimerActivity.this,"Favorite",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_tb_search:
                        Toast.makeText(TimerActivity.this,"Search",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.menu_tb_settings:
                        Toast.makeText(TimerActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                        return true;
                }
                return true;
            }
        });

        //turn back in toolbar
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TimerActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        //switch to other pages
        main_bottom_nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.menu_game:
                        Intent intent_game=new Intent(TimerActivity.this,MainActivity.class);
                        startActivity(intent_game);
                        return true;
                    case R.id.menu_timer:
                        return true;
                    case R.id.menu_tasks:
                        Intent intent_tasks=new Intent(TimerActivity.this,TasksActivity.class);
                        startActivity(intent_tasks);
                        return true;
                    case R.id.menu_user:
                        Intent intent_user=new Intent(TimerActivity.this,UserActivity.class);
                        startActivity(intent_user);
                        return true;
                }
                return true;
            }
        });
    }
}

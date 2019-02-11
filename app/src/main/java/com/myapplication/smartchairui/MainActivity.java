package com.myapplication.smartchairui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.myapplication.smartchairui.fragment.fifthfragment;
import com.myapplication.smartchairui.fragment.firstfragment;
import com.myapplication.smartchairui.fragment.fourthfragment;
import com.myapplication.smartchairui.fragment.secondfragment;
import com.myapplication.smartchairui.fragment.thirdfragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        Fragment fragment = null;
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                fragment = new firstfragment();
                break;
                case R.id.navigation_dashboard:
                fragment =  new secondfragment();
                break;
                case R.id.navigation_notifications:
                fragment = new thirdfragment();
                break;
                case R.id.navigation_feedback:
                    fragment = new fourthfragment();
                    break;
                case R.id.navigation_contactus:
                    fragment = new fifthfragment();
                    break;
            }
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame,fragment)
                    .commit();
            return true;


        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame, new firstfragment())
                .commit();


    }

}

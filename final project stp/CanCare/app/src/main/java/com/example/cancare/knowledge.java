package com.example.cancare;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class knowledge extends AppCompatActivity {

    Fragment range=new ranges(); //initialize new ranges fragment
    Fragment open=new OpenningFragment();//initialize new OpenningFragment fragment
    Fragment ess=new EssayFragment();//initialize new EssayFragment fragment
    Fragment phot=new photos();//initialize new photos fragment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knowledge);
        //دى بتظهر ال fragment الخاصة بأهمية التوعية أول مرة ال user يشغل ال app وبعد كدة يظهر مقالات التوعية
        SharedPreferences sharedPreferences=getSharedPreferences("first_time",MODE_PRIVATE);
        int first_time=sharedPreferences.getInt("first_time",1);
        if(first_time==1){
            fragment_show(open); //show first page in التوعية
SharedPreferences.Editor editor=getSharedPreferences("first_time",MODE_PRIVATE).edit();
editor.putInt("first_time",0);
editor.apply();
        }
        else {
            fragment_show(ess);
        }
        BottomNavigationView bottomNavigationView=findViewById(R.id.bn);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

//عشان تحدد اى Fragment هتظهر ع حسب ال clicked button
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.p1:
                    fragment_show(ess);
                    return true;
                case R.id.p2:
                    fragment_show(phot);
                    return true;
                case R.id.p3:
                    fragment_show(range);
                    return true;
                case R.id.p4:
                  // fragment_show(vid);
                    Intent a = new Intent(knowledge.this,youtube.class);
                    startActivity(a);
                    return true;
            }
            return false;
        }
    };
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(knowledge.this,MainActivity.class);
        startActivity(intent);
    }
    //a method to replace fragments
    private void fragment_show(Fragment fragment){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }
}

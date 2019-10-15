package com.example.cancare;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {
    ImageView activity1, activity2, activity3, activity4;
    private boolean gps;
    AlertDialog.Builder builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);




        activity1 = findViewById(R.id.activity1);
        activity2 = findViewById(R.id.activity2);
        activity4 = findViewById(R.id.activity4);
        activity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntent(knowledge.class);

            }
        });// لعرض التوعية
        activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIntent(Aarad_activity.class);
            }
        });//الاعراض

        activity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gps = isGPSEnabled(MainActivity.this);//دا الboolean variable الى بيرجع فيه الGPS شغال ولا لأ
                if (gps) {
                    Uri gmmIntentUri = Uri.parse("geo:0,0?q=nearby hospitals");
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    startActivity(mapIntent);
                } else {//لو gps=false يعنى الGPS مش شغال
                    //دى رسالة بتظهر عشان نشغل ال GPS
                    builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);
                    //Setting message manually and performing action on button click
                    builder.setMessage("أرجو تفعيل الموقع(GPS)لتحديد أقرب المستشفيات اليك")
                            .setCancelable(false)
                            .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));

                                }
                            })
                            .setNegativeButton("لا", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();

                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.setTitle("GPS");
                    alert.show();

                }
            }
        });
    }

    //دى method عشان نفتح اى Activity
    public void openIntent(Class c) {
        Intent intent = new Intent(MainActivity.this, c);
        startActivity(intent);


    }

    //دى method بتحدد الGPS شغال ولا مش شغال
    public boolean isGPSEnabled(Context mContext) {
        LocationManager locationManager = (LocationManager)
                mContext.getSystemService(Context.LOCATION_SERVICE);
        return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
    }

    @Override
    public void onBackPressed() {
        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
        homeIntent.addCategory(Intent.CATEGORY_HOME);
        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(homeIntent);
    }


}



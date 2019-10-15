package com.example.cancare;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;



public class Aarad_activity extends AppCompatActivity {
    //intsialize the check box by its id
    //and buttons and textviews and array of result that we got it from server
    public CheckBox ch, ch1, ch2, ch3, ch4 , ch5, ch6, ch7, ch8, ch9,ch10, ch11, ch12, ch13, ch14 , ch15, ch16, ch17, ch18, ch19,ch20, ch21, ch22, ch23, ch24 , ch25, ch26, ch27, ch28, ch29,ch30
            , ch31, ch32, ch33, ch34 , ch35, ch36, ch37, ch38, ch39,ch40, ch41, ch42, ch43, ch44 , ch45, ch46, ch47, ch48, ch49,ch50, ch51, ch52, ch53, ch54 , ch55, ch56, ch57, ch58, ch59,ch60, ch61, ch62, ch63, ch64 , ch65, ch66, ch67, ch68, ch69,ch70;
    public Button trans;
    public TextView rest ;
    public String Ares="";
    //make every check box as joson object because when it checked json object created

    final JSONObject cho = new JSONObject();
    final JSONObject ch1o = new JSONObject();
    final JSONObject ch2o = new JSONObject();
    final JSONObject ch3o = new JSONObject();
    final JSONObject ch4o = new JSONObject();
    final JSONObject ch5o = new JSONObject();
    final JSONObject ch6o = new JSONObject();
    final JSONObject ch7o = new JSONObject();
    final JSONObject ch8o = new JSONObject();
    final JSONObject ch9o = new JSONObject();
    final JSONObject ch10o = new JSONObject();
    final JSONObject ch11o = new JSONObject();
    final JSONObject ch12o = new JSONObject();
    final JSONObject ch13o = new JSONObject();
    final JSONObject ch14o = new JSONObject();
    final JSONObject ch15o = new JSONObject();
    final JSONObject ch16o = new JSONObject();
    final JSONObject ch17o = new JSONObject();
    final JSONObject ch18o = new JSONObject();
    final JSONObject ch19o = new JSONObject();
    final JSONObject ch20o = new JSONObject();
    final JSONObject ch21o = new JSONObject();
    final JSONObject ch22o = new JSONObject();
    final JSONObject ch23o = new JSONObject();
    final JSONObject ch24o = new JSONObject();
    final JSONObject ch25o = new JSONObject();
    final JSONObject ch26o = new JSONObject();
    final JSONObject ch27o = new JSONObject();
    final JSONObject ch28o = new JSONObject();
    final JSONObject ch29o = new JSONObject();
    final JSONObject ch30o = new JSONObject();
    final JSONObject ch31o = new JSONObject();
    final JSONObject ch32o = new JSONObject();
    final JSONObject ch33o = new JSONObject();
    final JSONObject ch34o = new JSONObject();
    final JSONObject ch35o = new JSONObject();
    final JSONObject ch36o = new JSONObject();
    final JSONObject ch37o = new JSONObject();
    final JSONObject ch38o = new JSONObject();
    final JSONObject ch39o = new JSONObject();
    final JSONObject ch40o = new JSONObject();
    final JSONObject ch41o = new JSONObject();
    final JSONObject ch42o = new JSONObject();
    final JSONObject ch43o = new JSONObject();
    final JSONObject ch44o = new JSONObject();
    final JSONObject ch45o = new JSONObject();
    final JSONObject ch46o = new JSONObject();
    final JSONObject ch47o = new JSONObject();
    final JSONObject ch48o = new JSONObject();
    final JSONObject ch49o = new JSONObject();
    final JSONObject ch50o = new JSONObject();
    final JSONObject ch51o = new JSONObject();
    final JSONObject ch52o = new JSONObject();
    final JSONObject ch53o = new JSONObject();
    final JSONObject ch54o = new JSONObject();
    final JSONObject ch55o = new JSONObject();
    final JSONObject ch56o = new JSONObject();
    final JSONObject ch57o = new JSONObject();
    final JSONObject ch58o = new JSONObject();
    final JSONObject ch59o = new JSONObject();
    final JSONObject ch60o = new JSONObject();
    final JSONObject ch61o = new JSONObject();
    final JSONObject ch62o = new JSONObject();
    final JSONObject ch63o = new JSONObject();
    final JSONObject ch64o = new JSONObject();
    final JSONObject ch65o = new JSONObject();
    final JSONObject ch66o = new JSONObject();
    final JSONObject ch67o = new JSONObject();
    final JSONObject ch68o = new JSONObject();
    final JSONObject ch69o = new JSONObject();
    final JSONObject ch70o = new JSONObject();
    //make for every check box flag to check if box is checked or not to take action
    public boolean chf, ch1f, ch2f, ch3f, ch4f, ch5f, ch6f, ch7f, ch8f, ch9f,ch10f, ch11f, ch12f, ch13f, ch14f, ch15f, ch16f, ch17f, ch18f, ch19f,ch20f, ch21f, ch22f, ch23f, ch24f, ch25f, ch26f, ch27f, ch28f, ch29f,ch30f
            , ch31f, ch32f, ch33f, ch34f, ch35f, ch36f, ch37f, ch38f, ch39f,ch40f, ch41f, ch42f, ch43f, ch44f, ch45f, ch46f, ch47f, ch48f, ch49f,ch50f, ch51f, ch52f, ch53f, ch54f, ch55f, ch56f, ch57f, ch58f, ch59f,ch60f
            , ch61f, ch62f, ch63f, ch64f, ch65f, ch66f, ch67f, ch68f, ch69f,ch70f;


    Button button;
    AlertDialog.Builder builder1;
int flag=0;
//make progress bar to konw when the respond of server got or not
     ProgressBar pbar ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_aarad_activity );
        pbar = findViewById( R.id.pp );
        button=findViewById(R.id.btt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //establish the jason object content that we will send to server to make request
                //make intent to google translaation to translate the result that we got it from server
                if(Ares.equals("")){}
                else {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_SEND);
                        intent.putExtra(Intent.EXTRA_TEXT, Ares);
                        // intent.putExtra("key_text_input", "hello");
                        intent.putExtra("key_text_output", "");
                        intent.putExtra("key_language_from", "en");
                        intent.putExtra("key_language_to", "ar");
                        // intent.putExtra("key_suggest_translation", "");
                        // intent.putExtra("key_from_floating_window", false);
                        intent.setComponent(new ComponentName(
                                "com.google.android.apps.translate",
                                //Change is here
                                //"com.google.android.apps.translate.HomeActivity"));
                                "com.google.android.apps.translate.TranslateActivity"));
                        startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(getApplication(), "Sorry, No Google Translation Installed",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        //define each check box by its id by find id
        ch = findViewById( R.id.cb );
        ch1 = findViewById( R.id.cb1 );
        ch2 = findViewById( R.id.cb2 );
        ch3 = findViewById( R.id.cb3 );
        ch4 = findViewById( R.id.cb4 );
        ch5 = findViewById( R.id.cb5 );
        ch6 = findViewById( R.id.cb6 );
        ch7 = findViewById( R.id.cb7 );
        ch8 = findViewById( R.id.cb8 );
        ch9 = findViewById( R.id.cb9 );
        ch10 = findViewById( R.id.cb10 );
        ch11 = findViewById( R.id.cb11 );
        ch12 = findViewById( R.id.cb12 );
        ch13 = findViewById( R.id.cb13 );
        ch14 = findViewById( R.id.cb14 );
        ch15 = findViewById( R.id.cb15 );
        ch16 = findViewById( R.id.cb16 );
        ch17 = findViewById( R.id.cb17 );
        ch18 = findViewById( R.id.cb18 );
        ch19 = findViewById( R.id.cb19 );
        ch20 = findViewById( R.id.cb20 );
        ch21 = findViewById( R.id.cb21 );
        ch22 = findViewById( R.id.cb22 );
        ch23 = findViewById( R.id.cb23 );
        ch24 = findViewById( R.id.cb24 );
        ch25 = findViewById( R.id.cb25 );
        ch26 = findViewById( R.id.cb26 );
        ch27 = findViewById( R.id.cb27 );
        ch28 = findViewById( R.id.cb28 );
        ch29 = findViewById( R.id.cb29 );
        ch30 = findViewById( R.id.cb30 );
        ch31 = findViewById( R.id.cb31 );
        ch32 = findViewById( R.id.cb32 );
        ch33 = findViewById( R.id.cb33 );
        ch34 = findViewById( R.id.cb34 );
        ch35 = findViewById( R.id.cb35 );
        ch36 = findViewById( R.id.cb36 );
        ch37 = findViewById( R.id.cb37 );
        ch38 = findViewById( R.id.cb38 );
        ch39 = findViewById( R.id.cb39 );
        ch40 = findViewById( R.id.cb40 );
        ch41 = findViewById( R.id.cb41 );
        ch42 = findViewById( R.id.cb42 );
        ch43 = findViewById( R.id.cb43 );
        ch44 = findViewById( R.id.cb44 );
        ch45 = findViewById( R.id.cb45 );
        ch46 = findViewById( R.id.cb46 );
        ch47 = findViewById( R.id.cb47 );
        ch48 = findViewById( R.id.cb48 );
        ch49 = findViewById( R.id.cb49 );
        ch50 = findViewById( R.id.cb50 );
        ch51 = findViewById( R.id.cb51 );
        ch52 = findViewById( R.id.cb52 );
        ch53 = findViewById( R.id.cb53 );
        ch54 = findViewById( R.id.cb54 );
        ch55 = findViewById( R.id.cb55 );
        ch56 = findViewById( R.id.cb56 );
        ch57 = findViewById( R.id.cb57 );
        ch58 = findViewById( R.id.cb58 );
        ch59 = findViewById( R.id.cb59 );
        ch60 = findViewById( R.id.cb60 );
        ch61 = findViewById( R.id.cb61 );
        ch62 = findViewById( R.id.cb62 );
        ch63 = findViewById( R.id.cb63 );
        ch64 = findViewById( R.id.cb64 );
        ch65 = findViewById( R.id.cb65 );
        ch66 = findViewById( R.id.cb66 );
        ch67 = findViewById( R.id.cb67 );
        ch68 = findViewById( R.id.cb68 );
        ch69 = findViewById( R.id.cb69 );
        ch70 = findViewById( R.id.cb70 );
        rest = findViewById( R.id.tvvv );



        ch.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check every check box if checked or not and if checked get its value

                if (ch.isChecked()) {
                    chf = true;
                    try {
                        cho.put( "id", "s_13" );
                        cho.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    chf = false;
            }
        } );
        ch1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch1.isChecked()) {
                    ch1f = true;
                    try {
                        ch1o.put( "id", "s_16" );
                        ch1o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch1f = false;
            }
        } );
        ch2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch2.isChecked()) {
                    ch2f = true;
                    try {
                        ch2o.put( "id", "s_14" );
                        ch2o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch2f = false;
            }
        } );
        ch3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch3.isChecked()) {
                    ch3f = true;
                    try {
                        ch3o.put( "id", "s_15" );
                        ch3o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch3f = false;
            }
        } );
        ch4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch4.isChecked()) {
                    ch4f = true;
                    try {
                        ch4o.put( "id", "s_1202" );
                        ch4o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch4f = false;
            }
        } );
        ch5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch5.isChecked()) {
                    ch5f = true;
                    try {
                        ch5o.put( "id", "s_1848" );
                        ch5o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch5f = false;
            }
        } );
        ch6.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch6.isChecked()) {
                    ch6f = true;
                    try {
                        ch6o.put( "id", "s_159" );
                        ch6o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch6f = false;
            }
        } );
        ch7.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch7.isChecked()) {
                    ch7f = true;
                    try {
                        ch7o.put( "id", "s_1206" );
                        ch7o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch7f = false;
            }
        } );
        ch8.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch8.isChecked()) {
                    ch8f = true;
                    try {
                        ch8o.put( "id", "s_53" );
                        ch8o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch8f = false;
            }
        } );
        ch9.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch9.isChecked()) {
                    ch9f = true;
                    try {
                        ch9o.put( "id", "s_1339" );
                        ch9o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch9f = false;
            }
        } );
        ch10.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch10.isChecked()) {
                    ch10f = true;
                    try {
                        ch10o.put( "id", "s_663" );
                        ch10o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch10f = false;
            }
        } );
        ch11.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch11.isChecked()) {
                    ch11f = true;
                    try {
                        ch11o.put( "id", "s_38" );
                        ch11o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch11f = false;
            }
        } );
        ch12.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch12.isChecked()) {
                    ch12f = true;
                    try {
                        ch12o.put( "id", "s_35" );
                        ch12o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch12f = false;
            }
        } );
        ch13.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch13.isChecked()) {
                    ch13f = true;
                    try {
                        ch13o.put( "id", "s_1763" );
                        ch13o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch13f = false;
            }
        } );
        ch14.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch14.isChecked()) {
                    ch14f = true;
                    try {
                        ch14o.put( "id", "s_42" );
                        ch14o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch14f = false;
            }
        } );
        ch15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch15.isChecked()) {
                    ch15f = true;
                    try {
                        ch15o.put( "id", "s_30" );
                        ch15o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch15f = false;
            }
        } );
        ch16.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch16.isChecked()) {
                    ch16f = true;
                    try {
                        ch16o.put( "id", "s_105" );
                        ch16o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch16f = false;
            }
        } );
        ch17.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch17.isChecked()) {
                    ch17f = true;
                    try {
                        ch17o.put( "id", "s_662" );
                        ch17o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch17f = false;
            }
        } );
        ch18.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch18.isChecked()) {
                    ch18f = true;
                    try {
                        ch18o.put( "id", "s_8" );
                        ch18o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch18f = false;
            }
        } );
        ch19.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch19.isChecked()) {
                    ch19f = true;
                    try {
                        ch19o.put( "id", "s_412" );
                        ch19o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch19f = false;
            }
        } );
        ch20.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch20.isChecked()) {
                    ch20f = true;
                    try {
                        ch20o.put( "id", "s_1121" );
                        ch20o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch20f = false;
            }
        } );
        ch21.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch21.isChecked()) {
                    ch21f = true;
                    try {
                        ch21o.put( "id", "s_370" );
                        ch21o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch21f = false;
            }
        } );
        ch22.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch22.isChecked()) {
                    ch22f = true;
                    try {
                        ch22o.put( "id", "s_1479" );
                        ch22o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch22f = false;
            }
        } );
        ch23.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch23.isChecked()) {
                    ch23f = true;
                    try {
                        ch23o.put( "id", "s_936" );
                        ch23o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch23f = false;
            }
        } );
        ch24.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch24.isChecked()) {
                    ch24f = true;
                    try {
                        ch24o.put( "id", "s_59" );
                        ch24o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch24f = false;
            }
        } );
        ch25.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch25.isChecked()) {
                    ch25f = true;
                    try {
                        ch25o.put( "id", "s_1432" );
                        ch25o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch25f = false;
            }
        } );
        ch26.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch26.isChecked()) {
                    ch26f = true;
                    try {
                        ch26o.put( "id", "s_962" );
                        ch26o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch26f = false;
            }
        } );
        ch27.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch27.isChecked()) {
                    ch27f = true;
                    try {
                        ch27o.put( "id", "s_1779" );
                        ch27o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch27f = false;
            }
        } );
        ch28.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch28.isChecked()) {
                    ch28f = true;
                    try {
                        ch28o.put( "id", "s_1776" );
                        ch28o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch28f = false;
            }
        } );
        ch29.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch29.isChecked()) {
                    ch29f = true;
                    try {
                        ch29o.put( "id", "s_47" );
                        ch29o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch29f = false;
            }
        } );
        ch30.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch30.isChecked()) {
                    ch30f = true;
                    try {
                        ch30o.put( "id", "s_493" );
                        ch30o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch30f = false;
            }
        } );
        ch31.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch31.isChecked()) {
                    ch31f = true;
                    try {
                        ch31o.put( "id", "s_478" );
                        ch31o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch31f = false;
            }
        } );
        ch32.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch32.isChecked()) {
                    ch32f = true;
                    try {
                        ch32o.put( "id", "s_1203" );
                        ch32o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch32f = false;
            }
        } );
        ch33.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch33.isChecked()) {
                    ch33f = true;
                    try {
                        ch33o.put( "id", "s_1436" );
                        ch33o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch33f = false;
            }
        } );
        ch34.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch34.isChecked()) {
                    ch34f = true;
                    try {
                        ch34o.put( "id", "s_98" );
                        ch34o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch34f = false;
            }
        } );
        ch35.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch35.isChecked()) {
                    ch35f = true;
                    try {
                        ch35o.put( "id", "s_215" );
                        ch35o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch35f = false;
            }
        } );
        ch36.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch36.isChecked()) {
                    ch36f = true;
                    try {
                        ch36o.put( "id", "s_75" );
                        ch36o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch36f = false;
            }
        } );
        ch37.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch37.isChecked()) {
                    ch37f = true;
                    try {
                        ch37o.put( "id", "s_21" );
                        ch37o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch37f = false;
            }
        } );
        ch38.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch38.isChecked()) {
                    ch38f = true;
                    try {
                        ch38o.put( "id", "s_1762" );
                        ch38o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch38f = false;
            }
        } );
        ch39.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch39.isChecked()) {
                    ch39f = true;
                    try {
                        ch39o.put( "id", "s_625" );
                        ch39o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch39f = false;
            }
        } );
        ch40.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch40.isChecked()) {
                    ch40f = true;
                    try {
                        ch40o.put( "id", "s_799" );
                        ch40o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch40f = false;
            }
        } );
        ch41.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch41.isChecked()) {
                    ch41f = true;
                    try {
                        ch41o.put( "id", "s_1349" );
                        ch41o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch41f = false;
            }
        } );
        ch42.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch42.isChecked()) {
                    ch42f = true;
                    try {
                        ch42o.put( "id", "s_543" );
                        ch42o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch42f = false;
            }
        } );
        ch43.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch43.isChecked()) {
                    ch43f = true;
                    try {
                        ch43o.put( "id", "s_1933" );
                        ch43o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch43f = false;
            }
        } );
        ch44.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch44.isChecked()) {
                    ch44f = true;
                    try {
                        ch44o.put( "id", "s_533" );
                        ch44o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch44f = false;
            }
        } );
        ch45.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch45.isChecked()) {
                    ch45f = true;
                    try {
                        ch45o.put( "id", "s_631" );
                        ch45o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch45f = false;
            }
        } );
        ch46.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch46.isChecked()) {
                    ch46f = true;
                    try {
                        ch46o.put( "id", "s_320" );
                        ch46o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch46f = false;
            }
        } );
        ch47.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch47.isChecked()) {
                    ch47f = true;
                    try {
                        ch47o.put( "id", "s_310" );
                        ch47o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch47f = false;
            }
        } );
        ch48.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch48.isChecked()) {
                    ch48f = true;
                    try {
                        ch48o.put( "id", "s_44" );
                        ch48o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch48f = false;
            }
        } );
        ch49.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch49.isChecked()) {
                    ch49f = true;
                    try {
                        ch49o.put( "id", "s_576" );
                        ch49o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch49f = false;
            }
        } );
        ch50.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch50.isChecked()) {
                    ch50f = true;
                    try {
                        ch50o.put( "id", "s_1621" );
                        ch50o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch50f = false;
            }
        } );
        ch51.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch51.isChecked()) {
                    ch51f = true;
                    try {
                        ch51o.put( "id", "s_1632" );
                        ch51o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch51f = false;
            }
        } );
        ch52.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch52.isChecked()) {
                    ch52f = true;
                    try {
                        ch52o.put( "id", "s_79" );
                        ch52o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch52f = false;
            }
        } );
        ch53.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch53.isChecked()) {
                    ch53f = true;
                    try {
                        ch53o.put( "id", "s_11" );
                        ch53o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch53f = false;
            }
        } );
        ch54.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch54.isChecked()) {
                    ch54f = true;
                    try {
                        ch54o.put( "id", "s_581" );
                        ch54o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch54f = false;
            }
        } );
        ch55.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch55.isChecked()) {
                    ch55f = true;
                    try {
                        ch55o.put( "id", "s_1654" );
                        ch55o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch55f = false;
            }
        } );
        ch56.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch56.isChecked()) {
                    ch56f = true;
                    try {
                        ch56o.put( "id", "s_1805" );
                        ch56o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch56f = false;
            }
        } );
        ch57.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch57.isChecked()) {
                    ch57f = true;
                    try {
                        ch57o.put( "id", "s_156" );
                        ch57o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch57f = false;
            }
        } );
        ch58.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch58.isChecked()) {
                    ch58f = true;
                    try {
                        ch58o.put( "id", "s_371" );
                        ch58o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch58f = false;
            }
        } );
        ch59.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch59.isChecked()) {
                    ch59f = true;
                    try {
                        ch59o.put( "id", "s_39" );
                        ch59o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch59f = false;
            }
        } );
        ch60.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch60.isChecked()) {
                    ch60f = true;
                    try {
                        ch60o.put( "id", "s_518" );
                        ch60o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch60f = false;
            }
        } );
        ch61.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch61.isChecked()) {
                    ch61f = true;
                    try {
                        ch61o.put( "id", "s_125" );
                        ch61o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch61f = false;
            }
        } );
        ch62.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch62.isChecked()) {
                    ch62f = true;
                    try {
                        ch62o.put( "id", "s_83" );
                        ch62o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch62f = false;
            }
        } );
        ch63.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ch63.isChecked()) {
                    ch63f = true;
                    try {
                        ch63o.put( "id", "s_261" );
                        ch63o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch63f = false;
            }
        } );
        ch64.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch64.isChecked()) {
                    ch64f = true;
                    try {
                        ch64o.put( "id", "s_227" );
                        ch64o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch64f = false;
            }
        } );
        ch65.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch65.isChecked()) {
                    ch65f = true;
                    try {
                        ch65o.put( "id", "s_551" );
                        ch65o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch65f = false;
            }
        } );
        ch66.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch66.isChecked()) {
                    ch66f = true;
                    try {
                        ch66o.put( "id", "s_55" );
                        ch66o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch66f = false;
            }
        } );
        ch67.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch67.isChecked()) {
                    ch67f = true;
                    try {
                        ch67o.put( "id", "s_339" );
                        ch67o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch67f = false;
            }
        } );
        ch68.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch68.isChecked()) {
                    ch68f = true;
                    try {
                        ch68o.put( "id", "s_56" );
                        ch68o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch68f = false;
            }
        } );
        ch69.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch69.isChecked()) {
                    ch69f = true;
                    try {
                        ch69o.put( "id", "s_153" );
                        ch69o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch69f = false;
            }
        } );
        ch70.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ch70.isChecked()) {
                    ch70f = true;
                    try {
                        ch70o.put( "id", "s_305" );
                        ch70o.put( "choice_id", "present" );
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else
                    ch70f = false;
            }
        } );


    }
//make jason object elements to send it to server and make progress bar
    public void click(View view) throws JSONException {
        rest.setText("");
        Ares="";
        ProgressBar bar = findViewById( R.id.pp );
        bar.setVisibility( View.VISIBLE );
        JSONObject jsonObject = new JSONObject();
        EditText kind = findViewById( R.id.ed );
        String gender = kind.getText().toString().trim();
        if (gender.equals("ذكر")){
            jsonObject.put( "sex","male" );
            flag=1;
// make the probalities of male and female and take it with arabic and convert it to english by if condtion statement

        }
        else if(gender.equals("أنثى") || gender.equals("انثى") || gender.equals("أنثي") || gender.equals("انثي")){
            jsonObject.put( "sex","female" );
            flag=1;
        }
        if ( flag==0)
        {

            builder1 = new AlertDialog.Builder(Aarad_activity.this);
            builder1.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title);
            //Setting message manually and performing action on button click
            builder1.setMessage("نوع خاطئ")
                    .setCancelable(false)
                    .setPositiveButton("نعم", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            pbar.setVisibility(View.INVISIBLE);
                        }
                    });

            AlertDialog alert = builder1.create();
            alert.setTitle("النوع");
            alert.show();


        }
        EditText old = findViewById( R.id.edd );

        String age = old.getText().toString().trim();
        //JSONObject jsonObject = new JSONObject();
        // jsonObject.put( "sex", gender );
        jsonObject.put( "age", age );
        JSONArray arr = new JSONArray();
//make jason array to put it the gender and age and know which the check box and put its value to the same array
        if (chf) {
            arr.put( cho );
        }
        if (ch1f) {
            arr.put( ch1o );
        }
        if (ch2f) {
            arr.put( ch2o );
        }
        if (ch3f) {
            arr.put( ch3o );
        }
        if (ch4f) {
            arr.put( ch4o );
        }
        if (ch5f) {
            arr.put( ch5o );
        }
        if (ch6f) {
            arr.put( ch6o );
        }
        if (ch7f) {
            arr.put( ch7o );
        }
        if (ch8f) {
            arr.put( ch8o );
        }
        if (ch9f) {
            arr.put( ch9o );
        }
        if (ch10f) {
            arr.put( ch10o );
        }
        if (ch11f) {
            arr.put( ch11o );
        }
        if (ch12f) {
            arr.put( ch12o );
        }
        if (ch13f) {
            arr.put( ch13o );
        }
        if (ch14f) {
            arr.put( ch14o );
        }
        if (ch15f) {
            arr.put( ch15o );
        }
        if (ch16f) {
            arr.put( ch16o );
        }
        if (ch17f) {
            arr.put( ch17o );
        }
        if (ch18f) {
            arr.put( ch18o );
        }
        if (ch19f) {
            arr.put( ch19o );
        }
        if (ch20f) {
            arr.put( ch20o );
        }
        if (ch21f) {
            arr.put( ch21o );
        }
        if (ch22f) {
            arr.put( ch22o );
        }
        if (ch23f) {
            arr.put( ch23o );
        }
        if (ch24f) {
            arr.put( ch24o );
        }
        if (ch25f) {
            arr.put( ch25o );
        }
        if (ch26f) {
            arr.put( ch26o );
        }
        if (ch27f) {
            arr.put( ch27o );
        }
        if (ch28f) {
            arr.put( ch28o );
        }
        if (ch29f) {
            arr.put( ch29o );
        }
        if (ch30f) {
            arr.put( ch30o );
        }if (ch31f) {
            arr.put( ch31o );
        }
        if (ch32f) {
            arr.put( ch32o );
        }
        if (ch33f) {
            arr.put( ch33o );
        }
        if (ch34f) {
            arr.put( ch34o );
        }
        if (ch35f) {
            arr.put( ch35o );
        }
        if (ch36f) {
            arr.put( ch36o );
        }
        if (ch37f) {
            arr.put( ch37o );
        }
        if (ch38f) {
            arr.put( ch38o );
        }
        if (ch39f) {
            arr.put( ch39o );
        }
        if (ch40f) {
            arr.put( ch40o );
        }
        if (ch41f) {
            arr.put( ch41o );
        }
        if (ch42f) {
            arr.put( ch42o );
        }
        if (ch43f) {
            arr.put( ch43o );
        }
        if (ch44f) {
            arr.put( ch44o );
        }
        if (ch45f) {
            arr.put( ch45o );
        }
        if (ch46f) {
            arr.put( ch46o );
        }
        if (ch47f) {
            arr.put( ch47o );
        }
        if (ch48f) {
            arr.put( ch48o );
        }
        if (ch49f) {
            arr.put( ch49o );
        }
        if (ch50f) {
            arr.put( ch50o );
        }
        if (ch51f) {
            arr.put( ch51o );
        }
        if (ch52f) {
            arr.put( ch52o );
        }
        if (ch53f) {
            arr.put( ch53o );
        }
        if (ch54f) {
            arr.put( ch54o );
        }
        if (ch55f) {
            arr.put( ch55o );
        }
        if (ch56f) {
            arr.put( ch56o );
        }
        if (ch57f) {
            arr.put( ch57o );
        }
        if (ch58f) {
            arr.put( ch58o );
        }
        if (ch59f) {
            arr.put( ch59o );
        }
        if (ch60f) {
            arr.put( ch60o );
        }if (ch61f) {
            arr.put( ch61o );
        }
        if (ch62f) {
            arr.put( ch62o );
        }
        if (ch63f) {
            arr.put( ch63o );
        }
        if (ch64f) {
            arr.put( ch64o );
        }
        if (ch65f) {
            arr.put( ch65o );
        }
        if (ch66f) {
            arr.put( ch66o );
        }
        if (ch67f) {
            arr.put( ch67o );
        }
        if (ch68f) {
            arr.put( ch68o );
        }
        if (ch69f) {
            arr.put( ch69o );
        }
        if (ch70f) {
            arr.put( ch70o );
        }
        jsonObject.put( "evidence", arr );
        Log.d("json", ""+jsonObject);
        callFromServer( jsonObject );
    }

    private void callFromServer(JSONObject jsonObject) {
        final ProgressBar pbar = findViewById( R.id.pp );
/*
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.infermedica.com/v2/diagnosis";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray condtions = response.getJSONArray( "conditions" );
                    for (int i = 0; i < condtions.length(); ++i) {
                        JSONObject obob = condtions.getJSONObject( i );
                        String name = obob.getString( "common_name" );
                        String prob = obob.getString( "probability" );
                        Ares = "you could have " + name + "\nwith a ratio is " + prob;
                        rest.append( Ares );
                    }
                }
                catch (JSONException e) {
                    e.printStackTrace();
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                rest.setText( "" + error );
            }

            {
                public Map<String, String> getHeaders () {
                Map<String, String> headers = new HashMap<>();
                headers.put( "App-Id", "9d234e69" );
                headers.put( "App-Key", "a97813bdc30f73f0857bfe7506c1ccaf" );
                //headers.put("Content-Type", "application/json");
                //Log.d("json", "headers: " + headers);
                return headers;
            }
            }


        queue.add(jsonObjectRequest);

        }



*/
// request the api with volley request with posting the json object then we get response from it
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://api.infermedica.com/v2/diagnosis";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, url, jsonObject,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        pbar.setVisibility( View.INVISIBLE );
                        try {
                            JSONArray condtions = response.getJSONArray( "conditions" );
                            for (int i = 0; i < condtions.length(); ++i) {
                                JSONObject obob = condtions.getJSONObject( i );
                                String name = obob.getString( "common_name" );
                                String prob = obob.getString( "probability" );
                                Ares = "you could have " + name + "\nwith a ratio is " + prob;
                                rest.append( Ares );
                            }
                        }
                        catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //rest.setText( "" + error );

            }
        }) {
            //give the api the appid and app key that we sign in with in api
            @Override
            public Map<String, String> getHeaders() {
                Map<String, String> headers = new HashMap<>();
                headers.put("App-Id", "9d234e69");
                headers.put("App-Key", "a97813bdc30f73f0857bfe7506c1ccaf");
                //headers.put("Content-Type", "application/json");
                //Log.d("json", "headers: " + headers);
                return headers;
            }
        };
        //jsonObjectRequest.setTag("lol");
        queue.add(jsonObjectRequest);



    }



}
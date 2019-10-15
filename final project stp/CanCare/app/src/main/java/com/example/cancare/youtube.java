package com.example.cancare;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import java.util.ArrayList;
import java.util.List;

public class youtube extends YouTubeBaseActivity  {


    private static final String API_KEY = "AIzaSyAixG1HA8NPxFFXWmyyQ9CnfJmFO-d5Rn8";
     String VIDEO_ID = "XSPepcOP4JU";
     String VIDEO_ID1 = "4OsY5GdFtOc";
     String VIDEO_ID2 = "WXTGJK86cqU";
     String VIDEO_ID3 = "USaXwnm-Cw8";
    String VIDEO_ID4 = "hSeofiAEy7w";
     String VIDEO_ID5 = "_D9f6-BAJPI";
     String VIDEO_ID6 = "16Vmfm5UKfU";
     String VIDEO_ID7 = "gY7f_eynjYE";
     String VIDEO_ID8 = "vdr2b1-mRMc";
     String VIDEO_ID9 = "1PAY4Difo1g";
     String VIDEO_ID10 = "GTs0DLTRNhU";



    YouTubePlayerView player;


   void ViedoPlay(final String id, YouTubePlayerView test){

        test.initialize(API_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if ( !b){
                   // youTubePlayer.loadVideo(id);
                    List<String> videos=new ArrayList<>();
                    videos.add(VIDEO_ID);
                    videos.add(VIDEO_ID1);
                    videos.add(VIDEO_ID2);
                    videos.add(VIDEO_ID3);
                    videos.add(VIDEO_ID4);
                    videos.add(VIDEO_ID5);
                    videos.add(VIDEO_ID6);
                    videos.add(VIDEO_ID7);
                    videos.add(VIDEO_ID8);
                    videos.add(VIDEO_ID9);
                    videos.add(VIDEO_ID10);







                    youTubePlayer.loadVideos(videos);
                    youTubePlayer.setPlayerStyle( YouTubePlayer.PlayerStyle.DEFAULT );
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Toast.makeText(youtube.this, "oooops!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_youtube );
       player =  findViewById( R.id.view );


    }
    
    public void play(View view) {
        ViedoPlay(VIDEO_ID,player);
    }

}

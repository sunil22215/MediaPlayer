package com.example.mediaplayer;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button start;
   // private Button pause;
    //private Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // MediaPlayer mp=new MediaPlayer();

       /* MediaPlayer mp=new MediaPlayer();
        mp=MediaPlayer.create(this,R.raw.music);
        mp.start();
       *//* try {
            mp.setDataSource("/Local file/Music/song.mp3");
            mp.prepare();
            mp.start();
        }catch (Exception e){e.printStackTrace();}
*/
        start = (Button) findViewById(R.id.button1);
      //  pause = (Button) findViewById(R.id.button2);
       // stop = (Button) findViewById(R.id.button3);
        //creating media player


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = new MediaPlayer();
                String path="Device storage/song.mp3";
                mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
                Uri uri=Uri.parse(path);
                try {
                    mp.setDataSource(getApplicationContext(),uri);
                    mp.prepare();
                    mp.start();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
       /* pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    */}
}
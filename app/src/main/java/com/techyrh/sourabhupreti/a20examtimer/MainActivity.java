package com.techyrh.sourabhupreti.a20examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1= MediaPlayer.create(this,R.raw.four);
        final TextView start = findViewById(R.id.textView2);
        final TextView done = findViewById(R.id.textView4);

        new CountDownTimer(10000,1000){
            @Override
            public void onTick(long millisUntilFinished) {

            start.setText("Time Left :"+String.valueOf(millisUntilFinished/1000));

            }

            @Override
            public void onFinish() {
                done.setText("Done!!!");

            }
        }.start();
    }
}

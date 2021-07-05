package com.hfad.messengerytbv;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;

public class StopWatchAct extends AppCompatActivity {
    Button btnstart, btnstop;
    ImageView icanchor;
    Animation roundingalone;
    Chronometer timerHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart = findViewById(R.id.btnstart);
        btnstop = findViewById(R.id.btnstop);
        icanchor = findViewById(R.id.icanchor);
        timerHere = findViewById(R.id.timerHere);

        // optional animation
        btnstop.setAlpha(0);

        // load animations
        roundingalone = AnimationUtils.loadAnimation( this, R.anim.roundingalone);

        // import font


        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");


        // customize font
        btnstart.setTypeface(MMedium);
        btnstop.setTypeface(MMedium);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //passing animation
                icanchor.startAnimation(roundingalone);
                btnstop.animate().alpha(1).translationY(-10).setDuration(300).start();
                btnstart.animate().alpha(0).setDuration(300).start();

                //start timer
                timerHere.setBase(SystemClock.elapsedRealtime());
                timerHere.start();

                btnstop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //ending animation
                        icanchor.clearAnimation();
                        btnstart.animate().alpha(1).setDuration(300).start();

                        //ending timer
                        timerHere.stop();
                    }
                });
            }
        });
    }
}
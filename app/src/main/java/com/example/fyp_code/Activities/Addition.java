package com.example.fyp_code.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.fyp_code.R;

import in.codeshuffle.typewriterview.TypeWriterView;

public class Addition extends AppCompatActivity {

    TypeWriterView Story;


    ImageView player;
    ImageView leftpath;
    ImageView rightpath;
    TextView count;
    TextView count1;

    ImageView plusicon;

    ImageView i_leftpath;
    ImageView i_rightpath;
    ImageView enemy;

    TextView counting;
    TextView counting2;
    TextView bars;
    TextView one;
    TextView one_add;
    ImageView plus;
    ImageView equals;
    TextView twobara;
    TextView twobarb;
    TextView two;
    TextView onea;
    TextView oneb;
    TextView twoo;

    ImageView nextpage;

    TypeWriterView Enemy_story;


    MediaPlayer astronout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);


        Story=findViewById(R.id.story);
        Enemy_story=findViewById(R.id.enemystory);
        player=findViewById(R.id.player);
        leftpath=findViewById(R.id.leftpath);
        rightpath=findViewById(R.id.rightpath);
        count=findViewById(R.id.count);
        plusicon=findViewById(R.id.plusicon);
        count1=findViewById(R.id.count1);
        i_leftpath=findViewById(R.id.i_leftpath);
        i_rightpath=findViewById(R.id.i_rightpath);
        enemy=findViewById(R.id.enemy);
        counting=findViewById(R.id.counting);
        counting2=findViewById(R.id.count2);
        bars=findViewById(R.id.bars);
        one = findViewById(R.id.one);
        one_add= findViewById(R.id.one_add);
        plus  = findViewById(R.id.plus);
        equals = findViewById(R.id.equals);
        twobara = findViewById(R.id.twobara);
        twobarb = findViewById(R.id.twobarb);
        two = findViewById(R.id.two);
        onea = findViewById(R.id.onea);
        oneb = findViewById(R.id.oneb);
        twoo = findViewById(R.id.twoo);
        nextpage=findViewById(R.id.nextpage);

        astronout=MediaPlayer.create(this,R.raw.astro);

        Animation animation = new TranslateAnimation(-500, 0,0, 0);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        player.startAnimation(animation);
        //player.setVisibility(0);

        nextpage.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                astronout.start();
                Story.setDelay(70);
                Story.setWithMusic(false);
                Story.animateText("Once there was an astronout. He went to Mars to save planet.");

            }
        },300);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                leftpath.setImageResource(R.drawable.leftpath);
                rightpath.setImageResource(R.drawable.rightpath);
                Animation fadein_paths =new AlphaAnimation(0,1);
                fadein_paths.setInterpolator(new AccelerateInterpolator());
                fadein_paths.setStartOffset(1000);
                fadein_paths.setDuration(1000);
                leftpath.startAnimation(fadein_paths);
                rightpath.startAnimation(fadein_paths);
            }
        },1000);




        count.setText("|");
        Animation fadein_count=new AlphaAnimation(0,1);
        fadein_count.setInterpolator(new AccelerateInterpolator());
        fadein_count.setStartOffset(5000);
        fadein_count.setDuration(1000);
        count.startAnimation(fadein_count);


        plusicon.setImageResource(R.drawable.plusicon);
        Animation fadein_plusicon =new AlphaAnimation(0,1);
        fadein_plusicon.setInterpolator(new AccelerateInterpolator());
        fadein_plusicon.setStartOffset(6000);
        fadein_plusicon.setDuration(1000);
        plusicon.startAnimation(fadein_plusicon);

        count1.setText("|");
        Animation fadein_count1=new AlphaAnimation(0,1);
        fadein_count1.setInterpolator(new AccelerateInterpolator());
        fadein_count1.setStartOffset(8000);
        fadein_count1.setDuration(1000);
        count1.startAnimation(fadein_count1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                i_leftpath.setImageResource(R.drawable.i_leftpath);
                i_rightpath.setImageResource(R.drawable.i_rightpath);
                Animation fadein_ipaths =new AlphaAnimation(0,1);
                fadein_ipaths.setInterpolator(new AccelerateInterpolator());
                fadein_ipaths.setStartOffset(1000);
                fadein_ipaths.setDuration(1000);
                i_leftpath.startAnimation(fadein_ipaths);
                i_rightpath.startAnimation(fadein_ipaths);

            }
        },7000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                enemy.setImageResource(R.drawable.opponent);
                Animation animation = new TranslateAnimation(500, 0,0, 0);
                animation.setDuration(1000);
                animation.setFillAfter(true);
                enemy.startAnimation(animation);
                astronout.start();
                Enemy_story.setDelay(70);
                Enemy_story.setWithMusic(false);
                Enemy_story.animateText("Once there was an astronout. He went to Mars to save planet.");
            }
        },8000);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                counting.setText("Counting");
                two.setText("2");
                bars.setText("Bars");
                one.setText("|");
                plus.setImageResource(R.drawable.plusicon);
                one_add.setText("|");
                equals.setImageResource(R.drawable.equalsicon);
                twobara.setText("|");
                twobarb.setText("|");
                two.setText("2");

                Animation fadein_ipaths =new AlphaAnimation(0,1);
                fadein_ipaths.setInterpolator(new AccelerateInterpolator());
                fadein_ipaths.setStartOffset(1000);
                fadein_ipaths.setDuration(1000);
                counting.startAnimation(fadein_ipaths);
                two.startAnimation(fadein_ipaths);
                bars.startAnimation(fadein_ipaths);
                one.startAnimation(fadein_ipaths);
                plus.startAnimation(fadein_ipaths);
                one_add.startAnimation(fadein_ipaths);
                equals.startAnimation(fadein_ipaths);
                twobara.startAnimation(fadein_ipaths);
                twobarb.startAnimation(fadein_ipaths);
                two.startAnimation(fadein_ipaths);
            }
        },10000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                onea.setText("1");
                oneb.setText("1");
                twoo.setText("2");
            }
        },11000);



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                nextpage.setVisibility(View.VISIBLE);

                nextpage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Addition.this,Scratch_addition.class);
                        startActivity(i);

                    }
                });
            }
        },12000);



    }
    @Override
    protected void onPause() {
        super.onPause();
        astronout.release();
        finish();
    }
}
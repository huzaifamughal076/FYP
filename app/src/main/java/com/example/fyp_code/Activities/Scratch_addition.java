package com.example.fyp_code.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.anupkumarpanwar.scratchview.ScratchView;
import com.example.fyp_code.R;

import java.util.Timer;
import java.util.TimerTask;


public class Scratch_addition extends AppCompatActivity {
////////////////////////////////////////////////////////////////////
    ////////////////////////////Declareing the variables/////////////////////////////
    Animation animation,anim;
    ScratchView scratchView, scratchView1;
    ImageView img1, img2, imgbehind1, imgbehind2;
    CardView cardView1, cardView2;

/////////////////////////////////////////////////////////////////////////////////////
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scratch_addition);
////////////////////////////////////////////////////////////////////////////////////

        //////////////////////Initializing the variables////////////////////////////

        animation = AnimationUtils.loadAnimation(this, R.anim.shake);
        anim = AnimationUtils.loadAnimation(this, R.anim.shake);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        imgbehind1 = (ImageView) findViewById(R.id.imgbehind1);
        imgbehind2 = (ImageView) findViewById(R.id.imgbehind2);

        cardView1 = (CardView) findViewById(R.id.cardview1);
        cardView2 = (CardView) findViewById(R.id.cardview2);

        scratchView = findViewById(R.id.scratchview);
        scratchView1 = findViewById(R.id.scratchview2);
        RelativeLayout relativeLayout = findViewById(R.id.linear);

        ////////////////////////////////////////////////////////////////////////////////////////////

        //////////CHECK AFTER 5SEC THAT SCRATCH VIEW IS REVELED OR NOT////////////////////////////////////
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!scratchView.isRevealed()) {
                    startingAnimation1();
                    Toast.makeText(getApplicationContext(), "Fill Apple", Toast.LENGTH_SHORT).show();
                }
                else{
                    stopingAnimation1();
                }
            }
        },5000);

        /////////////////// scratchview (FOR 1ST Scratch View) Starts Here /////////////////////////

        scratchView.setRevealListener(new ScratchView.IRevealListener() {
            @Override
            public void onRevealed(ScratchView scratchView) {
                stopingAnimation1();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(getApplicationContext(), "Completed", Toast.LENGTH_LONG).show();
                        relativeLayout.setVisibility(View.VISIBLE);
                        cardView1.setVisibility(View.INVISIBLE);
                        imgbehind1.setVisibility(View.VISIBLE);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                if (!scratchView1.isRevealed()) {

                                    startingAnimation2();
                                    Toast.makeText(getApplicationContext(), "Fill the Apple", Toast.LENGTH_SHORT).show();
                                } else {

                                }

                            }

                        }, 5000);


                        /////////////Now for Bouncing ANIMATION(FOR 1ST APPLE)//////////////////////
                        ObjectAnimator scaleDown1 = ObjectAnimator.ofPropertyValuesHolder(
                                imgbehind1,
                                PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                                PropertyValuesHolder.ofFloat("scaleY", 1.1f));
                        scaleDown1.setDuration(310);

                        scaleDown1.setRepeatCount(ObjectAnimator.INFINITE);
                        scaleDown1.setRepeatMode(ObjectAnimator.REVERSE);

                        scaleDown1.start();
                        /////////////////////////Bouncing ANIMATION ends///////////////////////////

                    }
                }, 3000);

            }

            @Override
            public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
                if (percent >= 1) {
                    Log.d("Reveal Percentage", "onRevealPercentChangedListener: " + String.valueOf(percent));
                }

            }
        });

        /////////////////////////////////Scratch View ENDS Here/////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////

//////////CHECK AFTER 5SEC THAT SCRATCH VIEW 2 IS REVELED OR NOT////////////////////////////////////




        //////////////////////scratchview1(For 2nd Scratch View) Starts Here////////////////////////



            scratchView1.setRevealListener(new ScratchView.IRevealListener() {
                @Override
                public void onRevealed(ScratchView scratchView) {

                    stopingAnimation2();

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            Toast.makeText(getApplicationContext(), "Completed", Toast.LENGTH_LONG).show();
                            cardView2.setVisibility(View.INVISIBLE);
                            imgbehind2.setVisibility(View.VISIBLE);


                            ///////////////////////Bouncing ANIMATION Starts(FOR 2ND APPLE)//////////////////////////
                            ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(
                                    imgbehind2,
                                    PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                                    PropertyValuesHolder.ofFloat("scaleY", 1.1f));
                            scaleDown.setDuration(310);

                            scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
                            scaleDown.setRepeatMode(ObjectAnimator.REVERSE);

                            scaleDown.start();
                            //Bouncing ANIMATION Ends

                            ///////////////////Bouncing ANIMATION FOR SYNCRONIZATION FOR BOTH APPLES////////////////////////////////
                            ObjectAnimator scaleDown2 = ObjectAnimator.ofPropertyValuesHolder(
                                    imgbehind1,
                                    PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                                    PropertyValuesHolder.ofFloat("scaleY", 1.1f));
                            scaleDown2.setDuration(310);

                            scaleDown2.setRepeatCount(ObjectAnimator.INFINITE);
                            scaleDown2.setRepeatMode(ObjectAnimator.REVERSE);

                            scaleDown2.start();
                                                 ///////////////////Bouncing ANIMATION ends//////////////////////////

                        }
                    }, 3000);

                }


                @Override
                public void onRevealPercentChangedListener(ScratchView scratchView, float percent) {
                    if (percent >= 1) {
                        Log.d("Reveal Percentage", "onRevealPercentChangedListener: " + String.valueOf(percent));
                    }
                }

            });
        ////////////////////////////////////////////  Scratchview1 ENDS Here  ////////////////////////////////////////////
        }

//ANIMATIONS IN CARD VIEWS
    public void startingAnimation1(){
        cardView1.startAnimation(anim);

    }

    public  void stopingAnimation1(){
        cardView1.clearAnimation();

    }

        public void startingAnimation2(){
        cardView2.startAnimation(anim);

        }

        public  void stopingAnimation2(){
        cardView2.clearAnimation();

        }

    }



/////////////////////////////////////////////////////////////////////////////







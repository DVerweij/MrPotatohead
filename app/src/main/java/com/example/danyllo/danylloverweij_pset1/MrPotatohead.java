package com.example.danyllo.danylloverweij_pset1;

import android.graphics.PorterDuff;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MrPotatohead extends AppCompatActivity {
    // global variables for body parts
    public static ImageView eyes, ears, nose, glasses, shoes, eyebrows, mustache, arms, hat, mouth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
        //makes all body parts invisible at app start-up (or rotation)
        Boolean startUp = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
        if(startUp){
            startVisibilities();
        }
    }
    // function which sets up invisibilities of drawables at start-up
    protected void startVisibilities() {
        //eyes:
        eyes = (ImageView) findViewById(R.id.imageView6);
        eyes.setVisibility(View.INVISIBLE);
        //ears:
        ears = (ImageView) findViewById(R.id.imageView3);
        ears.setVisibility(View.INVISIBLE);
        //nose:
        nose = (ImageView) findViewById(R.id.imageView7);
        nose.setVisibility(View.INVISIBLE);
        //glasses:
        glasses = (ImageView) findViewById(R.id.imageView9);
        glasses.setVisibility(View.INVISIBLE);
        //shoes:
        shoes = (ImageView) findViewById(R.id.imageView5);
        shoes.setVisibility(View.INVISIBLE);
        //eyebrows:
        eyebrows = (ImageView) findViewById(R.id.imageView12);
        eyebrows.setVisibility(View.INVISIBLE);
        //mustache:
        mustache = (ImageView) findViewById(R.id.imageView8);
        mustache.setVisibility(View.INVISIBLE);
        //hat:
        hat = (ImageView) findViewById(R.id.imageView11);
        hat.setVisibility(View.INVISIBLE);
        //arms:
        arms = (ImageView) findViewById(R.id.imageView2);
        arms.setVisibility(View.INVISIBLE);
        //mouth:
        mouth = (ImageView) findViewById(R.id.imageView10);
        mouth.setVisibility(View.INVISIBLE);
    }
    public void changeVisibility(View view) {
        boolean check = ((CheckBox) view).isChecked();
        //sets the visibilities of drawable linked to checkbox
        switch (view.getId()) {
            case R.id.eyes:
                if (check) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.nose:
                if (check) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouth:
                if (check) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.ears:
                if (check) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.arms:
                if (check) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrows:
                if (check) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustache:
                if (check) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hat:
                if (check) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoes:
                if (check) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glasses:
                if (check) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}

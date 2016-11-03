package com.example.danyllo.danylloverweij_pset1;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MrPotatohead extends AppCompatActivity {

    public static ImageView eyes;
    public static ImageView ears;
    public static ImageView nose;
    public static ImageView glasses;
    public static ImageView shoes;
    public static ImageView eyebrows;
    public static ImageView mustache;
    public static ImageView arms;
    public static ImageView hat;
    public static ImageView mouth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);
        if(isFirstRun){
            startVisibilities();
        }
    }
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
        }
    }
}

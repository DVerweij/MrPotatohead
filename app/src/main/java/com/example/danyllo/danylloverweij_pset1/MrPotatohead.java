package com.example.danyllo.danylloverweij_pset1;

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

    public ImageView eyes = (ImageView) findViewById(R.id.imageView6);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mr_potatohead);
    }

    public void switchVisibility(View view) {
        boolean check = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.eyes:
                if (check) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
        }
    }
}

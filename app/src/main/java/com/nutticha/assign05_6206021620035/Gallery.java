package com.nutticha.assign05_6206021620035;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Gallery extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnImage1 , btnImage2 , btnImage3 , btnImage4 , btnImage5 , btnImage6 , btnImage7 , btnImage8;
    private ImageView ImageShow;
    private Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        btnImage1 = (ImageButton) findViewById(R.id.btnimage1);
        btnImage2 = (ImageButton) findViewById(R.id.btnimage2);
        btnImage3 = (ImageButton) findViewById(R.id.btnimage3);
        btnImage4 = (ImageButton) findViewById(R.id.btnimage4);
        btnImage5 = (ImageButton) findViewById(R.id.btnimage5);
        btnImage6 = (ImageButton) findViewById(R.id.btnimage6);
        btnImage7 = (ImageButton) findViewById(R.id.btnimage7);
        btnImage8 = (ImageButton) findViewById(R.id.btnimage8);
        ImageShow = (ImageView)   findViewById(R.id.imageShow);
        Back      = (Button)      findViewById(R.id.Back);
        btnImage1.setOnClickListener(this);
        btnImage2.setOnClickListener(this);
        btnImage3.setOnClickListener(this);
        btnImage4.setOnClickListener(this);
        btnImage5.setOnClickListener(this);
        btnImage6.setOnClickListener(this);
        btnImage7.setOnClickListener(this);
        btnImage8.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.Back){
            Toast.makeText(Gallery.this, "Back To Main", Toast.LENGTH_SHORT).show();
            finish();
        }

        if (id == R.id.btnimage1){
            ImageShow.setImageResource(R.drawable.view_1);
        }
        else if (id == R.id.btnimage2){
            ImageShow.setImageResource(R.drawable.view_2);
        }
        else if (id == R.id.btnimage3){
            ImageShow.setImageResource(R.drawable.view_3);
        }
        else if (id == R.id.btnimage4){
            ImageShow.setImageResource(R.drawable.view_4);
        }
        else if (id == R.id.btnimage5){
            ImageShow.setImageResource(R.drawable.view_6);
        }
        else if (id == R.id.btnimage6){
            ImageShow.setImageResource(R.drawable.view_7);
        }
        else if (id == R.id.btnimage7){
            ImageShow.setImageResource(R.drawable.view_8);
        }
        else if (id == R.id.btnimage8){
            ImageShow.setImageResource(R.drawable.view_9);
        }
    }
}
package com.nutticha.assign05_6206021620035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button CalGrade , CalVat , CalGPA , ShowGallery , ExitProgram;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CalGrade = (Button) findViewById(R.id.CalGrade);
        CalVat   = (Button) findViewById(R.id.CalVat);
        CalGPA   = (Button) findViewById(R.id.CalGPA);
        ShowGallery = (Button) findViewById(R.id.ShowGallery);
        ExitProgram = (Button) findViewById(R.id.Exit);

        CalGrade.setOnClickListener(this);
        CalVat.setOnClickListener(this);
        CalGPA.setOnClickListener(this);
        ShowGallery.setOnClickListener(this);
        ExitProgram.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.CalGrade){
            CalculateGrade();
        }
        else if (id == R.id.CalVat){
            CalculateVat();
        }
        else if(id == R.id.CalGPA){
            CalculateGPA();
        }
        else if (id == R.id.ShowGallery){
            ShowGallery();
        }
        else if (id == R.id.Exit){
            Toast.makeText(MainActivity.this ,
                    "Exit Main Activity" ,
                    Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    public void CalculateGrade(){
        Intent CalculateGrade1 = new Intent(MainActivity.this , Grade.class);
        startActivity(CalculateGrade1);
    }
    public void CalculateVat(){
        Intent CalculateVat1 = new Intent(MainActivity.this , Vat.class);
        startActivity(CalculateVat1);
    }
    public void CalculateGPA(){
        Intent CalculateGPA = new Intent(MainActivity.this , GPA.class);
        startActivity(CalculateGPA);
    }
    public void ShowGallery(){
        Intent ShowGallery1 = new Intent(MainActivity.this , Gallery.class);
        startActivity(ShowGallery1);
    }
}
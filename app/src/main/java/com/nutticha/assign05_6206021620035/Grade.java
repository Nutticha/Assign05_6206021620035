package com.nutticha.assign05_6206021620035;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Grade extends AppCompatActivity implements View.OnClickListener {
    private Button Back , CalGrade;
    private EditText EditScore;
    private TextView Score , Grade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);

        Back = (Button) findViewById(R.id.Back);
        Back.setOnClickListener(this);
        CalGrade = (Button)  findViewById(R.id.CalGrade);
        CalGrade.setOnClickListener(this);
        EditScore = (EditText) findViewById(R.id.EditScore);
        Score = (TextView) findViewById(R.id.Score);
        Grade = (TextView) findViewById(R.id.Grade);

    }

    @Override
    public void onClick(View v){
        String converEditToString = EditScore.getText().toString();
        String message = "";
        int id = v.getId();
        if (id == R.id.Back){
            Toast.makeText(Grade.this, "Back To Main", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (converEditToString.equals("")){
            Toast.makeText(this , "กรุณากรอกคะแนน" , Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            if(id == R.id.CalGrade){
                int score = Integer.parseInt(EditScore.getText().toString());

                if (score <= 49){
                    message = "F";
                }
                else if (score >= 50 && score <= 54 ){
                    message = "D";
                }
                else if (score >= 55 && score <= 59 ){
                    message = "D+";
                }
                else if (score >= 60 && score <= 64 ){
                    message = "C";
                }
                else if (score >= 65 && score <= 69 ){
                    message = "C+";
                }
                else if (score >= 70 && score <= 74 ){
                    message = "B";
                }
                else if (score >= 75 && score <= 79 ){
                    message = "B+";
                }
                else if (score >= 80 && score <= 100 ){
                    message = "A";
                }

                Score.setText(converEditToString + "");
                Grade.setText(message);
                return;
            }

        }


    }

}

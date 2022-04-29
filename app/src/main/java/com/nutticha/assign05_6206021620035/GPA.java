package com.nutticha.assign05_6206021620035;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class GPA extends AppCompatActivity implements View.OnClickListener {
    private EditText EditGrade1 , EditGrade2 , EditGrade3 , EditGrade4 ;
    private Button btnCalGPA , Back;
    private TextView Points , Credits , GPA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        EditGrade1 = (EditText) findViewById(R.id.EditGrade1);
        EditGrade2 = (EditText) findViewById(R.id.EditGrade2);
        EditGrade3 = (EditText) findViewById(R.id.EditGraded3);
        EditGrade4 = (EditText) findViewById(R.id.EditGrade4);
        btnCalGPA  = (Button) findViewById(R.id.btnCalGPA);
        Back       = (Button) findViewById(R.id.Back);
        Points     = (TextView) findViewById(R.id.points);
        Credits    = (TextView) findViewById(R.id.credits);
        GPA        = (TextView) findViewById(R.id.gpa);
        btnCalGPA.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String EditToString1 = EditGrade1.getText().toString();
        String EditToString2 = EditGrade2.getText().toString();
        String EditToString3 = EditGrade3.getText().toString();
        String EditToString4 = EditGrade4.getText().toString();
        int id = v.getId();
        if (id == R.id.Back){
            Toast.makeText(GPA.this, "Back To Main", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (EditToString1.equals("")){
            Toast.makeText(this , "กรุณากรอกข้อมูล" , Toast.LENGTH_SHORT).show();
            return;
        }
        else if (EditToString2.equals("")){
            Toast.makeText(this , "กรุณากรอกข้อมูล" , Toast.LENGTH_SHORT).show();
            return;
        }
        else if (EditToString3.equals("")){
            Toast.makeText(this , "กรุณากรอกข้อมูล" , Toast.LENGTH_SHORT).show();
            return;
        }
        else if (EditToString4.equals("")){
            Toast.makeText(this , "กรุณากรอกข้อมูล" , Toast.LENGTH_SHORT).show();
            return;
        }
        else {
            if (id == R.id.btnCalGPA){
                Double credit1 = 0.0 , credit2 = 0.0  , credit3 = 0.0  , credit4 = 0.0;
                Double grade1 = 0.0 , grade2 = 0.0 , grade3 = 0.0 , grade4 = 0.0;
                Double totalPoints1 = 0.0  , totalPoints2 = 0.0 , totalPoints3 = 0.0 , totalPoints4 = 0.0;


                DecimalFormat df = new DecimalFormat();
                df.applyPattern("0.00");

                if(EditToString1.equals("A")){
                    grade1 = 4.0;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("B+")){
                    grade1 = 3.5;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("B")){
                    grade1 = 3.0;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("C+")){
                    grade1 = 2.5;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("C")){
                    grade1 = 2.0;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("D+")){
                    grade1 = 1.5;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("D")){
                    grade1 = 1.0;
                    credit1 = 3.0;
                    totalPoints1 = grade1 * credit1;
                }
                else if (EditToString1.equals("F")){
                    grade1 = 0.0;
                    credit1 = 0.0;
                    totalPoints1 = grade1 * credit1;
                }

                if(EditToString2.equals("A")){
                    grade2 = 4.0;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("B+")){
                    grade2 = 3.5;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("B")){
                    grade2 = 3.0;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("C+")){
                    grade2 = 2.5;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("C")){
                    grade2 = 2.0;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("D+")){
                    grade2 = 1.5;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("D")){
                    grade2 = 1.0;
                    credit2 = 3.0;
                    totalPoints2 = grade2 * credit2;
                }
                else if (EditToString2.equals("F")){
                    grade2 = 0.0;
                    credit2 = 0.0;
                    totalPoints2 = grade2 * credit2;
                }

                if(EditToString3.equals("A")){
                    grade3 = 4.0;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("B+")){
                    grade3 = 3.5;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("B")){
                    grade3 = 3.0;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("C+")){
                    grade3 = 2.5;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("C")){
                    grade3 = 2.0;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("D+")){
                    grade3 = 1.5;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("D")){
                    grade3 = 1.0;
                    credit3 = 3.0;
                    totalPoints3 = grade3 * credit3;
                }
                else if (EditToString3.equals("F")){
                    grade3 = 0.0;
                    credit3 = 0.0;
                    totalPoints3 = grade3 * credit3;
                }

                if(EditToString4.equals("A")){
                    grade4 = 4.0;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("B+")){
                    grade4 = 3.5;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;

                }
                else if (EditToString4.equals("B")){
                    grade4 = 3.0;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("C+")){
                    grade4 = 2.5;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("C")){
                    grade4 = 2.0;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("D+")){
                    grade4 = 1.5;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("D")){
                    grade4 = 1.0;
                    credit4 = 3.0;
                    totalPoints4 = grade4 * credit4;
                }
                else if (EditToString4.equals("F")){
                    grade4 = 0.0;
                    credit4 = 0.0;
                    totalPoints4 = grade4 * credit4;
                }

                Double TotalsumPoints = totalPoints1 + totalPoints2 + totalPoints3 + totalPoints4;
                Double TotalsumCredit = credit1 + credit2 + credit3 + credit4;
                Double TotalsumGPA = TotalsumPoints / TotalsumCredit ;


                String StringTotalsumPoints = String.valueOf(df.format(TotalsumPoints));
                String StringTotalsumCredit = String.valueOf( df.format(TotalsumCredit));
                String StringTotalsumGPA = String.valueOf( df.format(TotalsumGPA));


                Points.setText(StringTotalsumPoints);
                Credits.setText(StringTotalsumCredit);
                GPA.setText(StringTotalsumGPA);

            }
        }


    }
}
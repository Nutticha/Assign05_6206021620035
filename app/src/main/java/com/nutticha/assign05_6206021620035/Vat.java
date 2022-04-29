package com.nutticha.assign05_6206021620035;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.DecimalFormat;

public class Vat extends AppCompatActivity implements View.OnClickListener {
    private EditText EditPrice;
    private Button btnCalvat , Back;
    private TextView Price , Vat , Total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vat);

        EditPrice = (EditText) findViewById(R.id.EditPrice);
        btnCalvat = (Button) findViewById(R.id.btnCalvat);
        Back = (Button) findViewById(R.id.Back);
        Price = (TextView) findViewById(R.id.price);
        Vat   = (TextView) findViewById(R.id.vat);
        Total = (TextView) findViewById(R.id.total);

        btnCalvat.setOnClickListener(this);
        Back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String EditToString = EditPrice.getText().toString();
        int id = v.getId();
        if (id == R.id.Back){
            Toast.makeText(Vat.this, "Back To Main", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (EditToString.equals("")){
            Toast.makeText(this , "กรุณากรอกตัวเลข" , Toast.LENGTH_SHORT).show();
            return;
        }
        else {
           if(id == R.id.btnCalvat){
               DecimalFormat df = new DecimalFormat();
               df.applyPattern("0.00");

               Double numprice = Double.parseDouble(EditToString);
               Double numvat = (numprice * 7)/100;
               Double numtotal = numprice + numvat;

               String messageVat = String.valueOf(df.format(numvat));
               String messageTotal = String.valueOf(df.format(numtotal));

               Price.setText(EditToString + "");
               Vat.setText(messageVat);
               Total.setText(messageTotal);
               return;
           }

        }


    }

}
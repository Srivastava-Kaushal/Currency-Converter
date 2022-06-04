package com.controller.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void click(View view){
        EditText currency=(EditText) findViewById(R.id.currency);
        String amountInDollar=currency.getText().toString();
        Double amountInDollarDouble= Double.parseDouble(amountInDollar);
        Double amountInRupeeDouble=amountInDollarDouble*0.013;
        TextView textView2= (TextView) findViewById(R.id.textView2);
        textView2.setText("$ "+ amountInRupeeDouble);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
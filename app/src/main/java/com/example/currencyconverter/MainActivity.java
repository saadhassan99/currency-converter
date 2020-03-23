package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public void currencyConverter (View view) {
        Log.i("Info", "Button Pressed!");

        EditText amount = findViewById(R.id.amount);

        String usdString = amount.getText().toString();

        double usd = Double.parseDouble(usdString);
        double pkr= usd * 158.72;

        String amountInPkr = String.format("%.2f", pkr);

        Log.i("amount in pkr", amountInPkr);

        Toast.makeText(this, usdString + "PKR is $" + amountInPkr, Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

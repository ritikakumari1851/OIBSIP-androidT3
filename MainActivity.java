package com.example.convertor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText usdAmount;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usdAmount = findViewById(R.id.usdAmount);
        result = findViewById(R.id.result);
    }

    public void convertCurrency(View view) {
        try {
            // Get the amount in USD from the EditText
            String usdAmountStr = usdAmount.getText().toString();
            double usd = Double.parseDouble(usdAmountStr);

            // Conversion rate (USD to EUR)
            double conversionRate = 0.85;

            // Convert USD to EUR
            double eur = usd * conversionRate;

            // Display the result
            result.setText(String.format("%.2f USD = %.2f EUR", usd, eur));
        } catch (NumberFormatException e) {
            // Handle invalid input
            result.setText("Invalid input. Please enter a valid number.");
        }
    }
}

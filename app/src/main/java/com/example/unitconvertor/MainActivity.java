package com.example.unitconvertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText addValueEditText;
    private EditText addUnitEditText;
    private TextView resultEditText;
    private Button centigramsButton;
    private Button gramsButton;
    private Button centiButton;
    private Button metersButton;
    private Button kilometersButton;
    private Button kilogramsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValueEditText = findViewById(R.id.addvalue);
        addUnitEditText = findViewById(R.id.addunit);
        resultEditText = findViewById(R.id.result);
        centigramsButton = findViewById(R.id.centigrams);
        gramsButton = findViewById(R.id.gram);
        centiButton = findViewById(R.id.centi);
        metersButton = findViewById(R.id.Meters);
        kilometersButton = findViewById(R.id.kilometers);
        kilogramsButton = findViewById(R.id.kilograms);

        setButtonListeners();
    }

    private void setButtonListeners() {
        centigramsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToCentigrams();
            }
        });

        gramsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToGrams();
            }
        });

        centiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToCentimeters();
            }
        });

        metersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToMeters();
            }
        });

        kilometersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToKilometers();
            }
        });

        kilogramsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertToKilograms();
            }
        });
    }

    private void convertToCentigrams() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("kg")) {
            double result = value * 1000; // Convert grams to centigrams
            displayResult(String.valueOf(result), "centigrams");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("gm")) {
            double result = value * 100; // Convert grams to centigrams
            displayResult(String.valueOf(result), "centigrams");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("cg")) {
            double result = value; // Convert grams to centigrams
            displayResult(String.valueOf(result), "centigrams");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
    }

    private void convertToKilograms() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("gm")) {
            double result = value / 1000; // Convert grams to kilograms
            displayResult(String.valueOf(result), "kilograms");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("cg")) {
            double result = value / 100000; // Convert grams to kilograms
            displayResult(String.valueOf(result), "kilograms");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("kg")) {
            double result = value; // Convert grams to kilograms
            displayResult(String.valueOf(result), "kilograms");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
    }

    private void convertToCentimeters() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("m")) {
            double result = value * 100; // Convert meters to centimeters
            displayResult(String.valueOf(result), "centimeters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("km")) {
            double result = value * 1000; // Convert meters to centimeters
            displayResult(String.valueOf(result), "centimeters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("cm")) {
            double result = value; // Convert meters to centimeters
            displayResult(String.valueOf(result), "centimeters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
    }

    private void convertToMeters() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("cm")) {
            double result = value / 100; // Convert centimeters to meters
            displayResult(String.valueOf(result), "meters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("km")) {
            double result = value * 1000; // Convert centimeters to meters
            displayResult(String.valueOf(result), "meters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("m")) {
            double result = value; // Convert centimeters to meters
            displayResult(String.valueOf(result), "meters");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
    }

    private void convertToKilometers() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("m")) {
            double result = value / 1000; // Convert meters to kilometers
            displayResult(String.valueOf(result), "kilometers");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("cm")) {
            double result = value / 100000; // Convert meters to kilometers
            displayResult(String.valueOf(result), "kilometers");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("km")) {
            double result = value; // Convert meters to kilometers
            displayResult(String.valueOf(result), "kilometers");
        } else {
            showToast("Unsupported unit for this conversion.");
        }
    }
    private void convertToGrams() {
        String valueStr = addValueEditText.getText().toString();
        String unitStr = addUnitEditText.getText().toString();

        if (valueStr.isEmpty() || unitStr.isEmpty()) {
            showToast("Please enter both value and unit.");
            return;
        }

        double value = Double.parseDouble(valueStr);

        if (unitStr.equalsIgnoreCase("kg")) {
            double result = value * 1000;
            displayResult(String.valueOf(result), "grams");
        }else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("cg")) {
            double result = value / 100;
            displayResult(String.valueOf(result), "grams");
        }
        else {
            showToast("Unsupported unit for this conversion.");
        }
        if (unitStr.equalsIgnoreCase("gm")) {
         double  result = value;
            displayResult(String.valueOf(result), "grams");
        }
        else {
            showToast("Unsupported unit for this conversion.");
        }
    }


    private void displayResult(String value, String unit) {
        resultEditText.setText(value + " " + unit);
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

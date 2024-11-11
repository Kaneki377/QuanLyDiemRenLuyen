package com.example.quanlydiemrenluyen;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class FormChamDiemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chamdiem);  // Set the layout for the activity

        // Find the Spinner by ID
        Spinner spinner1 = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);

        // Create an ArrayAdapter using the ratings_array from strings.xml
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ratings_array, android.R.layout.simple_spinner_item);

        // Set the layout for the dropdown items in the Spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Set the adapter to both spinners
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
    }
}



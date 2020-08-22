package com.example.map;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editTextCountryFromMap, editTextCapital, editTextCountry;
    private TextView textViewChoiceCountry, textViewСhoiceCapital;
    private ArrayList<Map<String, String>> listCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextCountryFromMap = findViewById(R.id.editTextCountryFromMap);
        editTextCapital = findViewById(R.id.editTextCapital);
        editTextCountry = findViewById(R.id.editTextCountry);
        textViewChoiceCountry = findViewById(R.id.textViewChoiceCountry);
        textViewСhoiceCapital = findViewById(R.id.textViewСhoiceCapital);
        listCountry = new ArrayList<>();


    }

    public void addToMap(View view) {
        if (editTextCapital != null && editTextCountry != null) {
            Map<String, String> map = new HashMap<>();
            map.put("country", editTextCountry.getText().toString().trim());
            map.put("capital", editTextCapital.getText().toString().trim());
            listCountry.add(map);
        }
        else Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
    }
}

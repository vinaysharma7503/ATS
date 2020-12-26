package com.example.ats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistrationDate extends AppCompatActivity {

    Button btnDateSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_date);

        btnDateSubmit = findViewById(R.id.btnDateSubmit);

        btnDateSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationDate.this,com.example.ats.Registration.class);
                startActivity(intent);
            }
        });
    }
}
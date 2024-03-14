package com.example.lab5_6_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class ContactInfo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_info);


        Intent intent = getIntent();

        ((TextView)findViewById(R.id.txtNume)).setText(intent.getStringExtra("name"));
        ((TextView)findViewById(R.id.txtNumber)).setText(intent.getStringExtra("number"));
        ((TextView)findViewById(R.id.txtLinkedin)).setText(intent.getStringExtra("linkedin"));

    }
}
package com.example.mobilepractic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Greeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);
    }
    public void Log(View v) {
        Intent intent = new Intent(Greeting.this, Autorization.class);
        startActivity(intent);
    }
}
package com.example.healthconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class OnboardingStep1Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_step1);
        ImageButton button1 = (ImageButton) findViewById(R.id.btOnboarding1_next);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnboardingStep1Activity.this, OnboardingStep2Activity.class));
            }
        });

        Button button2 = (Button) findViewById(R.id.btOnboarding1_skip);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnboardingStep1Activity.this, OnboardingStep3Activity.class));
            }
        });
    }
}
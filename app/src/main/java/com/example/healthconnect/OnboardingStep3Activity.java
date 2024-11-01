package com.example.healthconnect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnboardingStep3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_step3);

        Button button1 = (Button) findViewById(R.id.btonboarding3_login);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnboardingStep3Activity.this, LoginActivity.class));
            }
        });

        Button button2 = (Button) findViewById(R.id.btOnboarding3_signup);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(OnboardingStep3Activity.this, RegistrationActivity.class));
            }
        });
    }
}
package com.example.bankyx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView signin;
    Button google_login,create_account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        IniciarComponentes();
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this,LoginActivity.class));
            }
        });
        create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this,RegisterActivity.class));
            }
        });
    }
    private void IniciarComponentes() {
        signin = findViewById(R.id.tv_signin);
        google_login = findViewById(R.id.button_google_login);
        create_account = findViewById(R.id.button_create_account);
    }
}
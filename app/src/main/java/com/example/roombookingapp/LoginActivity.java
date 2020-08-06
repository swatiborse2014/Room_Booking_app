package com.example.roombookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private static EditText userName, password;
    private static Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        onLoginClick();
    }

    public void onLoginClick() {
        userName = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userName.getText().toString().equals("User") && password.getText().toString().equals("Android")) {
                    Intent i = new Intent(LoginActivity.this, Homepage.class);
                    startActivity(i);
                } else {
                    Intent i = new Intent(LoginActivity.this, Homepage.class);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {

    }
}

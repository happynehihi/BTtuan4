package com.google.giaodienprofilend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        MaterialButton loginbtnup = (MaterialButton) findViewById(R.id.loginbtnup);
        loginbtnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent=new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(myIntent);

            }
        });

    }
}

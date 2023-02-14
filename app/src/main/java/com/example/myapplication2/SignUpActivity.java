package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    Button btnS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btnS=findViewById(R.id.btnS);

        btnS.setOnClickListener(Listen4);

        View.OnClickListener Listen4=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent4);
            }
        };
    }
}
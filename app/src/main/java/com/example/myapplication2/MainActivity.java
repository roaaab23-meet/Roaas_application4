package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvSignin;
    EditText etEmail;
    EditText etPassword;
    Button btnSignin;
    Button btnSignup;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        tvSignin=findViewById(R.id.tvSignin);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnSignin=findViewById(R.id.btnSignin);
        btnSignup=findViewById(R.id.btnSignup);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSignup.setOnClickListener(Listen1);
        btnSignin.setOnClickListener(Listen2);
        btnSubmit.setOnClickListener(Listen3);

        View.OnClickListener Listen3=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(intent1);
            }
        }


        View.OnClickListener Listen1 =new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 etEmail.setText(etEmail.getText());
                 etPassword.setText(etPassword.getText());
                 Intent intent2=new Intent(getApplicationContext(), HomeActivity.class);
                 startActivity(intent2);
             }

         };
         View.OnClickListener Listen2 =new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Toast.makeText(getApplicationContext(), "signup is under construction", Toast.LENGTH_LONG).show();
             }
         };
    }
}
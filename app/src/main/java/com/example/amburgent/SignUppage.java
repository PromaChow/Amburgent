package com.example.amburgent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUppage extends AppCompatActivity {

    EditText user,phone;
    Button withFb,withGoog,sign_in;
    String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_uppage);
        user = findViewById(R.id.username);
        phone = findViewById(R.id.phone);
        withFb =findViewById(R.id.fb_sign);
        withGoog = findViewById(R.id.google_sign);

    }
    public void sign_in(View v){
        //you have to add country code
        phoneNumber ="+88"+phone.getText().toString();

        Intent intent = new Intent(getApplicationContext(), OTPpage.class);
        intent.putExtra("phoneNumber",phoneNumber);
        startActivity(intent);
    }



}
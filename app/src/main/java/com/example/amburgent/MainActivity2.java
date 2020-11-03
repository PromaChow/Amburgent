package com.example.amburgent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //FirebaseApp.initializeApp(getApplicationContext());
       

    }

    public void log_out(View view) {

        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(getApplicationContext(),SignUppage.class);
        startActivity(intent);
    }
}
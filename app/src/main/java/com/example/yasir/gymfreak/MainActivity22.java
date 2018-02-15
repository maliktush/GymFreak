package com.example.yasir.gymfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity22 extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        mAuth=FirebaseAuth.getInstance();
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user has not already signed in to the account
        // if he hasn't then go to StartActivity page directly

        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser==null){
            Intent StartIntent = new Intent(MainActivity22.this,StartActivity.class);
            startActivity(StartIntent);
            finish();
        }

        else{

            Intent intent=new Intent(MainActivity22.this,MainActivity.class);
            startActivity(intent);
        }

    }
}

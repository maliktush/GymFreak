package com.example.yasir.gymfreak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    ImageButton b11,b12,b21,b22,b31,b32;
    Button bout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bout= (Button) findViewById(R.id.blogout);
        b11=(ImageButton)findViewById(R.id.b11);
        b12=(ImageButton)findViewById(R.id.b12);
        b21=(ImageButton)findViewById(R.id.b21);
        b22=(ImageButton)findViewById(R.id.b22);
        b31=(ImageButton)findViewById(R.id.b31);
        b32=(ImageButton)findViewById(R.id.b32);
       b11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i=new Intent(MainActivity.this,ChestActivity.class);
               startActivity(i);
           }
       });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,BackActivity.class);
                startActivity(i);
            }
        });
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ArmsActivity.class);
                startActivity(i);
            }
        });
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,ShoulderActivity.class);
                startActivity(i);
            }
        });
        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,LegsActivity.class);
                startActivity(i);
            }
        });
        b32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,CardioActivity.class);
                startActivity(i);
            }
        });
        bout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent i=new Intent(MainActivity.this,StartActivity.class);
                startActivity(i);
            }
        });
    }
}

package com.example.yasir.gymfreak;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private TextInputLayout mDisplayName ;
    private TextInputLayout mDisplayEmail ;
    private TextInputLayout mDisplayPassword ;
    private Button OnaccCreateButton;

    private Toolbar mToolbar;

    //firebase
    private FirebaseAuth mAuth;

    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.reg_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Create Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mProgressDialog =new ProgressDialog(this);

        mDisplayName=(TextInputLayout) findViewById(R.id.reg_name);
        mDisplayEmail=(TextInputLayout)findViewById(R.id.reg_email);
        mDisplayPassword=(TextInputLayout)findViewById(R.id.reg_password);
        OnaccCreateButton=(Button)findViewById(R.id.reg_createAccount_button);

        //firebase
        mAuth = FirebaseAuth.getInstance();

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent start_intent = new Intent(RegisterActivity.this,StartActivity.class);
                startActivity(start_intent);
                finish();
            }
        });


        OnaccCreateButton.setOnClickListener(new View.OnClickListener() {
            //On click listener for create new account button
            @Override
            public void onClick(View view) {

                String name = mDisplayName.getEditText().getText().toString();
                String email = mDisplayEmail.getEditText().getText().toString();
                String password = mDisplayPassword.getEditText().getText().toString();

                if(!TextUtils.isEmpty(name) || !TextUtils.isEmpty(email)|| !TextUtils.isEmpty(password)){
                    mProgressDialog.setMessage("Please Wait while you are registered");
                    mProgressDialog.setCanceledOnTouchOutside(false);
                    mProgressDialog.show();
                    register_user(name,email,password);
                }
            }
        });

    }

    //firebase code to register new user
    private void register_user(String name, String email, String password) {
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mProgressDialog.dismiss();

                            Intent mainIntent = new Intent(RegisterActivity.this,MainActivity.class);

                            startActivity(mainIntent);
                            finish();
                        } else {
                            mProgressDialog.hide();
                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }
                    }


                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(RegisterActivity.this,e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }




}

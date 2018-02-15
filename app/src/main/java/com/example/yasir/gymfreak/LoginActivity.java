package com.example.yasir.gymfreak;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {



    private ProgressDialog mProgressDialog;


    private TextInputLayout mEmail;
    private TextInputLayout mPassword;
    private Button mButton;

    //firebase code
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        mProgressDialog =new ProgressDialog(this);

        android.app.ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        mEmail=(TextInputLayout)findViewById(R.id.login_email);
        mPassword=(TextInputLayout)findViewById(R.id.login_password);
        mButton=(Button)findViewById(R.id.login_loginButton);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = mEmail.getEditText().getText().toString();
                String password = mPassword.getEditText().getText().toString();

                if(!TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)){

                    mProgressDialog.setMessage("Logging in");
                    mProgressDialog.setCanceledOnTouchOutside(false);
                    mProgressDialog.show();
                    login_user(email,password);
                }

            }
        });


    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent start_intent = new Intent(LoginActivity.this,StartActivity.class);
        startActivity(start_intent);
        return true;

    }


    private void login_user(String email , String password){

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent mainIntent = new Intent(LoginActivity.this,MainActivity.class);

                            startActivity(mainIntent);
                            finish();

                            mProgressDialog.dismiss();
                            FirebaseUser user = mAuth.getCurrentUser();

                        } else {
                            mProgressDialog.hide();
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(LoginActivity.this,e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();


            }});
    }
}

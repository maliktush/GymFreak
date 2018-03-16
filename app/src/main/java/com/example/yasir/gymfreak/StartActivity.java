package com.example.yasir.gymfreak;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

//public class StartActivity extends AppCompatActivity {
//
//    private SignInButton loginButton;
//
//    private FirebaseAuth mAuth;
//
//    private final static int  RC_SIGN_IN=1234;
//    private GoogleApiClient mGoogleApiClient;
//
//    private GoogleSignInApi mGoogleSignInClient;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_start);
//
//        mAuth = FirebaseAuth.getInstance();
//        GoogleSignInOptions gso=new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).
//                requestIdToken(getString(R.string.default_web_client_id)).
//                requestEmail().
//                build();
//
//
////        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
////                .requestIdToken(getString(R.string.default_web_client_id))
////                .requestEmail()
////                .build();
//
//
//        mGoogleApiClient = new GoogleApiClient.Builder(this).enableAutoManage(this, new GoogleApiClient.OnConnectionFailedListener() {
//            @Override
//            public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//                Toast.makeText(StartActivity.this, "YOU HAVE AN ERROR", Toast.LENGTH_SHORT).show();
//            }
//        }).addApi(Auth.GOOGLE_SIGN_IN_API,gso).build();
//
//
//
//
//        loginButton=(SignInButton) findViewById(R.id.sign_in_button);
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                signIn();
//
//            }
//        });
//    }
//    private void signIn(){
//        Intent signInIntent=mGoogleSignInClient.getSignInIntent(mGoogleApiClient);
//        startActivityForResult(signInIntent,RC_SIGN_IN);
//    }
//
////    private void signIn() {
////        Intent signInIntent = mGoogleSignInClient.getSignInIntent(mGoogleApiClient);
////        startActivityForResult(signInIntent, RC_SIGN_IN);
////    }
//
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
//        if (requestCode == RC_SIGN_IN) {
//            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
//            try {
//                // Google Sign In was successful, authenticate with Firebase
//                GoogleSignInAccount account = task.getResult(ApiException.class);
//                firebaseAuthWithGoogle(account);
//            } catch (ApiException e) {
//                // Google Sign In failed, update UI appropriately
//            }
//        }
//    }
//
//    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {
//
//        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
//        mAuth.signInWithCredential(credential)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//
//                            FirebaseUser user = mAuth.getCurrentUser();
//
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Toast.makeText(StartActivity.this, "Sign in failed", Toast.LENGTH_SHORT).show();
//                        }
//
//                        // ...
//                    }
//                });
//    }
//
//
//    public void OnStartToRegisterButtonClick(View view) {
//        Intent register_intent = new Intent(StartActivity.this,RegisterActivity.class);
//        startActivity(register_intent);
//        finish();
//
//    }
//
//    public void OnclickForLoginButton(View view) {
//        Intent login_intent = new Intent(StartActivity.this,LoginActivity.class);
//        startActivity(login_intent);
//        finish();
//
//    }
//}
public class StartActivity extends AppCompatActivity {

    private SignInButton loginButton;

    private FirebaseAuth mAuth;

    private final static int  RC_SIGN_IN=1234;

    private GoogleSignInClient mGoogleSignInClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        mAuth = FirebaseAuth.getInstance();


        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        loginButton=findViewById(R.id.sign_in_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn();
            }
        });
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            Intent main_intent = new Intent(StartActivity.this,MainActivity.class);
            startActivity(main_intent);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account);
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately

            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {


        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            FirebaseUser user = mAuth.getCurrentUser();


                        } else {
                            Toast.makeText(StartActivity.this, "Login Via Google Failed !", Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }




    public void OnStartToRegisterButtonClick(View view) {
        Intent register_intent = new Intent(StartActivity.this,RegisterActivity.class);
        startActivity(register_intent);
        finish();

    }

    public void OnclickForLoginButton(View view) {
        Intent login_intent = new Intent(StartActivity.this,LoginActivity.class);
        startActivity(login_intent);
        finish();

    }
}

package com.example.navyaspc.helpneedy;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public EditText username;
    public EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void LoginButton(View v){

        username = (EditText) findViewById(R.id.Emailedittest);
        password = (EditText) findViewById(R.id.Passwordedittest);

        if(username.length()==0 && password.length()==0){
            AlertDialog.Builder alertdialogbuilder3 = new AlertDialog.Builder(this);
            alertdialogbuilder3.setTitle("Warning!!")
                    .setMessage("You need to enter userid and password")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            AlertDialog alertDialog3 = alertdialogbuilder3.create();
            alertDialog3.show();
        }

        else if(username.length()==0) {
            AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(this);
            alertdialogbuilder.setTitle("Warning!!")
                    .setMessage("You need to enter the userid")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            AlertDialog alertDialog = alertdialogbuilder.create();
            alertDialog.show();
        }
        else if(password.length()==0){
            AlertDialog.Builder alertdialogbuilder2 = new AlertDialog.Builder(this);
            alertdialogbuilder2.setTitle("Warning!!")
                    .setMessage("You need to enter the password")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
            AlertDialog alertDialog2 = alertdialogbuilder2.create();
            alertDialog2.show();
        }

        else {
            Intent homeintent = new Intent(this, HomeActivity.class);
            startActivity(homeintent);
        }

    }

    public void signupButton(View v){
        Intent signupintent = new Intent(this, SignupActivity.class);
        startActivity(signupintent);
    }
}

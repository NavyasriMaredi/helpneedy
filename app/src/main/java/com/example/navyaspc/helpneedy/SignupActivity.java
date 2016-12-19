package com.example.navyaspc.helpneedy;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    public EditText name;
    public EditText email;
    public EditText password;
    public EditText confpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    public void signupbutton(View v){

        name = (EditText) findViewById(R.id.nameEditTest);
        email = (EditText) findViewById(R.id.emailEditTest);
        password = (EditText) findViewById(R.id.passworEditTest);
        confpassword = (EditText) findViewById(R.id.confirmEditTest);

        String emailstring = email.getText().toString();

        if(name.length() == 0 || email.length() == 0 || password.length() == 0 || confpassword.length() == 0){
            AlertDialog.Builder nameab = new AlertDialog.Builder(this);
            nameab.setTitle("Warning!")
                    .setMessage("Mandatory fields should not be blank")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

            AlertDialog name = nameab.create();
            name.show();
        }

        else if(isValidEmail(emailstring) == false){
            AlertDialog.Builder emailvalidab = new AlertDialog.Builder(this);
            emailvalidab.setTitle("Warning!")
                    .setMessage("Please enter a valid email")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });

            AlertDialog emailvalid = emailvalidab.create();
            emailvalid.show();
        }


        else if(password.length() < 6){
            AlertDialog.Builder passab = new AlertDialog.Builder(this);
            passab.setTitle("Warning!")
                    .setMessage("Password length should be of min 6 characters")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            AlertDialog pass = passab.create();
            pass.show();
        }

        else if(password != confpassword){
            AlertDialog.Builder confab = new AlertDialog.Builder(this);
            confab.setTitle("Warning!")
                    .setMessage("Password and confirm password are not matching")
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
            AlertDialog conf = confab.create();
            conf.show();
        }

    }

    public final static boolean isValidEmail(CharSequence email){
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }
}

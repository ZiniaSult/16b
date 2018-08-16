package com.example.networklab.alca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etUsername, etPassword;
    private Button btnLogin, btnCreateAcc;
    private String uname, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = (EditText) findViewById(R.id.username);
        etPassword = findViewById(R.id.pass);

        btnLogin = findViewById(R.id.login);
        btnCreateAcc = findViewById(R.id.createAcc);

        btnLogin.setOnClickListener(this);
        btnCreateAcc.setOnClickListener(this);





        //Toast.makeText(this,  etUsername.getText().toString()  + "kdfjkd " , Toast.LENGTH_LONG).show();



       // Toast.makeText(this, "On Create Called" , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart Called111" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume Called22222" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause Called3333333" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "OnStop Called" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy Called44444444" , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "restart Called44444444" , Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        if (v==btnLogin){

            uname = etUsername.getText().toString();
            pass = etPassword.getText().toString();
            Toast.makeText(this,  uname  + pass , Toast.LENGTH_SHORT).show();

        }

        else if (v==btnCreateAcc){
            Toast.makeText(this, "Create New Account" , Toast.LENGTH_SHORT).show();

        }else{

        }
    }
}

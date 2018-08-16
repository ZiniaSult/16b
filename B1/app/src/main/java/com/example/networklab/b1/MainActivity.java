package com.example.networklab.b1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnlogin;
    private EditText etname, etpass;
    private TextView tvinfo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnlogin = findViewById(R.id.login);
        etname = findViewById(R.id.username);
        etpass = findViewById(R.id.password);
        tvinfo = findViewById(R.id.info);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = etname.getText().toString();
                String b = etpass.getText().toString();
                tvinfo.setText("Your Have Provided Name: "+a +"\nAnd Password: "+ b );
            }
        });


    }

}

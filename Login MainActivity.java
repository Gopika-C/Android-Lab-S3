package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user,pass,dis;
        Button submit,reset;

        user=(EditText)findViewById(R.id.ed1);
        pass=(EditText)findViewById(R.id.ed2);
        dis=(EditText)findViewById(R.id.ed3);

        submit=(Button) findViewById(R.id.b1);
        reset=(Button) findViewById(R.id.b2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n=user.getText().toString();
                dis.setText("Welcome "+n);
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setText((" "));
                pass.setText(" ");
            }
        });






    }
}

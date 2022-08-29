package com.example.linearloginevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user,pass;
        Button submit,reset;

        user=(EditText)findViewById(R.id.e1);
        pass=(EditText)findViewById(R.id.e2);

        submit=(Button) findViewById(R.id.button);
        reset=(Button) findViewById(R.id.button2);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("admin") &&
                        pass.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Login Successfull", Toast.LENGTH_SHORT).show();
                }
                else if(user.getText().toString().equals("admin") &&
                        pass.getText().toString().equals("admin")){
                    Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                }
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
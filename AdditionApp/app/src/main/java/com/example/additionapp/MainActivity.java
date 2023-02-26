package com.example.additionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText n1 = (EditText) findViewById(R.id.n1);
                EditText n2 = (EditText) findViewById(R.id.n2);

                TextView res = (TextView) findViewById(R.id.res);
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());

                res.setText(sum + "");
            }
        });
    }
}
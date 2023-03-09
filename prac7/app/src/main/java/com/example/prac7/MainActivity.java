package com.example.prac7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView t1, t2;
    private EditText e1, e2;
    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.Edit1);
        e2 = (EditText) findViewById(R.id.Edit2);

        t1 = (TextView) findViewById(R.id.Display1);
        t2 = (TextView) findViewById(R.id.Display2);

        b1 = (Button) findViewById(R.id.Submit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t1.setText("Name: "+e1.getText().toString());
                t2.setText("Enrollment No: "+e2.getText().toString());
            }
        });
    }
}
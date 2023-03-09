package com.example.practical81;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton sb1;
        sb1 = (ToggleButton) findViewById(R.id.tb1);

        sb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String status = "Bluetooth: " +sb1.getText();
                Toast.makeText(getApplicationContext(),status, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
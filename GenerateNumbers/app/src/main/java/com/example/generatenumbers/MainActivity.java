package com.example.generatenumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText fet = (EditText) findViewById(R.id.Norange);
                TextView res = (TextView) findViewById(R.id.put);

                int range = Integer.parseInt(fet.getText().toString());
                Random r = new Random();
                int randomNumber = r.nextInt(range - 0)+0;
                res.setText(randomNumber+"");
            }
        });
    }
}
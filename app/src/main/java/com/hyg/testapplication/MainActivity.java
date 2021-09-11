package com.hyg.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainTV;
    Button workBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainTV = findViewById(R.id.textView);
        workBtn = findViewById(R.id.button);

        workBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainTV.setText("It Worked");
            }
        });
    }
}
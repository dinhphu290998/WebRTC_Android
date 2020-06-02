package com.example.sentdatatoandback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView result;
    Button add;
    Button sub;
    Button mul;
    Button dev;
    int soA;
    int soB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        initOutlets();
        getDataFromActivity1();
        backDataToActivity1();
    }

    void initOutlets() {
        result = findViewById(R.id.tvResult);
        add = findViewById(R.id.buttonAdd);
        sub = findViewById(R.id.buttonSub);
        mul = findViewById(R.id.buttonMul);
        dev = findViewById(R.id.buttonDev);

    }
    void getDataFromActivity1() {
        Intent intent = getIntent();
        soA = intent.getIntExtra("numberA",0);
        soB = intent.getIntExtra("numberB",0);
        result.setText(soA + "," + soB);
    }

    void backDataToActivity1() {
        final Intent backDataIntent = new Intent();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = soA + soB;
                backDataIntent.putExtra("resultFromActivity2",sum);
                setResult(RESULT_OK,backDataIntent);
                finish();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

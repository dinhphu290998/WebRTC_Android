package com.example.sentdatatoandback;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resutlTV;
    private EditText editTextA;
    private EditText editTextB;
    private Button buttonPassData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initOutlets();
        sendDataToActivity2();
    }

    public void initOutlets() {
        resutlTV = findViewById(R.id.tvResult);
        editTextA = findViewById(R.id.editTextA);
        editTextB = findViewById(R.id.editTextB);
        buttonPassData = findViewById(R.id.passData);
    }

    public void sendDataToActivity2() {
        buttonPassData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextA.getText().toString() != "" && editTextB.getText().toString() != "") {
                    int soA = Integer.parseInt(editTextA.getText().toString());
                    int soB = Integer.parseInt(editTextB.getText().toString());

                    Intent intent = new Intent(MainActivity.this,Activity2.class);
                    intent.putExtra("numberA", soA);
                    intent.putExtra("numberB",soB);

                    startActivityForResult(intent,1);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            int result = data.getIntExtra("resultFromActivity2",0);
            resutlTV.setText(result + "");
        }
    }
}

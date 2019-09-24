package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityHal1 extends AppCompatActivity {

    Button btnHal2;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        input = findViewById(R.id.Input);

        btnHal2 = findViewById(R.id.btnHal2);
        btnHal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TextInput = input.getText().toString();
                startActivity(new Intent(ActivityHal1.this, ActivityHal2.class).putExtra("Hasil",TextInput));
            }
        });
    }
}
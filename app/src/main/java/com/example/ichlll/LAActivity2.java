package com.example.ichlll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LAActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laactivity2);

        TextView textView = findViewById(R.id.resultFromSecondActivity);
        String str = getIntent().getStringExtra("date");
        textView.setText(str);
    }
}
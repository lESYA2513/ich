package com.example.ichlll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity2 extends AppCompatActivity {

    TextView textResult, textnumder2;
    Button button;
    EditText text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);


        textResult = findViewById(R.id.textView4);
        button = findViewById(R.id.button4);
        text1 = findViewById(R.id.editTextTextPersonName);
        text2 = findViewById(R.id.editTextTextPersonName2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    double num1, num2;
                    num1 = Double.parseDouble(text1.getText().toString());
                    num2 = Double.parseDouble(text2.getText().toString());
                    textResult.setText(num1+ num2 +"");

                    //передадим результат в третье активити
                    Intent intent = new Intent(secondActivity2.this, LAActivity2.class);
                    intent.putExtra("date", num1 + num2+"");
                    startActivity(intent);

                }catch (Exception e){
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
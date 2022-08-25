package com.example.ichlll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    static int count = 0;
    TextView textView;

    public MainActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ClickButtonkButton);
        textView = findViewById(R.id.AbenXtextView3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                button.setText(count+"");

                if (count > 10 && count < 50){
                    textView.setText("не плохо>");
                }
                if  (count >70 && count <100){
                    textView.setText("Вауу! Потрясающе!");
                }
                if (count > 101){
                    textView.setText("Ты реально крутой");
                }
                if (count == 100){
                    Toast.makeText(getApplicationContext(), "Ого как много!)", Toast.LENGTH_LONG).show();
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, secondActivity2.class);
                startActivity(intent);
            }
        });


    }
}
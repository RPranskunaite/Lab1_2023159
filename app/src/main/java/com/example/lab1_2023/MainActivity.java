package com.example.lab1_2023;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button btnChangeMainText;
    Button mBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.btnChangeMainText = (Button) findViewById(R.id.btnChangeMainText);
        btnChangeMainText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvMain.setText("Text was changed!");
            }



            public void mBtn(View view) {
                tvMain.setTextColor(getResources().getColor(R.color.RED));
            }
        });

    }

//    public void onBtnChangeMainTextClick(View view) {
//        this.tvMain.setText("Text was changed!");
//    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity_2c extends AppCompatActivity {
    ImageButton imageButton1,imageButton2;
    TextView textView1, textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2c);
        imageButton1 = findViewById(R.id.imageButtonadd);
        imageButton2 = findViewById(R.id.imageButtonremove);
        textView1 = findViewById(R.id.textViewquantity);
        textView2 = findViewById(R.id.textViewPrice);
        textView3 = findViewById(R.id.textViewPrice2);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView1.getText().toString();
                textView1.setText((Integer.parseInt(s)+1)+"");
                textView2.setText(141800*Integer.parseInt(textView1.getText().toString())+"đ");
                textView3.setText(textView2.getText());
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = textView1.getText().toString();
                if (Integer.parseInt(s)!=0) {
                    textView1.setText((Integer.parseInt(s) - 1)+"");
                    textView2.setText(141800*Integer.parseInt(textView1.getText().toString())+"đ");
                    textView3.setText(textView2.getText());
                }
                else textView1.setText(Integer.parseInt(s));
            }
        });

    }
}
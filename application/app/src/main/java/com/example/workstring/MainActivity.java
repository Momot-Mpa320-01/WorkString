package com.example.workstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1,text2;
    private Button gen;
    private String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        str = Pharser.PhraserGen();
        text1.setText("Всё, что нам нужно – это "+str+".");
        text2.setText(str.substring(0, 1).toUpperCase() + str.substring(1) + "– это всё, что нам нужно.");
        gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = Pharser.PhraserGen();
                text1.setText("Всё, что нам нужно – это "+str+".");
                text2.setText(str.substring(0, 1).toUpperCase() + str.substring(1) + "– это всё, что нам нужно.");
            }
        });
    }

    private void init(){
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        gen = findViewById(R.id.gen);

    }
}
package com.example.botton1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv= findViewById(R.id.tv);
    }
    public void Click(View view){
        x ++;
        tv.setWidth(10);
        tv.setTextColor(Color.GREEN);
        btn.setText("This a click number:"+ x);
    }
}
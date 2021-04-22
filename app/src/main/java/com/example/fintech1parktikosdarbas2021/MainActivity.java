package com.example.fintech1parktikosdarbas2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvMain;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = findViewById(R.id.tvMain);
        this.b1 = (Button) findViewById(R.id.btnMain2);
    }

    public void OnBtnclick(View view) {
        this.tvMain.setText(R.string.changed_label_caption);
    }
    public void OnBtnclick2(View view) {
        this.tvMain.setTextColor(Color.GREEN);
    }
}
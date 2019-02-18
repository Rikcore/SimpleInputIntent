package com.waxym.simpleinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView textView = findViewById(R.id.textView);

        Intent i = getIntent();
        String monTexte = i.getStringExtra("CLEDEMONTEXTE");

        textView.setText(monTexte);
    }
}

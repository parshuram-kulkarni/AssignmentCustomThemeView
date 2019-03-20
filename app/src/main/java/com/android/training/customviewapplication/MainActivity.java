package com.android.training.customviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnSubmit);
        String txt = btn.getText().toString();
        StringBuffer sb = new StringBuffer(txt);
        btn.setText(sb.reverse());

    }
}

package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size = 15;
    public void response(View v){
        EditText ed1,ed2,ed3;
        TextView txv;

        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);
        txv = findViewById(R.id.textView);

        txv.setTextSize(size);
        txv.setText(ed1.getText().toString() + "您好\n" + "您的BMI是: ");
    }

}

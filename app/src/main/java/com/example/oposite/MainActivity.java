package com.example.oposite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv = findViewById(R.id.textView);
    String textV = tv.getText().toString();
    private Button btn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a = findViewById(R.id.ed1);
        String ed = a.getText().toString();
        btn.setOnClickListener(this);
        char[] arr = ed.toCharArray();

        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);

        for (int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
            textV = String.valueOf(arr[i]);
        }

    }

    public void onClick(View v) {
            btn.setText(textV);
    }
}
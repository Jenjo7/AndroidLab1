package com.example.giannisavini.lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonFun;
    private CheckBox checkBox;
    private TextView lable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFun = (Button) findViewById(R.id.button_fun);
        lable = (TextView ) findViewById(R.id.textView);
        checkBox = (CheckBox) findViewById(R.id.checkBox);

        /*
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lable.setText("CheckBox is been hit");
            }
        });
        */
        buttonFun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lable.setText("BUTTON IS BEEN PRESSED!");
            }
        });
    }
}

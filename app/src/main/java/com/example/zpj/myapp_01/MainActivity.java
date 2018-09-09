package com.example.zpj.myapp_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private  boolean ledon = false;
    private Button button = null;

    //-------------------------外部类-------------------------------------------------
    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ledon = !ledon;
            if (ledon) {
                button.setText("ALL OFF");
            } else {
                button.setText("ALL ON");
            }
        }
    }
    //-------------------------外部类-------------------------------------------------

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new MyButtonListener());//调用外部类

        //-------------------------匿名类-------------------------------------------------
        /*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                ledon = !ledon;
                if (ledon) {
                    button.setText("ALL OFF");
                } else {
                    button.setText("ALL ON");
                }
            }
        });
        */
        //-------------------------匿名类-------------------------------------------------


    }
}

package com.example.zpj.myapp_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.security.cert.Extension;


public class MainActivity extends AppCompatActivity {

    private  boolean ledon = false;
    private Button button = null;

    private CheckBox checkBoxLed1 = null;
    private CheckBox checkBoxLed2 = null;
    private CheckBox checkBoxLed3 = null;
    private CheckBox checkBoxLed4 = null;
    private Extension view;

    //-------------------------外部类-------------------------------------------------
    class MyButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            ledon = !ledon;
            if (ledon) {
                button.setText("ALL OFF");
                checkBoxLed1.setChecked(true);
                checkBoxLed2.setChecked(true);
                checkBoxLed3.setChecked(true);
                checkBoxLed4.setChecked(true);


            } else {
                button.setText("ALL ON");
                checkBoxLed1.setChecked(false);
                checkBoxLed2.setChecked(false);
                checkBoxLed3.setChecked(false);
                checkBoxLed4.setChecked(false);
            }
        }
    }
    //-------------------------外部类-------------------------------------------------

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox1:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED1 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED1 off", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox2:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED2 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED2 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox3:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED3 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED3 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkBox4:
                if (checked) {
                    // Put some meat on the sandwich
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED4 on", Toast.LENGTH_SHORT).show();
                } else {
                    // Remove the meat
                    Toast.makeText(com.example.zpj.myapp_01.MainActivity.this, "LED4 off", Toast.LENGTH_SHORT).show();
                }
                break;

            // TODO: Veggie sandwich
        }
    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxLed1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBoxLed2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBoxLed3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBoxLed4 = (CheckBox) findViewById(R.id.checkBox4);

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

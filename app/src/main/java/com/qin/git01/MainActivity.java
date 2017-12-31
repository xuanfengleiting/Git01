package com.qin.git01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="QBH";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: "+"HAHAHA");
        Toast.makeText(this, "init ok", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "创建分支", Toast.LENGTH_SHORT).show();


    }
}

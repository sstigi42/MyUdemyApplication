package com.example.myudemyapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view){
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Log.i("Info", "Button wurde geklickt");
        Log.i("Name", editText.getText().toString());
    }
}
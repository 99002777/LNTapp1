package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void clickEvent(View view) {
        Toast.makeText(this, "Welcome TO L&T", Toast.LENGTH_SHORT).show();



        EditText nameditTextName;
        nameditTextName=findViewById(R.id.editTextName);
        String input = nameditTextName.getText().toString();


        TextView text;
        text = findViewById(R.id.hai);
        text.setText(input);

    }


}
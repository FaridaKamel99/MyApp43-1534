package com.example.myapp1534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.button);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();

            }




        });
    }
    public void openactivity2(){
        Intent intent= new Intent(this,Main2Activity.class);
        startActivity(intent);

    }
}
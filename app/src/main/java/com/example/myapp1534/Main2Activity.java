package com.example.myapp1534;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView=(ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Android");
        arrayList.add("IPhone");
        arrayList.add("Windows");
        arrayList.add("Bluckberry");
        arrayList.add("Linux");

        ArrayAdapter arrayAdapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                openactivity3();

            }
        });


    }
    public void openactivity3(){
        Intent intent1= new Intent(this,DeviceDetailActivity.class);
        startActivity(intent1);
    }

}

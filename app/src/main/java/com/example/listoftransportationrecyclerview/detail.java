package com.example.listoftransportationrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent detail = getIntent();
        String type_name = detail.getStringExtra("type").toString();
        String desc_trans = detail.getStringExtra("desc").toString();
        String desc_link = detail.getStringExtra("link").toString();

        TextView type = findViewById(R.id.txt_type);
        type.setText(type_name);
        TextView desc = findViewById(R.id.txt_desc);
        desc.setText(desc_trans);
        TextView link = findViewById(R.id.txt_link);
        link.setText(desc_link);
    }
}
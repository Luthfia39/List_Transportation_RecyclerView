package com.example.listoftransportationrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go_to_list = findViewById(R.id.btn_go);
        go_to_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listpage = new Intent(view.getContext(), listTransportation.class);
                startActivity(listpage);
            }
        });
    }
}
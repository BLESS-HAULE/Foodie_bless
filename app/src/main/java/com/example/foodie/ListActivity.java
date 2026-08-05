package com.example.foodie;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    String[] foods = {
            "Pizza",
            "Burger",
            "Rice",
            "Chicken",
            "Pasta",
            "French Fries",
            "Sandwich",
            "Salad"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                foods
        );

        listView.setAdapter(adapter);
    }
}
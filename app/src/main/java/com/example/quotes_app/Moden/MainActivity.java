package com.example.quotes_app.Moden;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quotes_app.Moden.Quotes_Model;
import com.example.quotes_app.Moden.Quotes_List;
import com.example.quotes_app.R;
import com.example.quotes_app.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Integer[] image = {R.drawable.sed, R.drawable.alone, R.drawable.motivation, R.drawable.love, R.drawable.attitude, R.drawable.angry, R.drawable.gym, R.drawable.cute, R.drawable.creative, R.drawable.aswsome};

    String[] Quotes = {"Sad", "Alone", "Motivation", "Love", "Attitude", "Angry", "Gym", "Cute", "Creative", "Aswsome"};

    ActivityMainBinding binding;

    ArrayList<Quotes_Model> quotesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        if (intent.hasExtra("QUOTE_TEXT")) {
            String quoteText = intent.getStringExtra("QUOTE_TEXT");

            // Use the data as needed
            TextView textView = findViewById(R.id.risi2);
            textView.setText(quoteText);
        } else {
            // Handle the case where "QUOTE_TEXT" is not present in the Intent
        }

        for (int i = 0; i < image.length; i++) {
            Quotes_Model t1 = new Quotes_Model(image[i], Quotes[i]);
            quotesList.add(t1);
        }


        for (int i = 0; i < image.length; i++) {
            Quotes_Model t1 = new Quotes_Model(image[i], Quotes[i]);
            quotesList.add(t1);
        }

        Quotes_List quotesListAdapter = new Quotes_List(this, quotesList);
        RecyclerView.LayoutManager R2 = new GridLayoutManager(this, 2);
        binding.risi1.setAdapter(quotesListAdapter);
        binding.risi1.setLayoutManager(R2);
    }
}

package com.example.quotes_app.Sad_Modenclass.Sad_imosan_Adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.quotes_app.R;
import com.example.quotes_app.Sad_Modenclass.Sad_moden_class;
import com.example.quotes_app.databinding.ActivitySadImosensBinding;

import java.util.ArrayList;
import java.util.List;

public class Sad_imosens extends AppCompatActivity {

    RecyclerView risi2;
    ArrayList<Sad_moden_class> list;


    ActivitySadImosensBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySadImosensBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        risi2 = binding.risi2;
        list = new ArrayList<>();
        initList();

        risi2.setHasFixedSize(true);
        risi2.setLayoutManager(new LinearLayoutManager(this));

        Sad_Adapter sadAdapter = new Sad_Adapter(this, list);
        risi2.setAdapter(sadAdapter);
    }

    public void initList() {
        list.add(new Sad_moden_class(R.drawable.s1, "A smile is happiness you'll find right under your nose.", "-Tom Wilson"));
        list.add(new Sad_moden_class(R.drawable.s2, "Because of your smile, you make life more beautiful.", "-Thich Nhat Hanh"));
        list.add(new Sad_moden_class(R.drawable.s3, "A smile is the best makeup any girl can wear.", "- Marilyn Monroe"));
    }


    }



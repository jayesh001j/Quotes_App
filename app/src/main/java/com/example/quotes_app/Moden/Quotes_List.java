package com.example.quotes_app.Moden;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.example.quotes_app.R;
import com.example.quotes_app.Sad_Modenclass.Sad_imosan_Adapter.Sad_imosens;

import java.util.ArrayList;

public class Quotes_List extends RecyclerView.Adapter<Quotes_List.QuotesViewHolder> {
    Context context;
    ArrayList<Quotes_Model> l1;

    public Quotes_List(Context context, ArrayList<Quotes_Model> l1) {
        this.context = context;
        this.l1 = l1;
    }


    @NonNull
    @Override
    public QuotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list, parent, false);
        return new QuotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuotesViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.sadimges.setImageResource(l1.get(position).getImage());
        holder.sadtext.setText(l1.get(position).getQuotes());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Sad_imosens.class);
                intent.putExtra("QUOTE_TEXT", l1.get(position).getQuotes());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    static class QuotesViewHolder extends RecyclerView.ViewHolder {
        ImageView sadimges;
        TextView sadtext;
        CardView cardid;


        public QuotesViewHolder(@NonNull View itemView) {
            super(itemView);
            sadimges = itemView.findViewById(R.id.sadimges);
            sadtext = itemView.findViewById(R.id.sadtext);
            cardid = itemView.findViewById(R.id.cardid);



        }
    }
}

package com.example.quotes_app.Sad_Modenclass.Sad_imosan_Adapter;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quotes_app.R;
import com.example.quotes_app.Sad_Modenclass.Sad_moden_class;

import java.util.ArrayList;

public class Sad_Adapter extends RecyclerView.Adapter<Sad_Adapter.SadViewHolder> {
    Context context;
    ArrayList<Sad_moden_class> l1;


    public Sad_Adapter(Context context, ArrayList<Sad_moden_class> l1) {
        this.context = context;
        this.l1 = l1;
    }

    @Override
    public SadViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sed_imagepasing, parent, false);
        return new SadViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull SadViewHolder holder, int position) {
        holder.imagepasing.setImageResource(l1.get(position).Image_passing);
        holder.sad_name.setText(l1.get(position).Sad_name);
        holder.sad_authirname.setText(l1.get(position).Author_name);

        holder.quotes_copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quoteText = l1.get(position).Sad_name;

                ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("quote", quoteText);
                clipboard.setPrimaryClip(clip);

                Toast.makeText(context, "Text copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        holder.quotes_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quoteText = l1.get(position).Sad_name;

                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT, quoteText);

                context.startActivity(Intent.createChooser(shareIntent, "Share using"));
            }
        });
    }

    @Override
    public int getItemCount() {
        return l1.size();
    }

    static class SadViewHolder extends RecyclerView.ViewHolder {
        ImageView imagepasing, quotes_copy, quotes_share;
        TextView sad_name, sad_authirname;


        public SadViewHolder(@NonNull View itemView) {
            super(itemView);
            imagepasing = itemView.findViewById(R.id.imagepasing);
            sad_name = itemView.findViewById(R.id.sad_name);
            sad_authirname = itemView.findViewById(R.id.sad_authirname);

            quotes_copy = itemView.findViewById(R.id.quotes_copy);
            quotes_share = itemView.findViewById(R.id.quotes_share);
        }
    }
}

package com.example.homesportv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    private ArrayList<sport> listsport;
    public CardAdapter(ArrayList<sport> list){
        this.listsport = list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.act_grid, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        sport olahraga = listsport.get(position);
        Glide.with(holder.itemView.getContext())
                .load(olahraga.getPict())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPict);
        holder.Title.setText(olahraga.getName());
        holder.Detail.setText(olahraga.getDetail());

        holder.btnFull.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return listsport.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPict;
        TextView Title, Detail;
        Button btnFull;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPict = itemView.findViewById(R.id.picture);
            Title = itemView.findViewById(R.id.titles);
            Detail = itemView.findViewById(R.id.detail);
            btnFull = itemView.findViewById(R.id.selengkapnya);
        }
    }
}

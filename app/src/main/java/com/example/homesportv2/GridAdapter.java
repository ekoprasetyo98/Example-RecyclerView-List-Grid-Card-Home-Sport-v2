package com.example.homesportv2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {
    private ArrayList<sport> listsport;

    public GridAdapter(ArrayList<sport> list){
        this.listsport = list;
    }
    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.act_grid, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listsport.get(position).getPict())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPicture);

    }

    @Override
    public int getItemCount() {
        return listsport.size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPicture;
        public GridViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPicture = itemView.findViewById(R.id.picture);
        }
    }
}

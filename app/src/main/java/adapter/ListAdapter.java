package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.homesportv2.R;
import com.example.homesportv2.sport;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder>  {
    private ArrayList<sport> listsport;
    public ListAdapter(ArrayList<sport> list) {
        this.listsport = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.act_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        sport olahraga = listsport.get(position);
        Glide.with(holder.itemView.getContext())
                .load(olahraga.getPict())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.pict);
        holder.Title.setText(olahraga.getName());
        holder.detail.setText(olahraga.getDetail());

    }

    @Override
    public int getItemCount() {
        return listsport.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView pict;
        TextView Title, detail;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            pict = itemView.findViewById(R.id.picture);
            Title = itemView.findViewById(R.id.titles);
            detail = itemView.findViewById(R.id.deskription);
        }
    }
}

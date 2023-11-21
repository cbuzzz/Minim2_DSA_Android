package com.example.aaaa;
/*
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    }
    @Override
    public int getItemCount() {
        return 0;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView firstLine;
        public TextView secondLine;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            firstLine = itemView.findViewById(R.id.firstLine);
            secondLine = itemView.findViewById(R.id.secondLine);
        }
    }

}

 */

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ArticleViewHolder> {
    private List<Item> items;

    public void setItems(List<Item> value) {
        this.items = value;
        notifyDataSetChanged();
    }

    @Override
    public ArticleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ArticleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ArticleViewHolder holder, int position) {
        Item item = items.get(position);
        holder.bind(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ArticleViewHolder extends RecyclerView.ViewHolder {
        private TextView nombre;
        private TextView descripcion;
        //private ImageView featuredImage;
        public ArticleViewHolder(View view) {
            super(view);
            nombre = view.findViewById(R.id.firstLine);
            descripcion = view.findViewById(R.id.secondLine);
            //featuredImage = view.findViewById(R.id.icon);
        }
        public void bind(Item item) {
            nombre.setText(item.getNombre());
            descripcion.setText(item.getDescripcion());
        }
    }
}



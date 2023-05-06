package com.abc.recyclerviewgit;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageview;
    TextView name, email;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageview = itemView.findViewById(R.id.imageview);
        name = itemView.findViewById(R.id.name);
        email = itemView.findViewById(R.id.email);
    }
}

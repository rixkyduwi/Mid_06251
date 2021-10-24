package com.example.mid_06251;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder>{
    private DataItem[] listdata;

    // RecyclerView recyclerView;
    public RvAdapter(DataItem[] listdata) {
        this.listdata = listdata;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.item_list, parent, false);
        return new ViewHolder(listItem);
    }
    @Override
    public int getItemCount() {
        return listdata.length;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final DataItem myListData = listdata[position];
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.textView.setText(listdata[position].getDescription());
        holder.textView.setText(listdata[position].getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();
                setContentView(R.layout.popupview);
            }
        });
    }

    private void setContentView(int activity_main) {
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.iv_item);
            this.textView = (TextView) itemView.findViewById(R.id.tv_title);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.cv_item);
        }
    }
}
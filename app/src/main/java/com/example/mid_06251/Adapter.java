package com.example.mid_06251;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private Context context;
    private Boolean POP_BATAL = true;
    List<Cards> list;
    Dialog dialog;

    public Adapter(List<Cards> list, Context context) {
        this.list = list;
        this.context = context;
        dialog = new Dialog(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);

        final ViewHolder viewHolder = new ViewHolder(view);

        dialog.setContentView(R.layout.custom_dialog);
        viewHolder.card_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout batal = dialog.findViewById(R.id.ly_batal);
                LinearLayout ly = dialog.findViewById(R.id.ly_pop_up);
                ImageView img = (ImageView) dialog.findViewById(R.id.img);
                TextView name = (TextView) dialog.findViewById(R.id.name);
                TextView deskripsi = (TextView) dialog.findViewById(R.id.deskripsi);
                TextView harga = (TextView) dialog.findViewById(R.id.jmlharga);
                TextView satuan = (TextView) dialog.findViewById(R.id.jmlsatuan);
                Button jumlah = (Button) dialog.findViewById(R.id.btnjumlah);
                Button kurang = (Button) dialog.findViewById(R.id.btnkurang);

                img.setImageResource(list.get(viewHolder.getAdapterPosition()).getImg());
                name.setText(list.get(viewHolder.getAdapterPosition()).getName());
                deskripsi.setText(list.get(viewHolder.getAdapterPosition()).getDeskripsi());
                harga.setText(list.get(viewHolder.getAdapterPosition()).getharga2());
                satuan.setText(list.get(viewHolder.getAdapterPosition()).getsatuan2());

                int jmlharga = Integer.parseInt(String.valueOf(harga));
                int jmlsatuan = Integer.parseInt(String.valueOf(satuan));

                dialog.show();

                batal.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (POP_BATAL) {
                            Log.d("batal", "klik");
                            dialog.dismiss();
                        } else {
                            POP_BATAL = true;
                        }
                    }
                });
                ly.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        POP_BATAL = false;
                    }
                });
                jumlah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        satuan.setText(jmlsatuan+ 1);
                        harga.setText(jmlharga * jmlsatuan);
                    }
                });
                kurang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        satuan.setText(jmlsatuan);
                        harga.setText(jmlharga * jmlsatuan);
                    }
                });
            }
        });
        viewHolder.card_list2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout batal2 = dialog.findViewById(R.id.ly_batal);
                LinearLayout ly2 = dialog.findViewById(R.id.ly_pop_up);
                ImageView img2 = (ImageView) dialog.findViewById(R.id.img);
                TextView name2 = (TextView) dialog.findViewById(R.id.name);
                TextView deskripsi2 = (TextView) dialog.findViewById(R.id.deskripsi);
                TextView harga2 = (TextView) dialog.findViewById(R.id.jmlharga);
                TextView satuan2 = (TextView) dialog.findViewById(R.id.jmlsatuan);
                Button jumlah2 = (Button) dialog.findViewById(R.id.btnjumlah);
                Button kurang2 = (Button) dialog.findViewById(R.id.btnkurang);

                img2.setImageResource(list.get(viewHolder.getAdapterPosition()).getImg2());
                name2.setText(list.get(viewHolder.getAdapterPosition()).getName2());
                deskripsi2.setText(list.get(viewHolder.getAdapterPosition()).getDeskripsi2());
                harga2.setText(list.get(viewHolder.getAdapterPosition()).getharga2());
                satuan2.setText(list.get(viewHolder.getAdapterPosition()).getsatuan2());


                int jmlharga2 = Integer.parseInt(String.valueOf(dialog.findViewById(R.id.jmlharga)));
                int jmlsatuan2 = Integer.parseInt(String.valueOf(dialog.findViewById(R.id.jmlsatuan)));

                dialog.show();

                batal2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (POP_BATAL) {
                            Log.d("batal", "klik");
                            dialog.dismiss();
                        } else {
                            POP_BATAL = true;
                        }
                    }
                });
                ly2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        POP_BATAL = false;
                    }
                });
                jumlah2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        satuan2.setText(jmlsatuan2 + 1);
                        harga2.setText(jmlharga2 * jmlsatuan2);
                    }
                });
                kurang2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        satuan2.setText(jmlsatuan2 - 1);
                        harga2.setText(jmlharga2 * jmlsatuan2);
                    }
                });
            }
        });return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {

        Cards card_post = list.get(i);
        final int img = card_post.getImg();
        final String content = card_post.getName();
        final int img2 = card_post.getImg2();
        final String content2 = card_post.getName2();
        final Integer[] fharga = new Integer[]{card_post.getharga()};
        final Integer[]  fsatuan = new Integer[]{card_post.getsatuan()};
        final Integer[]  fharga2 = new Integer[]{card_post.getharga2()};
        final Integer[]  fsatuan2 = new Integer[]{card_post.getsatuan2()};

        viewHolder.post_image.setImageResource(img);
        viewHolder.name.setText(content);
        viewHolder.post_image2.setImageResource(img2);
        viewHolder.name2.setText(content2);
        viewHolder.harga.setText(fharga[0]);
        viewHolder.satuan.setText(fsatuan[0]);
        viewHolder.harga2.setText(fharga2[0]);
        viewHolder.satuan2.setText(fsatuan2[0]);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView post_image,post_image2;
        TextView name,name2;
        TextView  harga,satuan,harga2,satuan2;
        LinearLayout card_list,card_list2;

        public ViewHolder(View itemView) {
            super(itemView);

            card_list = (LinearLayout) itemView.findViewById(R.id.box);
            card_list2 = (LinearLayout) itemView.findViewById(R.id.box2);
            post_image = (ImageView) itemView.findViewById(R.id.card_image);
            name = (TextView)itemView.findViewById(R.id.card_name);
            post_image2 = (ImageView) itemView.findViewById(R.id.card_image2);
            name2 = (TextView)itemView.findViewById(R.id.card_name2);
            harga = (TextView)itemView.findViewById(R.id.tmplharga);
            satuan = (TextView)itemView.findViewById(R.id.tmplsatuan);
            harga2 = (TextView)itemView.findViewById(R.id.tmplharga2);
            satuan2 = (TextView)itemView.findViewById(R.id.tmplsatuan2);
        }
    }
}
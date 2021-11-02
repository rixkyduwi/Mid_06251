package com.example.mid_06251;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.NumberFormat;
import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
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
                TextView jmlharga = (TextView) dialog.findViewById(R.id.jmlharga);
                TextView jmlsatuan = (TextView) dialog.findViewById(R.id.jmlsatuan);
                Button tambah = (Button) dialog.findViewById(R.id.btntambah);
                Button kurang = (Button) dialog.findViewById(R.id.btnkurang);
                Button addkeranjang = (Button) dialog.findViewById(R.id.beli);

                img.setImageResource(list.get(viewHolder.getAdapterPosition()).getImg());
                name.setText(list.get(viewHolder.getAdapterPosition()).getName());
                deskripsi.setText(list.get(viewHolder.getAdapterPosition()).getDeskripsi());
                String harga = list.get(viewHolder.getAdapterPosition()).getharga();
                jmlharga.setText(harga);
                final String satuan = list.get(viewHolder.getAdapterPosition()).getsatuan();
                jmlsatuan.setText(satuan);

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
                    public void onClick(View vv) {
                        POP_BATAL = false;
                    }
                });
                tambah.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View vvv) {
                        String txtsatuan = jmlsatuan.getText().toString();
                        int intsatuan = Integer.parseInt(txtsatuan) + 1;
                        String fixsatuan = String.valueOf(intsatuan);
                        jmlsatuan.setText(fixsatuan);
                        int intharga = Integer.parseInt(harga) * intsatuan;
                        String fixharga = String.valueOf(intharga);
                        jmlharga.setText(fixharga);
                    }
                });
                kurang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View vvvv) {
                        String txtsatuan = jmlsatuan.getText().toString();
                        int intsatuan = Integer.parseInt(txtsatuan) - 1;
                        String fixsatuan = String.valueOf(intsatuan);
                        jmlsatuan.setText(fixsatuan);
                        int intharga = Integer.parseInt(harga) * intsatuan;
                        String fixharga = String.valueOf(intharga);
                        jmlharga.setText(fixharga);
                        if(intsatuan<=0){
                            jmlsatuan.setText("0");
                            jmlharga.setText("0");
                        }
                    }
                });
                addkeranjang.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View vvvvv) {
                        String txtjmlsatuan = jmlsatuan.getText().toString();
                        int intjmlsatuan = Integer.parseInt(txtjmlsatuan);
                        if (intjmlsatuan>=100){
                            Toast.makeText(vvvvv.getContext(),"pesanan maximal 100",Toast.LENGTH_SHORT).show();
                        }
                        else if (intjmlsatuan<1){
                            Toast.makeText(vvvvv.getContext(),"pesanan minimal 1",Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(vvvvv.getContext(), "TERIMA KASIH", Toast.LENGTH_LONG).show();
                        }
                        dialog.dismiss();
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

        viewHolder.post_image.setImageResource(img);
        viewHolder.name.setText(content);


    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public int getharga() {
        TextView jmlharga = (TextView) dialog.findViewById(R.id.jmlharga);
        String txtjmlharga = jmlharga.getText().toString();
        int intjmlharga = Integer.parseInt(txtjmlharga);
        return intjmlharga;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView post_image;
        TextView name;
        LinearLayout card_list;

        public ViewHolder(View itemView) {
            super(itemView);
            card_list = (LinearLayout) itemView.findViewById(R.id.box);
            post_image = (ImageView) itemView.findViewById(R.id.card_image);
            name = (TextView)itemView.findViewById(R.id.card_name);
        }
    }
}

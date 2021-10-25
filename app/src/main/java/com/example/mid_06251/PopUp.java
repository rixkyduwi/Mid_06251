package com.example.mid_06251;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

class PopUp implements View.OnClickListener {
    private LayoutInflater inf;
    private Context context;
    private Boolean POP_BATAL = true;

    public PopUp(Context context, LayoutInflater inf) {
        this.context = context;
        this.inf = inf;
    }

    public void tampilPopUp(final FrameLayout content) {
        final View v = inf.inflate(R.layout.popupview, null);
        content.addView(v);
        LinearLayout batal = v.findViewById(R.id.ly_batal);
        LinearLayout ly = v.findViewById(R.id.ly_pop_up);

        TextView chat = v.findViewById(R.id.chat);
        TextView jumlah = v.findViewById(R.id.jmlharga);
        Button kurang = v.findViewById(R.id.video);
        Button tambah = v.findViewById(R.id.info);

        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vv) {
                if (POP_BATAL == true){
                    Log.d("batal", "klik");
                    content.removeView(v);
                }else{
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
        chat.setOnClickListener(this);
jumlah.setText("8000");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chat:
//              aksi ketika tombol chat di klik
                Log.d("klik", "chat");
                break;
            case R.id.jmlharga:
//              aksi ketika tombol call di klik
                Log.d("klik", "harga sekarang "+R.id.jmlharga);

                break;
            case R.id.video:
//              aksi ketika tombol video di klik
                Log.d("klik", "video");

                break;
            case R.id.info:
//              aksi ketika tombol info di klik
                Log.d("klik", "data berhasil ditambahkan");

                break;
        }
    }
}
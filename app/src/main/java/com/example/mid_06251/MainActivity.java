package com.example.mid_06251;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

public final class MainActivity extends AppCompatActivity {
    private FrameLayout content;
    private Button bt;
    private Context context;
    private LayoutInflater inf;
    private PopUp popUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tombolpupop);

        content = findViewById(R.id.content);
        bt = findViewById(R.id.button);
        context = this;
        inf = (LayoutInflater) getSystemService(this.LAYOUT_INFLATER_SERVICE);
        popUp = new PopUp(context, inf);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popUp.tampilPopUp(content);
            }
        });


    }

}

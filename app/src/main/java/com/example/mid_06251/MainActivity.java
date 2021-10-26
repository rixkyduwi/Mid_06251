package com.example.mid_06251;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

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
import butterknife.BindView;

public final class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView1)TextView textView1;
    private FrameLayout content;
    private Button bt;
    private Context context;
    private LayoutInflater inf;
    private PopUp popUp;
    Button buttoncaddy;
    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataItem[] myListData = new DataItem[] {
                new DataItem("Email", "http://github.com/github.jpg"),
                new DataItem("Info", "android.R.drawable.ic_dialog_info"),
                new DataItem("Delete", "android.R.drawable.ic_delete"),
                new DataItem("Dialer", "android.R.drawable.ic_dialog_dialer"),
                new DataItem("Alert", "android.R.drawable.ic_dialog_alert"),
                new DataItem("Map", "android.R.drawable.ic_dialog_map"),
                new DataItem("Email", "android.R.drawable.ic_dialog_email"),
                new DataItem("Info", "android.R.drawable.ic_dialog_info"),
                new DataItem("Delete", "android.R.drawable.ic_delete"),
                new DataItem("Dialer", "android.R.drawable.ic_dialog_dialer"),
                new DataItem("Alert", "android.R.drawable.ic_dialog_alert"),
                new DataItem("Map", "android.R.drawable.ic_dialog_map"),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_item);
        RvAdapter adapter = new RvAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        }
    }



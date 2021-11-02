package com.example.mid_06251;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button bt;
    Integer[] imageId = new Integer[]{
            R.drawable.affogatocoffe,
            R.drawable.americanocoffe,
            R.drawable.aulaitcoffe,
            R.drawable.espressocoffe,
            R.drawable.flatwhitecoffe,
            R.drawable.galaocoffe};
    String[] title = new String[]{
            "Affogato Coffe | RP8.000",
            "Americano Coffe | RP10.000",
            "Café au Lait | RP12.000",
            "Espresso Coffe | RP25.000",
            "Flat White Coffe | RP18.000",
            "Galao Coffe | RP10.000"};
    String[] deskripsi = new String[]{
            "Affogato adalah jenis minuman kopi yang disajikan dengan satu sendok es krim dan satu atau dua gelas espresso. Affogato adalah kelezatan ekstra yang disajikan dalam jajaran jenis minuman kopi lainnya. Affogato lebih cocok disebut desert, karena sangat cocok dinikmati sehabis makan berat.",
            "americano dxengan rasa yang mirip dengan kopi hitam, americano terdiri dari espresso shot yang diencerkan dengan air panas. Tips profesional khusus untuk Anda yang ingin membuat americano sendiri di rumah ialah, tuangkan espresso terlebih dahulu, baru tambahkan air panas.",
            "Café au lait sangat cocok untuk Anda penyuka jenis minuman kopi minimalis yang menginginkan sedikit rasa lebih. Cukup tambahkan sedikit susu hangat ke dalamnya, maka café au lait sudah siap dinikmati.",
            "Espresso adalah jenis minuman kopi yang sangat pekat. Meski sederhana dalam penampilan, espresso cenderung sulit untuk diminum bagi pemula karena rasanya yang pahit dan kental. Minuman espresso dapat disajikan sendiri atau digunakan sebagai dasar dari sebagian besar jenis minuman kopi, seperti latte dan macchiatos.",
            "Jenis minuman kopi yang satu ini berasal dari Australia dan New Zealand, yang merupakan perpaduan antara cappucino tanpa foam atau taburan coklat. Flat white adalah jenis minuman kopi espresso dengan steamed milk.",
            "Galão adalah jenis minuman kopi yang berasal dari Portugal. Jenis minuman kopi panas ini sangat erat kaitannya dengan latte dan cappucino. Satu-satunya perbedaan adalah galão mengandung sekitar dua kali lebih banyak milk foam, menjadikannya minuman yang lebih ringan dibandingkan dengan latte ataupun cappuccino.",
    };
    Integer[] harga = new Integer[]{
            8000,
            10000,
            12000,
            25000,
            18000,
            10000,
    };
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<Cards> Cardss;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(mLayoutManager);
        Cardss = new ArrayList<>();
        load_data();
    }
    private void load_data() {
        for (int i = 0; i < imageId.length; i++) {
            Cardss.add(new Cards(
                    imageId[i],
                    title[i],
                    deskripsi[i],
                    harga[i],
                    1
            ));
        }
        //adapter.notifyDataSetChanged();
        adapter = new Adapter(Cardss, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
        private void load_datae (RecyclerView.ViewHolder viewHolder){
            TextView keranjang = (TextView) findViewById(R.id.recyclerview);
            keranjang.setText(Cardss.get(viewHolder.getAdapterPosition()).getharga());
        }
}



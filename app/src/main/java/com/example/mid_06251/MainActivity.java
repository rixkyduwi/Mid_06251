package com.example.mid_06251;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private FrameLayout content;
    private Context context;
    private LayoutInflater inf;
    private Adapter popUp;
    Integer[] imageId = new Integer[]{
            R.drawable.affogatocoffe,
            R.drawable.americanocoffe,
            R.drawable.aulaitcoffe,
            R.drawable.blackcoffe,
            R.drawable.cappucino,
            R.drawable.cortadocoffe,
            R.drawable.doppiocoffe};
    String[] title = new String[]{
            "Affogato Coffe |",
            "Americano Coffe | RP10.000",
            "Café au Lait | RP10.000",
            "Black Coffe | RP10.000",
            "Cappucino | RP10.000",
            "Cortado Coffe | RP10.000",
            "Doppio Coffe | RP10.000"};
    String[] deskripsi = new String[]{
            "Affogato adalah jenis minuman kopi yang disajikan dengan satu sendok es krim dan satu atau dua gelas espresso. Affogato adalah kelezatan ekstra yang disajikan dalam jajaran jenis minuman kopi lainnya. Affogato lebih cocok disebut desert, karena sangat cocok dinikmati sehabis makan berat.",
            "Jenis minuman kopi yang keempat adalah americano. Dengan rasa yang mirip dengan kopi hitam, americano terdiri dari espresso shot yang diencerkan dengan air panas. Tips profesional khusus untuk Anda yang ingin membuat americano sendiri di rumah ialah, tuangkan espresso terlebih dahulu, baru tambahkan air panas.",
            "Jenis minuman kopi yang ketigabelas adalah café au lait. Café au lait sangat cocok untuk Anda penyuka jenis minuman kopi minimalis yang menginginkan sedikit rasa lebih. Cukup tambahkan sedikit susu hangat ke dalamnya, maka café au lait sudah siap dinikmati.",
            "Jenis minuman kopi yang pertama adalah black coffee atau kopi hitam. nama aslinya yakni cafe noir. Kopi hitam sangat disukai oleh orang-orang terutama orang dewasa. Kopi hitam adalah jenis minuman kopi yang sederhana, dibuat dengan biji kopi bubuk yang direndam dalam air panas, dan disajikan hangat.",
            "Cappuccino adalah latte yang dibuat dengan lebih banyak busa (foam) daripada steamed milk, seringkali ditambah dengan taburan bubuk kakao atau kayu manis di atasnya. Terdapat juga variasi cappuccino yang menggunakan krim sebagai pengganti susu atau yang memberikan penambah rasa",
            "Jenis minuman kopi yang ketujuh adalah cortado. Cortado adalah jenis minuman kopi yang menawarkan keseimbangan antara espresso dan steamed milk hangat. Steamed milk biasanya digunakan untuk mengurangi keasaman espresso pada jenis minuman kopi yang satu ini.",
            "Jenis minuman kopi yang keenam adalah doppio. Doppio adalah secangkir espresso shot ganda (1 shot espresso biasanya berkisar 20 hingga 35 ml). Doppio sangat cocok bagi pecinta kopi yang sedang membutuhkan semangat dan energi ekstra pada harinya."};
    Integer[] harga = new Integer[]{
            8000,
            10000,
            10000,
            10000,
            10000,
            10000,
            10000,
    };
    Integer[] imageId2 = new Integer[]{
            R.drawable.espressocoffe,
            R.drawable.flatwhitecoffe,
            R.drawable.galaocoffe,
            R.drawable.icedcoffe,
            R.drawable.lattecoffe,
            R.drawable.macchiatocoffe,
            R.drawable.moccacoffe};
    String[] title2 = new String[]{
            "Espresso Coffe | RP10.000",
            "Flat White Coffe | RP10.000",
            "Galao Coffe | RP10.000",
            "Iced Coffe | RP10.000",
            "Latte Coffe | RP10.000",
            "Macchiato Coffe | RP10.000",
            "moccacoffe | RP10.000"};
    String[] deskripsi2 = new String[]{
            "Espresso adalah jenis minuman kopi yang sangat pekat. Meski sederhana dalam penampilan, espresso cenderung sulit untuk diminum bagi pemula karena rasanya yang pahit dan kental. Minuman espresso dapat disajikan sendiri atau digunakan sebagai dasar dari sebagian besar jenis minuman kopi, seperti latte dan macchiatos.",
            "Jenis minuman kopi yang satu ini berasal dari Australia dan New Zealand, yang merupakan perpaduan antara cappucino tanpa foam atau taburan coklat. Flat white adalah jenis minuman kopi espresso dengan steamed milk.",
            "Galão adalah jenis minuman kopi yang berasal dari Portugal. Jenis minuman kopi panas ini sangat erat kaitannya dengan latte dan cappucino. Satu-satunya perbedaan adalah galão mengandung sekitar dua kali lebih banyak milk foam, menjadikannya minuman yang lebih ringan dibandingkan dengan latte ataupun cappuccino.",
            "iced coffee atau es kopi. Ini adalah salah satu jenis minuman kopi tersimpel yang bisa Anda buat dan temukan di daftar menu kafe atau kedai kopi. Iced coffee pada dasarnya adalah campuran kopi dengan es yang sederhana, biasanya disajikan dengan sedikit susu, krim, atau pemanis",
            "Sebagai minuman kopi paling populer di dunia, latte terdiri dari espresso dan steamed milk dengan sedikit busa di atasnya. Latte bisa dipesan dalam bentuk dan rasa originalnya, atau dengan tambahan perasa mulai dari vanilla hingga kayu manis. Latte juga terkenal dengan latte art-nya, yakni seni menggambar bentuk atau pola di atas busa minuman ini",
            "Macchiato adalah jenis minuman kopi berbasis espresso lainnya yang memiliki sedikit busa di atasnya. Kata \"macchiato\" berarti tanda atau noda. Ini mengacu pada tanda bahwa steamed milk meninggalkan permukaan espresso saat dituangkan ke dalam minuman. Sirup perasa sering ditambahkan ke jenis minuman kopi ini, sesuai dengan preferensi pelanggan.",
            "Mocha adalah jenis minuman kopi yang pas bagi Anda pecinta cokelat. Mocha adalah jenis minuman kopi yang terdiri dari espresso, coklat, steamed milk dan foam. Mocha adalah perpaduan unik kopi dan cokelat panas. Bubuk atau sirup coklat memberikan rasa yang kaya dan lembut serta mengurangi keasaman espresso pada jenis minuman kopi satu ini."};
    Integer[] harga2 = new Integer[]{
            10000,
            10000,
            10000,
            10000,
            10000,
            10000,
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
        mLayoutManager = new GridLayoutManager(MainActivity.this,1);
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
                    1,
                    imageId2[i],
                    title2[i],
                    deskripsi2[i],
                    harga2[i],
                    1
            ));
        }
        //adapter.notifyDataSetChanged();
        adapter = new Adapter(Cardss, MainActivity.this);
        recyclerView.setAdapter(adapter);
    }
}



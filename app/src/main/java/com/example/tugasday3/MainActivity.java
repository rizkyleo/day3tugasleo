package com.example.tugasday3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rSmartphone;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<smartphoneactivity> Listsmartphone;

    void dataDummy(){
        Listsmartphone = new ArrayList<>();
        Listsmartphone.add(new smartphoneactivity("Samsung zFold5", "Processor snapdragon 8+ gen2 ROM 1TB/512GB/265GB RAM 12GB", 24000000,R.drawable.samsung));
        Listsmartphone.add(new smartphoneactivity("Samsung galaxy A23", "OS android 12 dengan ram 16Gb Storage 512GB network 5g Ready dual sim dan size 7inch", 2500000,R.drawable.poco));
        Listsmartphone.add(new smartphoneactivity("Xiaomi poco m5", "POCO M5 menggunakan Layar FHD+ 6,58\", resolusi 2408x1080, layar 401 ppi, Gorilla Glass perlindungan lebih tangguh, rasio layar 20:9", 1500000,R.drawable.redmi));
        Listsmartphone.add(new smartphoneactivity("Redmi A3", "Bodi Super Tipis: Desain ultra tipis dengan bingkai datar yang mulus untuk kesan mewah dan trendi.Ketebalan: 8,3mm untuk genggaman satu tangan yang nyaman", 1250000,R.drawable.infinix));
        Listsmartphone.add(new smartphoneactivity("Infinix smart8", "Infinix Smart 8 adalah smartphone Android yang dirilis pada November 2023. Ponsel ini memiliki layar 6,6 inci, chipset Unisoc T606, dan baterai 5000 mAh.", 1000000,R.drawable.a23));
    }
    void data(){
        rSmartphone = findViewById(R.id.rv_smartphone);
        adapter = new Detailactivity(this,Listsmartphone);
        layoutManager = new LinearLayoutManager(this);
        rSmartphone.setLayoutManager(layoutManager);
        rSmartphone.setAdapter(adapter);

    }

    ImageView imageViewSmartphone, imageViewLaptop, imageViewTablet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataDummy();data();

        // Inisialisasi ImageView
        imageViewSmartphone = findViewById(R.id.imageViewSmartphone);
        imageViewLaptop = findViewById(R.id.imageViewLaptop);
        imageViewTablet = findViewById(R.id.imageViewTablet);

        // Set listener untuk ImageView
        imageViewSmartphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil method untuk meng-handle klik pada smartphone
                onSmartphoneClick(v);
            }
        });

        imageViewLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil method untuk meng-handle klik pada laptop
                onLaptopClick(v);
            }
        });

        imageViewTablet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Panggil method untuk meng-handle klik pada tablet
                onTabletClick(v);
            }
        });
    }

    // Method untuk menangani klik pada ImageView smartphone
    public void onSmartphoneClick(View view) {
        Intent intent = new Intent(MainActivity.this, smartphoneactivity.class);
        startActivity(intent);
    }

    // Method untuk menangani klik pada ImageView laptop
    public void onLaptopClick(View view) {
        Intent intent = new Intent(MainActivity.this, laptopactivity.class);
        startActivity(intent);
    }

    // Method untuk menangani klik pada ImageView tablet
    public void onTabletClick(View view) {
        Intent intent = new Intent(MainActivity.this, tabletactivity.class);
        startActivity(intent);
    }
}

package com.example.android.kalkulatorsales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {
    TextView tvNama, tvHarga, tvDP, tvPokokHutang, tvTotalBunga, tvTotalHutang, tvAngsuran;
    String nama;
    Integer harga, dp, dpPersen, tenor, bunga, pokokHutang, totalBunga, totalHutang, angsuran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvNama = findViewById(R.id.tv_hasilPembeli);
        tvHarga = findViewById(R.id.tv_hasilHarga);
        tvDP = findViewById(R.id.tv_hasilDp);
        tvPokokHutang = findViewById(R.id.tv_hasilPokokHutang);
        tvTotalBunga = findViewById(R.id.tv_hasilTotalBunga);
        tvTotalHutang = findViewById(R.id.tv_hasilTotalHutang);
        tvAngsuran = findViewById(R.id.tv_hasilAngsuran);

        ambilData();
    }

    public void ambilData(){
        nama = getIntent().getStringExtra("data1");
        harga = getIntent().getIntExtra("data2", 0);
        dpPersen = getIntent().getIntExtra("data3",0);
        tenor = getIntent().getIntExtra("data4",0);
        bunga = getIntent().getIntExtra("data5",0);

        dp = harga  * dpPersen / 100;
        pokokHutang = harga - dp;
        totalBunga = pokokHutang * tenor * bunga / 100;
        totalHutang = pokokHutang + totalBunga;
        angsuran = totalHutang / tenor;

        tvNama.setText(nama);
        tvHarga.setText(String.valueOf(harga));
        tvDP.setText(String.valueOf(dp));
        tvPokokHutang.setText(String.valueOf(pokokHutang));
        tvTotalBunga.setText(String.valueOf(totalBunga));
        tvTotalHutang.setText(String.valueOf(totalHutang));
        tvAngsuran.setText(String.valueOf(angsuran));
    }
}
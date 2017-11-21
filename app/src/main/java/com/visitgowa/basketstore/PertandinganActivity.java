package com.visitgowa.basketstore;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PertandinganActivity extends Activity {

    private int nilaiSkorKanan = 0;
    private int nilaiSkorKiri = 0;
    private TextView counterViewKanan;
    private TextView counterViewKiri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertandingan);

        counterViewKanan = findViewById(R.id.skorKanan);
        counterViewKiri = findViewById(R.id.skorKiri);

        Button plusSatuKanan = findViewById(R.id.tambah1Kanan);
        Button plusDuaKanan = findViewById(R.id.tambah2Kanan);
        Button plusTigaKanan = findViewById(R.id.tambah3Kanan);

        Button plusSatuKiri = findViewById(R.id.tambah1Kiri);
        Button plusDuaKiri = findViewById(R.id.tambah2Kiri);
        Button plusTigaKiri = findViewById(R.id.tambah3Kiri);

        Button reset = findViewById(R.id.reset);

        // Tombol Kanan

        plusSatuKanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKanan += 1;
                ubahSkorKanan(nilaiSkorKanan);
            }
        });

        plusDuaKanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKanan += 2;
                ubahSkorKanan(nilaiSkorKanan);
            }
        });

        plusTigaKanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKanan += 3;
                ubahSkorKanan(nilaiSkorKanan);
            }
        });

        // Tombol Kiri

        plusSatuKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKiri += 1;
                ubahSkorKiri(nilaiSkorKiri);
            }
        });

        plusDuaKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKiri += 2;
                ubahSkorKiri(nilaiSkorKiri);
            }
        });

        plusTigaKiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKiri += 3;
                ubahSkorKiri(nilaiSkorKiri);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSkorKanan = 0;
                nilaiSkorKiri = 0;
                ubahSkorKanan(nilaiSkorKanan);
                ubahSkorKiri(nilaiSkorKiri);
            }
        });
    }

    private void ubahSkorKanan(int skor) {
        counterViewKanan.setText(String.valueOf(skor));
    }

    private void ubahSkorKiri(int skor) {
        counterViewKiri.setText(String.valueOf(skor));
    }
}

package com.visitgowa.basketstore;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startPertandingan = findViewById(R.id.startButton);
        Button lihatJadwalPertandingan = findViewById(R.id.lihatJadwal);


        startPertandingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startPertandinganIntent = new Intent (MainActivity.this, PertandinganActivity.class);
                startActivity(startPertandinganIntent);
            }
        });

        lihatJadwalPertandingan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startJadwalIntent = new Intent (MainActivity.this, JadwalActivity.class);
                startActivity(startJadwalIntent);
            }
        });
    }
}

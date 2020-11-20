package com.example.android.kalkulatorsales;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNama, etHarga, etDp, etTenor, etBunga;
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.et_namaPembeli);
        etHarga = (EditText) findViewById(R.id.et_hargaMotor);
        etDp = (EditText) findViewById(R.id.et_dp);
        etTenor = (EditText) findViewById(R.id.et_tenor);
        etBunga = (EditText) findViewById(R.id.et_bunga);
        btnHitung = (Button) findViewById(R.id.button_hitung);
    }

    public void fungsiHitung(View view){
        Intent pindah = new Intent(MainActivity.this, HasilActivity.class );
        pindah.putExtra("data1", etNama.getText().toString());
        pindah.putExtra("data2", Integer.valueOf(etHarga.getText().toString()));
        pindah.putExtra("data3", Integer.valueOf(etDp.getText().toString()));
        pindah.putExtra("data4", Integer.valueOf(etTenor.getText().toString()));
        pindah.putExtra("data5", Integer.valueOf(etBunga.getText().toString()));
        startActivity(pindah);
    }
}
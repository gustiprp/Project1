package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilskormtk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilskormtk);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+matematika.benar+"\nJawaban Salah : "+matematika.salah);
        nilai.setText(""+matematika.hasil);

    }
    public void pemmtk1 (View view) {
        Intent i = new Intent(hasilskormtk.this, pembahasan.class);
        startActivity(i);
    }

    public void ulangi(View view) {
        finish();
        Intent i = new Intent(getApplicationContext(), matematika.class);
        startActivity(i);
    }
    public void menuawal (View view) {
        Intent i = new Intent(hasilskormtk.this, menuawal.class);
        startActivity(i);
    }
}

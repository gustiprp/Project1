package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilskoripa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilskoripa);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+ipa.benar+"\nJawaban Salah : "+ipa.salah);
        nilai.setText(""+ipa.hasil);

    }
    public void pemipa (View view) {
        Intent i = new Intent(hasilskoripa.this, pembahasan.class);
        startActivity(i);
    }
    public void ulangi(View view) {
        finish();
        Intent i = new Intent(getApplicationContext(), ipa.class);
        startActivity(i);
    }
    public void menuawal (View view) {
        Intent i = new Intent(hasilskoripa.this, menuawal.class);
        startActivity(i);
    }
}


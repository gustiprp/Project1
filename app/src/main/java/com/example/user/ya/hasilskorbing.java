package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilskorbing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilskorbing);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+bahasainggris.benar+"\nJawaban Salah : "+bahasainggris.salah);
        nilai.setText(""+bahasainggris.hasil);

    }
    public void pembing (View view) {
        Intent i = new Intent(hasilskorbing.this, pembahasan.class);
        startActivity(i);
    }
    public void ulangi(View view) {
        finish();
        Intent i = new Intent(getApplicationContext(), bahasainggris.class);
        startActivity(i);
    }
    public void menuawal (View view) {
        Intent i = new Intent(hasilskorbing.this, menuawal.class);
        startActivity(i);
    }
}

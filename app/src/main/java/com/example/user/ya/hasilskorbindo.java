package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hasilskorbindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasilskorbindo);
        TextView hasil = (TextView)findViewById(R.id.hasil);
        TextView nilai = (TextView)findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar : "+bahasaindonesia.benar+"\nJawaban Salah : "+bahasaindonesia.salah);
        nilai.setText(""+bahasaindonesia.hasil);

    }

    public void pembindo (View view) {
        Intent i = new Intent(hasilskorbindo.this, pembahasan.class);
        startActivity(i);
    }

    public void ulangi(View view) {
        finish();
        Intent i = new Intent(getApplicationContext(), bahasaindonesia.class);
        startActivity(i);
    }
    public void menuawal (View view) {
        Intent i = new Intent(hasilskorbindo.this, menuawal.class);
        startActivity(i);
    }
}
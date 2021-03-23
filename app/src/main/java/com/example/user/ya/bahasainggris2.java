package com.example.user.ya;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.x;

public class bahasainggris2 extends AppCompatActivity {
    TextView mtvSkor2, mtvSoal2;
    ImageView mivGambar;
    RadioGroup mrgPilihanJawaban;
    RadioButton mrbPilihanJawaban1, mrbPilihanJawaban2, mrbPilihanJawaban3, mrbPilihanJawaban4;
    Button mbtnSubmit2;
    int x = 0;
    int arr;
    int skor;
    String jawaban;

    soalbing2 bing = new soalbing2();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Latihan Soal Bahasa Inggris  2");
        setContentView(R.layout.activity_bahasainggris2);

        mtvSkor2 = (TextView) findViewById(R.id.tvSkor2);
        mtvSoal2 = (TextView) findViewById(R.id.tvSoal2);
        mivGambar = (ImageView) findViewById(R.id.ivGambar);
        mrgPilihanJawaban = (RadioGroup) findViewById(R.id.rgPilihanJawaban);
        mrbPilihanJawaban1 = (RadioButton) findViewById(R.id.rbPilihanJawaban1);
        mrbPilihanJawaban2 = (RadioButton) findViewById(R.id.rbPilihanJawaban2);
        mrbPilihanJawaban3 = (RadioButton) findViewById(R.id.rbPilihanJawaban3);
        mrbPilihanJawaban4 = (RadioButton) findViewById(R.id.rbPilihanJawaban4);
        mbtnSubmit2 = (Button) findViewById(R.id.btnSubmit2);

        mtvSkor2.setText("" + skor);
        setKonten();

        mbtnSubmit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aksinya disini
                //aksinya adalah ketika button tersebut diklik maka
                //akan mengecek jawaban benar atau salah
                //kemudian konten akan berubah (next konten)
                cekJawaban();
            }
        });
    }

    public void setKonten() {
        mrgPilihanJawaban.clearCheck();
        arr = bing.pertanyaan.length;
        if (x >= arr) { //jika nilai x melebihi nilai arr(panjang array) maka akan pindah activity (kuis selesai)
            String jumlahSkor = String.valueOf(skor);    //menjadikan skor menjadi string
            Intent i = new Intent(bahasainggris2.this, HasilSkoring.class);
            //waktu pindah activity, sekalian membawa nilai jumlahSkor yang ditampung dengan inisial skorAkhir2
            //singkatnya skorAkhir2 = jumlahSkor
            //jika masih belum jelas silahkan bertanya
            i.putExtra("skorAkhir2", jumlahSkor);
            i.putExtra("activity", "Essay");
            startActivity(i);
        } else {
            //setting text dengan mengambil text dari method getter di kelas SoalPilihanGanda
            mtvSoal2.setText(bing.getPertanyaan(x));
            ubahGambar();
            mrbPilihanJawaban1.setText(bing.getPilihanJawaban1(x));
            mrbPilihanJawaban2.setText(bing.getPilihanJawaban2(x));
            mrbPilihanJawaban3.setText(bing.getPilihanJawaban3(x));
            mrbPilihanJawaban4.setText(bing.getPilihanJawaban4(x));
            jawaban = bing.getJawabanBenar(x);
        }
        x++;
    }

    public void ubahGambar() {
        Resources res = getResources();
        String mPhoto = bing.getStringGambar(x);
        int resID = res.getIdentifier(mPhoto, "drawable", getPackageName());
        Drawable drawable = res.getDrawable(resID);
        mivGambar.setImageDrawable(drawable);
    }

    public void cekJawaban() {
        if (mrbPilihanJawaban1.isChecked()) { //jika radio button 1 diklik
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (mrbPilihanJawaban1.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor2.setText("" + skor);    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbPilihanJawaban2.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (mrbPilihanJawaban2.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor2.setText("" + skor);    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbPilihanJawaban3.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (mrbPilihanJawaban3.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor2.setText("" + skor);    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else if (mrbPilihanJawaban4.isChecked()) {
            //jika text yang tertulis di radio button tsb = nilai dari var jawaban
            if (mrbPilihanJawaban4.getText().toString().equals(jawaban)) {
                skor = skor + 10;
                mtvSkor2.setText("" + skor);    //mtvSkor diset nilainya = var skor
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show(); //keluar notifikasi "Jawaban Benar"
                setKonten(); //update next konten
            } else {
                mtvSkor2.setText("" + skor);
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show();
                setKonten();
            }
        } else {
            Toast.makeText(this, "Silahkan pilih jawaban dulu!", Toast.LENGTH_SHORT).show();
        }
    }

    //ini adalah method bawaan dari Android Studio
    //fungsi : memberi aksi ketika tombol back pada hp diklik
    public void onBackPressed() {
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast
    }

}
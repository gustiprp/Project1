package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class matematika extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    String[] pertanyaan_kuis = new String[]{
            "1. Perbandingan panjang dan lebar persegi panjang adalah 4 : 3. Jika kelilingnya 84 cm, luasnya adalah….\n",
            "2. Hasil dari ∛64 x √25:∛8 adalah...",
            "3. Perhatikan pola bilangan berikut ini!\n" +
                    "\n" +
                    "24, 12, 36, 18, 54…, …\n" +
                    "\n" +
                    "Tentukan bilangan ke-6 dan ke-7 dari pola di atas!\n" +
                    "\n",
            "4. Anis membeli sebuah telfon genggam dengan harga Rp1.800.000,00, setelah pemakaian 3 bulan Anis menjual dengan harga Rp1.200.000,00. Berapa persentase kerugian yang dialami oleh Anis?",
            "5. Diberikan P = {1,2,3,4,5,6,7,8,9}. Himpunan bilangan ganjil yang terdapat di P adalah....\n",
            "6. Umur Ibu 4 tahun lebih muda dari umur Ayah. Jumlah umur Ibu dan Ayah adalah 78 tahun. Berapakah umur Ayah sekarang?\n",
            "7. Sebuah taman berbentuk persegi. Di sekeliling taman itu ditanami pohon cemara dengan jarak antar pohon 8 m. Panjang sisi taman itu adalah 78 m. Berapakah banyak pohon cemara yang dibutuhkan?\n",
            "8. Hasil dari  (- 12) : 3 + 8 x (- 5) adalah .... \n",
            "9. Beni menjumlahkan nomor-nomor halaman buku yang terdiri dari 96 halaman adalah 4.672. Ternyata terjadi kekeliruan, ada 1 halaman yang dihitung 2 kali. Halaman berapakah itu? \n",
            "10. Suatu pekerjaan dapat diselesaikan oleh 15 pekerja dalam waktu 12 minggu. Jika pekerjaan itu harus selesai dalam 9 minggu, banyak pekerja yang harus ditambah adalah … \n",
            "11. Hasil dari 2-3 x 2-2 = . . . . \n",
            "12. Hasil dari  128 232    adalah… \n",
            "13. Rudi menabung pada sebuah bank sebesar Rp 800.000,00 dengan bunga 25% setahun. Jika tabungannya sekarang Rp 950.000,00,  maka lama ia menabung adalah … \n",
            "14. Ali menjual sepeda seharga Rp500.000,00 dan ia mendapat untung 25% dari harga pembeliannya. Berapakah harga pembelian sepeda tersebut ? \n",
            "15. Dua suku berikutnya dari barisan bilangan 20, 17, 13, 8, … adalah … \n",
    };


    //membuat array untuk pilihan jawaban
    String[] pilihan_jawaban = new String[]{
            "a. 234 cm2", "b. 324 cm2", "c. 432 cm2", "d. 452 cm2",
            "a. 10", "b. 25", "c. 40", "d. 45",
            "a. 22 dan 17", "b. 27 dan 18", "c. 27 dan 81", "d. 81 dan 27",
            "a. 23%", "b. 33%", "c. 34%", "d. 35%",
            "a. 1,2,3,7", "b. 2,4,8,9", "c. 1,3,5,7,9","d. 1,5,7,9",
            "a. 30", "b. 37", "c. 41", "d. 50",
            "a. 30 buah", "b. 35 buah", "c. 39 buah", "d. 49 buah",
            "A. - 44","B. - 36","C. 28","D. 48",
            "A. 16","B. 18","C. 24","D. 36",
            "A. 3 orang","B. 4 orang","C. 5 orang","D. 20 orang",
            "A. – 32","B. – 2","C. 64..1","D. 32..1",
            "A. 13..2","B. 11..2","C. 9..2","D. 6..2",
            "A. 9bulan","B. 8bulan","C. 6bulan","D. 4bulan",
            "A. Rp375.000,00","B. Rp400.000,00","C. Rp475.000,00","D. Rp625.000,00",
            "A. 5. 2","B. 5. 0","C. 2. –5","D. 1. –8",
    };

    //membuat array untuk jawaban benar
    String[] jawaban_benar = new String[]{
            "c. 432 cm2",
            "a. 10",
            "c. 27 dan 81",
            "b. 33%",
            "c. 1,3,5,7,9",
            "a. 30",
            "c. 39 buah",
            "A. - 44",
            "B. 18",
            "C. 5 orang",
            "D. 32..1",
            "B. 11..2",
            "A. 9bulan",
            "B. Rp400.000,00",
            "C. 2. –5",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Latihan Soal Matematika 1");
        setContentView(R.layout.activity_matematika);
        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
        rg = (RadioGroup) findViewById(R.id.radio_group);
        PilihanA = (RadioButton) findViewById(R.id.pilihanA);
        PilihanB = (RadioButton) findViewById(R.id.pilihanB);
        PilihanC = (RadioButton) findViewById(R.id.pilihanC);
        PilihanD = (RadioButton) findViewById(R.id.pilihanD);

        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[0]);
        PilihanB.setText(pilihan_jawaban[1]);
        PilihanC.setText(pilihan_jawaban[2]);
        PilihanD.setText(pilihan_jawaban[3]);

        rg.check(0);
        benar = 0;
        salah = 0;
    }
public void next(View view) {
        if (PilihanA.isChecked() || PilihanB.isChecked() || PilihanC.isChecked() || PilihanD.isChecked()) {
        RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        String ambil_jawaban_user = jawaban_user.getText().toString();
        rg.check(0);
        if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
        else salah++;
        nomor++;
        if (nomor < pertanyaan_kuis.length) {
        pertanyaan.setText(pertanyaan_kuis[nomor]);
        PilihanA.setText(pilihan_jawaban[(nomor * 4) + 0]);
        PilihanB.setText(pilihan_jawaban[(nomor * 4) + 1]);
        PilihanC.setText(pilihan_jawaban[(nomor * 4) + 2]);
        PilihanD.setText(pilihan_jawaban[(nomor * 4) + 3]);
        } else {
        hasil = benar * 10;
        Intent selesai = new Intent(getApplicationContext(), hasilskormtk.class);
        startActivity(selesai);
        }

        } else {
        Toast.makeText(this, "Pilih Jawan Dulu", Toast.LENGTH_SHORT).show();
        }
        }
    public void onBackPressed(){
        Toast.makeText(this, "Selesaikan kuis", Toast.LENGTH_SHORT).show();
        //jadi yang awalnya klik tombol back maka akan kembali ke activity sebelumnya
        //kali ini ketika tombol back diklik maka
        //hanya muncul Toast

    }
}

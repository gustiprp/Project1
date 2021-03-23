package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ipa extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;
    String[] pertanyaan_kuis = new String[]{
            "l. Gelombang merambat pada tali. Dalam waktu 15 sekon terbentuk 30 bukit dan 30 Iembah gelombang. Jika jarak antara dua dasar gelombang terdekat ketiga 60 cm, cepat rambat gelombang tersebut adalah ....",
            "2. Tiga gaya masing-masing 60 N ke selatan,40 N ke utara dan 80 ke selatan. Ketiga gaya bekerja pada sebua h benda. Jika usaha bersama ketiga gaya \terhadapbenda sebesar 720 J, jarak perpindahan benda dari posisi awa I adalah ....",
            "3. Bunyi garputala dengan frekuensi400 Hz merambat di udara dengan kecepatan 336 m/s. Kolom udara yng daPat beresonansi terhadap bunyi garputala adalah ....",
            "4. Benda terletak dari Iensa cembung sejauh 15 cm. Terbentuk bayangan nyata dengan perbesaran 2 kali dari bendanya. Jika benda digeser 6 cm menjauhi lensd, bayangan baru yang terbentuk bersifat .... ",
            "5. Alkohol pada suhu normal dipindahkan dari mangkok ke tabung. Yang terjadi terhadap alkohol bentuknya ...",
            "6. Batu bermassa 4 kg jatuh dari ketinggian 15 m dari tanah. Jika percepatan gravitasi 1 0 m/s2, energi kinetik batu pada saat sampai di tanah .... ",
            "7. Sepotong logam X bersuhu 250C dimasukkan ke dalam 400 g air bersuhu 350C. Suhu campuran menjadi 320C. Jika kalor jenis air 4200 J/kg0C, dan kalor jenis logam X 900 J/kgoC, berapakah massa logam X ...",
            "8. Seseorang menelpon temannya dari kota A yang waktu lokalnya men u nj u kka n pu ku l 09.00 kepada terna n nya d i kota B. Kota A berada pada posisi 105088-501S. Pada saat yang sama kota B menunjukkan waktu lokal pukul 14,40. Kota B berada pada koordinat .... ",
            "9.  Urutan cara pembuatan air bersih yang berasal dari air laut adalah ....",
            "10.  Pemanas air memiliki daya 600 W digunakan untuk memanaskan air 4 kg bersuhu awal 300C hingga mendidih pada suhu 1000C. Jika kalor jenis air 4200 J/kgoC. Waktu yang diperlukan untuk memanaskan adalah .... ",
    };
    String[] pilihan_jawaban = new String[]{
           "A. 150 cm/s","B. 120 c m/s","C. 90 cm/s","D. 60 cm/s",
            "A. 4 m kearah selatan","B. 7 ,2 m kearah selatan","C. 1 m kearah utara","D. 9 m kearah selatan",
            "A. 21 cm","B. 42cm","C. 84 cm","D. 168 cm",
            "A. nyata, terbalik, sama besar","B. nyata, terbalik, diperkecil","C. maya, tegak, diperbesar","D. nyata, terbalik, diperbesar",
            "A. mirip mangkok dan volum tetap karena gaya tarik antar molekul sangat lemah","B. mirip tabung dan volum sama dengan tabung karena gaya tarik antar molekul kuat ","C. mangkok dan volum sama dengan tabung karena gaya tarik antar ntolekul kuat","D. bentuk mirip tabung dan volum tetap karena gaya tarik antar molekul agak kuat",
            "A. 6OJ","B. 150J","C. 400J","D. 600 J",
            "A. 900 gram","B. 800 gram","C. 600 gram","D. 400 gram",
            "A. 600BB-100LU","B. 200BB-100LU","C. 350BT-100LU","D. 50BT-100LU",
            "A. penguapan -) kristalisasi","B. evaporasi -+ kondensasi","C. filtrasi -+ kristalisasi","D. evaporasi -+ destilasi",
            "A. 1800 sekon","B. 1960 sekon","C. 2100 sekon","D. 2250 sekon",
    };
    String[] jawaban_benar = new String[]{
            "B. 120 c m/s",
            "B. 7 ,2 m kearah selatan",
            "A. 21 cm",
            "B. nyata, terbalik, diperkecil",
            "D. bentuk mirip tabung dan volum tetap karena gaya tarik antar molekul agak kuat",
            "D. 600 J",
            "A. 800 gram",
            "C. 2) dan 3)",
            "B. 200BB-100LU",
            "B. evaporasi -+ kondensasi",
            "B. 1960 sekon",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Latihan Soal IPA 1");
        setContentView(R.layout.activity_ipa);
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
                Intent selesai = new Intent(getApplicationContext(), hasilskoripa.class);
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

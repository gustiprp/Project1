package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class bahasaindonesia extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    String[] pertanyaan_kuis = new String[]{
            "1.Berdasarkan hasil penelitian, satu pohon jika dikonversi ke rupiah bisa menghasilkan oksigen senilai Rp 1.174.000,00 per hari. Tentu pohon-pohon yang ditebang secara asal-asalan akan mempengaruhi ekosistem yang ada. Jika keseimbangan alam terganggu, dampaknya akan sangat dirasakan oleh manusia. Padahal fungsi pohon itu sendiri untuk menyerap air dan menyediakan oksigen secara gratis. Bayangkan saja apabila kila harus membeli oksigen untuk bernafas, berapa biaya yang kita keluarkan? Arti istilah dikonversi dalam paragraf tersebut adalah … \n",
            "2. Dewasa ini kita tidak asing lagi mendengar kata internet. Penggunaan internet berkembang dengan pesat. Sekarang masyarakat dapat dengan mudah mengakses internet di warnet atau melalui laptop dengan modem ataupun wireless-connected bahkan lewat HP. Jumlah pengguna interenet pun akan terus bertaambah.\n" +
                    "\n" +
                    "Arti istilah pesat dalam paragraf tersebut adalah …. \n",
            "3. Hidup bermasyarakat perlu saling menghargai. Salah satu bentuk penghargaan adalah pemberian pujian. Membiasakan memberikan pujian berarti belajar hidup saling menghargai. Hal itu akan membuat hidup ini semakin terasa indah.\n" +
                    "\n" +
                    "Makna tersurat paragraf di atas adalah … \n",
            "4. Perekonomian di dunia terus merosot yang disebabkan resesi di Eropa yang berkepanjangan. Hal ini membawa dampak yang sangat besar bagi perajin di Indonesia karena produknya tidak dapat diekspor bahkan gagal ekspor. Untuk mempertahankan kelangsungan hidup keluarga dan karyawannya banyak perajin kita yang beralih usaha lain.\n" +
                    "\n" +
                    "Makna tersurat paragraf di atas adalah … \n",
            "5. Mamaaaaa!!!!” teriak Sasa.\n" +
                    "\n" +
                    "“Ada apa, Sasa? Kok teriak-teriak begitu kayak di hutan saja,” tanya mama.\n" +
                    "\n" +
                    "“Ini nih, Ma. Lihat!! Masak bajunya gak muat, mana besok harus datang ke pesta ulang tahun Reno.”\n" +
                    "\n" +
                    "“Ya sudah, pakai yang lain saja atau mau pakai punya mama?” kata mama sambil tersenyum.\n" +
                    "\n" +
                    "Sasa hanya bisa mengernyitkan dahinya dan mendengus kesal.\n" +
                    "\n" +
                    "Makna tersurat dari kutipan cerpen di atas adalah … \n",
            "6. Aku bersyukur kepada Tuhan karena dia telah berubah. Aku pun memaafkannya, meskipun sampai saat ini aku belum bertemu dia lagi. Aku berharap suatu hari nanti kami akan menjalin persahabatan lagi.\n" +
                    "\n" +
                    "Penggalan cerpen di atas merupakan bagian … \n",
            "7. Matahari mulai tenggelam, anak katak yang nakal itu tidak juga pulang. Ibu katak sangat khawatir. Ia kemudian mencari anak katak. Ternyata anak katak masih asyik bermain dengan teman-temannya. Ibu katak mengajak anaknya pulang. Dengan berat hati, katak menyudahi dan mengikuti ibunya pulang.\n" +
                    "\n" +
                    "Kata ‘matahari yang mulai tenggelam” tersebut mengandung makna … \n",
            "8. Cermatilah petunjuk pembuatan cilok khas Bandung!\n" +
                    "\n" +
                    "Tepung terigu, garam, gula, merica dicampur dengan air panas sampai basahnya merata (jangan terlalu cair).\n" +
                    "Setelah kalis, siapkan air untuk merebus yang sudah diberi garam dan sedikit minyak.\n" +
                    "Setelah menunggu sampai agak dingin masukkan tepung kanji, daun bawang lalu uleni.\n" +
                    "Jika telah mengkilat, angkat lalu tiriskan.\n" +
                    "Bentuk adonan menjadi bulatan dan masukkan pada air yang mendidih.\n" +
                    "Terakhir untuk membuat bumbu kacang, blender semua bumbu kacang lalu didihkan sampai kental.\n" +
                    "Urutan pembuatan cilok yang tepat adalah … \n",
            "9. Penduduk desa binaan PKK provinsi mulai membajak sawah. Mereka akan menanam padi karena musim hujan sudah hadir.\n" +
                    "\n" +
                    "Penggunaan kata yang tidak tepat pada paragraf di atas adalah … \n",
            "10. Kedelai termasuk bahan pangan yang dapat dibuat segala makanan seperti tahu, tempe, dan tauco.\n" +
                    "\n" +
                    "Penggunaan kata yang tidak tepat pada paragraf di atas adalah … \n",

    };
    String[] pilihan_jawaban = new String[]{
            "A. Dibentuk", "B. Ditukar", "C. Digunakan", "D. Dihasilkan",
            "A. Banyak", "B. Lambat", "C. Cepat", "D. Kuat",
            "A. Bentuk penghargaan tidak hanya pemberian pujian tetapi bisa juga dengan pemberian hadiah.", "B. Hidup dengan memberi akan terasa sangat indah.", "C. Hidup dalam keanekaragaman harus saling menghargai.", "D. Pemberian pujian merupakan salah satu bentuk penghargaan dalam hidup bermasyarakat.",
            "A. Perekonomian Indonesia merosot sehingga berdampak di perekonomian dunia.", "B. Dampak kemerosoton perekonomian dunia, perajin Indonesia beralih usaha lain.", "C. Kegagalan mengekspor produk karena perajin tidak mampu bersaing untuk menghasilkan produk unggulan.", "D. Eropa menjadi penyebab Indonesia tidak bisa ekspor produk.",
            "A. Sasa kesal karena diejek oleh mamanya.", "B. Sasa tidak memiliki baju untuk ke pesta ulang tahun Reno.", "C. Mama memilihkan baju untuk Sasa.", "D. Sasa sedang mempersiapkan baju yang akan dipakai saat pesta ulang tahun Reno.",
            "A. Krisis", "B. Resolusi", "C. Orientasi", "D. Komplikasi",
            "A. Hari hampir sore", "B. Hari hampir pagi", "C. Hari hampir malam", "D. Hari hampir siang",
            "A. (1) – (3) – (2) – (5) – (4) – (6)", "B. (1) – (2) – (3) – (4) – (5) – (6)", "C. (1) – (2) – (5) – (3) – (4) – (6)", "D. (1) – (3) – (5) – (3) – (4) – (6)",
            "A. Binaan", "B. Membajak", "C. Musim", "D. Hadir",
            "A. Bahan", "B. Pangan", "C. Dibuat", "D. Segala",
    };
    String[] jawaban_benar = new String[]{
            "B. Ditukar",
            "C. Cepat",
            "D. Pemberian pujian merupakan salah satu bentuk penghargaan dalam hidup bermasyarakat.",
            "B. Dampak kemerosoton perekonomian dunia, perajin Indonesia beralih usaha lain.",
            "B. Sasa tidak memiliki baju untuk ke pesta ulang tahun Reno.",
            "B. Resolusi",
            "C. Hari hampir malam",
            "A. (1) – (3) – (2) – (5) – (4) – (6)",
            "D. Hadir",
            "D. Segala",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Latihan Soal Bahasa Indonesia");
        setContentView(R.layout.activity_bahasaindonesia);
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
                Intent selesai = new Intent(getApplicationContext(), hasilskorbindo.class);
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


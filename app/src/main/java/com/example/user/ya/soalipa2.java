package com.example.user.ya;

/**
 * Created by user on 06/06/2018.
 */

public class soalipa2 {
    public String pertanyaan[] = {
            "1. Perhatikan gambar pengukuran dengan alat berikut! \n\n" +
                    "Massa beban X adalah ....\n",
            "2. Perhatikan gambar tuas berikut!\n\n" +
                    "Tali penggantung digeser 10 cm menjauhi beban. Jika posisi kuasa tetap, agar tuas tetap seimbang maka kuasa diperbesar menjadi....\n",
            "3. Perhatikan gambar berikut!\n\n" +
                    "Bagian ginjal yang berfungsi untuk reabsopsi dan augmentasi ditunjukkan nomor....\n",
            "4. Kertas lakmus merah dan lakmus biru dicelupkan ke dalam beberapa larutan.\n" +
                    "Perubahan warna dan Perubahan warna lakmus yang benar adalah ....\n",
            "5. Beberapa balok terbuat dari bahan yang sama berada di atas lantai seperti gambar.\n" +
                    "Urutan balok dengan tekanan paling kecil ke paling besar adalah ....\n",
            "6. Perhatikan skema transformator berikut!\n\n" +
                    "Berdasarkan data pada gambar, kuat arus pada kumparan primer sebesar....\n",
            "7. Perhatikan grafik statistik kependudukan berikut!\n\n" +
                    "Berdasarkan statistik Kependudukan Indonesia tersebut, dampak yang terjadi berkaiatan dengan kualitas lingkungan adalah....\n",
            "8. Perhatikan tabel berikut!\n\n" +
                    "Berdasarkan tabel tersebut, bahan makanan yang mengandung glukosa adalah....\n",
            "9. Perhatikan gambar berikut!\n\n" +
                    "Sendi yarig diberi tanda panah adalah....\n",
            "10. Perhatikan grafik berikut!\n\n" +
                    "Udara residu di tunjukkan oleh nomor....\n",
                };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "ipa2no1",
            "ipa2no2",
            "ipa2no10",
            "ipa2no3",
            "ipa2no4",
            "ipa2no5",
            "ipa2no6",
            "ipa2no7",
            "ipa2no8",
            "ipa2no9",
    };

    private String pilihanJawaban[][] = {
            {"A. 300 g", "B. 350 g","C. 400 g", "D. 450 g"},
            {"A. 200 N","B. 160 N","C. 150 N", "D. 120 N"},
            {"A. 1 dan 2","B. 1 dan 3","C. 2 dan 3","D. 2 dan 4"},
            {"A. 1 dan 3","B. 2 dan 3","C. 2 dan 4","D. 3 dan 4"},
            {"A. (2), (3), (4), (1)","B. (1), (3), (2), (4)","C. (3), (1), (4), (2)","D. (2), (4), (1), (3)"},
            {"A. 3 A","B. 2,4 A","C. 0,8 A","D. 0,3 A"},
            {"A. meningkatkan udara bersih","B. menurunkan udara bersih","C. terpenuhinya air bersih bagi penduduk","D. terpenuhinya perumahan bagi penduduk"},
            {"A. 1, 2, dan 3","B. 1, 2, dan 5","C. 2, 4, dan 5","D. 2, 3, dan 5"},
            {"A. engsel, menggerakan ke satu arah","B. pelana, memungkinkan ke dua arah","C. peluruh, menggerakaan ke segala arah","D. putar, mengerakan gerak berputar"},
            {"A. 1","B. 2","C. 3","D. 4"},
    };


    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "C. 400 g",
            "C. 150 N",
            "B. 1 dan3",
            "A. 1dan3",
            "D. (2),(4),(1 ),(3)",
            "D. 0,3 A",
            "B. menurunkan udara bersih",
            "B. 1,2, dan 5",
            "B. pelana, memungkinkan ke dua arah",
            "A. 1",
    };

    //membuat getter untuk mengambil pertanyaan
    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }
    public String getPilihanJawaban1(int x){
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    //membuat getter untuk mengambil pilihan jawaban 2
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    //membuat getter untuk mengambil pilihan jawaban 3
    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }
    public String getPilihanJawaban4(int x){
        String jawaban4 = pilihanJawaban[x][3];
        return jawaban4;
    }

    //membuat getter untuk mengambil jawaban benar
    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}

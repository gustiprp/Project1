package com.example.user.ya;

/**
 * Created by user on 05/06/2018.
 */

public class soalmtk2 {
    public String pertanyaan[] = {
     "1. Perhatikan grafik berikut! \n" +
     "Rumus fungsinya  adalah … \n",
     "2. Perhatikan gambar berikut! \n"+
     "Luas bangun ABCDE adalah... \n",
     "3. Perhatikan gambar persegi ABCD dan jajargenjang EFGH di bawah! \n"+
             "Jika luas seluruh daerah yang tidak diarsir 61 cm2,  maka luas daerah yang diarsir adalah.... \n",
            "4. Perhatikan gambar! \n"+
                    "Pasangan sudut yang sama besar adalah… \n",
            "5. Perhatikan gambar! \n"+
                    "Pada gambar di atas panjang PQ adalah … \n ",
            "6. Perhatikan gambar berikut!" +
            "Nilai (2x + y + z)berdasarkan gambar di atas adalah .... \n",
            "7. Besar <A pada gambar  adalah … \n  ",
            "8. Perhatikan gambar berikut! BC adalah… \n",
            "9. Perhatikan gambar! pusat lingkaran     Jika besar <BOC = 720, maka  <BAC = ... \n",
            "10. Dari rangkaian persegi tersebut, yang merupakan jaring-jaring kubus adalah ... \n",
            "11. Perhatikan  gambar yang dibentuk oleh kerucut dan belahan bola! \n"+
                    "Volum bangun tersebut adalah....   (pi =3,14) \n",
            "12. Pola gambar berikut dibuat dari batang korek api. \n"+
                    "Banyak batang korek api pada pola ke-6 adalah … \n",
            "13. Perhatikan diagram Venn berikut! \n"+
                    "Daerah yang menyatakan A irisan B  adalah …  \n",
            "14. Perhatikan diagram panah berikut! \n"+
                    "Relasi yang tepat dari himpunan P ke himpunan Q adalah… \n",
    };

    //membuat array untuk set gambar (dari String diubah jadi ImageView)
    //pastikan yang tertulis disini sama dengan nama di drawable
    //lihat gambar penjelasan1
    private String image[] = {
            "s2",
            "s3",
            "s4",
            "s5",
            "s6",
            "s7",
            "s8",
            "s9",
            "s10",
            "s11",
            "s12",
            "s13",
            "s14",
            "s15",

    };
    private String pilihanJawaban[][] = {
            {"A. f(x) = -3x – 6","B. f(x) =  3x – 6","C. f(x) = -3x + 6","D. f(x) =  3x + 6"},
            {"A. 430 cm2","B. 470 cm2","C. 500 cm2","D. 568 cm2"},
            {"A. 6 cm2","B. 10 cm2","C. 12 cm2","D. 20 cm2"},
            {"A. <A dengan <D","B. <B dengan <D","C. <B dengan <E","D. <C dengan <F"},
            {"A. 19,2 cm","B. 18,8 cm","C. 17,2 cm","D. 16,3 cm"},
            {"A. 1250","B. 1400","C. 1450","D. 1800"},
            {"A. 45º","B. 55º","C. 65º","D. 85º"},
            {"A. Busur","B. Tali busur","C. Juring","D. Tembereng"},
            {"A. 36º","B. 48º","C. 60º","D. 72º"},
            {"A. 1 dan 3","B. 1 dan 4","C. 2 dan 3","D. 2 dan 4"},
            {"A. 15.543 cm³","B. 15.675 cm³","C. 18.681 cm³","D. 18.836 cm³"},
            {"A. 108","B. 84","C. 45","D. 30"},
            {"A. I","B. II","C. III","D. I. II. III"},
            {"A. Faktor dari","B. Kurang dari","C. Tiga kali dari","D. Sepertiga dari"},
    };


    //membuat array jawaban benar
    private String jawabanBenar[] = {
            "D. f(x) =  3x + 6",
            "B. 470 cm2",
            "A. 6 cm2",
            "B. <B dengan <D",
            "C. 17,2 cm",
            "C. 1450",
            "D. 85º",
            "A. Busur",
            "A. 36º",
            "B. 1 dan 4",
            "A. 15.543 cm³",
            "B. 84",
            "B. II",
            "A. Faktor dari",

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


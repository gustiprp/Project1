package com.example.user.ya;

/**
 * Created by user on 07/06/2018.
 */

public class soalbing2 {
    public String pertanyaan[] = {
            "1. What is advertised in the text? \n",
            "2. What is the maximum size of the micro SD compatible to the product? \n",
            "3. From the text, we can conclude that this advertisement is valid for … \n",
            "4. What is advertised in the text? \n",
            "5. What main cuisine is available in the restaurant? \n",
            "6. People can order food? \n",
            "7. What is mainly advertised in the text? \n",
            "8. What is the size of the memory offered for the product \n",
            "9. From the text we can conclude that by using the product, people can probably \n",
    };

    private String image[] = {
            "b1",
            "b1",
            "b1",
            "b2",
            "b2",
            "b2",
            "b3",
            "b3",
            "b3",


    };
    private String pilihanJawaban[][] = {
            {"A. A home phone.","B. A mobile phone.","C. A landline phone.","D. A used cellphone."},
            {"A. 15 GB.","B. 16 GB.","C. 17 GB.","D. 18 GB."},
            {"A. all cellphones produced by Samsung","B. all Samsung cellphones sold in the shop","C. all devices sold in Roma Cellular Phone","D. a certain model of cellphones sold in a shop"},
            {"A. A fine Persian cuisine.","B. A catering company.","C. A certain restaurant.","D. A kind of food."},
            {"A. Bangladesh cuisine.","B. Pakistan cuisine.","C. Persian cuisine.","D. Indian cuisine."},
            {"A. every day at certain time","B. every day at anytime","C. on weekends only","D. on weekdays only"},
            {"A. Portable computer.","B. Deskstop computer.","C. 1.2 MP Web camera.","D. USB 3.0 SuperSpeed Port."},
            {"A. 1.2 GB.","B. 2 GB.","C. 11 GB.","D. 32 GB."},
            {"A. listen to  a song","B. play an on line game","C. save their data up to 600 GB","D. write using  MS word or Excell program"},

                };

    private String jawabanBenar[] = {
            "B. A mobile phone.",
            "B. 16 GB.",
            "D. a certain model of cellphones sold in a shop",
            "C. A certain restaurant.",
            "C. Persian cuisine.",
            "A. every day at certain time",
            "A. Portable computer.",
            "B. 2 GB.",
            "D. write using  MS word or Excell program",
    };
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

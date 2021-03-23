package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class bahasainggris extends AppCompatActivity {
    TextView pertanyaan;
    RadioGroup rg;
    RadioButton PilihanA, PilihanB, PilihanC, PilihanD;
    int nomor = 0;
    public static int hasil, benar, salah;

    String[] pertanyaan_kuis = new String[]{
            "The following text is for questions 1 to 3. \n\n " +
                    "Important!\n" +
                    "For Grade 7 and Grade 8 students\n" +
                    "Attention!\n" +
                    "December has come! It is a special month. The story telling competition will\n" +
                    "be held as usual. Go and get it! Join now!\n" +
                    "There are interesting prizes for the three best winners.\n" +
                    "Practise your English and enroll for the competition soon.\n" +
                    "Registration\n" +
                    "Mr. Suryono (Administration Office)\n" +
                    "8 a.m. to 2 p.m.\n" +
                    "Monday to Friday, before December 20. \n\n" +
            "1. The text is written to .... \n",
            "2. What must the students firstly do to join the competition? \n",
            "3. From the text we can conclude that the competition is held .... \n",
            "The following text is for questions 4 to 6. \n\n" +
                    "12 November, 2015 \n" +
                    "To: All the committee of the Student Organization \n" +
                    "SMP N 2 Pandan Raya \n" +
                    "As shown in the school program, our school will celebrate its 10th anniversary next \n" +
                    "December. Therefore, we would like to invite you to attend the meeting: \n" +
                    "Day /Date : Saturday , 13 November, 2015 \n" +
                    "Place : Student Organization Room \n" +
                    "Time : 1 - 3 pm \n" +
                    "We have some crucial items to discuss: deciding the date and the place of the celebration, the prizes we will give the winners, etc. Due to the importance of this meeting, your attendance is a must. \n" +
                    "Please come on time. \n" +
                    "Chair person \n" +
                    "Student Organization \n" +
                    "Suhendra \n\n" +
            "4. The text is written to .... \n",
            "5. What items will be discussed in the meeting? \n",
            "6. We have some crucial items in the agenda to discuss. What does the underlined word mean? \n",

            "The following text is for questions 7 to 10. \n\n" +
                    "Yogyakarta, 21 November 2015 \n" +
                    "Dear Tantri, \n" +
                    "Nowadays, it’s difficult to find a true friend like you. I sometimes think I am very lucky to get you as my friend. Without you, my life would have been very boring. I still remember the first day of school when we were young. You called  Roma cellular Phone Pramuka Street 20 Yogyakarta. Telp: 0274 5667944. me and gave me a seat. That moment is not easy to forget. It is the beginning of our long friendship. You even often shared some of your food when my mother forgot to give me pocket money. You also lent me a dictionary when I forgot to bring it. It’s almost 15 years we have been shared problems and fun together. Now, you’re not here anymore. I would like to thank you for being there for me for the ups and downs of my life. It’s time for us to be apart. You have to move to Surabaya. I just want to say that you are my best friend. It is difficult for me to say goodbye. I don’t want you to leave me but I know that moving to Surabaya is very important for your future. I only hope that you will get everything that you dream of in your new city. One thing that I want to tell you, please don’t forget me. Keep in touch. Send me an email and tell your activities there. Don’t make the distance break our relationship. It is hard for me to stay away from you. I can’t wait to meet you soo \n" +
                    "With best wishes, \n" +
                    "Truly yours, \n" +
                    "Veny \n\n" +
            "7. What is the writer’s intention to write the letter? \n",
            "8. The unforgettable moment with Tantri that Veny always remembers is when she .... \n",
            "9. Why did the writer say thank you to her best friend via letter? \n",
            "10. From the text we can conclude that Tantri.... \n",


            "The following text is for questions 11 to 13. \n\n" +
                    "+6281226785922 \n" +
                    "Mr. Indra, please forward to others. As there will be a camping next month, I want all scout coaches to lead the dicussion with all the scouts related to the preparation for the next camping activity. \n" +
                    "Remind them to bring everything they need like clothes, cooking utensils and food stuff. \n" +
                    "Mr. Hakim and I will be responsible for the male scouts. Mrs. Susi and Ms. Dina will be with the girl scouts. In this way, the discussion will run well. \n" +
                    "Mr. Rendy (coordinator) \n\n" +
            "11. Why is the text written for? \n",
            "12. What should be prepared by the camping participants? \n",
            "13. To make the discussion run well, Mr. Rendi asks.... \n ",
            "The following text is for questions 14 to 15. \n\n" +
                    "Dragonflies are the fastest flying insects. They swoop over the streams and ponds up to 90 kilometers per hour. Meanwhile, damselflies have longer, thinner bodies and are more delicate, with a slow, flattering flight. The wings of the damselfly are almost transparent. They shimmer as the damselfly searches for small insects to eat. Dragonflies and damselflies live near water. They lay their eggs on plants. When they hatch, the young ones, called nymphs come out of the eggs. They feed on water creatures, and after two years the nymphs grow into adults.\n\n" +
            "14. What does the text mostly talk about? \n",
            "15. What is the main idea of the second paragraph? \n",
    };

    String[] pilihan_jawaban = new String[]{
            "A. explain to the readers about how to join a story telling competition", "B. ask the readers to advertise a story telling competition", "C. inform the readers about a story telling competition", "D. tell the readers about the prizes for the winners",
            "A. Meet the winners", "B. Practise their English", "C. Bring prizes to the event", "D. Enroll for the competition",
            "A. biweekly ", "B. annually ", "C. monthly", "D. weekly",
            "A. persuade the readers to succeed the meeting", "B. invite the readers to prepare the meeting", "C. inform the readers about the meeting", "D. ask the readers to attend the meeting",
            "A. The programs, date, and fund.", "B. The programs, prizes and committee.", "C. The date, place and prizes for winners", "D. The date of celebration, competition and show.",
            "A. Up-to-date", "B. Very difficult.", "C. Really popular.", "D. Extremely important.",
            "A. To give information about the writer’s past experience.", "B. To ask Tantri if she can meet the writer soon.", "C. To remind her friend to visit her.", "D. To say goodbye to her friend.",
            "A. lent her a dictionary in the English class", "B. gave her a seat on the first day of school", "C. shared food with her", "D. gave her some money",
            "A. Tantri was her true friend.", "B. She wants Tantry so send her an email", "C. Tantri does not live close to the writer anymore.", "D. Veny was very lucky to have a friend like Tantri.",
            "A. has moved to Surabaya", "B. is about to move to Surabaya", "C. moved to Surabaya several months ago", "D. will move to Surabaya anytime in the future",
            "A. To ask the scout coaches to lead the discussion with all the scouts.", "B. To invite the scout coaches to prepare the camping next month.", "C. To inform the students to prepare the things needed.", "D. To ask the students to go camping next month.",
            "A. Appliances, clothes, food stuff and regulations for participants.", "B. Clothes, appliances, food stuff and location of the camping.", "C. Tools, clothes, food stuff, and the timetable of the camping.", "D. Clothes, camping tools, cooking utensils and food stuff.",
            "A. the participants to discuss the preparation of the camping.", "B. Mr. Hakim and Mr. Indra to lead the discussion of the scouts.", "C. all coaches to be responsible for  the discussion of the scouts.", "D. the coaches to discuss the preparation of the camping activity.",
            "A. Dragonflies and nymphs.", "B. Dragonflies and damselflies.", "C. Water creatures and flying insects.", "D. Dragonflies and damselflies’ wings.",
            "A. Dragonflies and damselflies lay eggs.", "B. Dragonflies are the fastest flying insects.", "C. Damselflies have longer and thinner bodies.", "D. Dragonflies and damselflies live near water.",

    };

    String[] jawaban_benar = new String[]{
            "C. inform the readers about a story telling competition",
            "D. Enroll for the competition",
            "B. annually ",
            "B. invite the readers to prepare the meeting",
            "C. The date, place and prizes for winners",
            "D. Extremely important.",
            "D. To say goodbye to her friend.",
            "B. gave her a seat on the first day of school",
            "D. Veny was very lucky to have a friend like Tantri.",
            "A. has moved to Surabaya",
            "A. To ask the scout coaches to lead the discussion with all the scouts.",
            "C. Tools, clothes, food stuff, and the timetable of the camping.",
            "D. the coaches to discuss the preparation of the camping activity.",
            "B. Dragonflies and damselflies.",
            "C. Damselflies have longer and thinner bodies.",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Latihan Soal Bahasa Inggris 1");
        setContentView(R.layout.activity_bahasainggris);
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
                Intent selesai = new Intent(getApplicationContext(), hasilskorbing.class);
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

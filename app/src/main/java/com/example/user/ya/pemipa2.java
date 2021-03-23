package com.example.user.ya;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class pemipa2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Pembahasan IPA 2");
        setContentView(R.layout.activity_pemipa2);
        getSupportActionBar().setTitle("Pembahasan IPA 2");

        VideoView videoView = (VideoView) findViewById(R.id.videoView);
        //inisialisasi object videoView
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" +  R.raw.ipa2));
        //digunakan untuk mengidentifikasi resource seperti lokasi video
        videoView.setMediaController(new MediaController( this));
        //menampilkan media controller video
        videoView.start();
        //memulai video
    }
}

package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menumtk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu Matematika");
        setContentView(R.layout.activity_menumtk);
    }
    public void mtk1(View view) {
        Intent intent = new Intent(menumtk.this, matematika.class);
        startActivity(intent);
    }
    public void mtk2(View view) {
        Intent intent = new Intent(menumtk.this, matematika2.class);
        startActivity(intent);
    }
}

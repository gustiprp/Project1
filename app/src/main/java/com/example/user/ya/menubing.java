package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menubing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu Bahasa Inggris");
        setContentView(R.layout.activity_menubing);
    }
    public void bing1(View view) {
        Intent intent = new Intent(menubing.this, bahasainggris.class);
        startActivity(intent);
    }

    public void bing2(View view) {
        Intent intent = new Intent(menubing.this, bahasainggris2.class);
        startActivity(intent);
    }
}

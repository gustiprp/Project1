package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menubindo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu Bahasa Indonesia");
        setContentView(R.layout.activity_menubindo);

    }
    public void bindo1(View view) {
        Intent intent = new Intent(menubindo.this, bahasaindonesia.class);
        startActivity(intent);
    }
}

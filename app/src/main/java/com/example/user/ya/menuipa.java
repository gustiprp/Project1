package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menuipa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu IPA");
        setContentView(R.layout.activity_menuipa);
    }
    public void ipa1(View view) {
        Intent intent = new Intent(menuipa.this, ipa.class);
        startActivity(intent);
    }

    public void ipa2(View view) {
        Intent intent = new Intent(menuipa.this, ipa2.class);
        startActivity(intent);
    }
}

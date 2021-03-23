package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class pembahasan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu Pembahasan");
        setContentView(R.layout.activity_pembahasan);
    }
    public void mtk1 (View view) {
        Intent intent = new Intent(pembahasan.this, pemmtk1.class);
        startActivity(intent);
    }
    public void mtk2 (View view) {
        Intent intent = new Intent(pembahasan.this, pemmtk2.class);
        startActivity(intent);
    }

    public void ipa1 (View view) {
        Intent intent = new Intent(pembahasan.this, pemipa.class);
        startActivity(intent);
    }
    public void ipa2 (View view) {
        Intent intent = new Intent(pembahasan.this, pemipa2.class);
        startActivity(intent);
    }

    public void bahasainggris1 (View view) {
        Intent intent = new Intent(pembahasan.this, pembing1.class);
        startActivity(intent);
    }
    public void bahasainggris2 (View view) {
        Intent intent = new Intent(pembahasan.this, pembing2.class);
        startActivity(intent);
    }

    public void bahasaindonesia (View view) {
        Intent intent = new Intent(pembahasan.this, pemindo.class);
        startActivity(intent);
    }

}

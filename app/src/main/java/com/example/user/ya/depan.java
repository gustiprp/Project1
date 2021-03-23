package com.example.user.ya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class depan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depan);
        getSupportActionBar().setTitle("");
    }
    public void next (View view) {
        Intent intent = new Intent(depan.this, menuawal.class);
        startActivity(intent);
    }
}

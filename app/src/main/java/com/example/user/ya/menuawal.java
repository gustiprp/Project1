package com.example.user.ya;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.View;

public class menuawal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle( "Menu Mata Pelajaran");
        setContentView(R.layout.activity_menuawal);
    }

    public void mtk(View view) {
        Intent intent = new Intent(menuawal.this, menumtk.class);
        startActivity(intent);
    }

    public void ipa(View view) {
        Intent intent = new Intent(menuawal.this, menuipa.class);
        startActivity(intent);
    }

    public void bing(View view) {
        Intent intent = new Intent(menuawal.this, menubing.class);
        startActivity(intent);
    }

    public void bindo(View view) {
        Intent intent = new Intent(menuawal.this, menubindo.class);
        startActivity(intent);
    }

    public void pemba(View view) {
        Intent intent = new Intent(menuawal.this, pembahasan.class);
        startActivity(intent);
    }

    public void imageButton(View view) {
        Intent intent = new Intent(menuawal.this, tentang.class);
        startActivity(intent);
    }

    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Do you want to Exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        menuawal.this.finish();
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
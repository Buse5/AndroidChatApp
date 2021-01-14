package com.example.sohbetuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        kontrol();

    }

    public void tanimla()
    {
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();

    }
    public void kontrol()
    {
        if(user==null){

            Intent intent= new Intent(MainActivity.this,KayitOlActivity.class); //aktivityler arası geçisşi sağlamış oluyoruz
            startActivity(intent);
            finish();
        }

    }
}
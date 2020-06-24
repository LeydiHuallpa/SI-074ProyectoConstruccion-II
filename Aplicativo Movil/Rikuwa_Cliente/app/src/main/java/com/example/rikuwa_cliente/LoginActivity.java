package com.example.rikuwa_cliente;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void registro(View view) {
        startActivity(new Intent(this,RegistroActivity.class));
    }

    public void maps(View view) {
        startActivity(new Intent(this,MapaActivity.class));
    }
}


package com.yuri.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuri.bancomr.databinding.ActivitySaldoBinding;

public class Saldo extends AppCompatActivity {

    private ActivitySaldoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySaldoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Escondendo ActionBar da Activity
        getSupportActionBar().hide();

        //criando evento de click para o icone voltar
        binding.toolbarSaldo.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Declarando intenção de voltar a tela principal
                Intent voltarTelaPrincipal = new Intent(Saldo.this,MainActivity.class);
                startActivity(voltarTelaPrincipal);
            }
        });
    }
}
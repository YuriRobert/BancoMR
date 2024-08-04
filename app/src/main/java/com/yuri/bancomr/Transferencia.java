package com.yuri.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuri.bancomr.databinding.ActivityTransferenciaBinding;

public class Transferencia extends AppCompatActivity {

    private ActivityTransferenciaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTransferenciaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarTransferencia.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //tambem pode ser feito dessa forma, ao clicar no ic voltar a aplicação será finalizada e retornará a tela anterior
                //também irá aumentar um pouco o desempenho
                finish();
            }
        });

    }
}
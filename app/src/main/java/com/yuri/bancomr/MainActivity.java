package com.yuri.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yuri.bancomr.databinding.ActivityMainBinding;

//Implementando a interface de click
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        //Forma de reduzir o codigo
        binding.imgSaldo.setOnClickListener(this);
        binding.imgTransferencia.setOnClickListener(this);
        binding.imgPoupanca.setOnClickListener(this);
        binding.imgFaturas.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        //Criando variavel para ser a id das imagens
        int id = view.getId();

        if (id == R.id.imgSaldo){
            //intenção para navegar para outra tela, no caso navegando da Main Activity para a Activity de saldo
            Intent navegarTelaDeSaldo = new Intent(MainActivity.this, Saldo.class);
            startActivity(navegarTelaDeSaldo);
        }else if (id == R.id.imgFaturas ){
            Intent navegarTelaFaturas = new Intent(MainActivity.this, Faturas.class);
            startActivity(navegarTelaFaturas);
        }else if (id == R.id.imgTransferencia){
            Intent navegarTelaTransferencia = new Intent(MainActivity.this, Transferencia.class);
            startActivity(navegarTelaTransferencia);
        }else{
            Intent navegarTelaPoupanca = new Intent(MainActivity.this,Poupanca.class);
            startActivity(navegarTelaPoupanca);
        }
    }
}
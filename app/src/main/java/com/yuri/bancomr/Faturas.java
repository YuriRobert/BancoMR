package com.yuri.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;
import com.yuri.bancomr.databinding.ActivityFaturasBinding;

public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent voltarTelaFaturas = new Intent(Faturas.this,MainActivity.class);
                startActivity(voltarTelaFaturas);
            }
        });

        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("4235 6477 2802 5682");
        cartaoDeCredito.setCardName("kaique Alexandre Sampaio");
        cartaoDeCredito.setExpiryDate("11/25");
        cartaoDeCredito.setType(CardType.VISA);
    }
}
package com.example.ingressos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class tela02 extends AppCompatActivity {

    TextView nomeCliente;
    TextView rgcliente;
    TextView dtdenascimento;
    TextView formaPagamento;
    TextView acomp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela02);

        this.nomeCliente = findViewById(R.id.nomeCliente);
        this.rgcliente = findViewById(R.id.rgcliente);
        this.formaPagamento = findViewById(R.id.formaPagamento);
        this.dtdenascimento = findViewById(R.id.dtdenascimento);
        this.acomp = findViewById(R.id.acomp);

        Intent intentComprar = getIntent();

        Bundle parametros = intentComprar.getExtras();

        this.nomeCliente.setText("Nome cliente: " + parametros.getString("keyname"));
        this.rgcliente.setText("Rg do cliente: " + parametros.getString("keyrg"));
        this.formaPagamento.setText("Forma de pagamento: " + parametros.getString("keyformapagamento"));
        this.dtdenascimento.setText("Data de nascimento:" + parametros.getString("keydt"));
        this.acomp.setText(parametros.getString("keyacompanhamento"));
    }
}

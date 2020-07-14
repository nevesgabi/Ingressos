package com.example.ingressos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    EditText nomecli;
    EditText rgcli;
    EditText data;
    Button btncomprar;
    RadioGroup rgPagamento;
    CheckBox acompanhamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nomecli = (EditText) findViewById(R.id.nome);
        rgcli = (EditText) findViewById(R.id.rg);
        data = (EditText) findViewById(R.id.data);
        btncomprar = (Button) findViewById(R.id.btnComprar);
        rgPagamento = (RadioGroup) findViewById(R.id.rgPagamento);
        acompanhamento = (CheckBox) findViewById(R.id.acompanhamento);
    }

    public void Comprar(View view){

        String nome = nomecli.getText().toString();
        String rg = rgcli.getText().toString();
        String dt = data.getText().toString();

        Intent intentComprar = new Intent(getApplicationContext(), tela02.class);
        Bundle parametros = new Bundle();

        int selectedId = rgPagamento.getCheckedRadioButtonId();

        RadioButton formaPagamento = (RadioButton) findViewById(selectedId);

        parametros.putString("keyname", nome);
        parametros.putString("keyrg", rg);
        parametros.putString("keydt", dt);
        parametros.putString("keyformapagamento", formaPagamento.getText().toString());
        parametros.putString("keyacompanhamento", acompanhamento.isChecked() ? "Com acompanhamento" : "Sem acompanhamento");

        intentComprar.putExtras(parametros);
        startActivity(intentComprar);
    }
}

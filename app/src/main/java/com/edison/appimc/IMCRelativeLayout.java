package com.edison.appimc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IMCRelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imcrelative_layout);
    }

    public void calculaIMC(View view) {
        EditText edPeso = findViewById(R.id.pesoEdit);
        EditText edAltura = findViewById(R.id.alturaEdit);

        Double peso = Double.parseDouble(edPeso.getText().toString());
        Double altura = Double.parseDouble(edAltura.getText().toString());

        TextView imcLabel = findViewById(R.id.imcLabel);

        String calculo = String.valueOf(peso / (altura * altura));

        imcLabel.setText(calculo);

    }

    public void openCredito(View view) {
        Intent i = new Intent(this, CreditosActivity.class);

        startActivity(i);
    }
}

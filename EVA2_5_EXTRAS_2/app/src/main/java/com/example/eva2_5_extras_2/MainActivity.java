package com.example.eva2_5_extras_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private EditText edtTxtNom, edtTxtEdad,edtTxtSal;
    private RadioGroup rGroup;
    private RadioButton rbtnSol,rbtnCas,rbtnViu,rbtnArre;
    private CheckBox chkTrabaja;
    private Intent inSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxtNom = findViewById(R.id.edtTxtNom);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
        edtTxtSal= findViewById(R.id.edtTxtSal);
        rbtnSol = findViewById(R.id.rbtnSol);
        rbtnViu = findViewById(R.id.rbtnViu);
        rbtnArre = findViewById(R.id.rbtnArre);
        rbtnCas = findViewById(R.id.rbtnCas);
        chkTrabaja= findViewById(R.id.chkTrabaja);
        rGroup = findViewById(R.id.rGroup);

        inSecond = new Intent(this,SecondActivity.class);

    }

    public void onClick(View v){
        inSecond.putExtra("nombre",edtTxtNom.getText().toString());
        inSecond.putExtra("edad",edtTxtEdad.getText().toString());
        inSecond.putExtra("salario",Double.parseDouble(edtTxtSal.getText().toString()));
        inSecond.putExtra("trabaja",chkTrabaja.isChecked());

        if (rbtnSol.isChecked()){
            inSecond.putExtra("estado","Soltero");
        }else if(rbtnCas.isChecked()){
            inSecond.putExtra("estado","Casasdo");
        }else if(rbtnViu.isChecked()){
            inSecond.putExtra("estado","Viudo");
        }else if(rbtnArre.isChecked()){
            inSecond.putExtra("estado","Arrejuntado");
        }

        startActivity(inSecond);
    }
}

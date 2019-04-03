package com.example.eva2_9_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OtraActivity extends AppCompatActivity {
    private EditText edtTxtDatosOtra;
    Intent inDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);
        edtTxtDatosOtra = findViewById(R.id.edtTxtxtDatosOtra);
    }

    public void onClickOk2(View v){
        String sCad = edtTxtDatosOtra.getText().toString();
        inDatos = new Intent();
        inDatos.putExtra("DATOS",sCad);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickCancel2(View v){
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}

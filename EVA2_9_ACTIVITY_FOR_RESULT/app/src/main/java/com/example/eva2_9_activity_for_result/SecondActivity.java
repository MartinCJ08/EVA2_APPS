package com.example.eva2_9_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private EditText edtTxtDatosSec;
    Intent inDatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edtTxtDatosSec = findViewById(R.id.edtTxtDatosSec);
    }

    public void onClickOk(View v){
        String sCad = edtTxtDatosSec.getText().toString();
        inDatos = new Intent();
        inDatos.putExtra("DATOS",sCad);
        setResult(Activity.RESULT_OK,inDatos);
        finish();
    }

    public void onClickCancel(View v){
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}

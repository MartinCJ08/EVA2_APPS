package com.example.eva2_8_correo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtCorreo,edtTxtAsunto,edtTxtMensaje;
    Intent inCorreo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxtCorreo = findViewById(R.id.edtTxtCorreo);
        edtTxtAsunto = findViewById(R.id.edtTxtAsunto);
        edtTxtMensaje = findViewById(R.id.edtTxtMensaje);
    }

    public void onClick(View v){
        inCorreo.setType("vnd.android.cursor.dir/email");
        inCorreo.putExtra(Intent.EXTRA_SUBJECT, edtTxtAsunto.getText().toString());
        inCorreo.putExtra(Intent.EXTRA_EMAIL, edtTxtCorreo.getText().toString());
        inCorreo.putExtra(Intent.EXTRA_TEXT, edtTxtMensaje.getText().toString());
        startActivity(Intent.createChooser(inCorreo, "To complete action choose:"));
    }

}

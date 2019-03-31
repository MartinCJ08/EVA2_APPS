package com.example.eva2_p2_asignaturas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AsignaturaActivity extends AppCompatActivity {

    Intent inDatos;
    Bundle bDatos;

    TextView txtVwAsig2,txtVwCred,txtVwNomDoc;
    ImageView imgVwDoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asignatura);

        inDatos = getIntent();
        bDatos = inDatos.getExtras();

        txtVwAsig2 = findViewById(R.id.txtVwAsig2);
        txtVwCred = findViewById(R.id.txtVwCred);
        txtVwNomDoc = findViewById(R.id.txtVwNomDoc);
        imgVwDoc = findViewById(R.id.imgVwDoc);

        txtVwAsig2.setText(bDatos.getString("nom"));
        txtVwCred.setText(bDatos.getString("cred"));
        txtVwNomDoc.setText(bDatos.getString("nomDoc"));
        imgVwDoc.setImageResource(bDatos.getInt("imgDoc"));


    }
}

package com.example.eva2_p1_restaurantes;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RestauranteActivity extends AppCompatActivity {
    Intent inDatos;
    Bundle bDatos;
    TextView txtVwNom2,txtVwDesc2,txtVwCalle,txtVwColonia,txtVwTel;
    LinearLayout lytSecond;
    Intent i;
    final int MY_PERMISSIONS_REQUEST_CALL_PHONE = 42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        txtVwNom2 = findViewById(R.id.txtVwNom2);
        txtVwDesc2 = findViewById(R.id.txtVwDesc2);
        txtVwCalle = findViewById(R.id.txtVwCalle);
        txtVwColonia = findViewById(R.id.txtVwColonia);
        txtVwTel = findViewById(R.id.txtVwTel);
        lytSecond = findViewById(R.id.lytSecond);

        inDatos = getIntent();
        bDatos  = inDatos.getExtras();

        lytSecond.setBackgroundResource(bDatos.getInt("img"));
        txtVwNom2.setText(bDatos.getString("nom"));
        txtVwDesc2.setText(bDatos.getString("desc"));
        txtVwCalle.setText(bDatos.getString("calle"));
        txtVwColonia.setText(bDatos.getString("colonia"));
        txtVwTel.setText(bDatos.getString("tel"));
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_CALL_PHONE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                    Toast.makeText(getApplicationContext(),"Se autorizó permiso",Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(),"Se denegó permiso",Toast.LENGTH_SHORT).show();

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }

            // other 'case' lines to check for other
            // permissions this app might request
        }

    }

    public void onClick(View v){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            newerVersion(bDatos.getString("tel"));
        }else{
            olderVersion(bDatos.getString("tel"));
        }
    }

    public void olderVersion(String sTel){
        i = new Intent(Intent.ACTION_CALL);
        i.setData(Uri.parse(sTel));
        startActivity(i);
    }

    public void newerVersion(String sTel){
        // Here, thisActivity is the current activity
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {

            Toast.makeText(getApplicationContext(),"Se hace la solicitud",Toast.LENGTH_SHORT).show();
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CALL_PHONE},
                    MY_PERMISSIONS_REQUEST_CALL_PHONE);


        }else{
            i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse(sTel));
            startActivity(i);
        }
    }
}

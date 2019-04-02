package com.example.eva2_12_permisos;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtPhone;
    Button btnLlmaar;
    Intent inLlamar;
    private final int MY_CODE = 42;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case MY_CODE:
                if(grantResults.length>0 && (grantResults[0] == PackageManager.PERMISSION_GRANTED)){
                    Toast.makeText(this,"Se tiene permisos",Toast.LENGTH_SHORT).show();
                    btnLlmaar.setEnabled(true);
                }else{
                    Toast.makeText(this,"Nel krnl",Toast.LENGTH_SHORT).show();
                    btnLlmaar.setEnabled(false);
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTxtPhone = findViewById(R.id.edtTxtPhone);
        btnLlmaar = findViewById(R.id.btnLlamar);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.CALL_PHONE},MY_CODE);
            btnLlmaar.setEnabled(false);
        }else{
            btnLlmaar.setEnabled(true);
        }


    }

    public void onClick(View v){
        String sTel = "tel: "+edtTxtPhone.getText();
        inLlamar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));


        startActivity(inLlamar);
    }
}

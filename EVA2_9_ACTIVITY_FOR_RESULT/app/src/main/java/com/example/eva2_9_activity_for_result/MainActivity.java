package com.example.eva2_9_activity_for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtVwResu;
    private Intent inSecond,inOtra;
    private final int SECOND = 420,OTRA = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVwResu = findViewById(R.id.txtVwInfo);
        inSecond = new Intent(this,SecondActivity.class);
        inOtra = new Intent(this,OtraActivity.class);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String sCad;
        if(requestCode == SECOND){
            if(resultCode == Activity.RESULT_OK){
                sCad = data.getStringExtra("DATOS");
                txtVwResu.append("SEC:"+sCad);
            }else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"SECUNDARIA: Accion cancelada",Toast.LENGTH_SHORT).show();
            }
        }else if(requestCode == OTRA){
            if(resultCode == Activity.RESULT_OK){
                sCad = data.getStringExtra("DATOS");
                txtVwResu.append("OTRA:"+sCad);
            }else if(resultCode == Activity.RESULT_CANCELED){
                Toast.makeText(getApplicationContext(),"OTRA: Accion cancelada",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onClickSec(View v){startActivityForResult(inSecond,SECOND);}
    public void onClickOtra(View v){startActivityForResult(inOtra,OTRA);}
}

package com.example.eva2_p3_password;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Intent inRolled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inRolled = new Intent(getApplicationContext(),RolledActivity.class);
    }

    public void onClickEntrar(View v){
        final Dialog dlgMyDialog;
        dlgMyDialog = new Dialog(this);
        dlgMyDialog.setContentView(R.layout.layout_dialogo);
        ImageView imgVwRand;
        final EditText edtTxtUsu, edtTxtPass;
        Button btnOK, btnOut;

        imgVwRand = dlgMyDialog.findViewById(R.id.imgVwRand);
        edtTxtUsu = dlgMyDialog.findViewById(R.id.edtTxtUsu);
        edtTxtPass = dlgMyDialog.findViewById(R.id.edtTxtPass);

        btnOK = dlgMyDialog.findViewById(R.id.btnOK);
        btnOut = dlgMyDialog.findViewById(R.id.btnOut);

        imgVwRand.setImageResource(getResourceImg());


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sUsu = edtTxtUsu.getText().toString();
                String sPass = edtTxtPass.getText().toString();
                if(comprobar(sUsu,sPass)){
                    dlgMyDialog.dismiss();
                    startActivity(inRolled);
                }else{
                    Toast.makeText(getApplicationContext(),"Error de validación",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgMyDialog.dismiss();
            }
        });

        dlgMyDialog.show();


    }

    private boolean comprobar(String sUsu, String sPass) {
        boolean ban = false;
        if(sUsu.equals("root") && sPass.equals("root")){
            ban = true;
        }

        return ban;
    }

    public void onClickSalir(View v){
        finish();
    }

    public int getResourceImg(){
        int iVal = (int) (5 * Math.random()) + 1;
        int iRes=0;

        switch (iVal){
            case 1:
                iRes = R.drawable.bobypat;
                break;
            case 2:
                iRes = R.drawable.cake;
                break;
            case 3:
                iRes = R.drawable.ghost;
                break;
            case 4:
                iRes = R.drawable.lisa;
                break;
            case 5:
                iRes = R.drawable.thor;
                break;
        }
        return iRes;
    }
}

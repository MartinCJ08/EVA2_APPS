package com.example.eva2_3_intentos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSec;
    private Intent inSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSec = findViewById(R.id.btnSec);
        inSecond = new Intent(this,SecondActivity.class);
    }

    public void onClickOtraActivity(View v){startActivity(inSecond);}
}

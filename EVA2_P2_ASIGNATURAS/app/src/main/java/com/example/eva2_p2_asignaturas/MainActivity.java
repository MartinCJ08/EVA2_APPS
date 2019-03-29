package com.example.eva2_p2_asignaturas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    Intent inAsig;
    ListView myList;

    static Asignatura[] aaAsig = {
            new Asignatura(R.drawable.programacion,"Fundamentos de programación","5","John Travolta",5),
            new Asignatura(R.drawable.programacion,"Programación orientada a objetos","5","John Travolta",5),
            new Asignatura(R.drawable.programacion,"Estructura de datos","5","John Travolta",5)
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList);
        myList.setAdapter(
                new AsignaturaAdapter(this,R.layout.layout_asignatura,aaAsig)
        );

        myList.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        inAsig = new Intent(this,AsignaturaActivity.class);
        Bundle bDatos = new Bundle();
        bDatos.putString("nom",aaAsig[position].getNom());
        inAsig.putExtras(bDatos);
        startActivity(inAsig);
    }
}

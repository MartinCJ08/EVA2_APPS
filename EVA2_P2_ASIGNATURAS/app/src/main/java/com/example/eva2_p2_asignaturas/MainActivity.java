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
            new Asignatura(R.drawable.programacion,"Fundamentos de programación","5","Homero Simpson",R.drawable.homer),
            new Asignatura(R.drawable.programacion,"Programación orientada a objetos","5","John Travolta",R.drawable.travolta),
            new Asignatura(R.drawable.programacion,"Estructura de datos","5","Rick Sánchez",R.drawable.rick),
            new Asignatura(R.drawable.programacion,"Tópicos avanzados de programación","5","Rick Sánchez",R.drawable.rick),
            new Asignatura(R.drawable.database,"Fundamentos de bases de datos","5","Daria",R.drawable.daria),
            new Asignatura(R.drawable.database,"Taller de bases de datos","4","Homero Simpson",R.drawable.homer),
            new Asignatura(R.drawable.database,"Adminitración de bases de datos","5","John Travolta",R.drawable.travolta),
            new Asignatura(R.drawable.network,"Fundamentos de telecomunicaciones","4","Daria",R.drawable.daria),
            new Asignatura(R.drawable.network,"Redes de computadoras","5","Cerebro",R.drawable.cerebro),
            new Asignatura(R.drawable.network,"Conmutación y enrutamiento de redes de datos","5","Homero Simpson",R.drawable.homer),
            new Asignatura(R.drawable.network,"Administración de redes","5","Homero Simpson",R.drawable.homer)


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
        bDatos.putString("cred",aaAsig[position].getCreditos());
        bDatos.putString("nomDoc",aaAsig[position].getDocente());
        bDatos.putInt("imgDoc",aaAsig[position].getImgDoc());
        inAsig.putExtras(bDatos);

        startActivity(inAsig);
    }
}

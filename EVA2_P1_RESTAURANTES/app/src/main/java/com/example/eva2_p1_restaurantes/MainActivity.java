package com.example.eva2_p1_restaurantes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    Intent inSec;
    ListView lstVwRest;
    static Restaurante[] arRest ={
        new Restaurante(R.drawable.barrafina,"Barra Fina","Restaurante Gourment","Périferico de la juventud","Distrito 1","tel: 442 5000"),
            new Restaurante(R.drawable.cafedeadend,"Café Delicias","El mejor café del mundo","Périferico de la juventud","Distrito 1","tel: 442 5000"),
            new Restaurante(R.drawable.bourkestreetbakery,"Bourk Street","Restaurante Gourment","Périferico de la juventud","Distrito 1","tel: 442 5000"),
            new Restaurante(R.drawable.cafeloisl,"Café Louis","Cafetería para gente intergaltactica","Av Zaragoza","Las granjas","tel: 442 5000"),
            new Restaurante(R.drawable.cafelore,"Café Lore","Café argentino de alta calidad","9 de Julio 1583","Concepción del Uruguay","tel: 442 5000"),
            new Restaurante(R.drawable.confessional,"Confesional","Pizzas de leña","Av Cantera","Linda vista","tel: 442 5000"),
            new Restaurante(R.drawable.donostia,"Don Ostia","Las mejores brochetas ","Av tecnológico","El Tec","tel: 442 5000"),
            new Restaurante(R.drawable.fiveleaves,"Cinco Hojas","Comida vegetariana","Av Universidad","UACH","tel: 442 5000"),
            new Restaurante(R.drawable.forkeerestaurant,"Forkeer Restaurant","Paninis a cualquier hora","Av de Las industrias","Tierra y Libertad","tel: 442 5000"),
            new Restaurante(R.drawable.grahamavenuemeats,"Graham Avenue Meats","Carne de engorda","Av de las carnes","Nuevas Carnes","tel: 442 5000"),
            new Restaurante(R.drawable.haighschocolate,"Haighs Chocolate","Meriendas a toda hora","Calle Paseos de Delicias","Paseos de Chihuahua","tel: 442 5000"),
            new Restaurante(R.drawable.homei,"Homei","Café colombiano","Av 6ta ","Los muiscas","tel: 442 5000"),
            new Restaurante(R.drawable.palominoespresso,"Palomino Espresso","Un café gratis los martes","Périferico de la juventud","Distrito 2","tel: 442 5000"),
            new Restaurante(R.drawable.petiteoyster,"Petiteoyster","Restaurante Gourment","Av Homero","Distrito 10","tel: 442 5000"),
            new Restaurante(R.drawable.posatelier,"Pos Atelier","Mariscos al por mayor","Av Guillermo Prieto Lujan","Distrito 20","tel: 442 5000"),
            new Restaurante(R.drawable.royaloak,"Royaloak","Comida chatarra","Av Pacheco","Distrito 12","tel: 442 5000"),
            new Restaurante(R.drawable.teakha,"Teakha","Desayunos Baratos","Calle 20 de noviembre","Distrito 1","tel: 442 5000"),
            new Restaurante(R.drawable.thaicafe,"Thai Café","Comida Oriental","Av Niños Heroes","Fracc Sn Francisco","tel: 442 5000"),
            new Restaurante(R.drawable.traif,"TRAIF","Pastas al mejor precio","Av Nogales","Las Huertas","tel: 442 5000"),
            new Restaurante(R.drawable.upstate,"UPSTATE","Wing's 'n' Beer","Av Río Chiviscar","Centro","tel: 442 5000"),
            new Restaurante(R.drawable.wafflewolf,"Waffle Wolf","Waffles feroces","Av de los Manzanos","Las Huertas","tel: 442 5000")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstVwRest = findViewById(R.id.lstVwRest);
        lstVwRest.setAdapter(
                new RestauranteAdapter(this,R.layout.layout_restaurante,arRest)
        );

        lstVwRest.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        inSec = new Intent(this, RestauranteActivity.class);
        Bundle bDatos = new Bundle();
        bDatos.putInt("img", arRest[position].getImg_rest());
        bDatos.putString("nom", arRest[position].getNom());
        bDatos.putString("desc", arRest[position].getDesc());
        bDatos.putString("calle", arRest[position].getCalle());
        bDatos.putString("colonia", arRest[position].getColonia());
        bDatos.putString("tel", arRest[position].getTel());
        inSec.putExtras(bDatos);
        startActivity(inSec);
    }
}

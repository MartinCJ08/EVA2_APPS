package com.example.eva2_p1_restaurantes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RestauranteAdapter extends ArrayAdapter<Restaurante> {
    private Context cApp;
    private int iMyLayout;

    private  Restaurante[] arDatos;

    public RestauranteAdapter(@NonNull Context context, int resource, @NonNull Restaurante[] objects) {
        super(context, resource, objects);
        cApp = context;
        iMyLayout = resource;
        arDatos = objects;
    }


    //    @androidx.annotation.NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LinearLayout lytPrin;
        TextView txtVwNom,txtVwDesc;

        View vwMyLayout = convertView;

        if(vwMyLayout == null){
            LayoutInflater liCrearLayout = ((Activity)cApp).getLayoutInflater();
            vwMyLayout = liCrearLayout.inflate(iMyLayout,parent,false);
        }

        lytPrin = vwMyLayout.findViewById(R.id.lytRest);
        txtVwNom = vwMyLayout.findViewById(R.id.txtVwNom);
        txtVwDesc = vwMyLayout.findViewById(R.id.txtVwDesc);

        Restaurante rRest = arDatos[position];
        lytPrin.setBackgroundResource(rRest.getImg_rest());
        txtVwNom.setText(rRest.getNom());
        txtVwDesc.setText(rRest.getDesc());
        return vwMyLayout;
    }


}

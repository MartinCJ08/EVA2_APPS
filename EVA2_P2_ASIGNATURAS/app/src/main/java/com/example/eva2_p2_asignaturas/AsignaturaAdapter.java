package com.example.eva2_p2_asignaturas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AsignaturaAdapter extends ArrayAdapter<Asignatura> {
    private Context cApp;
    private int iMyLayout;

    private Asignatura[] aaDatos;
    public AsignaturaAdapter(@NonNull Context context, int resource, @NonNull Asignatura[] objects) {
        super(context, resource, objects);
        cApp = context;
        iMyLayout = resource;
        aaDatos = objects;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVwAsig;
        TextView txtVwAsig;

        View vwMyLayout = convertView;

        if(vwMyLayout == null){
            LayoutInflater liCrearLayout = ((Activity)cApp).getLayoutInflater();
            vwMyLayout = liCrearLayout.inflate(iMyLayout,parent,false);
        }

        imgVwAsig = vwMyLayout.findViewById(R.id.imgVwAsig);
        txtVwAsig = vwMyLayout.findViewById(R.id.txtVwAsig);

        Asignatura aAsig = aaDatos[position];
        imgVwAsig.setImageResource(aAsig.getImgAsig());
        txtVwAsig.setText(aAsig.getNom());

        return vwMyLayout;
    }
}

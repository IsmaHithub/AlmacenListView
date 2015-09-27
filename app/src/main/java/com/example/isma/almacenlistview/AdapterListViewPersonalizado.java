package com.example.isma.almacenlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Isma on 27/09/2015.
 */
public class AdapterListViewPersonalizado extends BaseAdapter {

    protected Activity activity;
    protected ArrayList<Directivo> items;

    public AdapterListViewPersonalizado(Activity activity, ArrayList<Directivo> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int arg0) {
        return items.get(arg0);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Generamos una convertView por motivos de eficiencia
        View v = convertView;

        //Asociamos el layout de la lista que hemos creado
        if(convertView == null)
        {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.itemlista, null);
        }
        // Creamos un objeto directivo
        Directivo dir = items.get(position);
        //Rellenamos la fotografía
        ImageView foto = (ImageView) v.findViewById(R.id.lvpersonalizadoivfoto);
        foto.setImageDrawable(dir.getFoto());
        //Rellenamos el nombre
        TextView nombre = (TextView) v.findViewById(R.id.lvpersonalizadotvnombre);
        nombre.setText(dir.getNombre());
        //Rellenamos el cargo
        TextView cargo = (TextView) v.findViewById(R.id.lvpersonalizadotvcargo);
        cargo.setText(dir.getCargo());

        RatingBar ratingbar=(RatingBar)v.findViewById(R.id.lvpersonalizadoratingBar);
        ratingbar.setRating(dir.getRatingbar());

        // Retornamos la vista
        return v;
    }
}
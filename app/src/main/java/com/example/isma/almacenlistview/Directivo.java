package com.example.isma.almacenlistview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.RatingBar;

/**
 * Created by Isma on 27/09/2015.
 */
public class Directivo {
protected Drawable foto;
protected String nombre;
protected String cargo;
protected RatingBar ratingbar;
protected long id;

        public Directivo(Context context, Drawable foto, String nombre, String cargo, int ratingBar) {
            super();
            this.foto = foto;
            this.nombre = nombre;
            this.cargo = cargo;
            this.ratingbar=new RatingBar(context, null, android.R.attr.ratingBarStyleSmall);
            this.ratingbar.setRating(ratingBar);
        }

        public Directivo(Context context, Drawable foto, String nombre, String cargo, long id, int ratingBar) {
            super();
            this.foto = foto;
            this.nombre = nombre;
            this.cargo = cargo;
            this.ratingbar=new RatingBar(context, null, android.R.attr.ratingBarStyleSmall);
            this.ratingbar.setRating(ratingBar);
            this.id = id;
        }

        public Drawable getFoto() {
            return foto;
        }

        public void setFoto(Drawable foto) {
            this.foto = foto;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
        public void setRatingbar(int rating)
        {
            this.ratingbar.setRating(rating);
        }
        public float getRatingbar()
        {

            return this.ratingbar.getRating();
        }
}

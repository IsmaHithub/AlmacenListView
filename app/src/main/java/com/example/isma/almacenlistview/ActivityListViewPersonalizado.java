package com.example.isma.almacenlistview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityListViewPersonalizado extends AppCompatActivity {
    private Context context;
    private Button bcerrar;
    private ListView lista;
    private ArrayList<Directivo> arraydir;
    private Directivo directivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_list_view_personalizado);
        setVariables();
        setVistas();
        setAdaptadores();
        setListernes();
    }
    private void setVariables()
    {
        this.context=getApplicationContext();
        lista = (ListView) findViewById(R.id.activitylistviewpersonalizadomylistview); //no ha funcionado...mejor poner android:isIndicator="true" en el xml para anular el toque del ratingbar...y que funcione onitemclicklistener
        lista.setDescendantFocusability(ListView.FOCUS_BLOCK_DESCENDANTS);
        arraydir = new ArrayList<Directivo>();


        // Introduzco en el array directivos varios objetos directivo....para mostrar en el listview...
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.isma), "Isma", "Barrendero",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.batiste), "Batiste", "El puto amo",5);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.android), "Hillary Clinton", "Tesorera",3);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s1), "Bono el de U2", "Amenizador",2);
        arraydir.add(directivo);
        directivo = new Directivo(context,getResources().getDrawable(R.drawable.s3), "Carmen de Mairena", "Directora RRHH",4);
        arraydir.add(directivo);






    }

    private void setVistas()
    {
        this.bcerrar=(Button)findViewById(R.id.alvpersonalizadobcerrar);
    }
    private void setAdaptadores()
    {
        AdapterListViewPersonalizado adapter = new AdapterListViewPersonalizado(this, arraydir);
        lista.setAdapter(adapter);

    }
    private void setListernes()
    {
        this.bcerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String cadena = arraydir.get(position).getNombre();
                Toast.makeText(getApplicationContext(), "Ha pulsado el item " + cadena, Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_list_view_personalizado, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

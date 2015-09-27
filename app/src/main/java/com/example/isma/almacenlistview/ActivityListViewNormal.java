package com.example.isma.almacenlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ActivityListViewNormal extends AppCompatActivity {

    private ListView listviewnormal;
    private ArrayAdapter<String> adaptador1;
    private String[] arraysistemas = {"Ubuntu", "Android", "iOS", "Windows", "Mac OSX", "Google Chrome OS", "Debian", "Mandriva", "Solaris", "Unix","Ubuntu", "Android", "iOS", "Windows", "Mac OSX", "Google Chrome OS", "Debian", "Mandriva", "Solaris", "Unix","Ubuntu", "Android", "iOS", "Windows", "Mac OSX", "Google Chrome OS", "Debian", "Mandriva", "Solaris", "Unix","Ubuntu", "Android", "iOS", "Windows", "Mac OSX", "Google Chrome OS", "Debian", "Mandriva", "Solaris", "Unix"};
    private Button blvcustom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_normal);
        setVariables();
        setVistas();
        setAdaptadores();
        setListernes();
    }
    private void setVariables()
    {

    }
    private void setVistas()
    {
        listviewnormal=(ListView)findViewById(R.id.listview1);
        this.blvcustom=(Button)findViewById(R.id.mainblvcustom);

    }
    private void setAdaptadores()
    {
        adaptador1 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arraysistemas);
        listviewnormal.setAdapter(adaptador1);

    }
    private void setListernes()
    {
        listviewnormal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String cadena = arraysistemas[position];
                Toast.makeText(getApplicationContext(), "Ha pulsado el item " + cadena, Toast.LENGTH_SHORT).show();
            }
        });
        this.blvcustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityListViewNormal.this,ActivityListViewPersonalizado.class));
            }
        });
    }

}

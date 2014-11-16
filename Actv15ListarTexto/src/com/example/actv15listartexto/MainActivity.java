package com.example.actv15listartexto;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main); Esta linea se debe quitar, no es necesaria en ListActivity
		/**Un ListView es un grupo de Views, puede tener scrolls y se podrá buscar.
		 * Utilizamos el setListAdapter para colocar los datos que queremos dentro
		 * del listView, se utiliza un new arrayAdapter para introducir objetos dentro de 
		 * listView, será de strings que es el tipo que hemos definido, coloco this, para colocarlo en este contexto en el
		 * MainActivity, después el Id del activity y por ultimo el conjunto de arrays que queremos colocar, 
		 * lo cojemos de resources, convertimos de r.array color en un string array y se lo devuelve
		 * al arrayAdapter.
		 * */
		setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main,
				getResources().getStringArray(R.array.colors)));
	}
}

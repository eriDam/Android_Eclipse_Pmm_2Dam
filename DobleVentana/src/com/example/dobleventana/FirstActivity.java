package com.example.dobleventana;

 

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//Cojemos del recurso boton1 y lo almacenamos en la variable de tipo button
		final Button comprobar = (Button) findViewById(R.id.button1);
		
		//Añado un nuevo listener
		comprobar.setOnClickListener(new Button.OnClickListener(){
		

			@Override
			public void onClick(View v) {
				//Para intentar lanzar un nuevo activity, se utiliza la clase Intent
				//Intent espera como primer parámetro un contexto de quien esta llamando a la segunda parte,
				//
				Intent abre2 = new Intent(
						FirstActivity.this, //Utilizamos this como en java para pasarle como primer parametro quien esta llamando(First activity que hereda de activity)			
						SecondActivity.class//Y en  la segunda le pasamos a quien está llamando
						);
				startActivity(abre2);
			}
		}
	);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

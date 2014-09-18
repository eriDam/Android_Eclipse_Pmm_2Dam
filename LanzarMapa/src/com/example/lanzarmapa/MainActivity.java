package com.example.lanzarmapa;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.net.Uri;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Creo un nuevo boton
		final Button boton = (Button) findViewById(R.id.button1);
		
		//Añado un nuevo listener
		boton.setOnClickListener(new Button.OnClickListener(){
		

			@Override
			public void onClick(View v) {
				//Para lanzar un nuevo activity, se utiliza la clase Intent
				Intent mapa = new Intent(
						android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:0,0?q=Blasco+Ibañez+Valencia+España")
						);
				startActivity(mapa);
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

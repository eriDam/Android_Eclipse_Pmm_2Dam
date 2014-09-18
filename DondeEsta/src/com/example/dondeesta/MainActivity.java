package com.example.dondeesta;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//creo un nuevo botón y el campo de texto de donde se cogerá la dirección a buscar
		final Button botonB = (Button) findViewById(R.id.button1);
		final EditText textField = (EditText)findViewById(R.id.editText1);
		
		//Añado un nuevo listener
		botonB.setOnClickListener(new Button.OnClickListener(){
		

			@Override
			public void onClick(View v) {
				
				//Para lanzar un nuevo activity, se utiliza la clase Intent
				Intent mapa = new Intent(
						android.content.Intent.ACTION_VIEW,
						Uri.parse("geo:0,0?q= ("+textField.getText()+")")//la direccion la cogerá mediante getText() del campo de texto
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

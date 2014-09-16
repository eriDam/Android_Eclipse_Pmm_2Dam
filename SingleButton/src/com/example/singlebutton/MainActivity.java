package com.example.singlebutton;

import com.example.unicbutton.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*Realizaremos un cambio del texto cuando hagamos click
		*(We will change the text when we click)
		*Utilizamos el metodo findViewById y le pasamos el id del boton, esto nos devolverá un View
		*realizamos casting para convertirlo a un Button y se lo asignamos a una variable q
		* utilizaremos después, utilizaremos final por que solo se va a usar una vez y dentro de la clase
		*/
		final Button boton = (Button)findViewById(R.id.button1);
	
		//Colocamos un listener para cuando el boton sea pulsado.
		boton.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				// cuando se realice un click sobre el botón haremos que cambie el texto
				boton.setText("Pulsado");
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

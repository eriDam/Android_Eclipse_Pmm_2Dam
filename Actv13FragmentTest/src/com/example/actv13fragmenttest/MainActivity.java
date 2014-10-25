package com.example.actv13fragmenttest;

/** 
 * @author Eri
 * @titulo: Actividad 13 fragments
 * Para generar el javadoc hay que localizar la aplicacion C:\Program Files\Java\jdk1.8.0_11\bin\javadoc.exe
 *  */
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);/** Colocamos el Layout en el contenedor */
		
		/** Cargamos de forma dinámica un fragment en nuestra interfaz :
		 *  Capturamos analizador de fragments, utilizando la clase fragmentManager
		 *  */
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction(); /** Con beginTransaction comenzamos a utilizarlo*/
		
		 
		fragmentTransaction.add(R.id.sup, new Sup()); /** Añadimos de forma dinámica 1 nuevo fragment de la clase Sup */
		fragmentTransaction.add(R.id.inf, new Inf()); /** Añadimos de forma dinámica 1 nuevo fragment de la clase Inf */
		fragmentTransaction.commit(); /** Una vez añadido aplicamos los cambios */
				
	
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

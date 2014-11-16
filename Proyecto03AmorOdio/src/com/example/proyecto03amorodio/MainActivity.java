package com.example.proyecto03amorodio;
 
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
	static final Inf inf = new Inf();
	static final Sup sup = new Sup();
	
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
		
		/** 
		 * Al cargar el fragment superior y después el inferior, salta un nullPointerExcception por 
		 * que intentamos acceder a la parte inferior que aún no se ha cargado, por tanto cargaremos 1 la clase inf 
		 *  */
		fragmentTransaction.add(R.id.inf, inf); /** Añadimos de forma dinámica 1 nuevo fragment de la clase Inf */
		fragmentTransaction.add(R.id.sup, sup); /** Añadimos de forma dinámica 1 nuevo fragment de la clase Sup */
		
		fragmentTransaction.commit(); /** Una vez añadido aplicamos los cambios */
		
		
	}
	
	protected void itemSeleccionado(String item) {
		inf.setItemSeleccionado(item);
	}
//	
//	@Override
//	public boolean onCreateOptionsMenu (Menu menu){
//		getMenuInflater().inflate(R.menu.main,menu);
//		return true;
//	}
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item){
//		int id = item.getItemId();
//		if (id == R.id.action_settings){
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
}


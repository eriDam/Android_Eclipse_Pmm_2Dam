 package com.example.proyecto03amorodio;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**Heredará de ListFragment en lugar de fragment, ListFragment es 1 fragmento que muestra una lista 
 * de elementos de unión a una fuente de datos como una matriz o cursor, y expone a los
 * controladores de eventos cuando el usuario selecciona un elemento.*/

public class Sup extends ListFragment {

	private static final String TAG = "Fragment Sup";
	
	@Override
	public void onAttach(Activity activity) {
		Log.i(TAG, getClass().getSimpleName() + ":entered onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, getClass().getSimpleName() + ":entered onCreate()");
		super.onCreate(savedInstanceState);
	}

	/** En un fragmento, usamos onCreateView a diferencia del mainActivity en el que se usa onCreate,  */
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		/** Utilizamos el inflater pasandole un fragment como parámetro  */
		return inflater.inflate(R.layout.fragment_sup, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		/**Creo el array aquí en lugar de en strings
		 * */
	String[] so = {"Android", "Iphone", "WindowsMobile", 
			"Blackberry","WebOs", "Windows7","Max OS X",
			"Linux", "Os/2","Android", "Iphone", "WindowsMobile", 
			"Blackberry","WebOs", "Windows7","Max OS X",
			"Linux", "Os/2" };
	/**  
	 * Sustituyo el ArrayAdapter ArrayAdapter<String> adapter = new ArrayAdapter<String>
	 * (this,R.layout.activity_main,R.id.textViewSo,so); que es el que estaba poniendo la 
	 * información por un adaptador propio, po ruqe las imagenes van a ser diferentes,
	 * dependiendo del texto, 
	 *  
     *  Usaré estos parametros para el constructor igual que en el anterior ArrayAdapter
     *  = new MiAdaptador(context, resource, textViewResourceId, objects)
     *  */
	
	MiAdaptador adapter = new MiAdaptador(getActivity(), R.layout.fragment_sup, R.id.textViewSo, so);
	
	/**
	 * Utilizamos el metodo para ponerle el adapter, el list View coge estos datos y los 
	 * representa por pantalla
	 * */
	 setListAdapter(adapter);
	}
	
	/**
	 * Método para cuando se haga click sobre el item
	 * */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		((MainActivity) getActivity()).itemSeleccionado(item);
	}
	
	@Override
	public void onStart() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStart()");
		super.onStart();
	}
	
	@Override
	public void onResume() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onResume()");
		super.onResume();
	}

	
	@Override
	public void onPause() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onPause()");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onStop()");
		super.onStop();
	}
	
	@Override
	public void onDetach() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDetach()");
		super.onDetach();
	}

	
	@Override
	public void onDestroy() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDestroyView() {
		Log.i(TAG, getClass().getSimpleName() + ":entered onDestroyView()");
		super.onDestroyView();
	}

}
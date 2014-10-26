package com.example.actv14fragmenttest;
/** 
 * He definido en el layout-activityMain dos frameLayout (frgaments que voy a a�adir 
 * dinamicamente desde esta clase Sup y desde Inf).
 * Inflate() es 1 M�todo que se utiliza para construir y a�adir las Views a los dise�os de:
 * 	Fragment
	Menu o ActionBar
	Adapter
	Dialogs
	Para a�adir una View a otra en cuando precisemos
 * */
import com.example.actv13fragmenttest.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Sup extends Fragment {

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
		/** Utilizamos el inflater pasandole un fragment como par�metro  */
		return inflater.inflate(R.layout.fragment_sup, container, false);
	}
	
	/** Para interactuar con el texto y el bot�n, se puede colocar tanto en onCreateView como
		 *  en onActivityCreated*/
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		/**
		 * Recuperamos el boton y el textView de nuestros resources con .findViewById(R.id.btnSup,
		 * como el fragment no controla donde esta cada uno de los elemntos, tenemos qe acceder 
		 * al activity que est� cargando el fragment con getActivity().
		 * 
		 *  */
		final Button btn = (Button) getActivity().findViewById(R.id.btnSup);
		final TextView txt = (TextView) getActivity().findViewById(R.id.textView1);
		
		btn.setOnClickListener(new Button.OnClickListener(){
			public void onClick(View v){
				txt.setText("Apretado");
			}
		});
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
package com.example.dobleventana;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private static final String TAG = "Segunda Ventana";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		//Para coger la informacion de la primera ventana primero capturamos el intent
		Intent primera= getIntent();
		
		//Rescuperando y colocando la información de cada uno de los datos
		final TextView editText1User=(TextView)findViewById(R.id.textView2);
		final TextView editText2Passw=(TextView)findViewById(R.id.textView4);//En realidad es el textView4 pero eclipse me lo saca de título así que están cammbiados
		
		//Colocamos la información, cogemos la informacion del putExtra
		editText1User.setText(primera.getStringExtra("usuario"));
		editText2Passw.setText(primera.getStringExtra("pass"));
		
		//Preparamos el botón de vuelta
		final Button boton=(Button) findViewById(R.id.buttonC);
		
		boton.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
				 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterio metodo que se le indicaba
				 * quien lo lanzaba y hacia donde*/
				Intent devolucion = new Intent();
				//En el intent intentamos enviar la información de la primera ventana
				devolucion.putExtra("txt", "Comprobado Ok");
				setResult(RESULT_OK,devolucion);//con setResult ponemos el resultado 
				finish();//Finaliza este activity y con finish automaticamente lanza onDestroy
			
			}
		}
	  );
		//El Log es la herra<mienta para poder controlar o hacer debug de nuestra app
		//Incorporamos el Log al final de cada método de la actividad de android
		Log.i(TAG, "onCreate");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
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


		//Generamos e incorporamos los metodos de Log, automaticamente desde botón dcho source-Override/Implement methodes
		//Override, en realidad ni sobrecarga ni sustituye, le dice al compilador que haga caso a este método y no al del padre
		@Override
		protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i(TAG, "onStart");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}
		
		@Override
		protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		Log.i(TAG, "onResume");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}
		
		@Override
		protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i(TAG, "onPause");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}
		
		@Override
		protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i(TAG, "onStop");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}
		
		@Override
		protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i(TAG, "onRestart");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}
		@Override
		protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i(TAG, "onDestroy");
		Log.d(TAG, "Debug");
		Log.e(TAG, "Error");
		Log.v(TAG, "Mensaje de Registro - Verbose Log");
		Log.w(TAG, "Mensaje de Advertencia - Warn");
		}

}

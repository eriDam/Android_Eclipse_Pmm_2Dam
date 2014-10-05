package com.example.dondeestacontactos;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Contactos extends Activity {
	
	//Declaramos la etiqueta y el texto a mostrar como en la primera ventana, para utilizar el Log
	private static final String TAG = "Segunda Ventana";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactos);
	
		//Preparamos el botón de vuelta
		final Button b1=(Button) findViewById(R.id.bLaGuardia);	
		final Button b2=(Button) findViewById(R.id.bBilbaoMus);
		final Button b3=(Button) findViewById(R.id.bZarautz);
		final Button b4=(Button) findViewById(R.id.bGet);
		final Button b5=(Button) findViewById(R.id.bSanS);
		
		//Evento b1
		b1.setOnClickListener(new Button.OnClickListener(){

			@Override
			public void onClick(View v) {
				/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
				 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterior metodo que se le indicaba
				 * quien lo lanzaba y hacia donde*/
				Intent enviaLugar = new Intent();
				//En el intent intentamos enviar la información de la primera ventana
				enviaLugar.putExtra("Lugar","La Guardia");
				setResult(RESULT_OK,enviaLugar);//con setResult ponemos el resultado 
				finish();//Finaliza este activity y con finish automaticamente lanza onDestroy
			
			}
		}
	  );
		
		//Evento b2
				b2.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
						 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterior metodo que se le indicaba
						 * quien lo lanzaba y hacia donde*/
						Intent enviaLugar = new Intent();
						//En el intent intentamos enviar la información de la primera ventana
						//enviaLugar.putExtra("Lugar", b2.getText());  //ASI NO ME COJE EL TEXTO
						enviaLugar.putExtra("Lugar", "Bilbao");
						setResult(RESULT_OK,enviaLugar);//con setResult ponemos el resultado 
						finish();//Finaliza este activity y con finish automaticamente lanza onDestroy
					
					}
				}
			  );
		
				//Evento b3
				b3.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
						 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterior metodo que se le indicaba
						 * quien lo lanzaba y hacia donde*/
						Intent enviaLugar = new Intent();
						//En el intent intentamos enviar la información de la primera ventana
						enviaLugar.putExtra("Lugar", "Zarautz");
						setResult(RESULT_OK,enviaLugar);//con setResult ponemos el resultado 
						finish();//Finaliza este activity y con finish automaticamente lanza onDestroy
					
					}
				}
			  );
				
				//Evento b4
				b4.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
						 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterior metodo que se le indicaba
						 * quien lo lanzaba y hacia donde*/
						Intent enviaLugar = new Intent();
						//En el intent intentamos enviar la información de la primera ventana
						enviaLugar.putExtra("Lugar", "Getárea");
						setResult(RESULT_OK,enviaLugar);//con setResult ponemos el resultado 
						finish();//Finaliza este activity y con finish automaticamente lanza onDestroy
					
					}
				}
			  );
		
				//Evento b5
				b5.setOnClickListener(new Button.OnClickListener(){

					@Override
					public void onClick(View v) {
						/* Cuando le demos click al boton, vamos a crear un intent llam. devolucion, no vamos a lanzarlo hacia
						 * ningun activity, por lo tanto no se le pasa ningun parametro como en el anterior metodo que se le indicaba
						 * quien lo lanzaba y hacia donde*/
						Intent enviaLugar = new Intent();
						//En el intent intentamos enviar la información de la primera ventana
						enviaLugar.putExtra("Lugar", "San Sebastian");
						setResult(RESULT_OK,enviaLugar);//con setResult ponemos el resultado 
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
		getMenuInflater().inflate(R.menu.contactos, menu);
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


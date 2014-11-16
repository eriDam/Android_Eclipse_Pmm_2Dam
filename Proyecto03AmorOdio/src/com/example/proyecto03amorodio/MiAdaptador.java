package com.example.proyecto03amorodio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * MiAdaptador hereda(extends) de ArrayAdapter en formato String se va a parecer, pero cambio 
 * como actua, en el tema de las imagenes
 * */
public class MiAdaptador extends ArrayAdapter<String> {
	private final Context context;
	private final String[] values;
	
	/**
	 * Constructor de nuestro manejador de datos, le paso los parámetros igual que en linea 37 de MAinActivity
	 * el contexto(la clase), el recurso qeu cohemos, el id del textView y el contenido de los datos
	 * que en este caso es un array de String*/
	public MiAdaptador(Context context, int resource, int textViewResourceId,
			String[] objects) {
		/**Se lo paso a la clase superior que es el arrayAdapter*/
		super(context, resource, textViewResourceId, objects);
	    /**Se almacenan los datos tanto el contexto como los valores para utilizar 
	     * posteriormente*/
		this.context = context;
	    this.values = objects;
	}
	
	/**
	 * Este método/función getView
	 * es llamado por el ListView  cada vez que quiere (pintar)un dato en pantalla*/
	public View getView(int position, View convertView, ViewGroup parent) {
		/**
		 * ConvertView es uno de los parámetros que tiene getView y que no siempre es nulo
		 * Si es nulo, inflare el Layout en una clase, con inflater(es una clase de android que convierte
		 * el xml del activity main en una clase), esto se realiza por q necesito conseguir el textViewSo y el icono
		 * Necesito conseguir el view donde estan mis elementos.
		 * 
		 * 
		 * Declaro un rowView (una fila)
		 * */
		View rowView;
		if(convertView==null){
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			rowView = inflater.inflate(R.layout.listview_customizated, parent, false);
		}else{
			/**Para que solo se mantengan en memoria la parte visible, cuando un item se sale de la ventana
			 * pasa al cache de recycler */
			rowView=convertView;
		}
		/**Capturamos de nuestra fila tanto la etiqueta como el icono con rowView.findViewById(R.id.textViewSo)*/
	    TextView textView = (TextView) rowView.findViewById(R.id.textViewSo);
	    ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
	   
	    /**En la etiqueta ponemos de nuestros textos/valores del array(values) el contenido
	     * de la posición que nos esté marcando*/
	    textView.setText(values[position]);
	    
	    /**Cambio el icono, si el texto del array empieza por Windows, Iph o Ma*/
	    String s = values[position];
	    if (s.startsWith("Windows")) {
	      imageView.setImageResource(R.drawable.ic_windows);
	    } else if(s.startsWith("Iph")||s.startsWith("Ma"))  {
	      imageView.setImageResource(R.drawable.ic_apple);
	    }else{
	    	imageView.setImageResource(R.drawable.ic_android);
	    }
	    return rowView;
	  }
}
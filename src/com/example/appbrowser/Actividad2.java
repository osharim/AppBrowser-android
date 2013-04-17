package com.example.appbrowser;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.appbrowser.R;


public class Actividad2 extends Activity {
	 private WebView webView1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.actividad2);
		webView1 = (WebView) findViewById(R.id.webView1);
		/*
		 En esta clase definimos una variable de tipo Bundle y la inicializamos llamando al método
		  getExtras() de la clase Intent  (esto lo hacemos para recuperar el o los parámetros que envió 
		 la otra actividad (Activity)):*/

		Bundle bundle = getIntent().getExtras();
		webView1.loadUrl("http://" + bundle.getString("direccion"));
		
		
	}

	
	public void cerrar(View view){
		
		finish();
		
	}
	
}

package com.example.exemploview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scrool_view);
		
		
		
		LinearLayout liner=  (LinearLayout) findViewById(R.id.linerlayout);
		
		
		for(int i=0;i<50;i++){
			TextView tv= new TextView(this);
			tv.setText("Texto Exemplo"+(i+1));
			liner.addView(tv);
		}
		
	
		
	}
	public void verContato(View view){
		
		FrameLayout f2= (FrameLayout) findViewById(R.id.load2);
		f2.setVisibility(View.VISIBLE);
		
	}
	
	public void enviarFormulario(View view){
		
		FrameLayout fl= (FrameLayout) findViewById(R.id.load);
		fl.setVisibility(View.VISIBLE);
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

package com.example.exemploview;

import java.io.File;

import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.CustomLabelFormatter;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.LineGraphView;

import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videoview);
		
		
		/*Video View*/
	/*  File sdcard= android.os.Environment.getExternalStorageDirectory();
	  String path=sdcard.toString();
	  Log.i("Script", path);
	  File file= new File(sdcard,"risada.3gp");*/
	  
	  VideoView video =  (VideoView)findViewById(R.id.vv);
	/*  
	  LinearLayout ll= (LinearLayout)findViewById(R.id.linearLayout1);
	  ll.addView(video);
	  */
	  /*Para pegar video do celualr*/
	//  String src= file.getAbsolutePath();
	//  video.setVideoPath(src);
	  
	  
	  /*Para pegar web*/
	//  Uri src= Uri.parse("https://www.villopim.com.br/android/video.3gp");
	  
	  Uri src= Uri.parse("android.resource://"+getPackageName()+"/"+"raw/"+R.raw.video);
	  video.setVideoURI(src);
	  
	  video.setMediaController(new MediaController(this));
		
		
		
		
		
//******************************************************************		
	/*GraphView*//*
		int tam=200;
		double v=0;
		
		GraphViewData[] data= new GraphViewData[tam]; 
		
		for(int i=0;i<tam;i++){
			v+=0.3;
			data[i]= new GraphViewData(i,Math.sin(v));
		}
		
		GraphViewSeries  seriesSeno= new GraphViewSeries(data);
		
		LineGraphView graph= new LineGraphView(this,"exemplo GraphView ");
		graph.addSeries(seriesSeno);
		
		graph.getGraphViewStyle().setGridColor(Color.GRAY);
		graph.getGraphViewStyle().setHorizontalLabelsColor(Color.WHITE);
		graph.getGraphViewStyle().setVerticalLabelsColor(Color.WHITE);
		graph.getGraphViewStyle().setTextSize(15);
		
		graph.setVerticalLabels(new String[]{"y1","y2","y3","y4",});
		graph.setHorizontalLabels(new String[]{"x1","x2","x3","x4",});
		
		
	/*	graph.setCustomLabelFormatter(new CustomLabelFormatter(){

			@Override
			public String formatLabel(double value, boolean isValueX) {
				
				if(isValueX){
					if(value>2){
						return("x1");
					}else{
						return ("x2");
					}
				}else
					if(value>2){
						return("y1");
						
					}
					return ("y2");
				
			}
			
		});*/
		/*
		graph.setViewPort(10, 30);
		graph.setScrollable(true);
		graph.setScalable(true);
		graph.setDrawBackground(true);
		graph.setBackgroundColor(Color.BLUE);
		
		LinearLayout ll= (LinearLayout) findViewById(R.id.graph);
		ll.addView(graph);*/
		//******************************************************************
	/* GridView*//*
		int[] lista= new int[]{R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2,
				R.drawable.android2,R.drawable.android2,R.drawable.android2
		};
	
		
		GridView gv= (GridView) findViewById(R.id.gridView1);
		gv.setAdapter(new Adaptador(this,lista));
		
		gv.setOnItemClickListener(new GridView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Toast.makeText(getBaseContext(), "Image:"+(position+1), Toast.LENGTH_SHORT).show();
				
			}
			
			
			
		});
		
		
		
		LinearLayout liner=  (LinearLayout) findViewById(R.id.linerlayout);
		
		
		for(int i=0;i<50;i++){
			TextView tv= new TextView(this);
			tv.setText("Texto Exemplo"+(i+1));
			liner.addView(tv);
		}
		*/
		//******************************************************************
		
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

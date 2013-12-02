package com.example.demoapp;


import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	    final TextView t1 = (TextView) findViewById(R.id.editText1);
	   
	    ImageButton b4 = (ImageButton) findViewById(R.id.b4);
	  		final Typeface tf = Typeface.createFromAsset(this.getAssets(), "hindi-saral1.ttf");
	  		
	  	b4.setOnClickListener(new OnClickListener() 
		{
		      @Override
		      public void onClick(final View arg0) 
		      {
		        t1.append("6");
		        t1.setTypeface(tf);
		      }
		    });
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

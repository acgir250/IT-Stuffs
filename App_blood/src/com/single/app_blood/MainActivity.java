package com.single.app_blood;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

@SuppressLint("ShowToast")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
 public void child1(View view)
 {
	 try
	 {
		 Intent in = new Intent(MainActivity.this,Registration.class);
		 
		 startActivity(in);
		 
	 }
   	 catch(Exception e)
   	 {
   		 Log.d("Child1 Error in calling ", "Error Ocuur during calling of child activity : "+e);
   		 
   		 Toast.makeText(getApplicationContext(), "Sorry upgrade to premium."+e, Toast.LENGTH_SHORT).show();
   		 
   	 }
 }
 
 public void child2(View view)
 {
	 try
	 {
		 Intent in = new Intent(MainActivity.this,Registration.class);
		 
		 startActivity(in);
		 
	 }
   	 catch(Exception e)
   	 {
   		 Log.d("Child2 Error Calling", "Error Occur in calling activity"+e);
   		 
   		 Toast.makeText(getApplicationContext(), "Sorry upgrade to premium."+e, Toast.LENGTH_SHORT).show();
   	 }
 }

}

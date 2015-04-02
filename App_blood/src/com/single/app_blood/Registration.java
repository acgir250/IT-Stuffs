package com.single.app_blood;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Registration extends Activity {
	
	@Override
	
	protected void onCreate(Bundle savedInstance) {
		super.onCreate(savedInstance);
          
		setContentView(R.layout.registration);
	
		Toast.makeText(getApplicationContext(), "one is called", Toast.LENGTH_SHORT).show();
	}

}

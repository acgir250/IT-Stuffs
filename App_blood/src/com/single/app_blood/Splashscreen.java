package com.single.app_blood;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;

public class Splashscreen extends Activity {
	private Thread mSplashThread = null;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		
		mSplashThread = new Thread() {

			@Override
			public void run() {
				try {
					synchronized (this) {

						wait(5000);
					}
				} catch (InterruptedException ex) {
				}

				finish();

				// Run next activity
				Intent intent = new Intent();
				intent.setClass(Splashscreen.this, MainActivity.class);
				startActivity(intent);
			}

	
		};

		mSplashThread.start();
	}

	public boolean onTouchEvent(MotionEvent evt) {

		if (evt.getAction() == MotionEvent.ACTION_DOWN) {
			synchronized (mSplashThread) {
				
				mSplashThread.notifyAll();
			}
		}
		return true;
	}

}

package com.personalfinance.expenses.ui;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.personalfinance.expenses.R;

public class SplashActivity extends Activity {
	
	private static final int SPLASH_TIMEOUT=100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		Timer timer = new Timer();
		timer.schedule(new SplashTimout(), SPLASH_TIMEOUT);
	}
	
	class SplashTimout extends TimerTask {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Intent intent = new Intent(SplashActivity.this, DashboardActivity.class);
			startActivity(intent);
			finish();
		}
		
	}

}

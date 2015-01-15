package com.service;

import com.personalfinance.expenses.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TestActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service);

		((Button) findViewById(R.id.testactivity_btn_start))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						startTestService();

					}
				});

		((Button) findViewById(R.id.testactivity_btn_stop))
				.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						stopTestService();

					}
				});

	}

	public void startTestService() {
		startService(new Intent(this, TestService.class));
	}

	public void stopTestService() {
		stopService(new Intent(this, TestService.class));
	}

}

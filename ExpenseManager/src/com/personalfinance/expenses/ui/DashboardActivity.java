package com.personalfinance.expenses.ui;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.test.ServiceTestCase;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.game.GameActivity;
import com.notes.NotesActivity;
import com.personalfinance.expenses.R;
import com.service.TestActivity;

import static com.util.Logger.*;

public class DashboardActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		logd("DashboardActivity is now visible");
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		Tab gamesTab = actionBar.newTab().setText(R.string.action_game);
		gamesTab.setTabListener(new DashboardTabListener(R.id.action_game, this));
		actionBar.addTab(gamesTab);
		
		Tab notesTab = actionBar.newTab().setText(R.string.action_notes);
		notesTab.setTabListener(new DashboardTabListener(R.id.action_notes, this));
		actionBar.addTab(notesTab);
		
		Tab serviceTab = actionBar.newTab().setText("Service");
		serviceTab.setTabListener(new DashboardTabListener(R.id.action_service, this));
		actionBar.addTab(serviceTab);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.dashboard, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		logd("selected option index " + id);

//		switch (id) {
//		case R.id.action_game:
//			logd("Launching Game...");
//			Intent gameintent = new Intent(getApplicationContext(), GameActivity.class);
//			startActivity(gameintent);
//			break;
//		case R.id.action_notes:
//			logd("Launching Notes...");
//			Intent noteIntent = new Intent(getApplicationContext(), NotesActivity.class);
//			startActivity(noteIntent);
//			break;
//		default:
//			logd("default selection");
//			return super.onOptionsItemSelected(item);
//		}
		return true;
	}
}

class DashboardTabListener implements TabListener {
	
	public int mTabId;
	
	public Context mContext;
	
	public DashboardTabListener(int id, Context cnt) {
		mContext = cnt;
		mTabId = id;
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		switch (mTabId) {
		case R.id.action_game:
			logd("Launching Game...");
			Intent gameintent = new Intent(mContext.getApplicationContext(), GameActivity.class);
			mContext.startActivity(gameintent);
			break;
		case R.id.action_notes:
			logd("Launching Notes...");
			Intent noteIntent = new Intent(mContext.getApplicationContext(), NotesActivity.class);
			mContext.startActivity(noteIntent);
			break;
		case R.id.action_service:
			logd("Launching Notes...");
			Intent serviceIntent = new Intent(mContext.getApplicationContext(), TestActivity.class);
			mContext.startActivity(serviceIntent);
			break;
		default:
			logd("default selection");
		}
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	
}
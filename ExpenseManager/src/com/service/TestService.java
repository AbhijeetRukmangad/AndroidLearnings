package com.service;

import static com.util.Logger.logd;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;

public class TestService extends Service {

	@Override
	public IBinder onBind(Intent intent) {
		logd("inside onBind");
		return null;
	}

	@Override
	public void onCreate() {
		logd("inside onCreate");
		super.onCreate();
	}

	@Override
	public void onStart(Intent intent, int startId) {
		logd("inside onStart");
		super.onStart(intent, startId);
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		logd("inside onStartCommand");
		return super.onStartCommand(intent, flags, startId);
	}

	@Override
	public void onDestroy() {
		logd("inside onDestroy");
		super.onDestroy();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		logd("inside onConfigurationChanged");
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onUnbind(Intent intent) {
		logd("inside onUnbind");
		return super.onUnbind(intent);
	}

	@Override
	public void onRebind(Intent intent) {
		// TODO Auto-generated method stub
		super.onRebind(intent);
	}

	@Override
	protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
		logd("");
		super.dump(fd, writer, args);
	}

}

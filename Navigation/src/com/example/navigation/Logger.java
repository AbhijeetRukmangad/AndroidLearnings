package com.example.navigation;

import android.util.Log;

public final class Logger {

	private static final String TAG = "abhijeet";

	private static final boolean DEBUG_FLAG = true;

	public static void debug(String text) {
		if (DEBUG_FLAG) {
			Log.d(TAG, text);
		}
	}

	public static void error(String text) {
		if (DEBUG_FLAG) {
			Log.e(TAG, text);
		}
	}
	
}

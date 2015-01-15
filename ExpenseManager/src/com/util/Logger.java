package com.util;

import android.util.Log;
import android.widget.Toast;

public final class Logger {

	private static final String TAG = "abhijeet";

	private static final boolean DEBUG_FLAG = true;

	public static void logd(String text) {
		if (DEBUG_FLAG) {
			Log.d(TAG, text);
		}
	}

	public static void loge(String text) {
		if (DEBUG_FLAG) {
			Log.e(TAG, text);
		}
	}
	
}

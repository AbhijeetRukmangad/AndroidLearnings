package learnings.androidcms.util;

import android.util.Log;

public class Logger {

	public static final boolean DEBUG_FLAG = true;
	public static final String DEBUG_TAG = "AndroidCMS";

	public static void debug(String message) {
		if (DEBUG_FLAG) {
			Log.d(DEBUG_TAG, message);
		}
	}

}

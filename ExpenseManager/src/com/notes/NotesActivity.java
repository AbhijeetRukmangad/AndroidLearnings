package com.notes;

import com.personalfinance.expenses.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import static com.util.Logger.*;

public class NotesActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		logd("Inside onCreate of NotesActivity");
		setContentView(R.layout.activity_notes);
	}

	@Override
	protected void onStart() {
		super.onStart();
		logd("Inside onStart of NotesActivity");
	}

	@Override
	protected void onResume() {
		super.onResume();
		logd("Inside onResume of NotesActivity");
	}

	@Override
	protected void onStop() {
		super.onStop();
		logd("Inside onStop of NotesActivity");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		logd("Inside onDestroy of NotesActivity");
	}

}

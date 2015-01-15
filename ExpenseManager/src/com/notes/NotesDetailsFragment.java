package com.notes;

import static com.util.Logger.logd;

import com.personalfinance.expenses.R;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NotesDetailsFragment extends Fragment {
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		logd("Inside onCreate of NotesDetailsFragment");
		
	}

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		logd("Inside onActivityCreated of NotesDetailsFragment");
	}

	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		logd("Inside onPause of NotesDetailsFragment");
	}

	@Override
	public void onStart() {
		super.onStart();
		logd("Inside onStart of NotesDetailsFragment");
	}

	@Override
	public void onResume() {
		super.onResume();
		logd("Inside onResume of NotesDetailsFragment");
	}

	@Override
	public void onStop() {
		super.onStop();
		logd("Inside onStop of NotesDetailsFragment");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		logd("Inside onDestroy of NotesDetailsFragment");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		logd("Inside onCreateView of NotesDetailsFragment");
//		return null;
		return inflater.inflate(R.layout.fragment_notesdetails, (ViewGroup)this.getActivity().findViewById(R.layout.fragment_notesdetails));
		
	}
	
	

}

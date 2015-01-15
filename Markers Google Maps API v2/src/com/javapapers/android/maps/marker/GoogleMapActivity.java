package com.javapapers.android.maps.marker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class GoogleMapActivity extends Activity { 
//implements		OnMarkerClickListener, OnMarkerDragListener {
	private static final LatLng LOWER_MANHATTAN = new LatLng(40.722543,
			-73.998585);
	private static final LatLng TIMES_SQUARE = new LatLng(40.7577, -73.9857);
	private static final LatLng BROOKLYN_BRIDGE = new LatLng(40.7057, -73.9964);
	private static final LatLng WALL_STREET = new LatLng(40.7064, -74.0094);
	private static final LatLng HINJEWADI = new LatLng(18.580684, 73.737366);

	private static LatLng fromPosition = null;
	private static LatLng toPosition = null;

	private GoogleMap googleMap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addGoogleMap();
		// addLines();
		addMarkers();
	}

	private void addGoogleMap() {
		// check if we have got the googleMap already
		if (googleMap == null) {
//			googleMap = ((SupportMapFragment) getSupportFragmentManager()
//					.findFragmentById(R.id.map)).getMap();
			googleMap = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();
			
//			googleMap.setOnMarkerClickListener(this);
//			googleMap.setOnMarkerDragListener(this);
		}

	}

	private void addMarkers() {
		if (googleMap != null) {
			

			// a draggable marker with title and snippet
			googleMap.addMarker(new MarkerOptions().position(HINJEWADI)
					.title("Blue Ridge").snippet("Infostretch Solutions Pvt. Ltd."));
//					.draggable(true));

//			// marker with custom color
//			googleMap.addMarker(new MarkerOptions()
//					.position(BROOKLYN_BRIDGE)
//					.title("First Pit Stop")
//					.icon(BitmapDescriptorFactory
//							.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
//
//			// marker with opacity
//			googleMap.addMarker(new MarkerOptions().position(LOWER_MANHATTAN)
//					.title("Second Pit Stop").snippet("Best Time: 6 Secs")
//					.alpha(0.4f));
//
//			// marker using custom image
//			googleMap.addMarker(new MarkerOptions()
//					.position(WALL_STREET)
//					.title("Wrong Turn!")
//					.icon(BitmapDescriptorFactory
//							.fromResource(R.drawable.my_flag)));
//
//			googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
//					BROOKLYN_BRIDGE, 13));

		}
	}

//	private void addLines() {
//		if (googleMap != null) {
//			googleMap.addPolyline((new PolylineOptions())
//					.add(TIMES_SQUARE, BROOKLYN_BRIDGE, LOWER_MANHATTAN,
//							TIMES_SQUARE).width(5).color(Color.BLUE)
//					.geodesic(true));
//			// move camera to zoom on map
//			googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(
//					LOWER_MANHATTAN, 13));
//		}
//	}

//	@Override
//	public boolean onMarkerClick(Marker marker) {
//		Log.i("GoogleMapActivity", "onMarkerClick");
//		Toast.makeText(getApplicationContext(),
//				"Marker Clicked: " + marker.getTitle(), Toast.LENGTH_LONG)
//				.show();
//		return false;
//	}
//
//	@Override
//	public void onMarkerDrag(Marker marker) {
//		// do nothing during drag
//	}
//
//	@Override
//	public void onMarkerDragEnd(Marker marker) {
//		toPosition = marker.getPosition();
//		Toast.makeText(
//				getApplicationContext(),
//				"Marker " + marker.getTitle() + " dragged from " + fromPosition
//						+ " to " + toPosition, Toast.LENGTH_LONG).show();
//
//	}
//
//	@Override
//	public void onMarkerDragStart(Marker marker) {
//		fromPosition = marker.getPosition();
//		Log.d(getClass().getSimpleName(), "Drag start at: " + fromPosition);
//	}
}
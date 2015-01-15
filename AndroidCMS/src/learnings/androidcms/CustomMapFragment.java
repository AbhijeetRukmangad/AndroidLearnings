package learnings.androidcms;

import static learnings.androidcms.util.Logger.debug;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class CustomMapFragment extends MapFragment {

	// @Override
	public void onMapReady(GoogleMap googleMap) {
		// options.position(new LatLng(18.580684, 73.737366));
		double lat = 18.580684;
		double lng = 73.737366;
		LatLng pos = new LatLng(lat, lng);
		debug("Showing map of type " + googleMap.getMapType());
		googleMap.animateCamera(CameraUpdateFactory.newLatLng(pos));
		googleMap.addMarker(new MarkerOptions().position(pos).title(
				"Mylocation"));
		debug("Added marker " + 1);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		if (ConnectionResult.SUCCESS == GooglePlayServicesUtil
				.isGooglePlayServicesAvailable(getActivity())) {
			debug("Play services are available");
			GoogleMap map = getMap();
			debug("Received map object " + map);
			if (map != null) {
				onMapReady(map);
			}
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		super.onCreateView(inflater, container, savedInstanceState);
		debug("Inflating map layout");
		return inflater.inflate(R.layout.fragment_map, container, false);
	}

}

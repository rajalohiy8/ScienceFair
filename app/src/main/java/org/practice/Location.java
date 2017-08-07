package org.practice;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Location extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(23.232787,77.452315);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Science Fair"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney, 16));
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
    } @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(0, 1, 1, R.string.title_section1);
        menu.add(0, 2, 2, R.string.title_section2);
        menu.add(0, 3, 3, R.string.title_section3);
        menu.add(0, 4, 4, R.string.title_section4);
        menu.add(0, 5, 5, R.string.title_section5);
        menu.add(0, 6, 6, R.string.title_section6);
        menu.add(0, 7, 7, R.string.title_section7);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case 1:

                Intent XXX = new Intent(this,MainActivity.class);
                startActivity(XXX);
                break;
            case 2:

                Intent D = new Intent(this,Registration.class);
                startActivity(D);
                break;
            case 3:

                Intent O = new Intent(this, Events.class);
                startActivity(O);
                break;
            case 4:

                Intent P = new Intent(this,Homee.class);
                startActivity(P);
                break;
            case 5:

                Intent Q = new Intent(this,Location.class);
                startActivity(Q);
                break;
            case 6:

                Intent R = new Intent(this,Contact.class);
                startActivity(R);
                break;
            case 7:

                Intent A = new Intent(this,About.class);
                startActivity(A);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}

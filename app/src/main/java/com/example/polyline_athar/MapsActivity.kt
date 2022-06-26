package com.example.polyline_athar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.example.polyline_athar.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.PolylineOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onMapReady(googleMap: GoogleMap) {

        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        val polyline1 = googleMap.addPolyline(
            PolylineOptions()
            .clickable(true)
            .add(
                LatLng(31.377580427903734, 74.23031659952451),
                LatLng(31.39256670525146, 74.24020397946077)))

        // Position the map's camera near Alice Springs in the center of Australia,
        // and set the zoom factor so most of Australia shows on the screen.
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(31.3805985788069, 74.23174568347031), 4f))

        // Set listeners for click events.
        googleMap.setOnPolylineClickListener(this)
        googleMap.setOnPolygonClickListener(this)
    }
}

private fun Any.setOnPolygonClickListener(mapsActivity: MapsActivity) {
    TODO("Not yet implemented")
}

private fun GoogleMap.setOnPolylineClickListener(mapsActivity: MapsActivity) {
    TODO("Not yet implemented")
}

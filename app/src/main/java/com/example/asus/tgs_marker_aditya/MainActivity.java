package com.example.asus.tgs_marker_aditya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.api.IMapController;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView map = (MapView) findViewById(R.id.map);
        map.setTileSource(TileSourceFactory.MAPNIK);
        map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);

        GeoPoint startPoint = new GeoPoint(-5.3757702,105.2462424);
        IMapController mapController = map.getController();
        mapController.setZoom(9);
        mapController.setCenter(startPoint);

        Marker startMarker = new Marker(map);
        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker);
        map.invalidate();
        startMarker.setIcon(getResources().
                getDrawable(R.drawable.pascasarjana));
        startMarker.setTitle("Pascasarjana Universitas Bandar Lampung");



            GeoPoint startPoint1 = new GeoPoint(-5.4022276,105.2028451);
            IMapController mapController1 = map.getController();
            mapController1.setCenter(startPoint1);

            Marker startMarker1 = new Marker(map);
            startMarker1.setPosition(startPoint1);
            startMarker1.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
            map.getOverlays().add(startMarker1);
            map.invalidate();
            startMarker1.setIcon(getResources().
                getDrawable(R.drawable.rumah));
            startMarker1.setTitle("Rumah M. Aditya Wulandana Sufit");


        GeoPoint startPoint2 = new GeoPoint(-5.3797433,105.2512951);
        IMapController mapController2 = map.getController();
        mapController2.setCenter(startPoint2);

        Marker startMarker2 = new Marker(map);
        startMarker2.setPosition(startPoint2);
        startMarker2.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker2);
        map.invalidate();
        startMarker2.setIcon(getResources().
                getDrawable(R.drawable.ubla));
        startMarker2.setTitle("Universitas Bandar Lampung");


            GeoPoint startPoint3 = new GeoPoint(-5.3730137,105.2404933);
            IMapController mapController3 = map.getController();
            mapController3.setCenter(startPoint3);

            Marker startMarker3 = new Marker(map);
            startMarker3.setPosition(startPoint3);
            startMarker3.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
            map.getOverlays().add(startMarker3);
            map.invalidate();
            startMarker3.setIcon(getResources().
                getDrawable(R.drawable.musium));
            startMarker3.setTitle("Museum Lampung");




        GeoPoint startPoint4 = new GeoPoint(-5.3819852,105.2600886);
        IMapController mapController4 = map.getController();
        mapController4.setCenter(startPoint4);

        Marker startMarker4 = new Marker(map);
        startMarker4.setPosition(startPoint4);
        startMarker4.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);
        map.getOverlays().add(startMarker4);
        map.invalidate();
        startMarker4.setIcon(getResources().
                getDrawable(R.drawable.mbka));
        startMarker4.setTitle("Mal Boemi Kedaton");
    }
}

package com.maddox.tmc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import org.osmdroid.tileprovider.MapTileProviderBasic;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.XYTileSource;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.ScaleBarOverlay;
import org.osmdroid.views.overlay.SimpleLocationOverlay;
import org.osmdroid.views.overlay.TilesOverlay;


public class MapActivity extends ActionBarActivity {

    private MapView mapView;
    private MapController mapController;
    private SimpleLocationOverlay mMyLocationOverlay;
    private ScaleBarOverlay mScaleBarOverlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        MapView mapView = (MapView) findViewById(R.id.mapview);
        mapView.setClickable(true);
        mapView.setBuiltInZoomControls(true);
        mapView.setMultiTouchControls(true);

        mapView.getController().setZoom(15);
        mapView.setMaxZoomLevel(18);
//        final MapTileProviderBasic tileProvider = new MapTileProviderBasic(getApplicationContext());
        mapView.setTileSource(TileSourceFactory.MAPNIK);
//        mapView.setTileSource((new XYTileSource("map", null, 0, 18, 256, "", new String[]{"http://tile.openstreetmap.org/"})));
//        final TilesOverlay tilesOverlay = new TilesOverlay(tileProvider, this.getBaseContext());
        mapView.getController().setCenter(new GeoPoint(54.51913889, 18.54650541));
//        mapView.getOverlays().add(tilesOverlay);
//        this.mMyLocationOverlay = new SimpleLocationOverlay(this);
//        this.mapView.getOverlays().add(mMyLocationOverlay);
//        this.mScaleBarOverlay = new ScaleBarOverlay(this);
//        this.mapView.getOverlays().add(mScaleBarOverlay);
//        mapView.setUseDataConnection(false);

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_map);
//    }
//
//
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_map, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

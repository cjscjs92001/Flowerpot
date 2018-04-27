package com.cjscjs.flowerpot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapController;
import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.maplib.NGeoPoint;

public class MapActivity extends NMapActivity {

    String clientID="1lSxEh5N2CKbtNuC70z0";

    NMapView mapView;
    NMapController mapController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        mapView=findViewById(R.id.mapview);
        mapView.setClientId(clientID);





        mapView.setClickable(true);
        mapView.setScalingFactor(2.5f,true);

        //맵 컨트롤러객체 얻어오기
        mapController=mapView.getMapController();
        mapController.setZoomEnabled(true);

        NGeoPoint geoPoint=new NGeoPoint(128.6181537, 35.8502054);
        mapController.setMapCenter(geoPoint,11);
    }
}

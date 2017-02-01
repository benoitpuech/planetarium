package com.laguigne.benoitpuech.cosmos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SunActivity extends AppCompatActivity {

    private ListView listplanet;
    private final ArrayList<Planet>ArrayPlanet = new ArrayList<>();
    public static final String PLANETE = "com.laguigne.benoitpuech.cosmos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);

        listplanet = (ListView) findViewById(R.id.idlist_item);

        ArrayPlanet.add(new Planet(R.drawable.soleil_logo, "Soleil", "Étoile", "27 jours", "acune", 1392684, 0, 0));
        ArrayPlanet.add(new Planet(R.drawable.mercure_logo, "Mercure", "Planète tellurique", "59 jours", "88 jours", 4879, 58, 0));
        ArrayPlanet.add(new Planet(R.drawable.venus_logo, "Vénus", "Planète tellurique", "243 jours", "224 jours", 12100, 108, 0));
        ArrayPlanet.add(new Planet(R.drawable.earth_logo, "Terre", "Planète tellurique", "365 jours", "1 jour", 12756, 149, 1));
        ArrayPlanet.add(new Planet(R.drawable.mars_logo, "Mars", "Planète tellurique", "1 an et 11 mois", "24 heures 37 minutes", 6792, 228, 2));
        ArrayPlanet.add(new Planet(R.drawable.jupiter_logo, "Jupiter", "Planète gazeuse", "11 ans et 315 jours", "10 heures", 142184, 816, 16));
        ArrayPlanet.add(new Planet(R.drawable.saturne_logo, "Saturne", "Planète gazeuse", "29 ans et 167 jours", "10h et 14 minutes", 120636, 1429, 21));
        ArrayPlanet.add(new Planet(R.drawable.uranus_logo, "Uranus", "Planète gazeuse", "83 ans et 7 jours", "15 heures et 30 minutes", 51118, 2875, 15));
        ArrayPlanet.add(new Planet(R.drawable.neptune_logo, "Neptune", "Planète gazeuse", "164 ans et 280 jours", "16 heures", 49532, 4504, 8));


        final CustomListAdapter adapter = new CustomListAdapter(this, ArrayPlanet);
        listplanet.setAdapter(adapter);
        listplanet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SunActivity.this, DetalsActivity.class);
                intent.putExtra("Test", ArrayPlanet.get(position));
                startActivity(intent);
            }
        });
    }
}

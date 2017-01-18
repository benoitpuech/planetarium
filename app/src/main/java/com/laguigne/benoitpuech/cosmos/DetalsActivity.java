package com.laguigne.benoitpuech.cosmos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalsActivity extends AppCompatActivity {

    private ImageView photo;
    private TextView name, type, rotate, revolution, size, range, satellites;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Planet planet = (Planet) getIntent().getSerializableExtra("Test");

        photo = (ImageView) findViewById(R.id.idImage);
        photo.setImageResource(planet.getImage());

        name = (TextView) findViewById(R.id.idName);
        name.setText(planet.getName());

        type = (TextView) findViewById(R.id.idtype);
        type.setText(planet.getType());

        rotate = (TextView) findViewById(R.id.idRotate);
        rotate.setText(planet.getTour());

        revolution = (TextView) findViewById(R.id.idRevolution);
        revolution.setText(planet.getRevolution());

        size = (TextView) findViewById(R.id.idSize);
        size.setText(planet.getSize().toString());

        range = (TextView) findViewById(R.id.idRange);
        range.setText(planet.getDistance().toString());

        satellites = (TextView) findViewById(R.id.idSatellite);
        satellites.setText(planet.getSatellites().toString());
    }
}

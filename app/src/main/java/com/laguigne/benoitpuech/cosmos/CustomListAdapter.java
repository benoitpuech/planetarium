package com.laguigne.benoitpuech.cosmos;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.id.list;
import static android.R.id.summary;

/**
 * Created by benoitpuech on 13/11/16.
 */

public class CustomListAdapter extends ArrayAdapter<Planet> {

    private Activity context;
    private ArrayList<Planet> ArrayPlanet;// attributs


    public CustomListAdapter(Activity context, ArrayList<Planet> ArrayPlanet){//constructeur
        super(context, R.layout.my_list, ArrayPlanet);
        this.context = context;
        this.ArrayPlanet = ArrayPlanet;

    }



    public View getView(int position, View view, ViewGroup parent) { //méthode pour mettre nos valeurs dans les textviews et imageview

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_list, parent, false);

        Planet m = getItem(position);
        ImageView image = (ImageView) rowView.findViewById(R.id.icon);
        TextView text = (TextView) rowView.findViewById(R.id.item);

        image.setImageResource(m.getImage());
        text.setText(m.getName());

        return rowView;
    }
}



package com.laguigne.benoitpuech.cosmos;

import android.support.v7.app.AppCompatActivity;

import java.io.Serializable;

/**
 * Created by benoitpuech on 23/10/16.
 */

public class Planet implements Serializable {



    private Integer image;
    private String name;
    private String type;
    private String tour;
    private String revolution;
    private Integer size;
    private Integer distance;
    private Integer satellites;



    public Planet(Integer image, String name, String type, String tour, String revolution, Integer size, Integer distance, Integer satellites) {
        this.image = image;
        this.name = name;
        this.type = type;
        this.tour = tour;
        this.revolution = revolution;
        this.size = size;
        this.distance = distance;
        this.satellites = satellites;
    }


    public int getImage(){
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }


    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }


    public String getTour(){
        return tour;
    }
    public void setTour(String tour){
        this.tour = tour;
    }


    public String getRevolution(){
        return revolution;
    }
    public void setRevolution(String revolution){
        this.revolution = revolution;
    }


    public Integer getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }


    public Integer getDistance(){
        return distance;
    }
    public void setDistance(int distance){
        this.distance = distance;
    }

    public Integer getSatellites() {return satellites;}
    public void setSatellites(int satellites) {this.satellites = satellites;}

}

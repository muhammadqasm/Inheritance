package com.example.siwaily.testinheritance;

import android.util.Log;

public class Animal {

    //try to find more descriptive property
    double speed;
    String color;

    public Animal (){


    }

    public Animal(double speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;


    }

    public void setColor(String color) {
        this.color = color;
    }



  public void displayinformation  (double speed){

      Log.i("displayInformation", "The Speed is : "+speed);

  }
    public void displayinformation  (String color,double speed){

        Log.i("displayInformation", "The Speed is : "+speed +" and the color is: "+color);

    }
}

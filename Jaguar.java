package com.example.siwaily.testinheritance;

public class Jaguar extends Animal {
    public Jaguar() {
        super();
    }

    public Jaguar(double speed, String color) {
        super(speed, color);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setSpeed(double speed) {
        super.setSpeed(speed);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }


    @Override
    public void displayinformation(double speed) {
        super.displayinformation(speed);
    }

    @Override
    public void displayinformation(String color, double speed) {
        super.displayinformation(color, speed);
    }
}

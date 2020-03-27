/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.designpatterns.creational.builder;

/**
 *
 * @author AbdElHalim
 */
public class Engine {

    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }

    public boolean isStarted() {
        return started;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public void go(double mileage) {

        if (started) {
            this.mileage += mileage;
        } else {
            System.out.println("Cannot go(), you must start engine first.");
        }
    }
}

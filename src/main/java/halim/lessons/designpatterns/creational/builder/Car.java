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
public class Car {
    
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private final Type type;
    private final int seats;
    private double fuel = 0;
    
    public Car(Engine engine, Transmission transmission, TripComputer tripComputer,
            GPSNavigator gpsNavigator, Type type, int seats) {
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.tripComputer.setCar(this);
        this.gpsNavigator = gpsNavigator;
        this.type = type;
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    
}

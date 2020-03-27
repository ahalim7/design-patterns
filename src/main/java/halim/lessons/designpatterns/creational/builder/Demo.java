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
public class Demo {
    
    public static void main(String[] args) {
        
        Director director = new Director();
        
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        
        Car car = carBuilder.getResult();
        System.out.println("Car Built: " + car.getType());
        
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar Built: " + manual.print());
    }
}

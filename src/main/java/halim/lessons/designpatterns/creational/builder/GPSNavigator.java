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
public class GPSNavigator {

    private final String route;

    public GPSNavigator() {
        route = "Cairo, Egypt";
    }

    public GPSNavigator(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}

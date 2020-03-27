/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.designpatterns.creational.abstractfactory;

/**
 *
 * @author AbdElHalim
 */
public class MacOSButton implements Button{

    @Override
    public void paint() {
        System.out.println("Painting MacOSButton");
    }
    
}

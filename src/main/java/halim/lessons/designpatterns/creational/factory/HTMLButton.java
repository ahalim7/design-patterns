/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.designpatterns.creational.factory;

/**
 *
 * @author AbdElHalim
 */
public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("<button> Hello World ! </button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
    
}

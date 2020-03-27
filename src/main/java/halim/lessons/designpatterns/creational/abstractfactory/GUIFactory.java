/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.designpatterns.creational.abstractfactory;

/**
 * Abstract Factory interface that knows all products (buttons, check boxes, ..etc)
 * @author AbdElHalim
 */
public interface GUIFactory {
    
    Button createButton();
    Checkbox createCheckbox();
}

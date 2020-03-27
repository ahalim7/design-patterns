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
public abstract class Dialog {
    
    public void renderWindow(){
        
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}

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
public class Demo {

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
    
    private static Application configureApplication(){
        
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }
}

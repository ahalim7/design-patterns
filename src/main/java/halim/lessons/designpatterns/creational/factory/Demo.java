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
public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {

        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

}

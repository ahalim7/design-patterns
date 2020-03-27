/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halim.lessons.designpatterns.creational.factory;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author AbdElHalim
 */
public class WindowsButton implements Button {
    
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
    
    @Override
    public void render() {
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 100);
        frame.setVisible(true);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        button = new JButton("Exit");
        
        panel.add(button);
        onClick();
        
    }
    
    @Override
    public void onClick() {
        button.addActionListener((ActionEvent ae) -> {
            frame.setVisible(false);
            System.exit(0);
        });
    }
    
}

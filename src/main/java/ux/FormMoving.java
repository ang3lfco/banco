/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ux;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Martinez
 */
public class FormMoving extends MouseAdapter{
    private int xMouse;
    private int yMouse;
    
    @Override
    public void mousePressed(MouseEvent e){
        xMouse = e.getX();
        yMouse = e.getY();
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        int x = e.getXOnScreen();
        int y = e.getYOnScreen();

        // Obtener el JFrame padre del JPanel
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor((Component) e.getSource());
        // Mover el JFrame
        frame.setLocation(x - xMouse, y - yMouse);
    }
}
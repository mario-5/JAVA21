/* Solution to Chapter 13, Exercise 1 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.UIManager.*;

/* This application requires four arguments: a radius, x position,
   y position and a color code like the one websites use. For example,
   the arguments 100 9,17 #FF0000 draw a 100-radius circle at x,y (9,17)
   with hexadecimal color #FF0000 (red) */
public class Circle extends JFrame {
    public Circle(String argR, String argX, String argY, String argColor) {
        super("Circle");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CirclePanel cp = new CirclePanel(argR, argX, argY, argColor);
        add(cp);
        setVisible(true);
    }
    
    public static void main(String[] arguments) {
        if (arguments.length < 3) {
            System.out.println("Usage: java Circle radius x y color");
            System.exit(0);
        } else {
            Circle dc = new Circle(arguments[0], arguments[1],
                arguments[2], arguments[3]);
        }
    }
}

class CirclePanel extends JPanel {
    int radius, x, y;
    Color color;

    public CirclePanel(String inRadius, String inX, String inY, String inColor) {
        super();
        if (inRadius == null) {
            radius = 100;
        }
        if (inX == null) {
            x = 110;
        }
        if (inY == null) {
            y = 110;
        }
        if (inColor == null) {
            color = Color.blue;
        }
        try {
            radius = Integer.parseInt(inRadius);
            x = Integer.parseInt(inX);
            y = Integer.parseInt(inY);
            color = Color.decode(inColor);
        } catch (NumberFormatException e) {
            System.out.println("Error" + e.getMessage());
        }
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        comp2D.setColor(Color.white);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(color);
        Ellipse2D.Float circle = new Ellipse2D.Float(x, y, radius, radius);
        comp2D.fill(circle);
    }
}
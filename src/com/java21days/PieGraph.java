/* Solution to Chapter 13, Exercise 2 in Teach Yourself Java in 21 Days (Covering Java 8
   and Android by Rogers Cadenhead. */

package com.java21days;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PieGraph extends JFrame {
    public PieGraph() {
        super("Pie Graph");
        setSize(322, 322);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PiePanel pie = new PiePanel(4);
        pie.addSlice(Color.green, 20F);
        pie.addSlice(Color.blue, 33F);
        pie.addSlice(Color.red, 2F);
        pie.addSlice(Color.yellow, 5F);
        add(pie);
        setVisible(true);
    }

    public static void main(String[] arguments) {
        PieGraph pg = new PieGraph();
    }
}       

class PiePanel extends JPanel {
    private PieSlice[] slice;
    private int current = 0;
    private float totalSize = 0;
    private Color background;

    public PiePanel(int sliceCount) {
        slice = new PieSlice[sliceCount];
        background = getBackground();
    }

    public void addSlice(Color sColor, float sSize) {
        if (current <= slice.length) {
            slice[current] = new PieSlice(sColor, sSize);
            totalSize += sSize;
            current++;
        }
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        int width = getSize().width - 10;
        int height = getSize().height - 15;
        int xInset = 5;
        int yInset = 5;
        if (width < 5) {
            xInset = width;
        }
        if (height < 5) {
            yInset = height;
        }
        comp2D.setColor(background);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(Color.lightGray);
        Ellipse2D.Float pie = new Ellipse2D.Float(
            xInset, yInset, width, height);
        comp2D.fill(pie);
        float start = 0;
        for (PieSlice slice1 : slice) {
            float extent = slice1.size * 360F / totalSize;
            comp2D.setColor(slice1.color);
            Arc2D.Float drawSlice = new Arc2D.Float(
                xInset, yInset, width, height, start, extent,
                Arc2D.Float.PIE);
            start += extent;
            comp2D.fill(drawSlice);
        }
    }
}

class PieSlice {
    Color color = Color.lightGray;
    float size = 0;

    PieSlice(Color pColor, float pSize) {
        color = pColor;
        size = pSize;
    }
}

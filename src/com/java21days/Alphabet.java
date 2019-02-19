package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alphabet extends JFrame {

    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.CENTER,30,10);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Burglar");
        JButton c = new JButton("Corpse");
        JButton d = new JButton("Deadbeat");
        JButton e = new JButton("Evidence");
        JButton f = new JButton("Fugitive");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }

    public static void main(String[] arguments) {
        Alphabet frame = new Alphabet();
    }
}

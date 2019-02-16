package com.java21days;

import javax.swing.*;

public class FormatFrame extends JFrame {
    JRadioButton[] teams = new JRadioButton[4];

    public FormatFrame() {
        super("Choose an Output Format");
        setSize(320, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teams[0] = new JRadioButton("Atom");
        teams[1] = new JRadioButton("RSS 0.92");
        teams[2] = new JRadioButton("RSS 1.0");
        teams[3] = new JRadioButton("RSS 2.0", true);
        JPanel panel = new JPanel();
        JLabel chooseLabel = new JLabel(
            "Choose an output format for syndicated news items.");
        panel.add(chooseLabel);
        ButtonGroup group = new ButtonGroup();
        for (JRadioButton team : teams) {
            group.add(team);
            panel.add(team);
        }
        add(panel);
        setVisible(true);
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String[] arguments) {
        FormatFrame.setLookAndFeel();
        FormatFrame ff = new FormatFrame();
    }
}

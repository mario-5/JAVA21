package com.java21days; 

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class  setLookAndFeel {
    public setLookAndFeel(){
           
        try {
             UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
                 // SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception exc) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + exc);
        }
    }
}




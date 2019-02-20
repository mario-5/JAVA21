
import java.awt.GridLayout;
//import java.awt.event.*;
import javax.swing.*;

public class dondeEstaTracker extends JFrame {

    private JLabel typeLabel = new JLabel("Type: ",
        SwingConstants.RIGHT);
    private JTextField type;

    public dondeEstaTracker() {
        super("En que calle la estacionaste");
        setSize(400, 145);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        String calle;

        // Calle
        String[] choices = { "Hlgo", "Gdhi", "Ante", "Psje" };
        int response = JOptionPane.showOptionDialog(null,
            "Seleccciona la calle:",
            "Direccion",
            0,
            JOptionPane.QUESTION_MESSAGE,
            null,
            choices,
            choices[0]);
        switch (response){
            case 0: calle ="Hidalgo";
            break;
            case 1: calle ="Gandhi";
            break;
            case 2: calle ="Antesana";
            break;
            case 3: calle ="Pasaje";
            break;
            default: calle ="No lo recuerdo";
        }                   
        //type = new JTextField(choices[response], 20);
        type = new JTextField(calle, 20);

        setLayout(new GridLayout(3, 2));

        add(typeLabel);
        add(type);
        setLookAndFeel();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the system "
                + "look and feel: " + e);
        }
    }

    public static void main(String[] arguments) {
        dondeEstaTracker frame = new dondeEstaTracker();
    }
}
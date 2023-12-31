/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumberGuess;

/**
 *
 * @author kali-i
 */
import java.awt.Dialog;
import javax.swing.*;

public class CustomDialogExample {

    public static boolean result=false;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {        
       openCustomDialog();


    }

    public static void openCustomDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Select A Option");
        dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        dialog.setSize(200, 150);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

       JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel messageLabel = new JLabel("Choose your option:");
        panel.add(messageLabel);

        JButton option1Button = new JButton("Start New Game");
        option1Button.addActionListener(e -> {
            dialog.dispose();
         result=true;
           

        });
        panel.add(option1Button);

        // Add vertical spacing
        panel.add(Box.createVerticalStrut(10));

        JButton option2Button = new JButton("Exit");
        option2Button.addActionListener(e -> {
            dialog.dispose();
           System.exit(0);

        });
        panel.add(option2Button);

        dialog.add(panel);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }
    }


import gradle.cucumber.ventana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.SwingUtilities.invokeAndWait;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bautista
 */
public class prueba extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;

    public prueba() {
        
        final JTextField textField = new JTextField("textToCopy");
        JButton button = new JButton("CopyButton");
        final JLabel label = new JLabel("copiedText");

        button.setText("Copiar");
        button.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
            }
        });
        
        add(textField);
        setSize(50,30);
        setVisible(true);
        
        add(button);
        setVisible(true);
        setSize(100,200);
        
        add(label);
        setVisible(true);
        
        pack();
    }

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {

        /**
        java.awt.EventQueue.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new prueba();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500,300);
            } 
    });

}
**/
        
        ventana ven = new ventana();
        ven.setVisible(true);
    }
}

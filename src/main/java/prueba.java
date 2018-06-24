
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
public class prueba{


    public static void main(String[] args) throws InterruptedException, InvocationTargetException {
        
        ventana ven = new ventana();
        ven.setVisible(true);
    }
}

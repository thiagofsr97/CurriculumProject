/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoLp1.Interface.Model;


import java.awt.Component;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;

import javax.swing.JTextField;
import java.io.Serializable;

/**
 *
 * @author thiagofsr
 */
public class Utils implements Serializable {
    public static boolean isEmptyOrNUll(JTextField textField){
        return textField == null || textField.getText().isEmpty();
    }
       
    
    public static void verifyField(Component component){
        JOptionPane.showMessageDialog(component, "Verifique os dados e tente novamente!", "Atenção", WIDTH);
        
    }
    
}

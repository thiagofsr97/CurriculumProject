package projetoLp1.Interface.Model;


import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.AbstractDocument.Content;

public class Utils implements Serializable {
    public static boolean isEmptyOrNUll(JTextField textField){
        return textField == null || textField.getText().isEmpty();
    }
       
    
    public static void verifyField(Component component){
        JOptionPane.showMessageDialog(component, "Verifique os dados e tente novamente!", "Atenção", WIDTH);
        
    }
    public static void verifyDate(Component component){
        JOptionPane.showMessageDialog(component, "Verifique os campos de Datas e tente novamente!", "Atenção", WIDTH);
    }
    public static int question(Component component){
        return JOptionPane.showConfirmDialog(component,"Deseja avançar sem preencher?", "Atenção", WIDTH);
    }
    
    
    
}

package Components;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AlertMessager {
    static public void success(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.INFORMATION_MESSAGE,new ImageIcon("D:\\ETEC\\JavaSwing2_3\\src\\Images\\success.png"));
    }
    static public void warning(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.WARNING_MESSAGE,new ImageIcon("D:\\ETEC\\JavaSwing2_3\\src\\Images\\warning.png"));
    }
    static public void error(String message){
        JOptionPane.showMessageDialog(null, message, "Information", JOptionPane.ERROR_MESSAGE,new ImageIcon("D:\\ETEC\\JavaSwing2_3\\src\\Images\\error.png"));
    }
}

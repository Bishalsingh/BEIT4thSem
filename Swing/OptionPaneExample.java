import javax.swing.*;  
public class OptionPaneExample {  
JFrame f;  
OptionPaneExample(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE);     
}  
public static void main(String[] args) {  
    new OptionPaneExample();  
}  
}  
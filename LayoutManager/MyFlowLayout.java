/* 
public static final int LEFT
public static final int RIGHT
public static final int CENTER
public static final int LEADING
public static final int TRAILING
Constructors of FlowLayout class
FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap

*/

import java.awt.*;  
import javax.swing.*;  
  
public class MyFlowLayout{  
JFrame f;  
MyFlowLayout(){  
    f=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");  
    JButton b5=new JButton("5");  
              
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
      
    f.setLayout(new FlowLayout(FlowLayout.RIGHT));  
    //setting flow layout of right alignment  
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyFlowLayout();  
}  
}  
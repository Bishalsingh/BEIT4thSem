/* 
Fields of BoxLayout class
public static final int X_AXIS
public static final int Y_AXIS
public static final int LINE_AXIS
public static final int PAGE_AXIS
Constructor of BoxLayout class
BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis. 
*/

import java.awt.*;  
import javax.swing.*;  
  
public class BoxLayoutExample1 extends Frame {  
 Button buttons[];  
  
 public BoxLayoutExample1 () {  
   buttons = new Button [5];  
    
   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
  
setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));  
setSize(400,400);  
setVisible(true);  
}  
  
public static void main(String args[]){  
BoxLayoutExample1 b=new BoxLayoutExample1();  
}  
}  
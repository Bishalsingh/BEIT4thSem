import java.applet.*;
import java.awt.*;

/**
 * A Java applet parameter test class.
 * Demonstrates how to read applet parameters.
 */
public class AppletParameterTest extends Applet {

   public void paint(Graphics g) {

      String myFont   = getParameter("font");
      String myString = getParameter("string");
      int mySize      = Integer.parseInt(getParameter("size"));

      Font f = new Font(myFont, Font.BOLD, mySize);
      g.setFont(f);
      g.setColor(Color.red);
      g.drawString(myString, 20, 20);

   }
}
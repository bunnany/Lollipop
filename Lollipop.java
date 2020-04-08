/* Based on the ecs 100 template
 * Code for 13DTC
 * Name: NY
 * Date: 
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** Draws little pictures on the graphics pane
 */
public class Lollipop{
    public static final double X = 300.0;       // horizontal center of lollipop
    public static final double Y = 180.0;       // vertical center of lollipop
    public static final double SIZE = 80.0;     // diameter of lollipop
    public static final double STICK = 200.0;   // length of lollipop stick

    
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }
    
    /** Drawe a red lollipop on a stick */
    private void drawLollipop() {
        double left = X-SIZE/2.0;           // left of lollipop
        double top = Y-SIZE/2.0;            //top of lollipop
        double bottom = Y+STICK;            // bottom of stick
        UI.setLineWidth(SIZE/8.0);          // set line width to 10
        UI.drawLine(X, Y, X, bottom);      // draw line
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(left, top, SIZE, SIZE);      // fill oval    @(260,160), 80x80
    }

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}


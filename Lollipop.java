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

    
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }
    
    /** Drawe a red lollipop on a stick */
    private void drawLollipop() {
        UI.setLineWidth(10);                // set line width to 10
        UI.drawLine(300, 200, 300, 400);    // draw line    (300, 200) to (300, 400)
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set color to red
        UI.fillOval(260, 160, 80, 80);      // fill oval    @(260,160), 80x80
    }

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();
    }

}


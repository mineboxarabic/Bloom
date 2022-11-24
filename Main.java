//import Application;
import java.awt.*;
import java.util.Vector;
import Classes.*;
import javax.swing.*;

import org.w3c.dom.stylesheets.StyleSheet;

public class Main 
 {
    public static Window window;
    public static void main(String[] args) {
        window = new Window();
        javax.swing.text.html.StyleSheet styleSheet = new javax.swing.text.html.StyleSheet();
        Tasks tasks = new Tasks();
        listView view1 = new listView(tasks);
        window.setVisible(true);
        window.add(view1);
        
    }
}
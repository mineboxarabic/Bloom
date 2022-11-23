//import Application;
import java.awt.*;
import java.util.Vector;
import Classes.*;
import javax.swing.*;
public class Main 
 {
    public static Window window;
    public static void main(String[] args) {
        window = new Window();
        Tasks tasks = new Tasks();
        listView view1 = new listView(tasks);
        window.setVisible(true);
        window.add(view1);
        
    }
}
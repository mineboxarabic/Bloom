//import Application;
import java.awt.*;
import java.util.Vector;
import Classes.Task;
import javax.swing.*;
public class Main 
 {
    public static Window window;
    void addContents(){
        JButton button = new JButton("add Task");
        JButton button2 = new JButton("Remove Task");
        button.setBounds(0,0,100,40);
        button2.setBounds(0,0,100,40);
        window.add(button);
        window.add(button2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Task> tasks = new Vector<Task>();
        window = new Window();
        for(int i = 0; i < 10; i++){
            tasks.add(new Task("Task " + i));
            Task task = tasks.get(i);
            window.add(task);
        }
 

        
        
    }
}
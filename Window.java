import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;    
import Classes.*;
public class Window extends JFrame 
{
    Window()
    {
        setTitle("Bloom");
        setSize(400, 400);
        setLocation(100, 100);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
    }
    
}
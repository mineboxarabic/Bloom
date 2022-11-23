import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;    
import Classes.*;
public class Window extends JFrame 
{
    JPanel downPanel;
    JPanel upPanel;
    void addContents(){
        upPanel.setLayout(new FlowLayout());
        JButton button = new JButton("add Task");
        JButton button2 = new JButton("Remove Task");
        button.setBounds(0,0,100,40);
        button2.setBounds(0,0,100,40);
        upPanel.add(button);
        upPanel.add(button2);
    }
    void add(Task task)
    {
        downPanel.add(task);
    }
    void add(JButton button)
    {
        upPanel.add(button);
    }
    Window()
    {

        setTitle("Bloom");
        setSize(400, 400);
        setLocation(100, 100);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        downPanel = new JPanel();
        downPanel.setLayout(new BoxLayout(downPanel, BoxLayout.Y_AXIS));
        upPanel = new JPanel();

        add(upPanel);
        add(downPanel);
        addContents();
    }
    
}
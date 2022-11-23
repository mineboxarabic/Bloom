package Classes;

import java.util.Vector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import FlowLayout;

public class listView extends JPanel {
    Tasks tasks;
    JPanel UpperPanel;
    JPanel LowerPanel;

    void updateView(){
        LowerPanel.removeAll();
        for(Task t : tasks){
            LowerPanel.add(new Task(t.getName()));
        }
    }
    void addTask()
    {
        System.out.println("Task added");
        String name = JOptionPane.showInputDialog(this,
                        "Task title", null);
        tasks.addTask(new Task(name));
    }
    public listView(Tasks tasks)
    {
        this.tasks = new Tasks();
        this.tasks = tasks;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        UpperPanel = new JPanel();
        UpperPanel.setLayout(new FlowLayout());
        LowerPanel = new JPanel();
        add(UpperPanel);
        add(LowerPanel);
        LowerPanel.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JButton button = new JButton("Add Task");
        JButton button2 = new JButton("Remove Task");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });

    }
        
}

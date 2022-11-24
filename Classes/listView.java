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
        LowerPanel.add(new Task(name));
        updateUI();
    }
    public listView(Tasks tasks)
    {
        this.tasks = new Tasks();
        this.tasks = tasks;
        setVisible(true);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        UpperPanel = new JPanel();
        UpperPanel.setVisible(true);
        UpperPanel.setLayout(new FlowLayout());
        LowerPanel = new JPanel();
        LowerPanel.setVisible(true);
        LowerPanel.setLayout(new BoxLayout(LowerPanel, BoxLayout.Y_AXIS));
        

        JButton button = new JButton("Add Task");
        JButton button2 = new JButton("Remove Task");
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        UpperPanel.add(button);
        UpperPanel.add(button2);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        add(UpperPanel);
        add(LowerPanel);

    }
        
}

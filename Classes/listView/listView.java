package Classes.listView;

import java.util.Vector;
import javax.swing.*;
import javax.swing.JPopupMenu.Separator;

import Classes.Task;
import Classes.TaskInfoPopUp;
import Classes.Tasks;

import java.awt.*;
import java.awt.event.*;
//import FlowLayout;
import java.io.Console;

public class listView extends JPanel {
    Tasks tasks;
    JPanel UpperPanel;
    JPanel LowerPanel;
    JPanel leftLowerPanel;
    JPanel rightLowerPanel;
    void updateView(){
        LowerPanel.removeAll();
        for(Task t : tasks){
            LowerPanel.add(new Task(t.getName()));
        }
    }
    void addTask()
    {
        System.out.println("Task added");


        TaskInfoPopUp taskInfoPopUp = new TaskInfoPopUp();
        taskInfoPopUp.saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Task task = taskInfoPopUp.getTask();
                listViewElement element = new listViewElement(task);
                tasks.addTask(task);
                element.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e)
                    {
                        rightLowerPanel.removeAll();
                        JLabel title = new JLabel(task.getTitle());
                        title.setFont(new Font("Arial", Font.PLAIN, 20));
                        rightLowerPanel.add(title);
                        JLabel description = new JLabel(task.getDescription());
                        description.setFont(new Font("Arial", Font.PLAIN, 10));
                        rightLowerPanel.add(description);
                        updateUI();

                    }
                });
                leftLowerPanel.add(element);
                Separator separator = new Separator();

                separator.setMaximumSize(new Dimension(20000, 2));
                leftLowerPanel.add(separator);
                taskInfoPopUp.dispose();
                updateUI();
            }
        });
            }
    public listView(Tasks tasks)
    {
        
        this.tasks = new Tasks();
        UpperPanel = new JPanel();
        UpperPanel.setVisible(true);
        UpperPanel.setLayout(new FlowLayout());
        UpperPanel.setMaximumSize(new Dimension(10000, 100));
        LowerPanel = new JPanel();
        LowerPanel.setVisible(true);
        LowerPanel.setLayout(new BoxLayout(LowerPanel, BoxLayout.X_AXIS));
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        JButton editButton = new JButton("Edit Task");
        leftLowerPanel = new JPanel();
        rightLowerPanel = new JPanel();
        leftLowerPanel.setLayout(new BoxLayout(leftLowerPanel, BoxLayout.Y_AXIS));
        rightLowerPanel.setLayout(new BoxLayout(rightLowerPanel, BoxLayout.Y_AXIS));

        leftLowerPanel.setBackground(Color.white);
        rightLowerPanel.setBackground(new Color(245,246,238));
        //Adding the spillter to the lower panel
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftLowerPanel, rightLowerPanel);
        splitPane.setOneTouchExpandable(true);
        splitPane.setDividerLocation(1000);
        splitPane.setDividerSize(10);
        splitPane.setResizeWeight(0.5);
        splitPane.setVisible(true);
        LowerPanel.add(splitPane);
        //Set Layout to BorderLayout 
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setVisible(true);
        //Put all tasks to this.tasks
        this.tasks = tasks;
        //Adding buttons to UpperPanel
        UpperPanel.add(addButton);
        UpperPanel.add(removeButton);
        UpperPanel.add(editButton);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addTask();
            }
        });
        
        add(UpperPanel);
        add(LowerPanel);

    }
        
}

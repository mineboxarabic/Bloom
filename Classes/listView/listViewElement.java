package Classes.listView;
import Classes.Task;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPopupMenu.Separator;
import javax.swing.Box.*;
import java.awt.event.*;
public class listViewElement extends JPanel
{
    private int id;
    public int getId ()
    {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }
    public listViewElement(Task task)
    {
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        if(task.getPriority() == 0)
            setBackground(new java.awt.Color(0, 255, 0));
        else if(task.getPriority() == 1)
            setBackground(new java.awt.Color(255, 255, 0));
        else if(task.getPriority() == 2)
            setBackground(new java.awt.Color(255, 0, 0));
        
        setAlignmentX(LEFT_ALIGNMENT);
        setMaximumSize(new java.awt.Dimension(1100, 20));
        setMinimumSize(new java.awt.Dimension(400, 20));
        //grid layout
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        JLabel title = new JLabel(task.getTitle());
        add(new JCheckBox("", task.getStatus()));
        add(title);
        JLabel date = new JLabel(task.getDate().toString());
        //adding marging to the right
        /*addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("Double clicked");
            }
        });*/
        add(Box.createHorizontalStrut(500));
        add(date);
        
        
        


    }    

}

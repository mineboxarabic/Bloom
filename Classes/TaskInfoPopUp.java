package Classes;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel.*;

import com.toedter.calendar.JCalendar;

import Classes.*;


public class TaskInfoPopUp extends JFrame 
{   public String title;
    public String description;
    public Date date;
    public String time;
    public int priority;
    public boolean status;
    public String category;
    public int id;
    public boolean isSaved;
    public JButton saveButton;
    public JCalendar calendar;
    public JTextField titleField;
    public JTextArea descriptionArea;
    public JComboBox<String> priorityComboBox;
    public JTextField timeField;
    public TaskInfoPopUp()
    {
        isSaved = false;
        JPanel mainPanel = new JPanel();
        setTitle("Task Info");
        setSize(400, 500);
        setLocation(100, 100);
        setResizable(false);
        setVisible(true);
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        add(mainPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        JLabel titleLabel = new JLabel("Title");
        titleLabel.setFont(new java.awt.Font("", 0, 18));
        mainPanel.add(titleLabel);
         titleField = new JTextField();
        mainPanel.add(titleField);
        JLabel descriptionLabel = new JLabel("Description");
        descriptionLabel.setFont(new java.awt.Font("", 0, 18));
        mainPanel.add(descriptionLabel);
         descriptionArea = new JTextArea();
        mainPanel.add(descriptionArea);
        JLabel dateLabel = new JLabel("Date");
        
        dateLabel.setFont(new java.awt.Font("", 0, 18));
        mainPanel.add(dateLabel);
        calendar = new JCalendar();
        mainPanel.add(calendar);
        JLabel timeLabel = new JLabel("Time");
        timeLabel.setFont(new java.awt.Font("", 0, 18));
        mainPanel.add(timeLabel);
         timeField = new JTextField();
        mainPanel.add(timeField);
        JLabel priorityLabel = new JLabel("Priority");
        priorityLabel.setFont(new java.awt.Font("", 0, 18));
        mainPanel.add(priorityLabel);

        priorityComboBox = new JComboBox<String>();
        priorityComboBox.addItem("Low");
        priorityComboBox.addItem("Medium");
        priorityComboBox.addItem("High");
        saveButton = new JButton("Save");
        mainPanel.add(priorityComboBox);
        mainPanel.add(saveButton);

        
    }
    public Task getTask(){
        category = "Default";

        isSaved = true;
        title = titleField.getText();
        description = descriptionArea.getText();
        date = new Date(calendar.getDate().getTime());
        priority = priorityComboBox.getSelectedIndex();
        time = "12:00";
        return new Task(title, description, date, time, priority, category);
    }
}

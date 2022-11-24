package Classes;
import java.util.*;
import javax.swing.JCheckBox;
public class Task extends JCheckBox
{
    private String title;
    private String description;
    private Date date;
    private Date time;
    private int priority;
    private boolean status;
    private String category;
    private int id;
    private static int idCounter = 0;
    int idGenerator()
    {
        idCounter++;
        return idCounter;
    }
    public Task(String title){
        super(title);
        id = this.idGenerator();
        date = new Date();
        time = new Date();
        priority = 0;
        status = false;
        category = "Default";
        this.title = title;
    }
}

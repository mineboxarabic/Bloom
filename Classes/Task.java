package Classes;
import java.util.*;
import javax.swing.JCheckBox;
import javax.swing.JPopupMenu.Separator;
public class Task extends JCheckBox
{
    private String title;
    private String description;
    private Date date;
    private String time;
    private int priority;
    private boolean status;
    private String category;
    private int id;
    private static int idCounter = 0;
    //Create getters and setters for all of the above
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }
    public Date getDate()
    {
        return date;
    }
    public void setDate(Date date)
    {
        this.date = date;
    }
    public String getTime()
    {
        return time;
    }
    public void setTime(String time)
    {
        this.time = time;
    }
    public int getPriority()
    {
        return priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    public boolean getStatus()
    {
        return status;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category = category;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }


    int idGenerator()
    {
        idCounter++;
        return idCounter;
    }
    public Task(String title){

        super(title);
        id = this.idGenerator();
        date = new Date();
        time = "00:00";
        priority = 0;
        status = false;
        category = "Default";
        this.title = title;
    }
    public Task(String title, String description, Date date, String time, int priority, String category)
    {
        super(title);
        id = this.idGenerator();
        this.title = title;
        this.description = description;
        this.date = date;
        this.time = time;
        this.priority = priority;
        this.status = false;
        this.category = category;
    }
}

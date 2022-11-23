package Classes;
import javax.swing.JCheckBox;

public class Task extends JCheckBox
{
    private String title;
    public Task(String title){
        super(title);
        this.title = title;
    }
}

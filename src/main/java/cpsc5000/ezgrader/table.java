package cpsc5000.ezgrader;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author calif
 */
public class table extends JFrame
{
    JTable table;
    Object [][] data;
    
    public table (Object [][] data )
    {
        setLayout (new FlowLayout ());
        String [] columns = {"Wrong", "Grade" , "Right"};
        
        table = new JTable (data, columns);
        table.setPreferredScrollableViewportSize(new Dimension (600, 175));
        table.setFillsViewportHeight(true);
        
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
}

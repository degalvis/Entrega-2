import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.awt.*;

public class Menu extends JFrame{
    
    private JPanel panel_menu = new JPanel();
    private JLabel myName = new JLabel("Diego Galvis");
    private JLabel u = new JLabel("Ing Sistemas, EAFIT");

    public Menu(){
        setTitle("Menu");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel_menu.setSize(800,600);
        panel_menu.setLocation(0,0);
      
        panel_menu.add(myName);
        panel_menu.add(u);
        
        add(panel_menu);
        
    }
    
}

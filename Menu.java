import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;

import java.awt.*;

public class Menu extends JFrame{
    
    private JPanel panel_menu = new JPanel();
    private JLabel myName = new JLabel("Diego Galvis");
    private JLabel u = new JLabel("Ing Sistemas, EAFIT");
    /*private JButton level1 = new JButton("Nivel 1");
    private JButton level2 = new JButton("Nivel 2");
    private JButton level3 = new JButton("Nivel 3");
*/

    public Menu(){
        setTitle("Menu");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        panel_menu.setBackground(Color.GRAY);
        panel_menu.setSize(800,600);
        panel_menu.setLocation(0,0);
        panel_menu.add(myName);
        panel_menu.add(u);
        Button level1 = new Button("level1");
        Button level2 = new Button("level2");
        Button level3 = new Button("level3");
        
        /*panel_menu.add(level1);
        panel_menu.add(level2);
        panel_menu.add(level3);*/
        
        panel_menu.setBorder(BorderFactory.createEmptyBorder(150, 350, 150, 350));
        BoxLayout boxLayout = new BoxLayout(panel_menu, BoxLayout.Y_AXIS);
        panel_menu.setLayout(boxLayout);
        
        panel_menu.add(level1);
        panel_menu.add(level2);
        panel_menu.add(level3);
        
        add(panel_menu);
        
    }

    
}

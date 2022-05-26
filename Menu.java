import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument.Content;
import java.awt.*;

public class Menu extends JFrame{
    
    private JPanel panel_menu = new JPanel();
    private JLabel myName = new JLabel("Diego Galvis");
    private JLabel u = new JLabel("Ing Sistemas, EAFIT");
    private JButton level1= new JButton("level1");
    private JButton level2 = new JButton("level2");
    private JButton level3 = new JButton("level3");

    public Menu(){
        setTitle("Menu");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        
        panel_menu.setBackground(Color.GRAY);
        panel_menu.setSize(800,600);
        panel_menu.setLocation(0,0);
        
        level1 = style(level1);
        level2 = style(level2);
        level3 = style(level3);

        /*
        level1.addActionListener(this);

        @Override
        public void actionPerformed(ActionEvent e){
            Ventana ventana = new Ventana();
        }*/
        

        panel_menu.setBorder(BorderFactory.createEmptyBorder(150, 300, 150, 300));
        BoxLayout boxLayout = new BoxLayout(panel_menu, BoxLayout.Y_AXIS);
        panel_menu.setLayout(boxLayout);
        panel_menu.add(myName);
        panel_menu.add(u);
        panel_menu.add(level1);
        panel_menu.add(level2);
        panel_menu.add(level3);
        
        add(panel_menu);
        
    }

    public JButton style(JButton a){
        a.setBackground(Color.MAGENTA);
        a.setBorderPainted(false);
        a.setFocusable(false);
        //a.setSize(40, 30);
        return a;
    }

    
}

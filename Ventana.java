import java.awt.Color;
import javax.swing.*;
import java.awt.*;

import java.awt.geom.Ellipse2D;


public class Ventana extends JFrame{
    
    private JPanel panel = new JPanel();

    public Ventana(){
        setTitle("Ventana");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        panel.setBackground(Color.BLACK);
        panel.setSize(800,600);
        panel.setLocation(0,0);
        add(panel);
    }

    @Override
    public void paint(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLUE);
        Shape circleShape = new Ellipse2D.Double(100,100,50,50);
        g2.fill(circleShape);
        g2.draw(circleShape);

    }
}

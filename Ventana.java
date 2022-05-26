import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.lang.Math;
import java.util.Random;
import java.awt.geom.Ellipse2D;


public class Ventana extends JFrame{
    
    private final int maxVelX = 3;
    private final int maxVelY = 3;
    private final int minVelX = 0;
    private final int minVelY = 0;
    private int veloY, veloX;
    private boolean started = false;
    private JPanel panel = new JPanel();

    public Ventana(){
        setTitle("Ventana");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setLocation(270, 220);
        setSize(800, 600);
        panel.setBackground(Color.BLACK);
        panel.setSize(800,600);
        panel.setLocation(0,0);
        add(panel);

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(100.f));
        g2.setPaint(Color.BLUE);
        g2.fillOval(370, 260, 60, 60);
        g
        /*g2.setColor(Color.BLUE);
        Shape circleShape = new Ellipse2D.Double(100,100,50,50);
        g2.fill(circleShape);
        g2.draw(circleShape);
        g2.translate(1000,1000);    */

    }

    public void move(){ 
        if(started == false){
            int velocidadRandX = (int)(Math.random()*(maxVelX+1));
            int velocidadRandY = (int)(Math.random()*(maxVelY+1));
            setVelX(velocidadRandX);
            setVelY(velocidadRandY);
            started = true;
        }
    }


    public void setVelX(int veloX){
        this.veloX = veloX;
    }


    public void setVelY(int veloY){
        this.veloY = veloY;
    }
    
}

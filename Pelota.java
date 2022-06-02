import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Pelota extends Rectangle{
    
    Random rand = new Random();
    public int xVelocity, yVelocity;
    
    private static final int maxVelX = 3;
    private static final int maxVelY = 3;
    private static final int minVelX = 1;
    private static final int minVelY = 1;

    public Pelota(int x, int y, int width, int height){
        super(x, y, width, height);
        int randomNumX = rand.nextInt(2);
        if(randomNumX == 0){
            randomNumX--;
        }
        setDirecX(randomNumX);

        int randomNumY = rand.nextInt(2);
        if(randomNumX == 0){
            randomNumY--;
        }
        setDirecY(randomNumY);

    }

    public void setDirecY(int randomInt){
        this.yVelocity = randomInt;
    }

    public void setDirecX(int randomInt){
        this.xVelocity = randomInt;
    }

    public void move(){
        x += xVelocity;
        y += yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, width, height);
    }
    
}

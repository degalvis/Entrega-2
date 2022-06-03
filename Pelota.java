import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Pelota extends Rectangle{
    
    private Random rand;
    public int xVelocity = 1, yVelocity = 1;
    public int xPosition = 350, yPosition = 240;
    
    public static final int MAX_VEL = 3;
    public static final int MIN_VEL = 1;


    public Pelota(int x, int y, int width, int height){
        super(x, y, width, height);
        rand = new Random();
        int randomNumX = rand.nextInt(2);

        if(randomNumX == 0){
            xVelocity*=-1;
        }
        //setDirecX(randomNumX);

        int randomNumY = rand.nextInt(2);
        if(randomNumY == 0){
            yVelocity *= -1;
        }
        //setDirecY(randomNumY);
    }

    public void setDirecY(int randomInt){
        //this.yVelocity = randomInt;
        /*if(randomInt == 0)
            yVelocity = -yVelocity;
    */}

    public void setDirecX(int randomInt){
        //this.xVelocity = randomInt;
        /*if(randomInt == 0)
            xVelocity = -xVelocity;
*/
    }

    public void move(){
        xPosition += xVelocity;
        yPosition += yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(xPosition, yPosition, width, height);
    }

}

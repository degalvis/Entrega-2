import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class Panel extends JPanel implements Runnable{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int DIAMETER = 40;

    
    private Pelota pelota;
    private Image image;
    private Graphics graphics;
    private Thread Gamethread;
    private Random random;

    public Panel(){
        createBall();
        setSize(WIDTH, HEIGHT);
        setLocation(0,0);

        Gamethread = new Thread(this);
        Gamethread.start();
    }

    public void createBall(){
        random = new Random();
        pelota = new Pelota((WIDTH/2)-(DIAMETER/2),(HEIGHT/2)-(DIAMETER/2), DIAMETER,DIAMETER);
    }

    public void move(){
        pelota.move();
    }

    public void paint(Graphics g){
        image = createImage(getWidth(), getHeight());
        graphics = image.getGraphics();
        draw(graphics);
        g.drawImage(image, 0, 0, this);
    }

    public void draw(Graphics g){
        pelota.draw(g);
    }

    public void collision(){
        if(pelota.y <=0) {
			pelota.setDirecY(-pelota.yVelocity);
		}
		if(pelota.y >= HEIGHT-DIAMETER) {
			pelota.setDirecY(-pelota.yVelocity);
		}

        if(pelota.x <=0) {
			pelota.setDirecX(-pelota.xVelocity);
		}
		if(pelota.x >= WIDTH-DIAMETER) {
			pelota.setDirecX(-pelota.xVelocity);
		}

    }

    public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks =100.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now -lastTime)/ns;
			lastTime = now;
			if(delta >=1) {
				move();
                collision();
				repaint();
				delta--;
			}
		}
        
	}
}

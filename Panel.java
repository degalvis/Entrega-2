import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Panel extends JPanel implements Runnable{
    private boolean cerrar = false;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int DIAMETER = 40;
    private Pelota pelota;
    private Image image;
    private Graphics graphics;
    private Thread Gamethread;
    private KeyListeners listener;

    
    public Panel(){
        createBall();
        setSize(WIDTH, HEIGHT);
        setLocation(0,0);
        setFocusable(true);
        listener = new KeyListeners();

        Gamethread = new Thread(this);
        Gamethread.start();

        addKeyListener(listener);
    }

    public void createBall(){
        pelota = new Pelota((WIDTH/2)-(DIAMETER/2),(HEIGHT/2)-(DIAMETER/2), DIAMETER,DIAMETER);
    }

    public void move(){
        pelota.move();
        update();
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
        if(pelota.yPosition <= 0) 
            pelota.yVelocity *= -1;
		
		if(pelota.yPosition >= HEIGHT-DIAMETER) 
            pelota.yVelocity *= -1;


        if(pelota.xPosition <=0) 
            pelota.xVelocity *= -1;

		
		if(pelota.xPosition >= WIDTH-DIAMETER) 
            pelota.xVelocity *= -1;
    }

    public void update(){
        if(listener.getUp() == true){
            if(pelota.yVelocity < pelota.MAX_VEL){
                pelota.yVelocity -= 1;
            }
        }
        if(listener.getDown()== true){
            if(pelota.yVelocity > pelota.MIN_VEL){
                pelota.yVelocity += 1;
            }
        }
        if(listener.getForwards() == true){
            if(pelota.yVelocity < pelota.MAX_VEL){
                pelota.xVelocity -= 1;
            }
        }
        if(listener.getBackwards() == true){
            if(pelota.yVelocity > pelota.MIN_VEL){
                pelota.xVelocity += 1;
            }
        }
    }

    public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks =30.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now -lastTime)/ns;
			lastTime = now;
			if(delta >=1) {
                if(listener.pPressed() == false){
                    move();
                }
                collision();
				repaint();
				delta--;
			}
		}
	}
}

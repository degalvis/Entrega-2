import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListeners implements KeyListener{
    private boolean upPressed, downPressed, forwardPressed, backwardPressed, pPressed;
    
    public boolean getUp(){
        return upPressed;
    }

    public boolean getDown(){
        return downPressed;

    }
    public boolean getForwards(){
        return forwardPressed;

    }
    public boolean getBackwards(){
        return backwardPressed;

    }
    public boolean pPressed(){
        return pPressed;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_UP)
            upPressed = true;

        if(code == KeyEvent.VK_DOWN)
            downPressed = true;
        
        if(code == KeyEvent.VK_RIGHT)   
            forwardPressed = true;
        
        if(code == KeyEvent.VK_LEFT)
            backwardPressed = true;
        
        if(code == KeyEvent.VK_P)
            pPressed = true;        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        
        if(code == KeyEvent.VK_UP)
            upPressed = false;

        if(code == KeyEvent.VK_DOWN)
            downPressed = false;
        
        if(code == KeyEvent.VK_RIGHT)   
            forwardPressed = false;
        
        if(code == KeyEvent.VK_LEFT)
            backwardPressed = false;
            
        if(code == KeyEvent.VK_P)
            pPressed = false;
                
    }

}
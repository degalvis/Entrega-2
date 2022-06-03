import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListeners implements KeyListener{
    private boolean upPressed, downPressed, forwardPressed, backwardPressed, rPressed, qPressed;
    
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
    public boolean r(){
        return rPressed;
    }

    public boolean q(){
        return qPressed;
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
            
        if(code == KeyEvent.VK_R)
            rPressed = true;
         
        if(code == KeyEvent.VK_Q)
            qPressed = true;
             
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
            
        if(code == KeyEvent.VK_R)
            rPressed = false;
         
        if(code == KeyEvent.VK_Q)
            qPressed = false;
           
    }

}
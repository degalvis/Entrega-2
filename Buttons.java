import javax.swing.*;
import java.awt.*;

public class Buttons{
    
    public Buttons(String title){
        JButton button = new JButton(title);
        button.setBackground(Color.MAGENTA);
        button.setBorderPainted(false);
        button.setFocusable(false);
        
    }

}

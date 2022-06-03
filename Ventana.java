import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{


    private Panel panel;

    public Ventana(){
        panel = new Panel();
        setTitle("Ventana");
        setVisible(true);
        setLayout(null);
        setResizable(false);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(panel);
 
    }

    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        Thread.sleep(2000);
        menu.dispose();
        Ventana ventana = new Ventana();


    }
    
}

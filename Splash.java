package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Splash extends JFrame {

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("front.gif"));
        Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1170, 650);
        add(image);
        setSize(1170, 650);
        setLocation(200,50); // Center the window on the screen
        setLayout(null);
        setVisible(true);

        try {
            Thread.sleep(6000);
            setVisible(false);
            new Login(); // Assuming Login is a class that shows the login screen
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();

    }
}
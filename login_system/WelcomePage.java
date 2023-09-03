import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame("Welcome Page");
    JLabel welcomeLabel = new JLabel("Welcome");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.BOLD, 25));
        welcomeLabel.setText("Hello " + userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
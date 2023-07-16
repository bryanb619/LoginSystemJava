/*

Login system where all login information is stored in a hashmap
and handled by the LoginSystem class.
 */
// BUTTONS & FRAME
import javax.swing.*;
// listener for events
import java.awt.*;
import java.awt.event.ActionEvent;
// listener for key events
import java.awt.event.ActionListener;
// hashmap
import java.util.HashMap;

public class LoginSystem implements ActionListener {

    // create frame
    JFrame frame = new JFrame();

    // Login button
    JButton loginBtn = new JButton("Login");
    // Reset button
    JButton resetBtn = new JButton("Reset");

    // user ID Input
    JTextField userIDField = new JTextField();
    // user Password Input
    JPasswordField userPasswordField = new JPasswordField();

    // label for text fields
    // ID label
    JLabel userIDLabel = new JLabel("user ID:");
    // password label
    JLabel userPasswordLabel = new JLabel("Enter password:");
    // Failed login label
    JLabel messageLabel = new JLabel();


    HashMap<String, String> logininfo = new HashMap<String, String>();
    // provide login info


    LoginSystem(HashMap<String, String> loginInfoOriginal) {

        logininfo = loginInfoOriginal;

        // labels in login window
        LoginWindowLabels();

        // Window standard configuration
        WindowConfig();
    }


    private void LoginWindowLabels(){

        // set size and transform
        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        // set font
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        // add labels to window(frame)
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);

    }


    // Window standard configuration method
    private void WindowConfig() {

        // make app closeable by pressing the X button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set size of frame
        frame.setSize(420, 420);
        // all work is done by hand
        frame.setLayout(null);
        // frame is set to visible
        frame.setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {


    }



}





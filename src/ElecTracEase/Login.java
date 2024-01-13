package ElecTracEase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField userText,passwordText;
    Choice loginChoice;

    JButton loginButton,cancelButton,signupButton;

    Login(){
        super("Login"); //Title

        getContentPane().setBackground(Color.white); //Background Color

        //Username Label
        JLabel username = new JLabel("UserName");
        username.setBounds(300,60,100,20);
        add(username);

        //Username Name Text
        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        //Password Label
        JLabel password = new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        //Password Input
        passwordText = new JTextField();
        passwordText.setBounds(400,100,150,20);
        add(passwordText);

        //Login Choice Label
        JLabel loggin = new JLabel("Log In As");
        loggin.setBounds(300,140,100,20);
        add(loggin);

        //Login Type
        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,150,20);
        add(loginChoice);

        //Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(330,180,100,20);
        loginButton.addActionListener(this);
        add(loginButton);

        //Cancel Button
        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(460,180,100,20);
        cancelButton.addActionListener(this);
        add(cancelButton);

        //Login Page Image
        ImageIcon profileOne =  new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTwo);
        JLabel profileLabel = new JLabel(fprofileOne);
        profileLabel.setBounds(5,5,250,250);
        add(profileLabel);

        //Signup Button
        signupButton = new JButton("Signup");
        signupButton.setBounds(400,215,100,20);
        signupButton.addActionListener(this);
        add(signupButton);

        setSize(640,300);
        setLocation(300,200);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Login();
    }
}

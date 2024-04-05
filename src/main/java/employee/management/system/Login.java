package employee.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {

    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40,70,100,30);
        add(lblpassword);

        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(150,70,150,30);
        add(tfpassword);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        add(login);

        ImageIcon imgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image img = imgIcon.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon imgIcon1 = new ImageIcon(img);
        JLabel image = new JLabel(imgIcon1);
        image.setBounds(350,0,200,200);
        add(image);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new Login();
    }
}

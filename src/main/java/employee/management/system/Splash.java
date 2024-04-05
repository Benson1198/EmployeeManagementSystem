package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {

    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

//        Adding Heading to the main screen
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200,60);
        heading.setFont(new Font("serif", Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);

        ImageIcon imgIcon = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image img = imgIcon.getImage().getScaledInstance(1100,700, Image.SCALE_DEFAULT);
        ImageIcon imgIcon1 = new ImageIcon(img);
        JLabel image = new JLabel(imgIcon1);
        image.setBounds(50,100,1050,500);
        add(image);

        JButton clickHere = new JButton("CLICK HERE TO CONTINUE");
        clickHere.setBounds(400, 400, 300, 60);
        clickHere.setBackground(Color.black);
        clickHere.setForeground(Color.WHITE);
        clickHere.addActionListener(this);
        image.add(clickHere);

        setSize(1170, 650);
        setLocation(200,50);
        setVisible(true);

        while(true){
            heading.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){
            }

            heading.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){
            }
        }
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }

    public static void main(String[] args){
        new Splash();
    }
}

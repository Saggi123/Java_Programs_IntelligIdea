import javax.swing.*;
import java.awt.*;

public class FirstGUI {
        public FirstGUI()
        {
            JTextField text1=new JTextField(20);
            text1.setBounds(100,20,165,25);
            JTextField text2=new JTextField(20);
            text2.setBounds(100,70,100,10);
            JLabel label1=new JLabel("User Name");
            JLabel label2=new JLabel("Password");
            label2.setBounds(10,70,60,10);
            label1.setBounds(10,20,80,25);
            JFrame frame=new JFrame();
            JPanel panel =new JPanel();
            JButton button=new JButton("LOGIN");
            button.setBounds(10,110,20,20);
            panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,20));
            panel.setLayout(new GridLayout(0,2));
            panel.add(label1);
            panel.add(text1);
            panel.add(label2);
            panel.add(text2);
            panel.add(button);
            frame.add(panel);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("First GUI");
            frame.pack();
            frame.setVisible(true);

        }
        public static void main(String args[])
        {
          new FirstGUI();
        }
    }

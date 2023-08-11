import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NextPage extends JFrame// JFrame available in Swing Package,creates a container
{
    NextPage()
    {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setSize(400,200);
    }
}
class Login extends JFrame implements ActionListener
{
    JButton SUBMIT;//JButton is a class anything that starts with J it is swing and without J it is awt
    JPanel panel;
    JLabel label1,label2;
    final JTextField text1 ,text2;

    Login()
    {
        label1=new JLabel();
        label1.setText("UserName");
        text1=new JTextField(15);
        label2=new JLabel();
        label2.setText("Password");
        text2=new JTextField(15);
        SUBMIT= new JButton("SUBMIT");


        panel=new JPanel(new FlowLayout());
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(SUBMIT);
        add(panel,BorderLayout.CENTER);
        SUBMIT.addActionListener(this);
        setTitle("LOGIN FORM");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String value1=text1.getText();
        String value2=text2.getText();
        if(value1.equals("christ") && value2.equals("aaa")) {
            NextPage page = new NextPage();
            page.setVisible(true);
            JLabel label = new JLabel("Welcome" + value1);
            page.getContentPane().add(label);
        }
        else {
            System.out.println("Enter The valid username and password");
            JOptionPane.showMessageDialog(this,"Incorrect Login or Password","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
public class GUI {
    public static void main(String arg[])
    {
        try
        {
            Login frame=new Login();
            frame.setSize(300,100);
            frame.setVisible(true);
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}

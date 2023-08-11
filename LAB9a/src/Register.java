
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Register extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 851, 497);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 10, 827, 440);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Register");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblNewLabel_1.setForeground(SystemColor.desktop);
        lblNewLabel_1.setBounds(337, 28, 150, 45);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("User Name:");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(191, 106, 123, 54);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Password:");
        lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_2_1.setBounds(191, 189, 111, 54);
        panel.add(lblNewLabel_2_1);

        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        textArea.setBounds(321, 106, 294, 54);
        panel.add(textArea);

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 20));
        textArea_1.setBackground(SystemColor.window);
        textArea_1.setBounds(321, 189, 294, 54);
        panel.add(textArea_1);

        JButton btnNewButton = new JButton("Register");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBounds(340, 326, 147, 45);
        panel.add(btnNewButton);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(new Color(222, 184, 135));
        lblNewLabel.setBounds(10, -23, 830, 475);
        panel.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\Downloads\\childhood-cancer-awareness-month-background-concept (2).jpg"));

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=textArea.getText();
                String password=textArea_1.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo",
                            "root", "sagnik" +
                                    "");
                    PreparedStatement st1=(PreparedStatement) connection.prepareStatement("Select username,password from user where username=? and password=?");
                    st1.setString(1,username);
                    st1.setString(2,password);
                    ResultSet rs=st1.executeQuery();
                    if(rs.next())
                    {
                        JOptionPane.showMessageDialog(btnNewButton,"User already exists");

                    }
                    else {
                        PreparedStatement st = (PreparedStatement) connection.prepareStatement("Insert into user values(?,?)");
                        st.setString(1, username);
                        st.setString(2, password);
                        st.executeUpdate();
                        JOptionPane.showMessageDialog(btnNewButton,"User Added to Database");
                    }
                }

                catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

    }

}




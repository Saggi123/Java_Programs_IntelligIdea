import javax.swing.*;
import java.awt.*;

public class Resume
{
    private JPanel panel1;
    private JLabel Resume;

    public Resume()
    {
        JFrame frame=new JFrame();
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension screensize=tk.getScreenSize();
        frame.setSize(screensize.width,screensize.height);
        frame.setTitle("My Resume");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=frame.getContentPane();
        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,1000,150);
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createMatteBorder(
                3, 3, 3, 3, Color.black));
        panel1.setLayout(null);
        JLabel label1=new JLabel("Sagnik Mukhopadhyay");
        label1.setForeground(Color.black);
        label1.setFont(new Font("Times New Roman",Font.BOLD,20));
        label1.setBounds(15,1,210,80);
        panel1.add(label1);
        JLabel label2=new JLabel("sag.muk200800@gmail.com , " +"9073891499");
        label2.setForeground(Color.black);
        label2.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label2.setBounds(15,81,300,15);
        panel1.add(label2);
        JLabel label3=new JLabel("Address:");
        label3.setFont(new Font("Times New Roamn",Font.BOLD,20));
        label3.setBounds(800,1,100,40);
        panel1.add(label3);
        JLabel label4=new JLabel("24/18 Madox Square");
        label4.setFont(new Font("Times New Roman",Font.ITALIC,18));
        label4.setBounds(802,41,170,30);
        label4.setForeground(Color.DARK_GRAY);
        panel1.add(label4);
        JLabel label5=new JLabel("Kolkata West Bengal");
        label5.setFont(new Font("Times New Roaman",Font.ITALIC,18));
        label5.setBounds(802,72,190,30);
        label5.setForeground(Color.DARK_GRAY);
        panel1.add(label5);
        frame.add(panel1);
        JPanel panel2=new JPanel();
        panel2.setBounds(0,150,400,1305);
        panel2.setBackground(Color.red);
        panel2.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));
        panel2.setBackground(Color.WHITE);
        panel2.setLayout(null);
        JLabel label6=new JLabel("Education:");
        label6.setFont(new Font("Times New Roman",Font.BOLD,20));
        label6.setForeground(Color.BLACK);
        label6.setBounds(10,50,100,20);
        panel2.add(label6);
        JLabel label7=new JLabel("Skills:");
        label7.setFont(new Font("Times New Roman",Font.BOLD,20));
        label7.setForeground(Color.BLACK);
        label7.setBounds(10,160,100,50);
        panel2.add(label7);
        JLabel label8=new JLabel("Projects Completed :");
        label8.setFont(new Font("Times New Roman",Font.BOLD,20));
        label8.setForeground(Color.BLACK);
        label8.setBounds(10,295,200,50);
        panel2.add(label8);
        JLabel label9=new JLabel("Internships :");
        label9.setFont(new Font("Times New Roman",Font.BOLD,20));
        label9.setForeground(Color.BLACK);
        label9.setBounds(10,440,130,50);
        panel2.add(label9);
        JLabel label10=new JLabel("Hobbies :");
        label10.setFont(new Font("Times New Roman",Font.BOLD,20));
        label10.setForeground(Color.black);
        label10.setBounds(10,570,100,30);
        panel2.add(label10);
        JPanel panel3=new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.WHITE);
        panel3.setBounds(401,151,600,1300);
        panel3.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));
        frame.add(panel2);
        frame.add(panel3);
        JLabel label11=new JLabel("Ram Mohan Mission High School(ICSE and ISC)");
        label11.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label11.setForeground(Color.DARK_GRAY);
        label11.setBounds(7,40,350,20);
        panel3.add(label11);
        JLabel label12=new JLabel("St. Xavier's College Park Street (Bsc. in Computer Science)");
        label12.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label12.setForeground(Color.DARK_GRAY);
        label12.setBounds(7,65,450,20);
        panel3.add(label12);
        JLabel label13=new JLabel("Christ University Bangalore (MCA)");
        label13.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label13.setForeground(Color.DARK_GRAY);
        label13.setBounds(7,90,300,20);
        panel3.add(label13);
        JLabel label14=new JLabel("C Programming Language");
        label14.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label14.setForeground(Color.DARK_GRAY);
        label14.setBounds(7,170,300,20);
        panel3.add(label14);
        JLabel label15=new JLabel("Database Management System(SQL)");
        label15.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label15.setForeground(Color.DARK_GRAY);
        label15.setBounds(7,195,300,20);
        panel3.add(label15);
        JLabel label16=new JLabel("JAVA Programming Language");
        label16.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label16.setForeground(Color.DARK_GRAY);
        label16.setBounds(7,220,300,20);
        panel3.add(label16);
        JLabel label17=new JLabel("Microsoft excel");
        label17.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label17.setForeground(Color.DARK_GRAY);
        label17.setBounds(7,245,300,20);
        panel3.add(label17);
        JLabel label18=new JLabel("Algorithm Visualizer(To visualize sorting and merging algorithms)");
        label18.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label18.setForeground(Color.DARK_GRAY);
        label18.setBounds(7,310,500,20);
        panel3.add(label18);
        JLabel label19=new JLabel("Resume Builder(Build Your Own Custom Resume))");
        label19.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label19.setForeground(Color.DARK_GRAY);
        label19.setBounds(7,335,400,20);
        panel3.add(label19);
        JLabel label20=new JLabel("Auto Authority(Road transport management system)");
        label20.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label20.setForeground(Color.DARK_GRAY);
        label20.setBounds(7,360,500,20);
        panel3.add(label20);
        JLabel label21=new JLabel(  " HCLTech");
        label21.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label21.setForeground(Color.DARK_GRAY);
        label21.setBounds(7,450,500,20);
        panel3.add(label21);
        JLabel label23=new JLabel("JPMorgan chase and Co");
        label23.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label23.setForeground(Color.DARK_GRAY);
        label23.setBounds(7,475,500,20);
        panel3.add(label23);
        JLabel label24=new JLabel("Lets transport Pvt Ltd");
        label24.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label24.setForeground(Color.DARK_GRAY);
        label24.setBounds(7,500,500,20);
        panel3.add(label24);
        JLabel label25=new JLabel("Reading Books");
        label25.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label25.setForeground(Color.DARK_GRAY);
        label25.setBounds(7,570,500,20);
        panel3.add(label25);
        JLabel label26=new JLabel("Current Affairs");
        label26.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label26.setForeground(Color.DARK_GRAY);
        label26.setBounds(7,595,500,20);
        panel3.add(label26);
        JLabel label27=new JLabel("Travelling");
        label27.setFont(new Font("Times New Roman",Font.ITALIC,16));
        label27.setForeground(Color.DARK_GRAY);
        label27.setBounds(7,620,500,20);
        panel3.add(label27);














        JPanel panel4=new JPanel();
        panel4.setBounds(1220,50,200,1300);
        panel4.setBackground(Color.WHITE);
        frame.add(panel4);
    }

    public static void main(String[] args) {
        new Resume();
    }
}

/*import javax.swing.*;
import java.awt.*;

public class Resume {
    private JPanel panel1;

    public Resume() {
        JFrame frame = new JFrame();
        frame.setTitle("My Resume");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel1 with FlowLayout
        panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        panel1.setBorder(BorderFactory.createMatteBorder(
                3, 3, 3, 3, Color.black));

        // Add name label with line break
        JLabel nameLabel = new JLabel("<html>Sagnik Mukhopadhyay<br></html>");
        nameLabel.setForeground(Color.black);
        nameLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        nameLabel.setBounds(1,1,150,50);
        panel1.add(nameLabel);

        // Add contact label
        JLabel contactLabel = new JLabel("sag.muk200800@gmail.com , " +"9073891499");
        contactLabel.setForeground(Color.black);
        contactLabel.setFont(new Font("Times New Roman", Font.ITALIC, 16));
        contactLabel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        panel1.add(contactLabel);

        // Add address label
        JLabel addressLabel = new JLabel("Kolkata WestBengal");
        addressLabel.setForeground(Color.black);
        addressLabel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        panel1.add(addressLabel);

        // Set horizontal alignment to LEFT
        panel1.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Add panel1 to frame's content pane
        frame.getContentPane().add(panel1, BorderLayout.NORTH);

        // Create panel2
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);

        // Set frame properties and show
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main(String[] args) {
        new Resume();
    }
}*/

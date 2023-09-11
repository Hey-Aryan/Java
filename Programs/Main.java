import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
class Main {
    public static void main(String[] args) {
        JFrame f=new JFrame("Vishwakarma Institue of Technology");
        JLabel l1=new JLabel("Name");
        l1.setBounds(100,100,80,30);
        JLabel l2=new JLabel("Roll number");
        l2.setBounds(100,150,80,30);
        JLabel l3=new JLabel("Branch");
        l3.setBounds(100,200,80,30);
        JLabel l4=new JLabel("PRN number");
        l4.setBounds(90,250,200,30);
        JLabel l5=new JLabel("Year");
        l5.setBounds(100,300,80,30);
        JTextField t1=new JTextField();
        t1.setBounds(200,100,100,30);
        JTextField t2=new JTextField();
        t2.setBounds(200,150,100,30);
        JTextField t3=new JTextField();
        t3.setBounds(200,250,100,30);
        JTextField t4=new JTextField();
        t4.setBounds(200,300,100,30);
        String branch[]={"Computer","IT","Mechanical","Chemical","Production","ENTC","AIDS"};
        JComboBox c1=new JComboBox<>(branch);
        c1.setBounds(200,200,100,30);
        JButton b = new JButton("Submit");
        b.setBounds(200,400,100,30);
        JPanel p=new JPanel();
        p.setBounds(200,300,100,30);

        f.add(t4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(p);

        f.add(c1);
        f.add(b);
        f.setLayout(null);
        f.setSize(500,500);
        f.setVisible(true);


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e1) {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa41","root","Ary@n000");
                    Statement st = c.createStatement();


                    String name=t1.getText();
                    String rollno=t2.getText();
                    String branch=(String) c1.getSelectedItem();
                    String prn=t3.getText();
                    String year=t4.getText();
                    String querry=String.format("INSERT INTO Lab6 VALUES('%s','%s','%s','%s','%s')",name,rollno,branch,prn,year);
                    st.executeUpdate(querry);
                    System.out.println("Querry Executed");
                } catch (ClassNotFoundException | SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        });


    }
}
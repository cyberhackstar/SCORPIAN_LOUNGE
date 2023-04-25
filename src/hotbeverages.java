
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class hotbeverages extends javax.swing.JFrame {


    public hotbeverages() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        c5 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        j2 = new javax.swing.JTextField();
        j1 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setSize(1500,1000);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setText("Add To Cart");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton1.setBounds(250, 210, -1, -1);
        panel.add(jButton1);

        c5.setBackground(new java.awt.Color(255, 255, 255));
        c5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c5.setText("CAFE BRULOT");
        c5.setOpaque(false);
        c5.setBounds(100, 150, 190, -1);

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c4.setText("CAFE LATTE");
        c4.setOpaque(false);
        c4.setBounds(100, 120, 130, -1);
        panel.add(c4);

        c3.setBackground(new java.awt.Color(255, 255, 255));
        c3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c3.setText("CAFE MOULU");
        c3.setOpaque(false);
        c3.setBounds(100, 90, 150, -1);
        panel.add(c3);

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c2.setText("ESPRESSO");
        c2.setOpaque(false);
        c2.setBounds(100, 60, 170, -1);
        panel.add(c2);

        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c1.setText("RESTRETO");
        c1.setOpaque(false);

        c1.setBounds(100, 30, 170, -1);
        panel.add(c1);

        j2.setText("0");
        j2.setBounds(460, 70, 50, -1);
        panel.add(j2);

        j1.setText("0");
        j1.setBounds(461, 41, 50, 30);
        panel.add(j1);

        j3.setText("0");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        j3.setBounds(460, 100, 50, -1);
        panel.add(j3);

        j4.setText("0");
        j4.setBounds(460, 130, 50, -1);
        panel.add(j4);

        j5.setText("0");
        j5.setBounds(460, 160, 50, -1);
        panel.add(j5);

        j6.setEditable(false);
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        j6.setBounds(440, 250, 70, -1);
        panel.add(j6);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setText("QTY");
        jLabel2.setBounds(470, 10, 50, 20);
        panel.add(jLabel2);

        jButton4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton4.setText("Generate Bill");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(330, 320, 170, 70);
        panel.add(jButton4);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setText("Total amount");
        jLabel3.setBounds(130, 260, -1, -1);
        panel.add(jLabel3);

        jButton5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton5.setText("Hookah");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(150, 320, 170, -1);
        panel.add(jButton5);

        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setText("beers");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(150, 360, 170, -1);
        panel.add(jButton2);

        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setText("SOFT DRINKS");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(150, 400, 170, -1);
        panel.add(jButton3);

        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setText("menu");
        jButton6.setOpaque(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(330, 400, 170, -1);
        panel.add(jButton6);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\china-coffee-cup.jpg")); // NOI18N
        jLabel1.setBounds(0, 0, 680, 440);
        panel.add(jLabel1);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int item=0;
        String cat="Hotbeverages";
        int q1=0,q2=0,q3=0,q4=0,q5=0,amt1=0,amt2=0,amt3=0,amt4=0,amt5=0;
        double total=0.0;
        q1=Integer.parseInt(j1.getText());
        q2=Integer.parseInt(j2.getText());
        q3=Integer.parseInt(j3.getText());
        q4=Integer.parseInt(j4.getText());
        q5=Integer.parseInt(j5.getText());

        if(c2.isSelected())
            amt2=q2*120;
        if(c1.isSelected())
            amt1=q1*120;
        if(c3.isSelected())
            amt3=q3*120;
        if(c4.isSelected())
            amt4=q4*140;
        if(c5.isSelected())
            amt5=q5*250;

        total=amt1+amt2+amt3+amt4+amt5;
        j6.setText(" "+total);
        if(c1.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Restreto";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q1+"',"+amt1+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Restreto added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(c2.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Espresso";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q2+"',"+amt2+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Espresso added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(c3.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Cafe Moulu";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q3+"',"+amt3+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Cafe Moulu added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        if(c4.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Cafe Latte";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q4+"',"+amt4+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Cafe Latte added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }

        if(c5.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Cafe Brulot";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q5+"',"+amt5+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Cafe Brulot added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        // TODO add your handling code here:
    }

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        finalbill f=new finalbill();
        f.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        hukka f=new hukka();
        f.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        beers f=new beers();
        f.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        softdrink f=new softdrink();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        menu f=new menu();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hotbeverages().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JTextField j1;
    private javax.swing.JTextField j2;
    private javax.swing.JTextField j3;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration
}

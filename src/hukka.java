
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;


public class hukka extends JFrame {

    /**
     * Creates new form hukka
     */
    public hukka() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        c1 = new javax.swing.JRadioButton();
        c2 = new javax.swing.JRadioButton();
        c3 = new javax.swing.JRadioButton();
        c4 = new javax.swing.JRadioButton();
        c5 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        j3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setSize(1500,1000);
        JPanel panel = new JPanel();
        panel.setLayout(null);

        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setText("menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(480, 400, 170, -1);
        panel.add(jButton6);

        jButton4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton4.setText("Generate Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(480, 330, -1, 60);
        panel.add(jButton4);

        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setText("soft drinks");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(80, 320, 170, -1);
        panel.add(jButton2);

        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setText("hot beverages");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(80, 360, -1, -1);
        panel.add(jButton3);

        jButton7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton7.setText("Beers");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.setBounds(80, 400, 170, -1);
        panel.add(jButton7);

        buttonGroup1.add(c1);
        c1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c1.setText("Commisinor");
        c1.setOpaque(false);
        c1.setBounds(430, 40, -1, -1);
        panel.add(c1);

        buttonGroup1.add(c2);
        c2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c2.setText("paan");
        c2.setOpaque(false);
        c2.setBounds(430, 70, -1, -1);
        panel.add(c2);

        buttonGroup1.add(c3);
        c3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c3.setText("Titanic");
        c3.setOpaque(false);
        c3.setBounds(430, 100, -1, -1);
        panel.add(c3);

        buttonGroup1.add(c4);
        c4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c4.setText("dragon");
        c4.setOpaque(false);
        c4.setBounds(430, 130, -1, -1);
        panel.add(c4);

        buttonGroup1.add(c5);
        c5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c5.setText("rdx 11");
        c5.setOpaque(false);
        c5.setBounds(430, 160, -1, -1);
        panel.add(c5);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setText("Total amount");
        jLabel3.setBounds(350, 270, 150, 30);
        panel.add(jLabel3);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setOpaque(true);
        jLabel11.setBounds(210, 280, 30, 20);
        panel.add(jLabel11);

        j3.setEditable(false);
        j3.setBounds(530, 270, 92, 40);
        panel.add(j3);

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(410, 210, -1, -1);
        panel.add(jButton1);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setOpaque(true);
        jLabel8.setBounds(190, 290, 50, 30);
        panel.add(jLabel8);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setOpaque(true);
        jLabel7.setBounds(310, 160, 40, 30);
        panel.add(jLabel7);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setOpaque(true);
        jLabel10.setBounds(0, 300, 80, 130);
        panel.add(jLabel10);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setOpaque(true);
        jLabel6.setBounds(280, 180, 60, 40);
        panel.add(jLabel6);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setOpaque(true);
        jLabel13.setBounds(0, 210, 70, 90);
        panel.add(jLabel13);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setOpaque(true);
        jLabel5.setBounds(220, 210, 120, 120);
        panel.add(jLabel5);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\image_172f2e2b-bf68-4fca-81ad-59151ae3ca67.jpg")); // NOI18N
        jLabel1.setBounds(0, -10, -1, 350);
        panel.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\bhau.jpg")); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.setBounds(270, 280, 330, 160);
        panel.add(jLabel2);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setOpaque(true);
        jLabel12.setBounds(320, 0, 340, 430);
        panel.add(jLabel12);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setBounds(0, 320, 320, 120);
        panel.add(jLabel4);
        getContentPane().add(panel);
        setVisible(true);
        pack();
    }// </editor-fold>

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        finalbill f=new finalbill();
        f.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        softdrink f=new softdrink();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        hotbeverages f=new hotbeverages();
        f.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        beers f=new beers();
        f.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        int item=0;
        String cat="Hookah";
        int q=1,amt=0;
        double total=0.0;

        if(c2.isSelected())
            amt=q*600;
        else if(c1.isSelected())
            amt=q*500;
        else  if(c3.isSelected())
            amt=q*700;
        else  if(c4.isSelected())
            amt=q*800;
        else if(c5.isSelected())
            amt=q*900;
        total=amt;
        j3.setText(" "+total);
        if(c1.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Commissioner";

                sql="insert into menu values('"+cat+"','"+scat+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Commissioner added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else  if(c2.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String sct="Paan";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Paan added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else if(c3.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String sct="Titanic";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Titanic added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else if(c4.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String sct="Dragon";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Dragon added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        else if(c5.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String sct="Rdx 11";

                sql="insert into menu values('"+cat+"','"+sct+"',"+q+","+amt+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Rdx 11 added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        menu f=new menu();
        f.setVisible(true);
        this.dispose();   // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hukka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hukka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton c1;
    private javax.swing.JRadioButton c2;
    private javax.swing.JRadioButton c3;
    private javax.swing.JRadioButton c4;
    private javax.swing.JRadioButton c5;
    private javax.swing.JTextField j3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration
}
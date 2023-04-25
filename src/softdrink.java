
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;


public class softdrink extends javax.swing.JFrame {
    
    public softdrink() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        j6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\chilled-cold-drink-500x500.jpg")); // NOI18N
        jLabel2.setOpaque(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        JPanel panel = new JPanel();
        panel.setLayout(null);
        setSize(1500,100);

        j1.setText("0");
        j1.setBounds(460, 40, 50, 30);
        panel.add(j1);

        j2.setText("0");
        j2.setBounds(460, 70, 50, -1);
        panel.add(j2);

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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setText("Add To Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(330, 210, -1, -1);
        panel.add(jButton1);

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setText("Total amt");
        jLabel3.setBounds(234, 274, -1, -1);
        panel.add(jLabel3);

        j6.setEditable(false);
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        j6.setBounds(471, 274, 92, -1);
        panel.add(j6);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setText("beers");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(220, 350, 170, -1);
        panel.add(jButton2);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setText("menu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(400, 390, 170, -1);
        panel.add(jButton6);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setText("hotbeverages");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(220, 390, 170, -1);
        panel.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton4.setText("Generate Bill");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(400, 310, -1, 70);
        panel.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton5.setText("Hookah");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(220, 310, 170, -1);
        panel.add(jButton5);

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setText("QTY");
        jLabel5.setBounds(470, 10, 50, -1);
        panel.add(jButton5);

        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c1.setText("Redbull");
        c1.setOpaque(false);
        c1.setBounds(260, 40, 170, -1);
        panel.add(c1);

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c2.setText("Orangina");
        c2.setOpaque(false);
        c2.setBounds(260, 70, 170, -1);
        panel.add(c2);

        c3.setBackground(new java.awt.Color(255, 255, 255));
        c3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c3.setText("Ginger Ale");
        c3.setOpaque(false);
        c3.setBounds(260, 100, 130, -1);
        panel.add(c3);

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c4.setText("Iced Tea");
        c4.setOpaque(false);
        c4.setBounds(260, 130, 130, -1);
        panel.add(c4);

        c5.setBackground(new java.awt.Color(255, 255, 255));
        c5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        c5.setText("Sparkling Water");
        c5.setOpaque(false);
        c5.setBounds(260, 160, 190, -1);
        panel.add(c5);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\chilled-cold-drink-500x500.jpg")); // NOI18N
        jLabel1.setBounds(-120, -10, 550, 460);
        panel.add(jLabel1);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setOpaque(true);
        jLabel4.setBounds(370, 0, 200, 450);
        panel.add(jLabel4);
        getContentPane().add(panel);
        pack();
        setVisible(true);
    }// </editor-fold>

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int item=0;
        String cat="Soft Drink";
        int q1=0,q2=0,q3=0,q4=0,q5=0,amt1=0,amt2=0,amt3=0,amt4=0,amt5=0;
        double total=0.0;
        q1=Integer.parseInt(j1.getText());
        q2=Integer.parseInt(j2.getText());
        q3=Integer.parseInt(j3.getText());
        q4=Integer.parseInt(j4.getText());
        q5=Integer.parseInt(j5.getText());

        if(c2.isSelected())
            amt2=q2*100;
        if(c1.isSelected())
            amt1=q1*150;
        if(c3.isSelected())
            amt3=q3*120;
        if(c4.isSelected())
            amt4=q4*110;
        if(c5.isSelected())
            amt5=q5*120;

        total=amt1+amt2+amt3+amt4+amt5;
        j6.setText(" "+total);
        if(c1.isSelected())
        {
            try
            {Class.forName("java.sql.DriverManager");
                Connection con;
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
                String sql;
                String scat="Red bull";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q1+"',"+amt1+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Red bull added");

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
                String scat="Orangina";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q2+"',"+amt2+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Orangina added");

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
                String scat="Ginger Ale";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q3+"',"+amt3+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Ginger Ale added");

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
                String scat="Iced Tea";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q4+"',"+amt4+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Iced Tea added");

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
                String scat="Sparkling Water";

                sql="insert into menu values('"+cat+"','"+scat+"','"+q5+"',"+amt5+")";
                Statement st=con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Sparkling Water added");

            }
            catch(HeadlessException | ClassNotFoundException | SQLException e)
            {JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        finalbill f=new finalbill();
        f.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        beers f=new beers();
        f.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        hotbeverages f=new hotbeverages();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        menu f=new menu();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        hukka f=new hukka();
        f.setVisible(true);
        this.dispose();    // TODO add your handling code here:
    }

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(softdrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(softdrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(softdrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(softdrink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new softdrink().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration
}

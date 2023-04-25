
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class finalbill extends javax.swing.JFrame {

    /**
     * Creates new form finalbill
     */
    public finalbill() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        setSize(1500,1000);

        jTable1.setBackground(new java.awt.Color(13, 53, 86));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Category", "Sub-Category", "Qty", "Amt"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(10, 50, 416, 90);
        panel.add(jScrollPane1);

        jButton1.setBackground(new java.awt.Color(13, 53, 87));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setText("Show Bill");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(150, 160, -1, -1);
        panel.add(jButton1);

        jButton2.setBackground(new java.awt.Color(13, 53, 87));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setText("Total Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(40, 210, -1, -1);
        jTextField1.setBounds(250, 210, 110, 30);
        panel.add(jButton2);
        panel.add(jTextField1);

        jButton3.setBackground(new java.awt.Color(13, 53, 87));
        jButton3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(150, 270, 120, -1);
        panel.add(jButton3);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\download.jpg")); // NOI18N
        jLabel3.setBounds(380, -10, 510, 520);
        panel.add(jLabel3);

        jLabel1.setBackground(new java.awt.Color(13, 53, 87));
        jLabel1.setOpaque(true);
        jLabel1.setBounds(-30, -240, 770, 590);
        panel.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jLabel2.setBounds(0, 0, 740, 350);
        panel.add(jLabel2);
        getContentPane().add(panel);
        setVisible(true);
        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection ("jdbc:mysql://localhost:3306/scorpian","root","1616");
            String cat,scat,qty,amt,sql;
            sql="select*from menu" ;
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            int rows=model.getRowCount();
            if(rows>0)
            { for(int i=0;i<rows;i++)
            {
                model.removeRow(0);
            }
            }
            while(rs.next())
            {
                cat=rs.getString("category");
                scat=rs.getString("subcategory");
                qty=rs.getString("qty");
                amt=rs.getString("amt");
                model.addRow(new Object[]
                        {cat,scat,qty,amt});
            }
        }
        catch(Exception e){System.out.println
                ("error"+e.getMessage());}

        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {Class.forName
                ("java.sql.DriverManager");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
            String sql;
            sql="select sum(amt)from menu";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(!rs.next())
                JOptionPane.showMessageDialog(null,"order something!!");
            else
                jTextField1.setText(rs.getString("sum(amt)"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog
                    (this,"error"+e.getMessage());

        }
        // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {Class.forName
                ("java.sql.DriverManager");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scorpian","root","1616");
            String sql;
            sql="delete from menu";
            Statement st=con.createStatement();
            st.executeUpdate(sql);

            JOptionPane.showMessageDialog(null,"Ready to take new order");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog
                    (this,"error"+e.getMessage());}
        menu f=new menu();
        f.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(finalbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalbill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalbill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}


import javax.swing.*;
import java.awt.*;
public class menu extends JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1600, 1200);
        // Create a panel with absolute layout
        JPanel panel = new JPanel();
        panel.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 6, 6));
        jButton1.setText("BEERS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(242, 6, 6));
        jButton2.setText("SOFT DRINKS");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });


        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(242, 6, 6));
        jButton3.setText("Homepage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(242, 6, 6));
        jButton4.setText("Hot Beverages");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(242, 6, 6));
        jButton5.setText("Close");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });


        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Student\\Desktop\\New folder (2)\\bhau1 - Copy.jpg")); // NOI18N
        jLabel2.setOpaque(true);


        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(242, 6, 6));
        jButton6.setText("hookah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });


        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setOpaque(true);


        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(242, 6, 6));
        jLabel1.setOpaque(true);


        jButton1.setBounds(30, 200, 210, 50);
        panel.add(jButton1);
        jButton2.setBounds(30, 60, 210, 50);
        panel.add(jButton2);
        jButton3.setBounds(390, 240, 140, 60);
        panel.add(jButton3);
        jButton4.setBounds(30, 130, 210, 50);
        panel.add(jButton4);
        jButton5.setBounds(390, 320, 140, 60);
        panel.add(jButton5);
        jButton6.setBounds(30, 270, 210, 50);
        panel.add(jButton6);
        jLabel1.setBounds(0, 0, 580, 390);
        panel.add(jLabel1);
        jLabel2.setBounds(280, -60, 560, 400);
        panel.add(jLabel2);
        jLabel3.setBounds(530, 310, 310, 80);
        panel.add(jLabel3);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        beers f=new beers();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        softdrink f=new softdrink();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        hotbeverages f=new hotbeverages();
        f.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        homepage  f=new homepage();
        f.setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
// TODO add your handling code here:
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        hukka f=new hukka();
        f.setVisible(true);
        this.dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainticketingsystem;

/**
 *
 * @author Mila
 */
public class Startpage extends javax.swing.JFrame {

    /**
     * Creates new form Startpage
     */
    public Startpage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textJlabel = new javax.swing.JLabel();
        adminbutton = new javax.swing.JButton();
        trainbutton = new javax.swing.JButton();
        mainJlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textJlabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        textJlabel.setText("Train Ticketing System");
        getContentPane().add(textJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 430, 80));

        adminbutton.setBackground(new java.awt.Color(153, 153, 153));
        adminbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adminbutton.setText("Admin Panel");
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(adminbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 390, 90));

        trainbutton.setBackground(new java.awt.Color(153, 153, 153));
        trainbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trainbutton.setText("Train Information");
        trainbutton.setActionCommand("Train Information\n");
        trainbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(trainbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 390, 90));

        mainJlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trainticketingsystem/1.jpg"))); // NOI18N
        getContentPane().add(mainJlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
        // TODO add your handling code here:
         LogInAdmin ad = new LogInAdmin();
          ad.setVisible(true);
    }//GEN-LAST:event_adminbuttonActionPerformed

    private void trainbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainbuttonActionPerformed
        // TODO add your handling code here:
        
        Trains tr = new Trains();
        tr.setVisible(true);
    }//GEN-LAST:event_trainbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Startpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Startpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel mainJlabel;
    private javax.swing.JLabel textJlabel;
    private javax.swing.JButton trainbutton;
    // End of variables declaration//GEN-END:variables
}

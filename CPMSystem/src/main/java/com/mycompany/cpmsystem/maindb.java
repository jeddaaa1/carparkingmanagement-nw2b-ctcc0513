package com.mycompany.cpmsystem;

public class maindb extends javax.swing.JFrame {
    
    public maindb() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        checkinbt = new javax.swing.JButton();
        logoutbt = new javax.swing.JButton();
        exitbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        checkinbt.setText("Manage Vehicle");
        checkinbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinbtActionPerformed(evt);
            }
        });
        getContentPane().add(checkinbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 200, 60));

        logoutbt.setText("Log Out");
        logoutbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 200, 60));

        exitbt.setText("Exit");
        exitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtActionPerformed(evt);
            }
        });
        getContentPane().add(exitbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 200, 58));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\CPMSystem\\photos\\4 copy.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkinbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinbtActionPerformed
        checkin checkinForm = new checkin();
        checkinForm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_checkinbtActionPerformed

    private void exitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitbtActionPerformed

    private void logoutbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtActionPerformed
        login loginForm = new login();
        loginForm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_logoutbtActionPerformed
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(maindb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maindb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maindb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maindb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maindb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkinbt;
    private javax.swing.JButton exitbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutbt;
    // End of variables declaration//GEN-END:variables
}

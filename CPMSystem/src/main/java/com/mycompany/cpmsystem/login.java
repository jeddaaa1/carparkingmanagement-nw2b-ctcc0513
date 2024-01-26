package com.mycompany.cpmsystem;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class login extends javax.swing.JFrame {
    private static ArrayList<User> userList;
    
    public login() {
        initComponents();
        userList = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usertb = new javax.swing.JTextField();
        passpf = new javax.swing.JPasswordField();
        logintb = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        susertb = new javax.swing.JTextField();
        spasspf = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        scpasspf = new javax.swing.JPasswordField();
        signupbt = new javax.swing.JButton();
        Role = new javax.swing.JLabel();
        srolecombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        rolecombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log in");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 141, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 69, -1));
        getContentPane().add(usertb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 150, -1));
        getContentPane().add(passpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 150, -1));

        logintb.setText("Log in");
        logintb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintbActionPerformed(evt);
            }
        });
        getContentPane().add(logintb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign up");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Username");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));
        getContentPane().add(susertb, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 150, -1));
        getContentPane().add(spasspf, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 150, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Confirm Password");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));
        getContentPane().add(scpasspf, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 150, -1));

        signupbt.setText("Sign up");
        signupbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtActionPerformed(evt);
            }
        });
        getContentPane().add(signupbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 150, -1));

        Role.setForeground(new java.awt.Color(255, 255, 255));
        Role.setText("Role");
        Role.setToolTipText("");
        getContentPane().add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        srolecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operator", "Admin" }));
        getContentPane().add(srolecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 150, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Role");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        rolecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operator", "Admin" }));
        getContentPane().add(rolecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 150, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\CPMSystem\\photos\\4.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void logintbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintbActionPerformed
        String username = usertb.getText();
        char[] password = passpf.getPassword();
        Object selectedRole = (Object) rolecombo.getSelectedItem();
        
        for (User user : userList) {
            if (user.getUsername().equals(username) && Arrays.equals(password, user.getPassword()) && user.getRole().equals(selectedRole)) {
                JOptionPane.showMessageDialog(this, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                maindb maindbForm = new maindb();
                maindbForm.setVisible(true);
                this.dispose();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(this, "Invalid username, password or role. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);      
    }//GEN-LAST:event_logintbActionPerformed

    private void signupbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtActionPerformed
        String susername = susertb.getText();
        char[] spassword = spasspf.getPassword();
        char[] sconfirmPassword = scpasspf.getPassword();
        Object selectedRole = (Object) srolecombo.getSelectedItem();

        if (Arrays.equals(spassword, sconfirmPassword)) {
            userList.add(new User(susername, new String(spassword), selectedRole));
            JOptionPane.showMessageDialog(this, "Signup successful! You can now log in.");
        } else {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_signupbtActionPerformed
    
    public static ArrayList<User> getUserList() {
        return userList;
    }
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logintb;
    private javax.swing.JPasswordField passpf;
    private javax.swing.JComboBox<String> rolecombo;
    private javax.swing.JPasswordField scpasspf;
    private javax.swing.JButton signupbt;
    private javax.swing.JPasswordField spasspf;
    private javax.swing.JComboBox<String> srolecombo;
    private javax.swing.JTextField susertb;
    private javax.swing.JTextField usertb;
    // End of variables declaration//GEN-END:variables
}

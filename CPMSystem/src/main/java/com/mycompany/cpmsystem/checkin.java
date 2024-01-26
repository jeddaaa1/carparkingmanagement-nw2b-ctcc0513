package com.mycompany.cpmsystem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.util.Deque;

public class checkin extends javax.swing.JFrame {
    private Deque<Object[]> historyStack = new ArrayDeque<>();
    private LinkedList<Object[]> dataList = new LinkedList<>();
    
    
    public checkin() {
        initComponents();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        typeCombo = new javax.swing.JComboBox<>();
        dateSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        maindb = new javax.swing.JButton();
        addbt = new javax.swing.JButton();
        deletebt = new javax.swing.JButton();
        updatebt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        historybt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("License Plate Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, -1));

        jLabel2.setText("Vehicle Type");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 90, 20));

        jLabel3.setText("Date and Time");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 94, 30));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 143, -1));

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Motorcycle" }));
        getContentPane().add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 143, -1));

        dateSpinner.setModel(new javax.swing.SpinnerDateModel());
        getContentPane().add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate Number", "Vehicle Type", "Check-in Date and Time"
            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, 273));

        maindb.setText("Main Menu");
        maindb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maindbActionPerformed(evt);
            }
        });
        getContentPane().add(maindb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 180, 50));

        addbt.setText("Check-In Vehicle");
        addbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtActionPerformed(evt);
            }
        });
        getContentPane().add(addbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        deletebt.setText("Delete");
        deletebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtActionPerformed(evt);
            }
        });
        getContentPane().add(deletebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        updatebt.setText("Update");
        updatebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtActionPerformed(evt);
            }
        });
        getContentPane().add(updatebt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Check-In");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        historybt.setText("Check-Out a Vehicle");
        historybt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historybtActionPerformed(evt);
            }
        });
        getContentPane().add(historybt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 180, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Check-in History");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\CPMSystem\\photos\\1.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private int searchLicensePlate(String licensePlate) {
    DefaultTableModel tblModel = (DefaultTableModel) dataTable.getModel();

    for (int i = 0; i < tblModel.getRowCount(); i++) {
        String currentLicensePlate = tblModel.getValueAt(i, 0).toString();

        if (currentLicensePlate.equalsIgnoreCase(licensePlate)) {
            return i;
        }
    }
        return -1;
    }
    
    private void addbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtActionPerformed
        if (txtName.getText().equals("") || typeCombo.getSelectedItem().equals("") || dateSpinner.getValue().equals("")) {
        JOptionPane.showMessageDialog(this, "Please Enter All Data !");
        } else {
            String newLicensePlate = txtName.getText();

        int rowIndex = searchLicensePlate(newLicensePlate);

        if (rowIndex != -1) {
            JOptionPane.showMessageDialog(this, "License Plate already exists!");
        } else {
            Object data[] = { newLicensePlate, typeCombo.getSelectedItem(), dateSpinner.getValue() };
            dataList.add(data);

            DefaultTableModel tblModel = (DefaultTableModel) dataTable.getModel();
            tblModel.addRow(data);

            Deque<Object[]> sessionHistoryStack = new ArrayDeque<>(historyStack);
            sessionHistoryStack.push(data);
            historyStack = sessionHistoryStack;

            JOptionPane.showMessageDialog(this, "Add Data Success!");
            txtName.setText("");
            typeCombo.setSelectedItem("");
            dateSpinner.setValue("");
            }   
        }     
    }//GEN-LAST:event_addbtActionPerformed

    private void maindbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maindbActionPerformed
        maindb maindbForm = new maindb();
        maindbForm.setVisible(true);
     
        this.dispose();
    }//GEN-LAST:event_maindbActionPerformed

    private void deletebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) dataTable.getModel();
        if(dataTable.getSelectedRowCount()==1){
        tblModel.removeRow(dataTable.getSelectedRow());
        } else{
            if(dataTable.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is empty.");
            }else{
                JOptionPane.showMessageDialog(this, "Select a row to be deleted.");
            }
        }
    }//GEN-LAST:event_deletebtActionPerformed

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)dataTable.getModel();
        
        String tblLicense = (String) tblModel.getValueAt(dataTable.getSelectedRow(), 0).toString();
        Object tblVehicle = (Object) tblModel.getValueAt(dataTable.getSelectedRow(), 1).toString();
        Object tblDate = (Object) tblModel.getValueAt(dataTable.getSelectedRow(), 2).toString();
        
        txtName.setText(tblLicense);
        typeCombo.setSelectedItem(tblVehicle);
        dateSpinner.setValue(tblDate);
    }//GEN-LAST:event_dataTableMouseClicked

    private void updatebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) dataTable.getModel();
           if(dataTable.getSelectedRowCount() == 1){
               String License  = txtName.getText();
               Object Vehicle  = (Object) typeCombo.getSelectedItem();
               Object Date = (Object) dateSpinner.getValue();
               
               tblModel.setValueAt(License, dataTable.getSelectedRow(), 0);
               tblModel.setValueAt(Vehicle, dataTable.getSelectedRow(), 1);
               tblModel.setValueAt(Date, dataTable.getSelectedRow(), 2);
               
               JOptionPane.showMessageDialog(this, "Data updated successfully.");
           } else {
               if(dataTable.getRowCount() == 0){
                 JOptionPane.showMessageDialog(this, "Table is empty.");
           } else {
               JOptionPane.showMessageDialog(this, "Select a row to be updated.");
               }
           }
    }//GEN-LAST:event_updatebtActionPerformed

    private void historybtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historybtActionPerformed
        if (!historyStack.isEmpty()) {
            checkout historyForm = new checkout(historyStack);
            historyForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No history available.");
        }
    }//GEN-LAST:event_historybtActionPerformed

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
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbt;
    private javax.swing.JTable dataTable;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JButton deletebt;
    private javax.swing.JButton historybt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton maindb;
    private javax.swing.JTextField txtName;
    private javax.swing.JComboBox<String> typeCombo;
    private javax.swing.JButton updatebt;
    // End of variables declaration//GEN-END:variables
}

package com.mycompany.cpmsystem;
import java.util.Deque;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class checkout extends javax.swing.JFrame {
    private DefaultTableModel historyTableModel;
    private Deque<Object[]> historyStack;
    private Object[] lastCheckedIn;
    private Deque<Object[]> updatedStack;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    public checkout() {
        initComponents();
    }
    
    public checkout(Deque<Object[]> sessionHistoryStack) {
        initComponents();
        
        if (historyTableModel == null) {
            historyTableModel = new DefaultTableModel(
                new Object[][] {},
                new String[] { "License Plate Number", "Vehicle Type", "Check-in Date and Time" }
            );
            historyTable.setModel(historyTableModel);
        }

        for (Object[] data : sessionHistoryStack) {
            historyTableModel.addRow(data);
        }

        this.historyStack = sessionHistoryStack;
    }
    
    public void setCheckInHistory(LinkedList<Object[]> checkInHistory) {
        DefaultTableModel tblModel = (DefaultTableModel) historyTable.getModel();

        tblModel.setRowCount(0);

        for (Object[] data : checkInHistory) {
            tblModel.addRow(data);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        checkoutbt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        typeCombo = new javax.swing.JComboBox<>();
        dateSpinner = new javax.swing.JSpinner();
        codateSpinner = new javax.swing.JSpinner();
        mainbt = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Check-Out");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "License Plate Number", "Vehicle Type", "Check-in Date and Time"
            }
        ));
        historyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(historyTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 30, 440, 281));

        checkoutbt.setText("Check-out Vehicle");
        checkoutbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutbtActionPerformed(evt);
            }
        });
        getContentPane().add(checkoutbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, -1, -1));

        jLabel2.setText("License Plate Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel3.setText("Vehicle Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 114, -1));

        jLabel4.setText("Date and Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 114, -1));

        jLabel5.setText("Check-out Date and Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 150, -1));

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Motorcycle" }));
        getContentPane().add(typeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 150, -1));

        dateSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1706111226419L), null, null, java.util.Calendar.DAY_OF_MONTH));
        getContentPane().add(dateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        codateSpinner.setModel(new javax.swing.SpinnerDateModel());
        getContentPane().add(codateSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 150, -1));

        mainbt.setText("Main Menu");
        mainbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainbtActionPerformed(evt);
            }
        });
        getContentPane().add(mainbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 200, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Acer\\Documents\\NetBeansProjects\\CPMSystem\\photos\\1.jpg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyTableMouseClicked
        int selectedRow = historyTable.getSelectedRow();

    if (selectedRow != -1) {
        DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
        String licensePlate = (String) model.getValueAt(selectedRow, 0);
        Object vehicleType = model.getValueAt(selectedRow, 1);
        Date checkInDateTime = (Date) model.getValueAt(selectedRow, 2);

        txtName.setText(licensePlate);
        typeCombo.setSelectedItem(vehicleType);
        dateSpinner.setValue(checkInDateTime);
        } 
    }//GEN-LAST:event_historyTableMouseClicked

    private void checkoutbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutbtActionPerformed
        if(historyTable.getSelectedRowCount() == 1){
            
        String licensePlate = txtName.getText();
        Object vehicleType = typeCombo.getSelectedItem();
        Date checkInDateTime = (Date) dateSpinner.getValue();
        Date checkOutDateTime = (Date) codateSpinner.getValue();

        double price = calculatePrice(checkInDateTime, checkOutDateTime);
        String receiptMessage = "License Plate: " + licensePlate + "\n"
            + "Vehicle Type: " + vehicleType + "\n"
            + "Check-In Time: " + dateFormat.format(checkInDateTime) + "\n"
            + "Check-Out Time: " + dateFormat.format(checkOutDateTime) + "\n"
            + "Price: ₱" + String.format("%.2f", price);

        JOptionPane.showMessageDialog(this, receiptMessage, "Receipt", JOptionPane.INFORMATION_MESSAGE);
        }else {
               JOptionPane.showMessageDialog(this, "Select a row to be updated");
        }
    }//GEN-LAST:event_checkoutbtActionPerformed

    private void mainbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainbtActionPerformed
        System.out.println("Main Dashboard button clicked");
        maindb maindbForm = new maindb();
        maindbForm.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_mainbtActionPerformed
    
    private double calculatePrice(Date checkInDateTime, Date checkOutDateTime) {
        long durationInMillis = checkOutDateTime.getTime() - checkInDateTime.getTime();
        double hours = durationInMillis / (60.0 * 60.0 * 1000.0);
        double pricePerHour = 50.0;
        return hours * pricePerHour;
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
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkoutbt;
    private javax.swing.JSpinner codateSpinner;
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainbt;
    private javax.swing.JTextField txtName;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables
}

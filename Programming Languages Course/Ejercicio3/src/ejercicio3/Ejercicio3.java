/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Figueroa
 */
public class Ejercicio3 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio3
     */
    public Ejercicio3() throws IOException {
        initComponents();
        saveButton.setEnabled(false);
        deleteButton.setEnabled(false);
        saveButton.setVisible(false);
        deleteButton.setVisible(false);
        editButton.setEnabled(false);
        editButton.setVisible(false);
        itemTextField.setEnabled(false);
        priceTextField.setEnabled(false);
        itemTextField.setText("");
        priceTextField.setText("");
        readFile();
        itemList.setModel(listModel);
    }
    
    DefaultListModel listModel = new DefaultListModel();
    String path = "C:\\Users\\Gabriel Figueroa\\Desktop\\inventario.txt";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemLabel = new javax.swing.JLabel();
        itemTextField = new javax.swing.JTextField();
        priceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemList = new javax.swing.JList<>();
        priceTextField = new javax.swing.JTextField();
        inventoryLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemLabel.setText("Item:");

        priceLabel.setText("Price:");

        itemList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        itemList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemList);

        inventoryLabel.setText("Inventory");

        addButton.setText("Add Item");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit Item");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save Item");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Item");

        titleLabel.setText("Inventory Price System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemLabel)
                            .addComponent(priceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(itemTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(priceTextField))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryLabel))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemLabel)
                    .addComponent(itemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inventoryLabel))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(priceLabel)
                            .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        itemTextField.setEnabled(true);
        priceTextField.setEnabled(true);
        saveButton.setEnabled(true);
        saveButton.setVisible(true);
        addButton.setEnabled(false);
        addButton.setVisible(false);
        deleteButton.setEnabled(false);
        deleteButton.setVisible(false);
        editButton.setEnabled(true);
        editButton.setVisible(false);
        itemTextField.setText("");
        priceTextField.setText("");
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        itemTextField.setEnabled(true);
        priceTextField.setEnabled(true);
        saveButton.setEnabled(true);
        saveButton.setVisible(true);
        addButton.setEnabled(true);
        addButton.setVisible(false);
        deleteButton.setEnabled(false);
        deleteButton.setVisible(false);
        editButton.setEnabled(false);
        editButton.setVisible(false);
    }//GEN-LAST:event_editButtonActionPerformed

    private void itemListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemListMouseClicked
        editButton.setEnabled(true);
        editButton.setVisible(true);
        deleteButton.setEnabled(true);
        deleteButton.setVisible(true);
        String string = itemList.getSelectedValue();
        String[] splitString = string.split("\\s+");
        itemTextField.setText(splitString[0]);
        priceTextField.setText(splitString[1]);
    }//GEN-LAST:event_itemListMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int index = itemList.getSelectedIndex();
        if (editButton.isEnabled()== false) {
            listModel.remove(index);
            listModel.addElement(itemTextField.getText() + " " + priceTextField.getText());
            itemList.setModel(listModel);
            try {
                writeToFile(listModel);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
            itemTextField.setText("");
            priceTextField.setText("");
            itemTextField.setEnabled(false);
            priceTextField.setEnabled(false);
            saveButton.setEnabled(false);
            saveButton.setVisible(false);
            addButton.setEnabled(true);
            addButton.setVisible(true);
        } else if (addButton.isEnabled() == false) {
            listModel.addElement(itemTextField.getText() + " " + priceTextField.getText());
            String validator = itemTextField.getText() + " " + priceTextField.getText();
            for (int i = 0; i < listModel.size(); i++) {
                if (listModel.get(i) == validator) {
                    JOptionPane.showMessageDialog(null, "Item already exists.");
                    listModel.remove(i);
                }
            }
            itemList.setModel(listModel);
             try {
                writeToFile(listModel);
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
            }
            itemTextField.setText("");
            priceTextField.setText("");
            itemTextField.setEnabled(false);
            priceTextField.setEnabled(false);
            saveButton.setEnabled(false);
            saveButton.setVisible(false);
            addButton.setEnabled(true);
            addButton.setVisible(true);
        }  
    }//GEN-LAST:event_saveButtonActionPerformed

    private void readFile() throws IOException {   
        try {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            listModel.addElement(scanner.nextLine());
        }
        scanner.close();
        } catch(FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    private void writeToFile(DefaultListModel listModel) throws IOException {
        FileWriter writer = new FileWriter(path);
        for(int i = 0; i < listModel.size(); i++) {
            writer.write(listModel.get(i).toString() + "\r\n");
        }
        writer.close();
    }
    
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
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ejercicio3().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel inventoryLabel;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JList<String> itemList;
    private javax.swing.JTextField itemTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

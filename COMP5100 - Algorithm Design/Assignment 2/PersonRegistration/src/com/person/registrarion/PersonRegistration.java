package com.person.registrarion;

import javax.swing.table.DefaultTableModel;

public class PersonRegistration extends javax.swing.JFrame {
    
    public PersonRegistration() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitDialog = new javax.swing.JDialog();
        exitPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        yesExitButton = new javax.swing.JButton();
        noExitButton = new javax.swing.JButton();
        personPanel = new javax.swing.JPanel();
        firstName_Label = new javax.swing.JLabel();
        lastName_Label = new javax.swing.JLabel();
        firstName_TextField = new javax.swing.JTextField();
        lastName_TextField = new javax.swing.JTextField();
        address_Label = new javax.swing.JLabel();
        address_TextField = new javax.swing.JTextField();
        ocupation_Label = new javax.swing.JLabel();
        ocupation_TextField = new javax.swing.JTextField();
        phone_Label = new javax.swing.JLabel();
        email_Label = new javax.swing.JLabel();
        email_TextField = new javax.swing.JTextField();
        phone_TextField = new javax.swing.JTextField();
        agendaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        exitbutton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();

        exitDialog.setTitle("exitDialog");
        exitDialog.setName("exitDialog"); // NOI18N

        exitLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        exitLabel.setText("Are you sure you want to exit?");

        yesExitButton.setText("Yes");
        yesExitButton.setName("yesExitButton"); // NOI18N

        noExitButton.setText("No");
        noExitButton.setName("noExitButton"); // NOI18N
        noExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noExitButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout exitPanelLayout = new org.jdesktop.layout.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(exitPanelLayout.createSequentialGroup()
                .add(33, 33, 33)
                .add(exitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(exitPanelLayout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(yesExitButton)
                        .add(18, 18, 18)
                        .add(noExitButton))
                    .add(exitLabel))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(exitPanelLayout.createSequentialGroup()
                .add(44, 44, 44)
                .add(exitLabel)
                .add(18, 18, 18)
                .add(exitPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(yesExitButton)
                    .add(noExitButton))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        yesExitButton.getAccessibleContext().setAccessibleName("yesExitButton");
        noExitButton.getAccessibleContext().setAccessibleName("noExitButton");

        org.jdesktop.layout.GroupLayout exitDialogLayout = new org.jdesktop.layout.GroupLayout(exitDialog.getContentPane());
        exitDialog.getContentPane().setLayout(exitDialogLayout);
        exitDialogLayout.setHorizontalGroup(
            exitDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(exitPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitDialogLayout.setVerticalGroup(
            exitDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(exitPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PersonRegistrationFrame");
        setName("PersonRegistrationFrame"); // NOI18N

        personPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Person"));
        personPanel.setName("personPanel"); // NOI18N

        firstName_Label.setText("First Name:");

        lastName_Label.setText("Last Name:");

        lastName_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastName_TextFieldActionPerformed(evt);
            }
        });

        address_Label.setText("Address:");

        ocupation_Label.setText("Ocupation:");

        phone_Label.setText("Phone:");

        email_Label.setText("E-mail:");

        org.jdesktop.layout.GroupLayout personPanelLayout = new org.jdesktop.layout.GroupLayout(personPanel);
        personPanel.setLayout(personPanelLayout);
        personPanelLayout.setHorizontalGroup(
            personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(personPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(firstName_Label)
                    .add(phone_Label)
                    .add(address_Label)
                    .add(email_Label))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(personPanelLayout.createSequentialGroup()
                        .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(address_TextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, firstName_TextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .add(phone_TextField))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(lastName_Label)
                            .add(ocupation_Label)))
                    .add(email_TextField))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lastName_TextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .add(ocupation_TextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap())
        );
        personPanelLayout.setVerticalGroup(
            personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(personPanelLayout.createSequentialGroup()
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(firstName_Label)
                    .add(lastName_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(firstName_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lastName_Label))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(address_Label)
                    .add(ocupation_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ocupation_Label, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(address_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(phone_Label)
                    .add(phone_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(personPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(email_Label)
                    .add(email_TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        address_Label.getAccessibleContext().setAccessibleName("Address");

        agendaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Agenda"));
        agendaPanel.setName("agendaPanel"); // NOI18N

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "Occupation", "Address", "Phone", "Email"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        org.jdesktop.layout.GroupLayout agendaPanelLayout = new org.jdesktop.layout.GroupLayout(agendaPanel);
        agendaPanel.setLayout(agendaPanelLayout);
        agendaPanelLayout.setHorizontalGroup(
            agendaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
        );
        agendaPanelLayout.setVerticalGroup(
            agendaPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
        );

        exitbutton.setText("Exit");
        exitbutton.setName("exitButton"); // NOI18N
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        registerButton.setText("Register");
        registerButton.setName("registerButton"); // NOI18N
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(registerButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(exitbutton))
                    .add(personPanel, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, agendaPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {exitbutton, registerButton}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(personPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(agendaPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(exitbutton)
                    .add(registerButton))
                .addContainerGap())
        );

        personPanel.getAccessibleContext().setAccessibleName("personPanel");
        agendaPanel.getAccessibleContext().setAccessibleName(" agendaPanel ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastName_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastName_TextFieldActionPerformed

    private void noExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noExitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noExitButtonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)personTable.getModel();
        
        String firstName = firstName_TextField.getText();
        String lastName = lastName_TextField.getText();
        String fullName = firstName + " " + lastName;
        String address = address_TextField.getText();
        String occupation = ocupation_TextField.getText();
        String phone = phone_TextField.getText();
        String email = email_TextField.getText();
        model.addRow(new Object[]{fullName, address, occupation, phone, email});
        
        firstName_TextField.setText("");
        lastName_TextField.setText("");
        address_TextField.setText("");
        ocupation_TextField.setText("");
        phone_TextField.setText("");
        email_TextField.setText("");
        
    }//GEN-LAST:event_registerButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersonRegistration().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_Label;
    private javax.swing.JTextField address_TextField;
    private javax.swing.JPanel agendaPanel;
    private javax.swing.JLabel email_Label;
    private javax.swing.JTextField email_TextField;
    private javax.swing.JDialog exitDialog;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel firstName_Label;
    private javax.swing.JTextField firstName_TextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastName_Label;
    private javax.swing.JTextField lastName_TextField;
    private javax.swing.JButton noExitButton;
    private javax.swing.JLabel ocupation_Label;
    private javax.swing.JTextField ocupation_TextField;
    private javax.swing.JPanel personPanel;
    private javax.swing.JTable personTable;
    private javax.swing.JLabel phone_Label;
    private javax.swing.JTextField phone_TextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton yesExitButton;
    // End of variables declaration//GEN-END:variables
    
}

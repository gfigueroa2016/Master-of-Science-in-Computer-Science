package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Figueroa
 */
public class Students extends javax.swing.JFrame {

    private static final ArrayList<Student> studentList = new ArrayList<>();
    private static final String dbUrl = "jdbc:mysql://localhost:3306/sys";
    private static final String dbUser = "dev";
    private static final String dbPassword = "dev12345";
    private int i = 0;
    
    public Students() {
        initComponents();
        getDbQuery(studentList,dbUrl, dbUser, dbPassword);
        firstNameTextField.setText(studentList.get(i).getFirstName());
        lastNameTextField.setText(studentList.get(i).getLastName());
        phoneTextField.setText(studentList.get(i).getPhone());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstRecordButton = new javax.swing.JButton();
        nextRecordButton = new javax.swing.JButton();
        previousRecordButton = new javax.swing.JButton();
        lastRecordButton = new javax.swing.JButton();
        aboutButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Telephone");

        firstRecordButton.setText("First Record");
        firstRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstRecordButtonActionPerformed(evt);
            }
        });

        nextRecordButton.setText("Next Record");
        nextRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRecordButtonActionPerformed(evt);
            }
        });

        previousRecordButton.setText("Previous Record");
        previousRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousRecordButtonActionPerformed(evt);
            }
        });

        lastRecordButton.setText("Last Record");
        lastRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastRecordButtonActionPerformed(evt);
            }
        });

        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Students Database");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField)
                            .addComponent(lastNameTextField)
                            .addComponent(firstNameTextField)))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(firstRecordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(previousRecordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextRecordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastRecordButton)
                        .addGap(7, 7, 7)
                        .addComponent(aboutButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstRecordButton)
                    .addComponent(nextRecordButton)
                    .addComponent(aboutButton)
                    .addComponent(exitButton)
                    .addComponent(previousRecordButton)
                    .addComponent(lastRecordButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstRecordButtonActionPerformed
        i = 0;
        firstNameTextField.setText(studentList.get(i).getFirstName());
        lastNameTextField.setText(studentList.get(i).getLastName());
        phoneTextField.setText(studentList.get(i).getPhone());
    }//GEN-LAST:event_firstRecordButtonActionPerformed

    private void previousRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousRecordButtonActionPerformed
        if (i != 0) {
            i = i - 1;
            firstNameTextField.setText(studentList.get(i).getFirstName());
            lastNameTextField.setText(studentList.get(i).getLastName());
            phoneTextField.setText(studentList.get(i).getPhone());
        } else {
            i = studentList.size() - 1;
            firstNameTextField.setText(studentList.get(i).getFirstName());
            lastNameTextField.setText(studentList.get(i).getLastName());
            phoneTextField.setText(studentList.get(i).getPhone());
        }
    }//GEN-LAST:event_previousRecordButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        JOptionPane.showMessageDialog(null, "This program was coded by Gabriel Figueroa. "
                + "Designed for the first test of the course COMP5510.DEVELOPMENT & SOFTWARE DESIGN (201923.12969) "
                + "from the Inter American Universiy of Puerto Rico, Fajardo Campus.");
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void nextRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRecordButtonActionPerformed
        if (i != studentList.size() - 1) {
            i = i + 1;
            firstNameTextField.setText(studentList.get(i).getFirstName());
            lastNameTextField.setText(studentList.get(i).getLastName());
            phoneTextField.setText(studentList.get(i).getPhone());
        } else {
            i = 0;
            firstNameTextField.setText(studentList.get(i).getFirstName());
            lastNameTextField.setText(studentList.get(i).getLastName());
            phoneTextField.setText(studentList.get(i).getPhone());
        }
    }//GEN-LAST:event_nextRecordButtonActionPerformed

    private void lastRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastRecordButtonActionPerformed
        i = studentList.size() - 1;
        firstNameTextField.setText(studentList.get(i).getFirstName());
        lastNameTextField.setText(studentList.get(i).getLastName());
        phoneTextField.setText(studentList.get(i).getPhone());
    }//GEN-LAST:event_lastRecordButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Students().setVisible(true);
        });
    }
    
    private static ArrayList<Student> getDbQuery(ArrayList<Student> studentList, String dbUrl, String dbUser, String dbPassword) {
        Student student;
        try {
            Connection connection = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Id, FirstName, LastName, Phone FROM sys.Students");
            while(resultSet.next()){
                student = new Student();
                String Id = resultSet.getString("Id");
                String FirstName = resultSet.getString("FirstName");
                String LastName = resultSet.getString("LastName");
                String Phone = resultSet.getString("Phone");
                student.setId(Id);
                student.setFirstName(FirstName);
                student.setLastName(LastName);
                student.setPhone(Phone);
                studentList.add(student);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        return studentList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton firstRecordButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JButton lastRecordButton;
    private javax.swing.JButton nextRecordButton;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton previousRecordButton;
    // End of variables declaration//GEN-END:variables
}

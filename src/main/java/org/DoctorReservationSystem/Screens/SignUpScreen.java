/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.DoctorReservationSystem.Screens;

import org.DoctorReservationSystem.controller.UserController;
import org.DoctorReservationSystem.dao.PatientDaoImp;
import org.DoctorReservationSystem.domain.Patient;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.MouseInputListener;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class SignUpScreen extends javax.swing.JFrame {

    /**
     * Creates new form SignUpScreen
     */
    public SignUpScreen() {
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

        jLabel1 = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        FirstNameTextField = new javax.swing.JTextField();
        firstNameFeedbackLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        lastNameFeedbackLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailFeedbackLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordFeedbackLabel = new javax.swing.JLabel();
        DOBLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dayLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        monthLabel = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        yearLabel = new javax.swing.JLabel();
        yearTextField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        phoneFeedbackLabel = new javax.swing.JLabel();
        DOBFeedbackLabel = new javax.swing.JLabel();
        MainLabel = new javax.swing.JLabel();
        signUpBtn = new javax.swing.JButton();
        alreadyHaveAccount = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        firstNameLabel.setText("First Name:");

        firstNameFeedbackLabel.setText("");

        FirstNameTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                firstNameActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                firstNameActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        lastNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lastNameLabel.setText("Last Name:");

        lastNameFeedbackLabel.setText("");

        //TODO: add action Listener to lastName;

        lastNameTextField.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                lastNameActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                lastNameActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailLabel.setText("Email:");

        emailFeedbackLabel.setText("");

        //TODO: add action Listener to email;

        emailTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                emailActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                emailActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setText("Password:");

        passwordFeedbackLabel.setText("");

        //TODO: add action Listener to password;

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                passwordActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                passwordActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        DOBLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DOBLabel.setText("Date of birth:");

        //TODO: add action Listener to DOB;
        dayTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        monthTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        yearTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                DOBActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dayLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dayLabel.setText("Day:");

        dayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayTextFieldActionPerformed(evt);
            }
        });

        monthLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        monthLabel.setText("Month:");

        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        yearLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        yearLabel.setText("Year:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        phoneNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phoneNumberLabel.setText("Phone:");

        phoneFeedbackLabel.setText("");

        phoneTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                phoneActionPerformed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                phoneActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        DOBFeedbackLabel.setText("");

        MainLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MainLabel.setText("Create Account");

        signUpBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signUpBtn.setText("SignUp");
        signUpBtn.setFocusable(false);
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        alreadyHaveAccount.setText("<html><u>Already have an account?</u></html>");
        alreadyHaveAccount.addMouseListener(new MouseInputListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                alreadyHaveAccountListener();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DOBLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DOBFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap(595, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                    .addComponent(emailFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTextField)
                                    .addComponent(firstNameFeedbackLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordFeedbackLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(lastNameFeedbackLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(phoneFeedbackLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(phoneTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)))
                        .addContainerGap(75, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(MainLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alreadyHaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(MainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameFeedbackLabel)
                    .addComponent(lastNameFeedbackLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailFeedbackLabel)
                    .addComponent(passwordFeedbackLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBFeedbackLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(phoneFeedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alreadyHaveAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(){
        if(FirstNameTextField.getText().isEmpty())
            firstNameFeedbackLabel.setText("");
        else{
            if(UserController.verifyName(FirstNameTextField.getText())){
                firstNameFeedbackLabel.setText("Valid");
                firstNameFeedbackLabel.setForeground(Color.GREEN);
            }else{
                firstNameFeedbackLabel.setText("Invalid");
                firstNameFeedbackLabel.setForeground(Color.RED);
            }
        }
    }

    private void lastNameActionPerformed(){
        if(lastNameTextField.getText().isEmpty())
            lastNameFeedbackLabel.setText("");
        else{
            if(UserController.verifyName(lastNameTextField.getText())){
                lastNameFeedbackLabel.setText("Valid");
                lastNameFeedbackLabel.setForeground(Color.GREEN);
            }else{
                lastNameFeedbackLabel.setText("Invalid");
                lastNameFeedbackLabel.setForeground(Color.RED);
            }
        }
    }

    private void emailActionPerformed(){
        if(emailTextField.getText().isEmpty())
            emailFeedbackLabel.setText("");
        else{
            if(UserController.verifyEmail(emailTextField.getText())){
                emailFeedbackLabel.setText("Valid");
                emailFeedbackLabel.setForeground(Color.GREEN);
            }else{
                emailFeedbackLabel.setText("Invalid");
                emailFeedbackLabel.setForeground(Color.RED);
            }
        }
    }

    private void passwordActionPerformed(){
        if(String.valueOf(passwordField.getPassword()).isEmpty())
            passwordFeedbackLabel.setText("");
        else{
            if(UserController.verifyPassword(String.valueOf(passwordField.getPassword()))){
                passwordFeedbackLabel.setText("Valid");
                passwordFeedbackLabel.setForeground(Color.GREEN);
            }else{
                passwordFeedbackLabel.setText("Invalid");
                passwordFeedbackLabel.setForeground(Color.RED);
            }
        }
    }

    private void phoneActionPerformed(){
        if(phoneTextField.getText().isEmpty())
            phoneFeedbackLabel.setText("");
        else{
            if(UserController.verifyPhone(phoneTextField.getText())){
                phoneFeedbackLabel.setText("Valid");
                phoneFeedbackLabel.setForeground(Color.GREEN);
            }else{
                phoneFeedbackLabel.setText("Invalid");
                phoneFeedbackLabel.setForeground(Color.RED);
            }
        }
    }

    private void DOBActionPerformed(){
        if(dayTextField.getText().isEmpty() || monthTextField.getText().isEmpty() || yearTextField.getText().isEmpty())
            DOBFeedbackLabel.setText("");
        else {
            try {
                int year = Integer.parseInt(yearTextField.getText());
                int month = Integer.parseInt(monthTextField.getText());
                int day = Integer.parseInt(dayTextField.getText());

                if(UserController.verifyDOB(day,month,year)){
                    DOBFeedbackLabel.setText("Valid");
                    DOBFeedbackLabel.setForeground(Color.GREEN);
                }else
                    throw new NumberFormatException();

            }catch (NumberFormatException nfe){
                DOBFeedbackLabel.setText("Invalid");
                DOBFeedbackLabel.setForeground(Color.RED);
            }


        }
    }

    public void alreadyHaveAccountListener(){
        this.dispose();
        new LoginScreen().setVisible(true);
    }

    private void dayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayTextFieldActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:

        try{
            int year = Integer.parseInt(yearTextField.getText());
            int month = Integer.parseInt(monthTextField.getText());
            int day = Integer.parseInt(dayTextField.getText());

            if(UserController.verifyName(FirstNameTextField.getText())&&
                    UserController.verifyName(lastNameTextField.getText())&&
                    UserController.verifyEmail(emailTextField.getText())&&
                    UserController.verifyPassword(String.valueOf(passwordField.getPassword()))&&
                    UserController.verifyPhone(phoneTextField.getText())&&
                    UserController.verifyDOB(day,month,year)){
                PatientDaoImp patientDaoImp = new PatientDaoImp();

                ArrayList<Patient> patients = patientDaoImp.fetchPatients();

                String time = year
                        + "-" + month + "-" + day;
                System.out.println(time);

                Patient patient = new Patient(0,
                        FirstNameTextField.getText(),
                        lastNameTextField.getText(),
                        Date.valueOf(time),
                        emailTextField.getText().toLowerCase(),
                        phoneTextField.getText(),
                        String.valueOf(passwordField.getPassword()),
                        "");

                for(Patient i:patients){
                    if(i.getEmail().equals(patient.getEmail())){
                        JOptionPane.showMessageDialog(this,"Account Already Exist", "Fetal", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                patientDaoImp.add(patient);
                JOptionPane.showMessageDialog(this,"Account Registered","Account Created",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new LoginScreen().setVisible(true);
            }
        }catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this,"Invalid Input","Fetal Error",JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_signUpBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOBFeedbackLabel;
    private javax.swing.JLabel DOBLabel;
    private javax.swing.JTextField FirstNameTextField;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JLabel alreadyHaveAccount;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField dayTextField;
    private javax.swing.JLabel emailFeedbackLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameFeedbackLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel lastNameFeedbackLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JTextField monthTextField;
    private javax.swing.JLabel passwordFeedbackLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel phoneFeedbackLabel;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JLabel yearLabel;
    private javax.swing.JTextField yearTextField;
    // End of variables declaration//GEN-END:variables
}
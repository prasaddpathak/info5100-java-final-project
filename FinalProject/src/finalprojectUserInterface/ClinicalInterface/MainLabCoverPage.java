/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.ClinicalInterface;

import javax.swing.JOptionPane;
import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Lab.Technician;
import finalprojectUserInterface.ClinicalInterface.LabLoginPages.LabTechnicianSignin;

import finalprojectUserInterface.MainJFrameForm;


/**
 *
 * @author supriyaa
 */
public class MainLabCoverPage extends javax.swing.JPanel {

    /**
     * Creates new form MainLabCoverPage
     */
    MainJFrameForm MainLPage;
    private DB4OUtility dB4OUtility;
    private OperatingSystem operatingSystem;
    
    public MainLabCoverPage(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_role = new javax.swing.JLabel();
        cmb_Role = new javax.swing.JComboBox<>();
        lbl_username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setMaximumSize(new java.awt.Dimension(2000, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Clinical Laboratory");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 220, -1));

        lbl_role.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_role.setText("Role:");
        jPanel1.add(lbl_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        cmb_Role.setEditable(true);
        cmb_Role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technician"}));
        cmb_Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RoleActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 197, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_username.setText("Username:");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 197, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pswd.setText("Password:");
        jPanel1.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 197, -1));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, 40));

        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSignin.setText("Sign Up");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 80, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/06212021-37advance-problem-solving-decision-choice-direction-thinking-1252318414.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(2000, 1300));
        jLabel2.setMinimumSize(new java.awt.Dimension(2000, 1300));
        jLabel2.setPreferredSize(new java.awt.Dimension(2000, 1300));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-620, -10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1451, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(122, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RoleActionPerformed
        // TODO add your handling code here:
        System.out.println(cmb_Role.getSelectedItem().toString());
        if (cmb_Role.getSelectedItem().toString() == "Admin") {
            btnSignin.setEnabled(false);
        } else {
            btnSignin.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_RoleActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        
        try {
            if (cmb_Role.getSelectedItem().toString() == "Technician") {
            Technician ho = (Technician) operatingSystem.loginAuthentication(txtUsername.getText(), txtPassword.getText());
            if (ho == null) {
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            } else {
                LabTechnicianSignin ap = new LabTechnicianSignin(MainLPage, dB4OUtility, operatingSystem, ho);
                MainLPage.setContentPane(ap);
                MainLPage.invalidate();
                MainLPage.validate();
                return;
            }
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Technician does not exist. Please Sign up");
        }

        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:

        if (cmb_Role.getSelectedItem().toString() == "Technician") {

            LabSignUp signlab = new LabSignUp(MainLPage, dB4OUtility, operatingSystem);
            //
            //            //suc.setVisible(true);
            MainLPage.setContentPane(signlab);
            ////            //             this.add(s);
            ////
            MainLPage.invalidate();
            MainLPage.validate();

        }
    }//GEN-LAST:event_btnSigninActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cmb_Role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

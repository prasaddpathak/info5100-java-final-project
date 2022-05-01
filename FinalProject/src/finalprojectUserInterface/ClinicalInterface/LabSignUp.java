/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.ClinicalInterface;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Lab.Technician;

import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;
import java.util.Date;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author supriyaa
 */
public class LabSignUp extends javax.swing.JPanel {

    /**
     * Creates new form LabSignUp
     */
    
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLPage;
    private DB4OUtility dB4OUtility;
    private OperatingSystem operatingSystem;
    public LabSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
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
        admintitle = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        fullname_txt = new javax.swing.JTextField();
        unamelbl = new javax.swing.JLabel();
        usrnametxt = new javax.swing.JTextField();
        paswdlbl = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        addresslbl = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        citylbl = new javax.swing.JLabel();
        citytxt = new javax.swing.JTextField();
        statelbl = new javax.swing.JLabel();
        state_txt = new javax.swing.JTextField();
        ziplbl = new javax.swing.JLabel();
        lblzip = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        signupbtn = new javax.swing.JButton();
        genderlbl = new javax.swing.JLabel();
        gender_cmb = new javax.swing.JComboBox<>();
        telephnum_lbl = new javax.swing.JLabel();
        telenum_txt = new javax.swing.JTextField();
        dob_lbl = new javax.swing.JLabel();
        dob_txt = new javax.swing.JTextField();
        labname_lbl = new javax.swing.JLabel();
        labname_txt = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        admintitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        admintitle.setText("Create Technician Profile");

        namelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        namelbl.setText("Name:");

        fullname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fullname_txtKeyReleased(evt);
            }
        });

        unamelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        unamelbl.setText("Username:");

        paswdlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        paswdlbl.setText("Password:");

        addresslbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addresslbl.setText("Address:");

        addresstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addresstxtKeyReleased(evt);
            }
        });

        citylbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        citylbl.setText("City:");

        citytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citytxtActionPerformed(evt);
            }
        });
        citytxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                citytxtKeyReleased(evt);
            }
        });

        statelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        statelbl.setText("State:");

        state_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                state_txtActionPerformed(evt);
            }
        });
        state_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                state_txtKeyReleased(evt);
            }
        });

        ziplbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ziplbl.setText("Zip Code:");

        lblzip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblzipActionPerformed(evt);
            }
        });
        lblzip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblzipKeyReleased(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        signupbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        genderlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        genderlbl.setText("Gender:");

        gender_cmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        gender_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        telephnum_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telephnum_lbl.setText("Phone no.:");

        telenum_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telenum_txtActionPerformed(evt);
            }
        });
        telenum_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                telenum_txtKeyReleased(evt);
            }
        });

        dob_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dob_lbl.setText("Date of Birth:");

        dob_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dob_txtActionPerformed(evt);
            }
        });
        dob_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dob_txtKeyReleased(evt);
            }
        });

        labname_lbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labname_lbl.setText("Lab Name:");

        labname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labname_txtActionPerformed(evt);
            }
        });
        labname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                labname_txtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signupbtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(223, 223, 223)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labname_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(labname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(paswdlbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(citylbl)
                                            .addComponent(addresslbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(telephnum_lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(telenum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(namelbl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(unamelbl))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(usrnametxt)
                                            .addComponent(fullname_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                        .addGap(1, 1, 1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dob_lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dob_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(genderlbl)
                                .addComponent(ziplbl)
                                .addComponent(statelbl))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblzip)
                                .addComponent(gender_cmb, 0, 220, Short.MAX_VALUE)
                                .addComponent(state_txt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(admintitle)))
                .addContainerGap(431, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admintitle)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namelbl)
                    .addComponent(fullname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamelbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paswdlbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addresslbl)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citylbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statelbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ziplbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlbl)
                    .addComponent(gender_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telenum_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telephnum_lbl))
                .addGap(18, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labname_lbl)
                    .addComponent(labname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(signupbtn))
                .addGap(446, 446, 446))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fullname_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fullname_txtKeyReleased
        
    }//GEN-LAST:event_fullname_txtKeyReleased

    private void addresstxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addresstxtKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_addresstxtKeyReleased

    private void citytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_citytxtActionPerformed

    private void citytxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_citytxtKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_citytxtKeyReleased

    private void state_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_state_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_state_txtActionPerformed

    private void state_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_state_txtKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_state_txtKeyReleased

    private void lblzipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblzipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblzipActionPerformed

    private void lblzipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblzipKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_lblzipKeyReleased

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = addresstxt.getText() + citytxt.getText() + state_txt.getText() + lblzip.getText();
                    //uname, pswd, id, name, add, gender, telenum, dob
                    //(txtFullName.getText(), txtNo.getText(), address, txtUsrName.getText(), txtPass.getText());

                    Technician tech = new Technician(usrnametxt.getText(), passtxt.getText(), "idid", fullname_txt.getText(), address, gender_cmb.getSelectedItem().toString(), telenum_txt.getText(), new Date(),labname_txt.getText());

                    operatingSystem.addTechnician(tech);
                    dB4OUtility.storeSystem(operatingSystem);

                    MainJFrameForm suc = new MainJFrameForm();
                    ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
                    suc.setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Some Error in entered data.Please check over the red fields to know more.");
                    validationCheck=true;
                }
            }
            else{
                JOptionPane.showMessageDialog(this,"Data Cant be empty. Please check over the red fields to know more.");
                emptyValidationStatus=true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Technician not registered, Try again");
            emptyValidationStatus=true;
        }
       
    }//GEN-LAST:event_signupbtnActionPerformed

    private boolean RegexValidation() {
    if(!fullname_txt.getText().matches("^[a-zA-Z ]+$"))
        {
            fullname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            fullname_txt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!telenum_txt.getText().matches("^[0-9]{10}$"))
        {
            telenum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            telenum_txt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!lblzip.getText().matches("^[0-9]{5}$"))
        {
            lblzip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            lblzip.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }

        // if(!labname_txt.getText().matches("^[0-9]{5}$"))
        // {
        //     labname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //     labname_txt.setToolTipText("Please enter a 5 digit number");
        //     validationCheck=false;
        // }

        return validationCheck;
    }   


    private boolean EmpytyFieldValidation() {
        if(addresstxt.getText().equals(null) || addresstxt.getText().trim().isEmpty() )
        {
            addresstxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            addresstxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!addresstxt.getText().equals(null) && !addresstxt.getText().trim().isEmpty() )
        {
            addresstxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(citytxt.getText().equals(null) || citytxt.getText().trim().isEmpty() )
        {
            citytxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            citytxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!citytxt.getText().equals(null) && !citytxt.getText().trim().isEmpty() )
        {
            citytxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(fullname_txt.getText().equals(null) || fullname_txt.getText().trim().isEmpty() )
        {
            fullname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            fullname_txt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!fullname_txt.getText().equals(null) && !fullname_txt.getText().trim().isEmpty() )
        {
            fullname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(passtxt.getText().equals(null) || passtxt.getText().trim().isEmpty() )
        {
            passtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            passtxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!passtxt.getText().equals(null) && !passtxt.getText().trim().isEmpty() )
        {
            passtxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(state_txt.getText().equals(null) || state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            state_txt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!state_txt.getText().equals(null) && !state_txt.getText().trim().isEmpty() )
        {
            state_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(usrnametxt.getText().equals(null) || usrnametxt.getText().trim().isEmpty() )
            {
                usrnametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                usrnametxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!usrnametxt.getText().equals(null) && !usrnametxt.getText().trim().isEmpty() )
        {
            usrnametxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(lblzip.getText().equals(null) || lblzip.getText().trim().isEmpty() )
            {
                lblzip.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                lblzip.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!lblzip.getText().equals(null) && !lblzip.getText().trim().isEmpty() )
        {
            lblzip.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(labname_txt.getText().equals(null) || labname_txt.getText().trim().isEmpty() )
            {
                labname_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                labname_txt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!labname_txt.getText().equals(null) && !labname_txt.getText().trim().isEmpty() )
        {
            labname_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(telenum_txt.getText().equals(null) || telenum_txt.getText().trim().isEmpty() )
            {
                telenum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                telenum_txt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!telenum_txt.getText().equals(null) && !telenum_txt.getText().trim().isEmpty() )
        {
            telenum_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(dob_txt.getText().equals(null) || dob_txt.getText().trim().isEmpty() )
            {
                dob_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                dob_txt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!dob_txt.getText().equals(null) && !dob_txt.getText().trim().isEmpty() )
        {
            dob_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return emptyValidationStatus;
    }
    
    private void telenum_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telenum_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telenum_txtActionPerformed

    private void telenum_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telenum_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_telenum_txtKeyReleased

    private void dob_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dob_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_txtActionPerformed

    private void dob_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dob_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dob_txtKeyReleased

    private void labname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labname_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_labname_txtActionPerformed

    private void labname_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labname_txtKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_labname_txtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslbl;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JLabel admintitle;
    private javax.swing.JButton btnback;
    private javax.swing.JLabel citylbl;
    private javax.swing.JTextField citytxt;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JTextField dob_txt;
    private javax.swing.JTextField fullname_txt;
    private javax.swing.JComboBox<String> gender_cmb;
    private javax.swing.JLabel genderlbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labname_lbl;
    private javax.swing.JTextField labname_txt;
    private javax.swing.JTextField lblzip;
    private javax.swing.JLabel namelbl;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel paswdlbl;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField state_txt;
    private javax.swing.JLabel statelbl;
    private javax.swing.JTextField telenum_txt;
    private javax.swing.JLabel telephnum_lbl;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JTextField usrnametxt;
    private javax.swing.JLabel ziplbl;
    // End of variables declaration//GEN-END:variables
}

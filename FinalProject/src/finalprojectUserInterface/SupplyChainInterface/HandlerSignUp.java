/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.SupplyChainInterface;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;

import finalprojectBackend.Enterprise.SupplyChain.Handler;
import finalprojectBackend.Enterprise.SupplyChain.Vehicle;

import finalprojectUserInterface.MainJFrameForm;
import java.awt.Color;

import java.util.Date;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author supriyaa
 */
public class HandlerSignUp extends javax.swing.JPanel {

    /**
     * Creates new form HandlerSignUp
     */
    
    Random rand = new Random();
    
    
    boolean emptyValidationStatus = true;
    boolean validationCheck = true;
    
    MainJFrameForm MainLPage;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;
    
    public HandlerSignUp(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        
        for(Vehicle h: operatingSystem.getVehicleDirectory()){
            String s = h.getVehiclenum()+"| " + h.getVehiclename()+" | "+ h.getVehicletype();
            vehicle_cmb.addItem(s);
        }
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
        Namelbl = new javax.swing.JLabel();
        unamelbl = new javax.swing.JLabel();
        FullNametxt = new javax.swing.JTextField();
        UsrNametxt = new javax.swing.JTextField();
        pswdlbl = new javax.swing.JLabel();
        Passtxt = new javax.swing.JPasswordField();
        addresslbl = new javax.swing.JLabel();
        Add_txt = new javax.swing.JTextField();
        City_lbl = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        State_lbl = new javax.swing.JLabel();
        Zip_lbl = new javax.swing.JLabel();
        Statetxt = new javax.swing.JTextField();
        Ziptxt = new javax.swing.JTextField();
        BackBtn = new javax.swing.JButton();
        Genderlbl = new javax.swing.JLabel();
        signupBtn = new javax.swing.JButton();
        telenum_lbl = new javax.swing.JLabel();
        genderCmb = new javax.swing.JComboBox<>();
        dob_lbl = new javax.swing.JLabel();
        telenum_txt = new javax.swing.JTextField();
        vehnum_lbl = new javax.swing.JLabel();
        dob_txt = new javax.swing.JTextField();
        vehicle_cmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        admintitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        admintitle.setForeground(new java.awt.Color(0, 51, 51));
        admintitle.setText("Create Handler Profile");
        jPanel1.add(admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        Namelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Namelbl.setForeground(new java.awt.Color(0, 0, 0));
        Namelbl.setText("Name:");
        jPanel1.add(Namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, 20));

        unamelbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unamelbl.setForeground(new java.awt.Color(0, 0, 0));
        unamelbl.setText("Username:");
        jPanel1.add(unamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));
        jPanel1.add(FullNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 216, -1));
        jPanel1.add(UsrNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 216, -1));

        pswdlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pswdlbl.setForeground(new java.awt.Color(0, 0, 0));
        pswdlbl.setText("Password:");
        jPanel1.add(pswdlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 20));
        jPanel1.add(Passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, 216, -1));

        addresslbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addresslbl.setForeground(new java.awt.Color(0, 0, 0));
        addresslbl.setText("Address:");
        jPanel1.add(addresslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));
        jPanel1.add(Add_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 216, -1));

        City_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        City_lbl.setForeground(new java.awt.Color(0, 0, 0));
        City_lbl.setText("City:");
        jPanel1.add(City_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 216, -1));

        State_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        State_lbl.setForeground(new java.awt.Color(0, 0, 0));
        State_lbl.setText("State:");
        jPanel1.add(State_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, -1, -1));

        Zip_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Zip_lbl.setForeground(new java.awt.Color(0, 0, 0));
        Zip_lbl.setText("Zip Code:");
        jPanel1.add(Zip_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, -1, -1));

        Statetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatetxtActionPerformed(evt);
            }
        });
        jPanel1.add(Statetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 216, -1));
        jPanel1.add(Ziptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 215, -1));

        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 659, 87, 40));

        Genderlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Genderlbl.setForeground(new java.awt.Color(0, 0, 0));
        Genderlbl.setText("Gender:");
        jPanel1.add(Genderlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, 20));

        signupBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupBtn.setText("Sign Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 659, 87, 40));

        telenum_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telenum_lbl.setForeground(new java.awt.Color(0, 0, 0));
        telenum_lbl.setText("Phone no.:");
        jPanel1.add(telenum_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        genderCmb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        genderCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel1.add(genderCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 216, -1));

        dob_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dob_lbl.setForeground(new java.awt.Color(0, 0, 0));
        dob_lbl.setText("Date of Birth:");
        jPanel1.add(dob_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 550, -1, 30));
        jPanel1.add(telenum_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 216, -1));

        vehnum_lbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehnum_lbl.setForeground(new java.awt.Color(0, 0, 0));
        vehnum_lbl.setText("Vehicle:");
        jPanel1.add(vehnum_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 600, -1, 20));
        jPanel1.add(dob_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 216, 27));

        vehicle_cmb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(vehicle_cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, 216, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/delivery.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -250, 2310, 1300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1406, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed

        MainJFrameForm suc = new MainJFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // TODO add your handling code here:
        
        try {
            if(EmpytyFieldValidation())
            {
                if(RegexValidation())
                {
                    String address = Add_txt.getText() + txtCity.getText() + Statetxt.getText() + Ziptxt.getText();
                    int id = rand.nextInt(99);
                    

                    Handler handler = new Handler(UsrNametxt.getText(), Passtxt.getText(), String.valueOf(id), FullNametxt.getText(), address,genderCmb.getSelectedItem().toString(), telenum_txt.getText(), new Date(),operatingSystem.getVehicleByNumber(vehicle_cmb.getSelectedItem().toString()));
                    System.out.println("handler " + handler.getVehicle().getVehiclename());
                    operatingSystem.addHandler(handler);
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
        }
        
        /*
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
                JOptionPane.showMessageDialog(this,"Patient not registered, Try again");
                emptyValidationStatus=true;
            }
            */
        
    }//GEN-LAST:event_signupBtnActionPerformed

    private void StatetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatetxtActionPerformed

    private boolean RegexValidation() {
    if(!FullNametxt.getText().matches("^[a-zA-Z ]+$"))
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            FullNametxt.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(!telenum_txt.getText().matches("^[0-9]{10}$"))
        {
            telenum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            telenum_txt.setToolTipText("Please enter a 10 digit number");
            validationCheck=false;
        }


        if(!Ziptxt.getText().matches("^[0-9]{5}$"))
        {
            Ziptxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Ziptxt.setToolTipText("Please enter a 5 digit number");
            validationCheck=false;
        }

        // if(!telenum_txt.getText().matches("^[0-9]{5}$"))
        // {
        //     telenum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //     telenum_txt.setToolTipText("Please enter a 5 digit number");
        //     validationCheck=false;
        // }

        return validationCheck;


    }   


    private boolean EmpytyFieldValidation() {

        if(FullNametxt.getText().equals(null) || FullNametxt.getText().trim().isEmpty() )
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            FullNametxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!FullNametxt.getText().equals(null) && !FullNametxt.getText().trim().isEmpty() )
        {
            FullNametxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(Statetxt.getText().equals(null) || Statetxt.getText().trim().isEmpty() )
        {
            Statetxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Statetxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!Statetxt.getText().equals(null) && !Statetxt.getText().trim().isEmpty() )
        {
            Statetxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(Passtxt.getText().equals(null) || Passtxt.getText().trim().isEmpty() )
        {
            Passtxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Passtxt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!Passtxt.getText().equals(null) && !Passtxt.getText().trim().isEmpty() )
        {
            Passtxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        
        if(Add_txt.getText().equals(null) || Add_txt.getText().trim().isEmpty() )
        {
            Add_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            Add_txt.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!Add_txt.getText().equals(null) && !Add_txt.getText().trim().isEmpty() )
        {
            Add_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(txtCity.getText().equals(null) || txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtCity.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtCity.getText().equals(null) && !txtCity.getText().trim().isEmpty() )
        {
            txtCity.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(Statetxt.getText().equals(null) || Statetxt.getText().trim().isEmpty() )
            {
                Statetxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                Statetxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!Statetxt.getText().equals(null) && !Statetxt.getText().trim().isEmpty() )
        {
            Statetxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }

        if(Ziptxt.getText().equals(null) || Ziptxt.getText().trim().isEmpty() )
            {
                Ziptxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                Ziptxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!Ziptxt.getText().equals(null) && !Ziptxt.getText().trim().isEmpty() )
        {
            Ziptxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
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

        // if(telenum_txt.getText().equals(null) || telenum_txt.getText().trim().isEmpty() )
        //     {
        //         telenum_txt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        //         telenum_txt.setToolTipText("This Field Cannot be empty");
        //         emptyValidationStatus= false;
        //     }
        // if(!telenum_txt.getText().equals(null) && !telenum_txt.getText().trim().isEmpty() )
        // {
        //     telenum_txt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        // }

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
        
        if(UsrNametxt.getText().equals(null) || UsrNametxt.getText().trim().isEmpty() )
            {
                UsrNametxt.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                UsrNametxt.setToolTipText("This Field Cannot be empty");
                emptyValidationStatus= false;
            }
        if(!UsrNametxt.getText().equals(null) && !UsrNametxt.getText().trim().isEmpty() )
        {
            UsrNametxt.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Add_txt;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel City_lbl;
    private javax.swing.JTextField FullNametxt;
    private javax.swing.JLabel Genderlbl;
    private javax.swing.JLabel Namelbl;
    private javax.swing.JPasswordField Passtxt;
    private javax.swing.JLabel State_lbl;
    private javax.swing.JTextField Statetxt;
    private javax.swing.JTextField UsrNametxt;
    private javax.swing.JLabel Zip_lbl;
    private javax.swing.JTextField Ziptxt;
    private javax.swing.JLabel addresslbl;
    private javax.swing.JLabel admintitle;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JTextField dob_txt;
    private javax.swing.JComboBox<String> genderCmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel pswdlbl;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel telenum_lbl;
    private javax.swing.JTextField telenum_txt;
    private javax.swing.JTextField txtCity;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JComboBox<String> vehicle_cmb;
    private javax.swing.JLabel vehnum_lbl;
    // End of variables declaration//GEN-END:variables
}

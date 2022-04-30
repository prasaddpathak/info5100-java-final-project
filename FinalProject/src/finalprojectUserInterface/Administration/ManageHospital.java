/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.Hospital.Hospital;
import finalprojectBackend.Enterprise.Hospital.Nurse;
import finalprojectBackend.Enterprise.Hospital.Patient;
import finalprojectBackend.Enterprise.Hospital.Doc;
import finalprojectUserInterface.MainJFrameForm;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author supriyaa
 */
public class ManageHospital extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospital
     */
    MainJFrameForm MainLPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageHospital(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateTable();
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
        admintitle_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPaneDoctor = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        getdetails_btn = new javax.swing.JButton();
        jScrollPaneNurse = new javax.swing.JScrollPane();
        tb3 = new javax.swing.JTable();
        jScrollPanePatient = new javax.swing.JScrollPane();
        tb4 = new javax.swing.JTable();
        DocDetails_lbl = new javax.swing.JLabel();
        Nursedet_lbl = new javax.swing.JLabel();
        patientDet_lbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        admintitle_lbl.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        admintitle_lbl.setForeground(new java.awt.Color(0, 0, 0));
        admintitle_lbl.setText("Administration");

        tb1.setBackground(new java.awt.Color(255, 255, 255));
        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hospital name", "User ID", "Registration No.", "Address"
            }
        ));
        jScrollPane1.setViewportView(tb1);

        tb2.setBackground(new java.awt.Color(255, 255, 255));
        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "User ID", "Hospital Name", "Address"
            }
        ));
        jScrollPaneDoctor.setViewportView(tb2);

        getdetails_btn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getdetails_btn.setText("Get Details");
        getdetails_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdetails_btnActionPerformed(evt);
            }
        });

        tb3.setBackground(new java.awt.Color(255, 255, 255));
        tb3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nurse Name", "User ID", "Hospital Name", "Address"
            }
        ));
        jScrollPaneNurse.setViewportView(tb3);

        tb4.setBackground(new java.awt.Color(255, 255, 255));
        tb4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Hospital Name", "Diagnosis"
            }
        ));
        jScrollPanePatient.setViewportView(tb4);

        DocDetails_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        DocDetails_lbl.setForeground(new java.awt.Color(0, 0, 0));
        DocDetails_lbl.setText("Doctor Details");

        Nursedet_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        Nursedet_lbl.setForeground(new java.awt.Color(0, 0, 0));
        Nursedet_lbl.setText("Nurse Details");

        patientDet_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        patientDet_lbl.setForeground(new java.awt.Color(0, 0, 0));
        patientDet_lbl.setText("Patient Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPanePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPaneNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPaneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DocDetails_lbl)
                                        .addGap(364, 364, 364))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patientDet_lbl)
                                            .addComponent(Nursedet_lbl))
                                        .addGap(360, 360, 360))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(583, 583, 583)
                        .addComponent(getdetails_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(538, 538, 538)
                        .addComponent(admintitle_lbl)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(admintitle_lbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(getdetails_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(DocDetails_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Nursedet_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneNurse, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(patientDet_lbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPanePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1276, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void getdetails_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdetails_btnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String hospitalName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" hospitalDoctorSeach: " + hospitalName);
        Hospital h = operatingSystem.getHospitalDirectory().findHospital(hospitalName);
        //        System.out.println(" "+h.getDoctordirectory().get(0).getName());
        populateDoctorTable(operatingSystem.getDoctorDirectory(), hospitalName);
        populatePatientTable(operatingSystem.getPatientDirectory(), hospitalName);
        populateNurseTable(operatingSystem.getNurseDirectory(), hospitalName);
    }//GEN-LAST:event_getdetails_btnActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (Hospital h : operatingSystem.getHospitalDirectory().getListOfHospitals()) {

            Object[] row = new Object[5];
            row[0] = h.getEnterpriseName();
            row[1] = h.getUserName();
            row[2] = h.getRegNumber();
            row[3] = h.getAddress();
            model.addRow(row);
        }

    }

    private void populateDoctorTable(ArrayList<Doc> doctors, String hosp) {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setRowCount(0);

        for (Doc d : doctors) {
            
            Object[] row = new Object[5];
            if (d.getHospitalName().equals(hosp)) {

                row[0] = d.getPersonName();
                row[1] = d.getUserName();
                row[2] = d.getHospitalName();
                row[3] = d.getAddress();
                model.addRow(row);
            }
        }
    }

    private void populateNurseTable(ArrayList<Nurse> nurse, String hosp) {
        DefaultTableModel model = (DefaultTableModel) tb3.getModel();
        model.setRowCount(0);

        for (Nurse d : nurse) {

            Object[] row = new Object[5];
            if (d.getHospitalName().equals(hosp)) {
                row[0] = d.getPersonName();
                row[1] = d.getUserName();
                row[2] = d.getHospitalName();
                row[3] = d.getAddress();
                model.addRow(row);
            } 
        }
    }

    private void populatePatientTable(ArrayList<Patient> patient, String hosp) {
        DefaultTableModel model = (DefaultTableModel) tb4.getModel();
        model.setRowCount(0);

        for (Patient d : patient) {

            Object[] row = new Object[5];
            if (d.getHospitalName().equals(hosp)) {
                row[0] = d.getPersonName();
                row[1] = d.getUserName();
                row[2] = d.getHospitalName();
                row[3] = d.getPtnDiagnosis();
                model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DocDetails_lbl;
    private javax.swing.JLabel Nursedet_lbl;
    private javax.swing.JLabel admintitle_lbl;
    private javax.swing.JButton getdetails_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneDoctor;
    private javax.swing.JScrollPane jScrollPaneNurse;
    private javax.swing.JScrollPane jScrollPanePatient;
    private javax.swing.JLabel patientDet_lbl;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    private javax.swing.JTable tb3;
    private javax.swing.JTable tb4;
    // End of variables declaration//GEN-END:variables
}

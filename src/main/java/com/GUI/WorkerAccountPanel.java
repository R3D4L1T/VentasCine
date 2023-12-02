package com.GUI;

import com.CODE.DAOTrabajador;
import com.CODE.Trabajador;
import com.DB.DAOTrabajadorImpl;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public final class WorkerAccountPanel extends javax.swing.JPanel {
    
    //public Administrador adminis = new Administrador();
    public Trabajador worker = new Trabajador();
    
    public WorkerAccountPanel() {
        initComponents();
        initStyle();
        initContent();
    }
    
    public void recolectUser(String userName){
        
        DAOTrabajador dao = new DAOTrabajadorImpl();
        worker = dao.getTrabajador(userName);
        btnProfile.setText(worker.getNombre());
        txtFullname.setText(worker.getNombre());
        txtUsername.setText(worker.getApellidos());
        txtEmail.setText(worker.getNumIdCard());
        txtRol.setText(worker.getRol());
        
    }
    public void initStyle(){
        
        txtActualPasswordM.putClientProperty("JTextField.placeholderText", "enter the actual password");
        txtNewPasswordM.putClientProperty("JTextField.placeholderText", "enter new Password");
        txtConfirmPasswordM.putClientProperty("JTextField.placeholderText", "enter the confirm password");
    }
    public void initContent(){
        lblFullname.setVisible(false);
        lblUsernameM.setVisible(false);
        lblEmailM.setVisible(false);
        lblActualPassword.setVisible(false);
        lblNewPassword.setVisible(false);
        lblConfirmNewPassword.setVisible(false);
        
        txtFullnameM.setVisible(false);
        txtUsernameM.setVisible(false);
        txtEmailM.setVisible(false);        
        txtActualPasswordM.setVisible(false);
        txtNewPasswordM.setVisible(false);
        txtConfirmPasswordM.setVisible(false);
        
        btnModify.setVisible(false);
        
        roundPanel3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jPanel2 = new javax.swing.JPanel();
        btnProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        roundPanel2 = new com.GUI.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblFullname = new javax.swing.JLabel();
        txtFullnameM = new javax.swing.JTextField();
        lblUsernameM = new javax.swing.JLabel();
        txtUsernameM = new javax.swing.JTextField();
        btnModify = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rol = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblEmailM = new javax.swing.JLabel();
        txtEmailM = new javax.swing.JTextField();
        roundPanel3 = new com.GUI.RoundPanel();
        lblActualPassword = new javax.swing.JLabel();
        txtActualPasswordM = new javax.swing.JTextField();
        lblNewPassword = new javax.swing.JLabel();
        txtNewPasswordM = new javax.swing.JTextField();
        lblConfirmNewPassword = new javax.swing.JLabel();
        txtConfirmPasswordM = new javax.swing.JTextField();
        btnPassUpdate = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(968, 653));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        roundPanel1.setBackground(new java.awt.Color(70, 70, 70));

        jPanel2.setBackground(new java.awt.Color(45, 45, 45));

        btnProfile.setBackground(new java.awt.Color(0, 0, 0));
        btnProfile.setForeground(new java.awt.Color(255, 255, 255));
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnProfile.setText("worker worker");
        btnProfile.setBorder(null);
        btnProfile.setContentAreaFilled(false);
        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProfile.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnProfile.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man64.png"))); // NOI18N
        btnProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(btnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("full name");

        jLabel2.setText("ID Card number");

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel2.setForeground(new java.awt.Color(255, 255, 255));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("WARNING");
        roundPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 6, -1, -1));

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setText("DELETE ACCOUNT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        roundPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(255, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 0, 0));
        roundPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 320, 10));

        jButton2.setText("MODIFY DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(189, 17, 51));
        jSeparator1.setForeground(new java.awt.Color(189, 17, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblFullname.setText("name");

        lblUsernameM.setText("lastname");

        btnModify.setText("MODIFY");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        jLabel4.setText("username");

        rol.setText("rol");

        txtRol.setEditable(false);

        txtFullname.setEditable(false);

        txtUsername.setEditable(false);

        txtEmail.setEditable(false);

        lblEmailM.setText("ID card number");

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblActualPassword.setText("ACTUAL PASS");

        lblNewPassword.setText("NEW PASS");

        lblConfirmNewPassword.setText("CONFIRM NEW PASS");

        btnPassUpdate.setBackground(new java.awt.Color(204, 0, 0));
        btnPassUpdate.setText("PASSWORD UPDATE");
        btnPassUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmNewPassword)
                    .addComponent(lblNewPassword)
                    .addComponent(lblActualPassword))
                .addGap(32, 32, 32)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConfirmPasswordM, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(txtActualPasswordM)
                    .addComponent(txtNewPasswordM, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPassUpdate)
                .addGap(19, 19, 19))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActualPassword)
                    .addComponent(txtActualPasswordM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txtNewPasswordM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirmNewPassword)
                    .addComponent(txtConfirmPasswordM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnPassUpdate)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel4))
                                    .addGroup(roundPanel1Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rol)
                                            .addComponent(jLabel2))))
                                .addGap(42, 42, 42)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFullname)
                                    .addComponent(txtUsername)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(jButton2))
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFullname)
                                    .addComponent(lblUsernameM)
                                    .addComponent(lblEmailM))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFullnameM, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(txtUsernameM)
                                    .addComponent(txtEmailM)))
                            .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModify)
                        .addGap(118, 118, 118))))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rol)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(156, 156, 156)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFullname)
                    .addComponent(txtFullnameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsernameM)
                    .addComponent(txtUsernameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailM)
                    .addComponent(txtEmailM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        
    }//GEN-LAST:event_btnProfileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lblFullname.setVisible(true);
        lblUsernameM.setVisible(true);
        lblEmailM.setVisible(true);
        
        txtFullnameM.setVisible(true);
        txtUsernameM.setVisible(true);
        txtEmailM.setVisible(true);
        
        txtFullnameM.setText(worker.getNombre());
        txtUsernameM.setText(worker.getApellidos());
        txtEmailM.setText(worker.getNumIdCard());
        
        btnModify.setVisible(true);        
        roundPanel3.setVisible(true);
        
        lblActualPassword.setVisible(true);
        lblNewPassword.setVisible(true);
        lblConfirmNewPassword.setVisible(true);
        txtActualPasswordM.setVisible(true);
        txtNewPasswordM.setVisible(true);
        txtConfirmPasswordM.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        
        String n = txtFullnameM.getText();
        String lastn = txtUsernameM.getText();
        String email =  txtEmailM.getText();
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas modificar este usuario?", "Confirmación de modificacion", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            if(txtFullnameM.getText().isEmpty()|| txtUsernameM.getText().isEmpty()||txtEmailM.getText().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"complete all fields!!");
            return;
            }
            
            DAOTrabajador dao =  new DAOTrabajadorImpl();
            worker.setNombre(n);
            worker.setApellidos(lastn);
            worker.setNumIdCard(email);
            dao.modifyData(worker);
            
            lblFullname.setVisible(false);
            lblUsernameM.setVisible(false);
            lblEmailM.setVisible(false);

            txtFullnameM.setVisible(false);
            txtUsernameM.setVisible(false);
            txtEmailM.setVisible(false);
        
            btnModify.setVisible(false);
            
            roundPanel3.setVisible(false);
            
        } else {
        
        }
           
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este usuario?", "Confirmación de Eliminación", JOptionPane.YES_NO_OPTION);
    
        if (opcion == JOptionPane.YES_OPTION) {
            DAOTrabajador daao =  new DAOTrabajadorImpl();
            daao.remove(worker.getNombre());
            
            Window parentWindow = SwingUtilities.windowForComponent(this); 
            if (parentWindow instanceof JFrame) {
                JFrame frame = (JFrame) parentWindow;
                frame.dispose();
                PreLoginForm s = new PreLoginForm();
                s.setVisible(true);
            }                    
        } else {
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPassUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassUpdateActionPerformed
        String passActual = txtActualPasswordM.getText();
        String newPass = txtNewPasswordM.getText();
        String ConfirmPass =  txtConfirmPasswordM.getText();
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas modificar este usuario?", "Confirmación de modificacion", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
                        
            DAOTrabajador daaoo =  new DAOTrabajadorImpl();
            boolean verify = daaoo.loginVerify(worker.getNombre(),passActual, worker.getRol());
            
            if(verify){
                if(newPass.equals(ConfirmPass)){
                    worker.setPassword(newPass);
                    System.out.println("ssssssssssss"+passActual + newPass + ConfirmPass);
                    
                    System.out.println("aaaaaaaa"+worker.getPassword());
                    daaoo.modifyData(worker);
                    
                    txtActualPasswordM.setText("");
                    txtNewPasswordM.setText("");
                    txtConfirmPasswordM.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(null, "the new password is not confirmed");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "credentials incorrects");
            }
        } else {
        
        }
    }//GEN-LAST:event_btnPassUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnPassUpdate;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblActualPassword;
    private javax.swing.JLabel lblConfirmNewPassword;
    private javax.swing.JLabel lblEmailM;
    private javax.swing.JLabel lblFullname;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JLabel lblUsernameM;
    private javax.swing.JLabel rol;
    private com.GUI.RoundPanel roundPanel1;
    private com.GUI.RoundPanel roundPanel2;
    private com.GUI.RoundPanel roundPanel3;
    private javax.swing.JTextField txtActualPasswordM;
    private javax.swing.JTextField txtConfirmPasswordM;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailM;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtFullnameM;
    private javax.swing.JTextField txtNewPasswordM;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameM;
    // End of variables declaration//GEN-END:variables
}


package com.GUI;

import com.CODE.Cliente;
import com.CODE.DAOCliente;
import com.CODE.DAOTrabajador;
import com.CODE.Trabajador;
import com.DB.DAOClienteImpl;
import com.DB.DAOTrabajadorImpl;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class RegisterForm extends javax.swing.JFrame {
    String rol = "";
    Random rand =  new Random();
    public RegisterForm() {
        initComponents();
        initStyle();
    }
    
    public void initStyle(){
        
        txtFullName.putClientProperty("JTextField.placeholderText", "enter name");
        txtUsername.putClientProperty("JTextField.placeholderText", "enter last name");
        numIdCard.putClientProperty("JTextField.placeholderText", "enter number of ID Card");
        txtPhone.putClientProperty("JTextField.placeholderText", "enter number of phone");
        
    }
    public void verifyUser(String rl){
        rol = rl;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        lblMinimize = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        numIdCard = new javax.swing.JTextField();
        idCard = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(21, 21, 21));
        roundPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange, java.awt.Color.orange));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 140, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("App Cine");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 14, 210, -1));

        jSeparator1.setForeground(new java.awt.Color(240, 140, 0));
        roundPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 40, 487, 10));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 140, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userAdd48.png"))); // NOI18N
        jLabel4.setText("  REGISTER NEW CLIENT");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 140, 0)));
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 56, 308, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user32.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 38, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIdcard32.png"))); // NOI18N
        jLabel9.setText("jLabel5");
        roundPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 38, -1));

        txtFullName.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });
        roundPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 132, 348, -1));

        txtUsername.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        roundPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 170, 350, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        roundPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 130, 10, 230));

        btnRegister.setBackground(new java.awt.Color(51, 51, 51));
        btnRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        roundPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        lblMinimize.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseExited(evt);
            }
        });
        roundPanel1.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 9, 19, -1));

        lblExit.setFont(new java.awt.Font("MS Gothic", 1, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        roundPanel1.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 9, 19, -1));

        btnReturn.setBackground(new java.awt.Color(51, 51, 51));
        btnReturn.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("RETURN");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        roundPanel1.add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        numIdCard.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        numIdCard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numIdCardFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numIdCardFocusLost(evt);
            }
        });
        roundPanel1.add(numIdCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 340, 40));

        idCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Carnet de estranjeria" }));
        idCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idCardActionPerformed(evt);
            }
        });
        roundPanel1.add(idCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 109, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIdcard32.png"))); // NOI18N
        jLabel12.setText("jLabel5");
        roundPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 38, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user32.png"))); // NOI18N
        jLabel7.setText("jLabel5");
        roundPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 38, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userIdcard32.png"))); // NOI18N
        jLabel13.setText("jLabel5");
        roundPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 38, -1));
        roundPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 322, 340, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.orange);
        lblMinimize.setBorder(labelMinBorder);
        lblMinimize.setForeground(Color.orange);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        lblMinimize.setBorder(labelMinBorder);
        lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.red);
        lblExit.setBorder(labelMinBorder);
        lblExit.setForeground(Color.red);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        lblExit.setBorder(labelMinBorder);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseExited

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        
        int id = rand.nextInt(100);
        String name = txtFullName.getText();
        String lastname = txtUsername.getText();
        String IdCard = (String) idCard.getSelectedItem();
        String numCard = numIdCard.getText();
        String phone = txtPhone.getText();
        
        
        if(name.isEmpty()|| lastname.isEmpty()||numCard.isEmpty() ||phone.isEmpty() ){
            javax.swing.JOptionPane.showMessageDialog(this,"complete all fields!!","aviso",javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(phone.length() != 9){
            javax.swing.JOptionPane.showMessageDialog(this,"Ingrese un numero de telefono valido!!","aviso",javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        Cliente cl = new Cliente();
        cl.setId(id);
        cl.setNombre(name);
        cl.setApellidos(lastname);
        cl.setIdCard(IdCard);
        cl.setNumIdCard(numCard);
        cl.setRol(rol);
        cl.setPhone(phone);

        DAOCliente dao = new DAOClienteImpl();

        javax.swing.JOptionPane.showMessageDialog(this,"user add correct!!","msg",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        dao.register(cl);

        txtFullName.setText("");
        txtUsername.setText("");
        numIdCard.setText("");
        txtPhone.setText("");

        initStyle();
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
        txtFullName.setForeground(Color.black);
    }//GEN-LAST:event_txtFullNameFocusGained

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
        txtFullName.setForeground(new Color(153,153,153,153));
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        txtUsername.setForeground(Color.black);
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        txtUsername.setForeground(new Color(153,153,153,153));
    }//GEN-LAST:event_txtUsernameFocusLost

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void numIdCardFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numIdCardFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_numIdCardFocusGained

    private void numIdCardFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numIdCardFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numIdCardFocusLost

    private void idCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idCardActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> idCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JTextField numIdCard;
    private com.GUI.RoundPanel roundPanel1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

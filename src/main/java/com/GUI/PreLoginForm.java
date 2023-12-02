package com.GUI;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class PreLoginForm extends javax.swing.JFrame {

    public PreLoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUserLogin4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        btnParentLogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        btnAdminLogin = new javax.swing.JButton();

        btnUserLogin4.setBackground(new java.awt.Color(0, 0, 0));
        btnUserLogin4.setForeground(new java.awt.Color(255, 255, 255));
        btnUserLogin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnUserLogin4.setText("ENTER USER");
        btnUserLogin4.setBorder(null);
        btnUserLogin4.setContentAreaFilled(false);
        btnUserLogin4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserLogin4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUserLogin4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnUserLogin4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man64.png"))); // NOI18N
        btnUserLogin4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(46, 48, 62));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(209, 209, 209));
        jLabel1.setText("App Cine");

        btnParentLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnParentLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnParentLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnParentLogin.setText("Ingresar trabajador");
        btnParentLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        btnParentLogin.setContentAreaFilled(false);
        btnParentLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnParentLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnParentLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnParentLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man64.png"))); // NOI18N
        btnParentLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnParentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentLoginActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hello48.png"))); // NOI18N
        jLabel5.setText(" WELLCOME TO APP CINE");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 0)));

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

        btnAdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdminLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnAdminLogin.setText("Ingresar administrador");
        btnAdminLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        btnAdminLogin.setContentAreaFilled(false);
        btnAdminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdminLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man48.png"))); // NOI18N
        btnAdminLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man64.png"))); // NOI18N
        btnAdminLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addComponent(btnParentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(61, 61, 61)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnParentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdminLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(275, 275, 275))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseExited
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        lblMinimize.setBorder(labelMinBorder);
        lblMinimize.setForeground(Color.white);
    }//GEN-LAST:event_lblMinimizeMouseExited

    private void lblMinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseEntered
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.orange);
        lblMinimize.setBorder(labelMinBorder);
        lblMinimize.setForeground(Color.orange);
    }//GEN-LAST:event_lblMinimizeMouseEntered

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        lblExit.setBorder(labelMinBorder);
        lblExit.setForeground(Color.white);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        Border labelMinBorder = BorderFactory.createMatteBorder(1,1,1,1, Color.red);
        lblExit.setBorder(labelMinBorder);
        lblExit.setForeground(Color.red);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        LoginForm login = new LoginForm();
        login.secureLogin();
        this.setVisible(false);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.viewMessage(1);
        
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void btnParentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentLoginActionPerformed
        LoginForm login = new LoginForm();
        this.setVisible(false);
        login.secureLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        login.viewMessage(2);
    }//GEN-LAST:event_btnParentLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnParentLogin;
    private javax.swing.JButton btnUserLogin4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMinimize;
    private com.GUI.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}

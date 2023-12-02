/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.GUI;


import com.CODE.DAOTrabajador;
import com.CODE.Trabajador;
import com.DB.DAOTrabajadorImpl;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class AdminUsersPanel extends javax.swing.JPanel {
    
    public AdminUsersPanel() {
        initComponents();
        initStyle();
        loadUsers();
    }
    
    public void initStyle(){
        txtSearch.putClientProperty("JTextField.placeholderText", "enter name for search");
    }
    
    public void loadUsers(){
        try{
            DAOTrabajador dao = new DAOTrabajadorImpl();
            DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
            dao.listaTrabajador().forEach((u) -> model.addRow(new Object [] {u.getId(),u.getNombre(),u.getApellidos(),u.getIdCard(),u.getNumIdCard(),u.getRol(),u.getSalario(),u.getPassword()}));
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlUsers = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsers = new rojeru_san.complementos.RSTableMetro();

        jPanel1.setBackground(new java.awt.Color(21, 21, 21));

        pnlUsers.setBackground(new java.awt.Color(70, 70, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("WORKER TABLE");

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRemove.setText("delete");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "name", "last name", "ID Card", "ID card number", "rol", "salary", "pass"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.setColorBackgoundHead(new java.awt.Color(204, 51, 0));
        tblUsers.setColorFilasForeground1(new java.awt.Color(153, 51, 0));
        tblUsers.setColorFilasForeground2(new java.awt.Color(153, 102, 0));
        tblUsers.setColorSelBackgound(new java.awt.Color(204, 153, 0));
        tblUsers.setSelectionBackground(new java.awt.Color(102, 102, 0));
        jScrollPane2.setViewportView(tblUsers);

        javax.swing.GroupLayout pnlUsersLayout = new javax.swing.GroupLayout(pnlUsers);
        pnlUsers.setLayout(pnlUsersLayout);
        pnlUsersLayout.setHorizontalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUsersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRemove)
                .addGap(203, 203, 203))
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlUsersLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlUsersLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1))
                    .addGroup(pnlUsersLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlUsersLayout.setVerticalGroup(
            pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUsersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(pnlUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnRemove)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        DAOTrabajador dao = new DAOTrabajadorImpl();
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        
        for(int i : tblUsers.getSelectedRows()){
            try{
                dao.remove((String) tblUsers.getValueAt(i,1));
                model.removeRow(i);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String val = txtSearch.getText();
    
        try {
            DAOTrabajador dao = new DAOTrabajadorImpl();
            ArrayList<Trabajador> list = dao.listaTrabajador();
            ArrayList<Trabajador> results = new ArrayList<>();

            if (val.isEmpty()) {
                results.addAll(list);
            } else {                
                for (Trabajador tr : list) {               
                    if (tr.getNombre().contains(val)) {
                        results.add(tr);
                    }
                }
            }
        
            try{        
                DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
                model.setRowCount(0);
                results.forEach((u) -> model.addRow(new Object [] {u.getId(),u.getNombre(),u.getApellidos(),u.getIdCard(),u.getNumIdCard(),u.getRol(),u.getSalario(),u.getPassword()}));           
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.GUI.RoundPanel pnlUsers;
    private rojeru_san.complementos.RSTableMetro tblUsers;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

package com.GUI;

import com.CODE.DAOProducto;
import com.CODE.DAOTrabajador;
import com.CODE.Producto;
import com.CODE.Trabajador;
import com.DB.DAOProductoImpl;
import com.DB.DAOTrabajadorImpl;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;


public class AdminProducts extends javax.swing.JPanel {
    Random rand = new Random();
    public AdminProducts() {
        initComponents();
        loadProducts();
        initContent();
    }
    
    public void initContent(){
        jTextField1.putClientProperty("JTextField.placeholderText", "enter name");
        jTextField2.putClientProperty("JTextField.placeholderText", "enter the stock");
        jTextField3.putClientProperty("JTextField.placeholderText", "enter price by unit of measure");
        txtResearch.putClientProperty("JTextField.placeholderText", "enter name to search");
    }
    
    public void loadProducts(){
        try{
            DAOProducto dao = new DAOProductoImpl();
            DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
            dao.listProducts().forEach((p) -> model.addRow(new Object [] {p.getId(),p.getNombre(),p.getStock(),p.getMeasure(),p.getPrecio()}));
            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new rojeru_san.complementos.RSTableMetro();
        jButton2 = new javax.swing.JButton();
        txtResearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Products");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nombre");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 63, -1, -1));
        roundPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 86, 243, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("stock");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 63, -1, -1));
        roundPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("unit price");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 63, -1, -1));
        roundPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 86, 243, -1));

        jButton1.setText("saved");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 126, -1, -1));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Stock", "Measure", "unit price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setColorBackgoundHead(new java.awt.Color(204, 51, 0));
        tblProducts.setColorFilasForeground1(new java.awt.Color(153, 51, 0));
        tblProducts.setColorFilasForeground2(new java.awt.Color(153, 102, 0));
        tblProducts.setColorSelBackgound(new java.awt.Color(204, 153, 0));
        tblProducts.setSelectionBackground(new java.awt.Color(153, 153, 0));
        jScrollPane1.setViewportView(tblProducts);

        roundPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 167, 800, 271));

        jButton2.setText("search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));
        roundPanel1.add(txtResearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 153, -1));

        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, -1, -1));

        jButton4.setText("modify");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "unit", "m", "kg", "gr", " " }));
        roundPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int id = rand.nextInt(100,1000);
        String n = jTextField1.getText();
        int stk = 0;
        float unitPrice= 0;
        String measure = (String) jComboBox1.getSelectedItem();
        
        
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "complete all fields!!");
                return;
        }
        try {
            stk = Integer.parseInt(jTextField2.getText());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,"error: the stock not number!!","aviso",javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            unitPrice = Float.parseFloat(jTextField3.getText());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,"error: the price by unit not number!!","aviso",javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Producto p =  new Producto(id,n,stk,measure,unitPrice);
        
        DAOProducto dao =  new DAOProductoImpl();
        dao.register(p);
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);
        loadProducts();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String val = txtResearch.getText();
    
        try {
            DAOProducto dao = new DAOProductoImpl();
            ArrayList<Producto> list = dao.listProducts();
            ArrayList<Producto> results = new ArrayList<>();

            if (val.isEmpty()) {
                results.addAll(list);
            } else {                
                for (Producto pd : list) {               
                    if (pd.getNombre().contains(val)) {
                        results.add(pd);
                    }
                }
            }
        
            try{        
                DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
                model.setRowCount(0);
                results.forEach((p) -> model.addRow(new Object [] {p.getId(),p.getNombre(),p.getStock(),p.getMeasure(),p.getPrecio()}));           
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DAOProducto dao = new DAOProductoImpl();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        
        for(int i : tblProducts.getSelectedRows()){
            try{
                dao.removeProduct((String) tblProducts.getValueAt(i,1));
                model.removeRow(i);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DAOProducto dao = new DAOProductoImpl();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        
        for(int i : tblProducts.getSelectedRows()){
            try{
                Producto pd = dao.getProduct((String)tblProducts.getValueAt(i,1));
                System.out.println(pd.getNombre());
                ProductMod d =  new ProductMod();
                d.setVisible(true);
                d.setLocationRelativeTo(null);
                d.getProduct(pd);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.GUI.RoundPanel roundPanel1;
    private rojeru_san.complementos.RSTableMetro tblProducts;
    private javax.swing.JTextField txtResearch;
    // End of variables declaration//GEN-END:variables
}

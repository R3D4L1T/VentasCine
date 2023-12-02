package com.GUI;

import com.CODE.DAOAdministrador;
import com.CODE.DAOProducto;
import com.CODE.Producto;
import com.DB.DAOAdministradorImpl;
import com.DB.DAOProductoImpl;
import javax.swing.JOptionPane;

public class ProductMod extends javax.swing.JFrame {
    Producto product = new Producto();
    public ProductMod() {
        initComponents();
    }
    
    public void getProduct(Producto p){
        product = p;
        loadData();
    }
    
    public void loadData(){
        jLabel1.setText("MODIFY " + product.getNombre());
        jTextField1.setText(product.getNombre());
        jTextField2.setText(Integer.toString(product.getStock()));
        jTextField3.setText(product.getMeasure());
        jTextField4.setText(Float.toString(product.getPrecio()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));
        roundPanel1.setForeground(new java.awt.Color(255, 255, 255));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 270, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("nombre");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 83, 55, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("stock");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 117, 55, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("measure");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 151, 55, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("priceUnit");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 189, -1, -1));

        jTextField1.setText("jTextField1");
        roundPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 83, 250, -1));

        jTextField2.setText("jTextField2");
        roundPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 117, 250, -1));

        jTextField3.setText("jTextField3");
        roundPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 250, -1));

        jTextField4.setText("jTextField4");
        roundPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, -1));

        jButton1.setText("saved");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String name = jTextField1.getText();
        String stck = jTextField2.getText();
        String extent = jTextField3.getText();
        String pric =  jTextField4.getText().trim();
        int stckk; float pricc;
        
        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas modificar este usuario?", "Confirmación de modificacion", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            if(name.isEmpty()|| stck.isEmpty()|| extent.isEmpty()||pric.isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(this,"complete all fields!!");
                return;
            }
            try {
                String texto = jTextField2.getText().trim(); 
                stckk = Integer.parseInt(texto); 
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,"error: Stock no valid!!");
                return;
            }
            try {
                String texto = jTextField2.getText().trim(); 
                pricc = Float.parseFloat(texto); 
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,"error: the price not valid!!");
                return;
            }
            
            DAOProducto dao =  new DAOProductoImpl();
            product.setNombre(name);
            product.setStock(stckk);
            product.setMeasure(extent);
            product.setPrecio(pricc);
            
            dao.modifyProduct(product);
            this.setVisible(false);
            
        } else {
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private com.GUI.RoundPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}

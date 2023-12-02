package com.GUI;

import com.CODE.DAOPelicula;
import com.CODE.DAOProducto;
import com.CODE.Pelicula;
import com.CODE.Producto;
import com.DB.DAOPeliculaImpl;
import com.DB.DAOProductoImpl;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;


public class AdminMoviePanel extends javax.swing.JPanel {
    Random rand = new Random();
    
    public AdminMoviePanel() {
        initComponents();
        loadMovies();
    }
    
    public void initContent(){
        jTextField1.putClientProperty("JTextField.placeholderText", "enter title of movie");
        jTextField3.putClientProperty("JTextField.placeholderText", "enter diration(hour:min)");
        txtResearch.putClientProperty("JTextField.placeholderText", "enter name for search");
    }
     
    public void loadMovies(){
        try{
            DAOPelicula dao = new DAOPeliculaImpl();
            DefaultTableModel model = (DefaultTableModel) tblMovies.getModel();
            dao.listMovies().forEach((m) -> model.addRow(new Object [] {m.getTitulo(),m.getGenero(),m.getDuracion()}));
            
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
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovies = new rojeru_san.complementos.RSTableMetro();
        jButton2 = new javax.swing.JButton();
        txtResearch = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MOVIES");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 13, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("title");
        roundPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 63, -1, -1));
        roundPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 86, 243, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GENDER");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 63, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("DURATION");
        roundPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));
        roundPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 243, -1));

        jButton1.setText("saved");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 126, -1, -1));

        tblMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "title", "gender", "duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMovies.setColorBackgoundHead(new java.awt.Color(204, 51, 0));
        tblMovies.setColorFilasForeground1(new java.awt.Color(153, 51, 0));
        tblMovies.setColorFilasForeground2(new java.awt.Color(153, 102, 0));
        tblMovies.setColorSelBackgound(new java.awt.Color(102, 51, 0));
        tblMovies.setSelectionBackground(new java.awt.Color(102, 102, 0));
        jScrollPane1.setViewportView(tblMovies);

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "accion", "romance", "terror", "suspense", "aventure", " " }));
        roundPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        String n = jTextField1.getText();
        String g = (String) jComboBox1.getSelectedItem();
        String d = jTextField3.getText();
        
        if(n.isEmpty() ||g.isEmpty() || d.isEmpty() ){
            javax.swing.JOptionPane.showMessageDialog(this,"complete all fields!!");
            return;
        }
        
        Pelicula mov =  new Pelicula(n,g,d);
        
        DAOPelicula dao =  new DAOPeliculaImpl();
        dao.register(mov);
        DefaultTableModel model = (DefaultTableModel) tblMovies.getModel();
        model.setRowCount(0);
        loadMovies();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String val = txtResearch.getText();
    
        try {
            DAOPelicula dao = new DAOPeliculaImpl();
            ArrayList<Pelicula> list = dao.listMovies();
            ArrayList<Pelicula> results = new ArrayList<>();

            if (val.isEmpty()) {
                results.addAll(list);
            } else {                
                for (Pelicula mv : list) {               
                    if (mv.getTitulo().contains(val)) {
                        results.add(mv);
                    }
                }
            }
        
            try{        
                DefaultTableModel model = (DefaultTableModel) tblMovies.getModel();
                model.setRowCount(0);
                results.forEach((m) -> model.addRow(new Object [] {m.getTitulo(),m.getGenero(),m.getDuracion()}));           
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DAOPelicula dao = new DAOPeliculaImpl();
        DefaultTableModel model = (DefaultTableModel) tblMovies.getModel();
        
        for(int i : tblMovies.getSelectedRows()){
            try{
                dao.removePelicula((String) tblMovies.getValueAt(i,0));
                model.removeRow(i);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private com.GUI.RoundPanel roundPanel1;
    private rojeru_san.complementos.RSTableMetro tblMovies;
    private javax.swing.JTextField txtResearch;
    // End of variables declaration//GEN-END:variables
}

package com.GUI;

import com.CODE.DAOVenta;
import com.CODE.QRGeneration;
import com.CODE.Butaca;
import com.CODE.Venta;
import com.CODE.WhatsappSend;
import com.DB.DAOVentaImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class SaleDetails extends javax.swing.JFrame {
    Venta sale = new Venta();
    String sala = ""; int seat=0;String hour = "";
    Butaca seatModify = new Butaca();
    int horario=0;
    
    public SaleDetails() {
        initComponents();
    }
    
    public void getSale(Venta v, String s,String h, int se){
        sale = v;
        sala = s;hour=h;seat=se;
        loadContent();
    }
    
    public void loadContent(){
        jTextField1.setText(sale.getCliente().getNombre() + " " + sale.getCliente().getApellidos());
        jTextField10.setText(sale.getCliente().getPhone());
        jTextField2.setText(Integer.toString(sale.getVoleta().getId()));
        jTextField3.setText(Integer.toString(sale.getVoleta().getProductos().size()));
        jTextField5.setText(Double.toString(sale.getVoleta().getCosto()));
        jTextField6.setText(sala);
        jTextField7.setText(seat+"");
        jTextField8.setText(hour);
        jTextField9.setText(10+"$");
        jTextField4.setText(Double.toString(sale.getVoleta().getCosto()+ 10));
        
        
        if(hour.equals("15:30-17:00")){
            seatModify.setOcupado1(1);
            seatModify.setOcupado2(0);
            seatModify.setOcupado3(0);
            seatModify.setOcupado4(0);
            seatModify.setOcupado5(0);
        }
        if(hour.equals("17:15-19:00")){
            seatModify.setOcupado1(0);
            seatModify.setOcupado2(1);
            seatModify.setOcupado3(0);
            seatModify.setOcupado4(0);
            seatModify.setOcupado5(0);
        }
        if(hour.equals("19:00-20:30")){
            seatModify.setOcupado1(0);
            seatModify.setOcupado2(0);
            seatModify.setOcupado3(1);
            seatModify.setOcupado4(0);
            seatModify.setOcupado5(0);
        }
        if(hour.equals("21:00-23:00")){
            seatModify.setOcupado1(0);
            seatModify.setOcupado2(0);
            seatModify.setOcupado3(0);
            seatModify.setOcupado4(1);
            seatModify.setOcupado5(0);
        }
        
        if(hour.equals("23:00-00:30")){
            seatModify.setOcupado1(0);
            seatModify.setOcupado2(0);
            seatModify.setOcupado3(0);
            seatModify.setOcupado4(0);
            seatModify.setOcupado5(1);
        }
        
        seatModify.setNumber(seat);
        seatModify.setLocation(sala.replace(" ", ""));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        roundPanel2 = new com.GUI.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        roundPanel3 = new com.GUI.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sale Details");

        roundPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cliente");

        jTextField1.setText("jTextField1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("phone number");

        jTextField10.setText("jTextField10");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(jTextField10))
                .addGap(23, 23, 23))
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        roundPanel3.setBackground(new java.awt.Color(51, 51, 51));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("numVoucher");
        roundPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("product total");
        roundPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("costo total");
        roundPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jTextField2.setText("jTextField1");
        roundPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 20, 188, -1));

        jTextField3.setText("jTextField1");
        roundPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 60, 188, -1));

        jTextField4.setText("jTextField1");
        roundPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 188, -1));

        jLabel9.setText("costo de productos");
        roundPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 97, -1, -1));

        jTextField5.setText("jTextField5");
        roundPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 94, 188, -1));
        roundPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 123, 330, 10));

        jLabel10.setText("sala");
        roundPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel11.setText("asiento");
        roundPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel12.setText("horario");
        roundPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel13.setText("Costo");
        roundPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTextField6.setText("jTextField6");
        roundPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, -1));

        jTextField7.setText("jTextField7");
        roundPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 120, -1));

        jTextField8.setText("jTextField8");
        roundPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, -1));

        jTextField9.setText("jTextField9");
        roundPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 120, -1));

        jButton1.setText("confirm sale");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(roundPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rand = new Random();
        sale.setNumVenta(rand.nextInt(1000));
        sale.setAsiento(seatModify);
        sale.getVoleta().setCosto(Double.parseDouble(jTextField4.getText()));
        
        DAOVenta dao = new DAOVentaImpl();
        dao.register(sale);
        dao.registerHistory(sale);
        
        QRGeneration QRgen=new QRGeneration();
        String tt = Integer.toString(seat);
        QRgen.generateQR(sale.getNumVenta(),sale.getCliente().getNombre(),sala, hour,tt);
        
        WhatsappSend send = new WhatsappSend();
        send.sendInfo(jTextField10.getText(),"boletaID.png");
        
        
        
        modifySeat(seatModify);

        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private com.GUI.RoundPanel roundPanel1;
    private com.GUI.RoundPanel roundPanel2;
    private com.GUI.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables
    
    
    public void modifySeat(Butaca s) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/DBText/seats.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 7) {
                    int num = Integer.parseInt(parts[0].trim());
                    String sala = parts[1].trim();
                    
                    if (num == s.getNumber() && sala.equals(s.getLocation())) {
                        
                        lineas.add(s.getNumber() + "," +s.getLocation() + "," + s.getOcupado1() + "," + s.getOcupado2()+ "," + s.getOcupado3() +","+ s.getOcupado4() +","+s.getOcupado5());
                    } else {
                        lineas.add(linea);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/DBText/seats.txt"))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

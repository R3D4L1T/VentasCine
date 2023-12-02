
package com.GUI;

import com.CODE.Cliente;
import com.CODE.DAOCliente;
import com.CODE.DAOProducto;
import com.CODE.Pelicula;
import com.CODE.Producto;
import com.CODE.Butaca;
import com.CODE.Venta;
import com.DB.DAOClienteImpl;
import com.DB.DAOProductoImpl;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class SeatsSell extends javax.swing.JPanel {
    Random rand  = new Random();
    ArrayList<Butaca> seats = new ArrayList();
    JLabel[] labels = new JLabel[74];
    
    ArrayList<Producto> things = new ArrayList<>();
    Venta.Boleta voucher = new Venta.Boleta();
    Pelicula movie = new Pelicula();
    Cliente client =  new Cliente();
    Butaca seat = new Butaca();
    
    public SeatsSell() {
        initComponents();
        loadJLabels();
        loadClients();
        loadProducts();
        loadButacas("Sala1","15:30-17:00");
        
        
        jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar cuando se selecciona una sala en el ComboBox
                actualizarInformacion();
            }
        });
        
        jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acciones a realizar cuando se selecciona una sala en el ComboBox
                actualizarInformacion();
            }
        });
    }

    private void actualizarInformacion() {
        // Obtén la sala seleccionada
        String salaSeleccionada = ((String) jComboBox1.getSelectedItem()).replace(" ", "");
        String horario = ((String) jComboBox2.getSelectedItem());
        
        loadButacas(salaSeleccionada,horario);
    }
    
    public void loadButacas(String sal,String hour){
        try{
            ArrayList<Butaca> Butacas = listaButacas(sal);

            for(int i=0;i<72;i++){
                labels[i].setText("   "+Integer.toString(Butacas.get(i).getNumber())+"   ");
                labels[i].setEnabled(true);
                labels[i].setForeground(Color.white);
                if(hour.equals("15:30-17:00")){
                    if(Butacas.get(i).getOcupado1()== 1){
                        labels[i].setForeground(Color.red);
                    }
                }
                
                if(hour.equals("17:15-19:00")){
                    if(Butacas.get(i).getOcupado2()== 1){
                        labels[i].setForeground(Color.red);
                    }
                }
                
                if(hour.equals("19:00-20:30")){
                    if(Butacas.get(i).getOcupado3()== 1){
                        labels[i].setForeground(Color.red);
                    }
                }
                if(hour.equals("21:00-23:00")){
                    if(Butacas.get(i).getOcupado4()== 1){
                        labels[i].setForeground(Color.red);
                    }
                }
                if(hour.equals("23:00-00:30")){
                    if(Butacas.get(i).getOcupado4()== 1){
                        labels[i].setForeground(Color.red);
                    }
                }
                
            }
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void loadJLabels(){
        labels[0] = lbl1; labels[13] = lbl16; labels[28] = lbl31; labels[43] = lbl46; labels[58] = lbl61; 
        labels[1] = lbl2; labels[14] = lbl17; labels[29] = lbl32; labels[44] = lbl47; labels[59] = lbl62;
    /*labels[2] = lbl5;*/ labels[15] = lbl18; labels[30] = lbl33; labels[45] = lbl48; labels[60] = lbl63;
    /*labels[3] = lbl6;*/ labels[16] = lbl19; labels[31] = lbl34; labels[46] = lbl49; labels[61] = lbl64;
        labels[2] = lbl5; labels[17] = lbl20; labels[32] = lbl35; labels[47] = lbl50; labels[62] = lbl65;
        labels[3] = lbl6; labels[18] = lbl21; labels[33] = lbl36; labels[48] = lbl51; labels[63] = lbl66;
        labels[4] = lbl7; labels[19] = lbl22; labels[34] = lbl37; labels[49] = lbl52; labels[64] = lbl67;
        labels[5] = lbl8; labels[20] = lbl23; labels[35] = lbl38; labels[50] = lbl53; labels[65] = lbl68;
        labels[6] = lbl9; labels[21] = lbl24; labels[36] = lbl39; labels[51] = lbl54; labels[66] = lbl69;
        labels[7] = lbl10; labels[22] = lbl25; labels[37] = lbl40; labels[52] = lbl55; labels[67] = lbl70;
        labels[8] = lbl11; labels[23] = lbl26; labels[38] = lbl41; labels[53] = lbl56; labels[68] = lbl71;
        labels[9] = lbl12; labels[24] = lbl27; labels[39] = lbl42; labels[54] = lbl57; labels[69] = lbl72;
        labels[10] = lbl13; labels[25] = lbl28; labels[40] = lbl43; labels[55] = lbl58; labels[70] = lbl73;
        labels[11] = lbl14; labels[26] = lbl29; labels[41] = lbl44; labels[56] = lbl59; labels[71] = lbl74;
        labels[12] = lbl15; labels[27] = lbl30; labels[42] = lbl45; labels[57] = lbl60; 
    }
    
    
    public void loadClients(){
        DAOCliente dao = new DAOClienteImpl();
        ArrayList<Cliente> clients =  dao.listaCliente();
        
        for(Cliente cl : clients){
            String cli = cl.getNombre() + " "+ cl.getApellidos();
            jComboBox3.addItem(cli);
        }
    }
    
    public void loadProducts(){
        DAOProducto dao =  new DAOProductoImpl();
        ArrayList<Producto> products =  dao.listProducts();
        
        for(Producto p : products){
            jComboBox4.addItem(p.getNombre());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        roundPanel1 = new com.GUI.RoundPanel();
        roundPanel2 = new com.GUI.RoundPanel();
        pnlSeat1 = new com.GUI.RoundPanel();
        lbl1 = new javax.swing.JLabel();
        pnlSeat2 = new com.GUI.RoundPanel();
        lbl2 = new javax.swing.JLabel();
        pnlSeat5 = new com.GUI.RoundPanel();
        lbl5 = new javax.swing.JLabel();
        pnlSeat6 = new com.GUI.RoundPanel();
        lbl6 = new javax.swing.JLabel();
        pnlSeat7 = new com.GUI.RoundPanel();
        lbl7 = new javax.swing.JLabel();
        pnlSeat8 = new com.GUI.RoundPanel();
        lbl8 = new javax.swing.JLabel();
        pnlSeat9 = new com.GUI.RoundPanel();
        lbl9 = new javax.swing.JLabel();
        pnlSeat10 = new com.GUI.RoundPanel();
        lbl10 = new javax.swing.JLabel();
        pnlSeat11 = new com.GUI.RoundPanel();
        lbl11 = new javax.swing.JLabel();
        pnlSeat12 = new com.GUI.RoundPanel();
        lbl12 = new javax.swing.JLabel();
        pnlSeat13 = new com.GUI.RoundPanel();
        lbl13 = new javax.swing.JLabel();
        pnlSeat14 = new com.GUI.RoundPanel();
        lbl14 = new javax.swing.JLabel();
        pnlSeat15 = new com.GUI.RoundPanel();
        lbl15 = new javax.swing.JLabel();
        pnlSeat16 = new com.GUI.RoundPanel();
        lbl16 = new javax.swing.JLabel();
        pnlSeat17 = new com.GUI.RoundPanel();
        lbl17 = new javax.swing.JLabel();
        pnlSeat18 = new com.GUI.RoundPanel();
        lbl18 = new javax.swing.JLabel();
        pnlSeat19 = new com.GUI.RoundPanel();
        lbl19 = new javax.swing.JLabel();
        pnlSeat20 = new com.GUI.RoundPanel();
        lbl20 = new javax.swing.JLabel();
        pnlSeat21 = new com.GUI.RoundPanel();
        lbl21 = new javax.swing.JLabel();
        pnlSeat22 = new com.GUI.RoundPanel();
        lbl22 = new javax.swing.JLabel();
        pnlSeat23 = new com.GUI.RoundPanel();
        lbl23 = new javax.swing.JLabel();
        pnlSeat24 = new com.GUI.RoundPanel();
        lbl24 = new javax.swing.JLabel();
        pnlSeat25 = new com.GUI.RoundPanel();
        lbl25 = new javax.swing.JLabel();
        pnlSeat26 = new com.GUI.RoundPanel();
        lbl26 = new javax.swing.JLabel();
        pnlSeat27 = new com.GUI.RoundPanel();
        lbl27 = new javax.swing.JLabel();
        pnlSeat28 = new com.GUI.RoundPanel();
        lbl28 = new javax.swing.JLabel();
        pnlSeat29 = new com.GUI.RoundPanel();
        lbl29 = new javax.swing.JLabel();
        pnlSeat30 = new com.GUI.RoundPanel();
        lbl30 = new javax.swing.JLabel();
        pnlSeat31 = new com.GUI.RoundPanel();
        lbl31 = new javax.swing.JLabel();
        pnlSeat32 = new com.GUI.RoundPanel();
        lbl32 = new javax.swing.JLabel();
        pnlSeat33 = new com.GUI.RoundPanel();
        lbl33 = new javax.swing.JLabel();
        pnlSeat34 = new com.GUI.RoundPanel();
        lbl34 = new javax.swing.JLabel();
        pnlSeat35 = new com.GUI.RoundPanel();
        lbl35 = new javax.swing.JLabel();
        pnlSeat36 = new com.GUI.RoundPanel();
        lbl36 = new javax.swing.JLabel();
        pnlSeat37 = new com.GUI.RoundPanel();
        lbl37 = new javax.swing.JLabel();
        pnlSeat38 = new com.GUI.RoundPanel();
        lbl38 = new javax.swing.JLabel();
        pnlSeat39 = new com.GUI.RoundPanel();
        lbl39 = new javax.swing.JLabel();
        pnlSeat40 = new com.GUI.RoundPanel();
        lbl40 = new javax.swing.JLabel();
        pnlSeat41 = new com.GUI.RoundPanel();
        lbl41 = new javax.swing.JLabel();
        pnlSeat42 = new com.GUI.RoundPanel();
        lbl42 = new javax.swing.JLabel();
        pnlSeat43 = new com.GUI.RoundPanel();
        lbl43 = new javax.swing.JLabel();
        pnlSeat44 = new com.GUI.RoundPanel();
        lbl44 = new javax.swing.JLabel();
        pnlSeat45 = new com.GUI.RoundPanel();
        lbl45 = new javax.swing.JLabel();
        pnlSeat46 = new com.GUI.RoundPanel();
        lbl46 = new javax.swing.JLabel();
        pnlSeat47 = new com.GUI.RoundPanel();
        lbl47 = new javax.swing.JLabel();
        pnlSeat48 = new com.GUI.RoundPanel();
        lbl48 = new javax.swing.JLabel();
        pnlSeat49 = new com.GUI.RoundPanel();
        lbl49 = new javax.swing.JLabel();
        pnlSeat50 = new com.GUI.RoundPanel();
        lbl50 = new javax.swing.JLabel();
        pnlSeat51 = new com.GUI.RoundPanel();
        lbl51 = new javax.swing.JLabel();
        pnlSeat52 = new com.GUI.RoundPanel();
        lbl52 = new javax.swing.JLabel();
        pnlSeat53 = new com.GUI.RoundPanel();
        lbl53 = new javax.swing.JLabel();
        pnlSeat54 = new com.GUI.RoundPanel();
        lbl54 = new javax.swing.JLabel();
        pnlSeat55 = new com.GUI.RoundPanel();
        lbl55 = new javax.swing.JLabel();
        pnlSeat56 = new com.GUI.RoundPanel();
        lbl56 = new javax.swing.JLabel();
        pnlSeat57 = new com.GUI.RoundPanel();
        lbl57 = new javax.swing.JLabel();
        pnlSeat58 = new com.GUI.RoundPanel();
        lbl58 = new javax.swing.JLabel();
        pnlSeat59 = new com.GUI.RoundPanel();
        lbl59 = new javax.swing.JLabel();
        pnlSeat60 = new com.GUI.RoundPanel();
        lbl60 = new javax.swing.JLabel();
        pnlSeat61 = new com.GUI.RoundPanel();
        lbl61 = new javax.swing.JLabel();
        pnlSeat62 = new com.GUI.RoundPanel();
        lbl62 = new javax.swing.JLabel();
        pnlSeat63 = new com.GUI.RoundPanel();
        lbl63 = new javax.swing.JLabel();
        pnlSeat64 = new com.GUI.RoundPanel();
        lbl64 = new javax.swing.JLabel();
        pnlSeat65 = new com.GUI.RoundPanel();
        lbl65 = new javax.swing.JLabel();
        pnlSeat66 = new com.GUI.RoundPanel();
        lbl66 = new javax.swing.JLabel();
        pnlSeat67 = new com.GUI.RoundPanel();
        lbl67 = new javax.swing.JLabel();
        pnlSeat68 = new com.GUI.RoundPanel();
        lbl68 = new javax.swing.JLabel();
        pnlSeat69 = new com.GUI.RoundPanel();
        lbl69 = new javax.swing.JLabel();
        pnlSeat70 = new com.GUI.RoundPanel();
        lbl70 = new javax.swing.JLabel();
        pnlSeat71 = new com.GUI.RoundPanel();
        lbl71 = new javax.swing.JLabel();
        pnlSeat72 = new com.GUI.RoundPanel();
        lbl72 = new javax.swing.JLabel();
        pnlSeat73 = new com.GUI.RoundPanel();
        lbl73 = new javax.swing.JLabel();
        pnlSeat74 = new com.GUI.RoundPanel();
        lbl74 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        roundPanel3 = new com.GUI.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        lblCreate4 = new javax.swing.JLabel();

        roundPanel1.setBackground(new java.awt.Color(0, 0, 0));

        roundPanel2.setBackground(new java.awt.Color(153, 153, 153));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSeat1.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat1.setForeground(new java.awt.Color(255, 255, 255));

        lbl1.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat1Layout = new javax.swing.GroupLayout(pnlSeat1);
        pnlSeat1.setLayout(pnlSeat1Layout);
        pnlSeat1Layout.setHorizontalGroup(
            pnlSeat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat1Layout.setVerticalGroup(
            pnlSeat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        pnlSeat2.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat2.setForeground(new java.awt.Color(255, 255, 255));

        lbl2.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat2Layout = new javax.swing.GroupLayout(pnlSeat2);
        pnlSeat2.setLayout(pnlSeat2Layout);
        pnlSeat2Layout.setHorizontalGroup(
            pnlSeat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl2)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat2Layout.setVerticalGroup(
            pnlSeat2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        pnlSeat5.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat5.setForeground(new java.awt.Color(255, 255, 255));

        lbl5.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat5Layout = new javax.swing.GroupLayout(pnlSeat5);
        pnlSeat5.setLayout(pnlSeat5Layout);
        pnlSeat5Layout.setHorizontalGroup(
            pnlSeat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl5)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat5Layout.setVerticalGroup(
            pnlSeat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl5)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        pnlSeat6.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat6.setForeground(new java.awt.Color(255, 255, 255));

        lbl6.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat6Layout = new javax.swing.GroupLayout(pnlSeat6);
        pnlSeat6.setLayout(pnlSeat6Layout);
        pnlSeat6Layout.setHorizontalGroup(
            pnlSeat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl6)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat6Layout.setVerticalGroup(
            pnlSeat6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        pnlSeat7.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat7.setForeground(new java.awt.Color(255, 255, 255));

        lbl7.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat7Layout = new javax.swing.GroupLayout(pnlSeat7);
        pnlSeat7.setLayout(pnlSeat7Layout);
        pnlSeat7Layout.setHorizontalGroup(
            pnlSeat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl7)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat7Layout.setVerticalGroup(
            pnlSeat7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl7)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        pnlSeat8.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat8.setForeground(new java.awt.Color(255, 255, 255));

        lbl8.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat8Layout = new javax.swing.GroupLayout(pnlSeat8);
        pnlSeat8.setLayout(pnlSeat8Layout);
        pnlSeat8Layout.setHorizontalGroup(
            pnlSeat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl8)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat8Layout.setVerticalGroup(
            pnlSeat8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl8)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        pnlSeat9.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat9.setForeground(new java.awt.Color(255, 255, 255));

        lbl9.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat9Layout = new javax.swing.GroupLayout(pnlSeat9);
        pnlSeat9.setLayout(pnlSeat9Layout);
        pnlSeat9Layout.setHorizontalGroup(
            pnlSeat9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl9)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat9Layout.setVerticalGroup(
            pnlSeat9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl9)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        pnlSeat10.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat10.setForeground(new java.awt.Color(255, 255, 255));

        lbl10.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat10Layout = new javax.swing.GroupLayout(pnlSeat10);
        pnlSeat10.setLayout(pnlSeat10Layout);
        pnlSeat10Layout.setHorizontalGroup(
            pnlSeat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl10)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat10Layout.setVerticalGroup(
            pnlSeat10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl10)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        pnlSeat11.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat11.setForeground(new java.awt.Color(255, 255, 255));

        lbl11.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat11Layout = new javax.swing.GroupLayout(pnlSeat11);
        pnlSeat11.setLayout(pnlSeat11Layout);
        pnlSeat11Layout.setHorizontalGroup(
            pnlSeat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl11)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat11Layout.setVerticalGroup(
            pnlSeat11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl11)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        pnlSeat12.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat12.setForeground(new java.awt.Color(255, 255, 255));

        lbl12.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat12Layout = new javax.swing.GroupLayout(pnlSeat12);
        pnlSeat12.setLayout(pnlSeat12Layout);
        pnlSeat12Layout.setHorizontalGroup(
            pnlSeat12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl12)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat12Layout.setVerticalGroup(
            pnlSeat12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl12)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        pnlSeat13.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat13.setForeground(new java.awt.Color(255, 255, 255));

        lbl13.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat13Layout = new javax.swing.GroupLayout(pnlSeat13);
        pnlSeat13.setLayout(pnlSeat13Layout);
        pnlSeat13Layout.setHorizontalGroup(
            pnlSeat13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl13)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat13Layout.setVerticalGroup(
            pnlSeat13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat13Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl13)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, -1, -1));

        pnlSeat14.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat14.setForeground(new java.awt.Color(255, 255, 255));

        lbl14.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat14Layout = new javax.swing.GroupLayout(pnlSeat14);
        pnlSeat14.setLayout(pnlSeat14Layout);
        pnlSeat14Layout.setHorizontalGroup(
            pnlSeat14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl14)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat14Layout.setVerticalGroup(
            pnlSeat14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl14)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        pnlSeat15.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat15.setForeground(new java.awt.Color(255, 255, 255));

        lbl15.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat15Layout = new javax.swing.GroupLayout(pnlSeat15);
        pnlSeat15.setLayout(pnlSeat15Layout);
        pnlSeat15Layout.setHorizontalGroup(
            pnlSeat15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl15)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat15Layout.setVerticalGroup(
            pnlSeat15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl15)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, -1, -1));

        pnlSeat16.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat16.setForeground(new java.awt.Color(255, 255, 255));

        lbl16.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat16Layout = new javax.swing.GroupLayout(pnlSeat16);
        pnlSeat16.setLayout(pnlSeat16Layout);
        pnlSeat16Layout.setHorizontalGroup(
            pnlSeat16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl16)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat16Layout.setVerticalGroup(
            pnlSeat16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl16)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat16, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        pnlSeat17.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat17.setForeground(new java.awt.Color(255, 255, 255));

        lbl17.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat17Layout = new javax.swing.GroupLayout(pnlSeat17);
        pnlSeat17.setLayout(pnlSeat17Layout);
        pnlSeat17Layout.setHorizontalGroup(
            pnlSeat17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl17)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat17Layout.setVerticalGroup(
            pnlSeat17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl17)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pnlSeat18.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat18.setForeground(new java.awt.Color(255, 255, 255));

        lbl18.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat18Layout = new javax.swing.GroupLayout(pnlSeat18);
        pnlSeat18.setLayout(pnlSeat18Layout);
        pnlSeat18Layout.setHorizontalGroup(
            pnlSeat18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl18)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat18Layout.setVerticalGroup(
            pnlSeat18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat18Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl18)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        pnlSeat19.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat19.setForeground(new java.awt.Color(255, 255, 255));

        lbl19.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat19Layout = new javax.swing.GroupLayout(pnlSeat19);
        pnlSeat19.setLayout(pnlSeat19Layout);
        pnlSeat19Layout.setHorizontalGroup(
            pnlSeat19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl19)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat19Layout.setVerticalGroup(
            pnlSeat19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat19Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl19)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        pnlSeat20.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat20.setForeground(new java.awt.Color(255, 255, 255));

        lbl20.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat20Layout = new javax.swing.GroupLayout(pnlSeat20);
        pnlSeat20.setLayout(pnlSeat20Layout);
        pnlSeat20Layout.setHorizontalGroup(
            pnlSeat20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl20)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat20Layout.setVerticalGroup(
            pnlSeat20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat20Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl20)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        pnlSeat21.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat21.setForeground(new java.awt.Color(255, 255, 255));

        lbl21.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat21Layout = new javax.swing.GroupLayout(pnlSeat21);
        pnlSeat21.setLayout(pnlSeat21Layout);
        pnlSeat21Layout.setHorizontalGroup(
            pnlSeat21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl21)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat21Layout.setVerticalGroup(
            pnlSeat21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat21Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl21)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        pnlSeat22.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat22.setForeground(new java.awt.Color(255, 255, 255));

        lbl22.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat22Layout = new javax.swing.GroupLayout(pnlSeat22);
        pnlSeat22.setLayout(pnlSeat22Layout);
        pnlSeat22Layout.setHorizontalGroup(
            pnlSeat22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl22)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat22Layout.setVerticalGroup(
            pnlSeat22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat22Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl22)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        pnlSeat23.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat23.setForeground(new java.awt.Color(255, 255, 255));

        lbl23.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat23Layout = new javax.swing.GroupLayout(pnlSeat23);
        pnlSeat23.setLayout(pnlSeat23Layout);
        pnlSeat23Layout.setHorizontalGroup(
            pnlSeat23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl23)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat23Layout.setVerticalGroup(
            pnlSeat23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat23Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl23)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        pnlSeat24.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat24.setForeground(new java.awt.Color(255, 255, 255));

        lbl24.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat24Layout = new javax.swing.GroupLayout(pnlSeat24);
        pnlSeat24.setLayout(pnlSeat24Layout);
        pnlSeat24Layout.setHorizontalGroup(
            pnlSeat24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl24)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat24Layout.setVerticalGroup(
            pnlSeat24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat24Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl24)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        pnlSeat25.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat25.setForeground(new java.awt.Color(255, 255, 255));

        lbl25.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat25Layout = new javax.swing.GroupLayout(pnlSeat25);
        pnlSeat25.setLayout(pnlSeat25Layout);
        pnlSeat25Layout.setHorizontalGroup(
            pnlSeat25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl25)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat25Layout.setVerticalGroup(
            pnlSeat25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl25)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat25, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        pnlSeat26.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat26.setForeground(new java.awt.Color(255, 255, 255));

        lbl26.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat26Layout = new javax.swing.GroupLayout(pnlSeat26);
        pnlSeat26.setLayout(pnlSeat26Layout);
        pnlSeat26Layout.setHorizontalGroup(
            pnlSeat26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl26)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat26Layout.setVerticalGroup(
            pnlSeat26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat26Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl26)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat26, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        pnlSeat27.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat27.setForeground(new java.awt.Color(255, 255, 255));

        lbl27.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat27Layout = new javax.swing.GroupLayout(pnlSeat27);
        pnlSeat27.setLayout(pnlSeat27Layout);
        pnlSeat27Layout.setHorizontalGroup(
            pnlSeat27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl27)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat27Layout.setVerticalGroup(
            pnlSeat27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat27Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl27)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat27, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        pnlSeat28.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat28.setForeground(new java.awt.Color(255, 255, 255));

        lbl28.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat28Layout = new javax.swing.GroupLayout(pnlSeat28);
        pnlSeat28.setLayout(pnlSeat28Layout);
        pnlSeat28Layout.setHorizontalGroup(
            pnlSeat28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl28)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat28Layout.setVerticalGroup(
            pnlSeat28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat28Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl28)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat28, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, -1, -1));

        pnlSeat29.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat29.setForeground(new java.awt.Color(255, 255, 255));

        lbl29.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat29Layout = new javax.swing.GroupLayout(pnlSeat29);
        pnlSeat29.setLayout(pnlSeat29Layout);
        pnlSeat29Layout.setHorizontalGroup(
            pnlSeat29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl29)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat29Layout.setVerticalGroup(
            pnlSeat29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat29Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl29)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat29, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, -1, -1));

        pnlSeat30.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat30.setForeground(new java.awt.Color(255, 255, 255));

        lbl30.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat30Layout = new javax.swing.GroupLayout(pnlSeat30);
        pnlSeat30.setLayout(pnlSeat30Layout);
        pnlSeat30Layout.setHorizontalGroup(
            pnlSeat30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl30)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat30Layout.setVerticalGroup(
            pnlSeat30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat30Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl30)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        pnlSeat31.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat31.setForeground(new java.awt.Color(255, 255, 255));

        lbl31.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat31Layout = new javax.swing.GroupLayout(pnlSeat31);
        pnlSeat31.setLayout(pnlSeat31Layout);
        pnlSeat31Layout.setHorizontalGroup(
            pnlSeat31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl31)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat31Layout.setVerticalGroup(
            pnlSeat31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat31Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl31)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        pnlSeat32.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat32.setForeground(new java.awt.Color(255, 255, 255));

        lbl32.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat32Layout = new javax.swing.GroupLayout(pnlSeat32);
        pnlSeat32.setLayout(pnlSeat32Layout);
        pnlSeat32Layout.setHorizontalGroup(
            pnlSeat32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl32)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat32Layout.setVerticalGroup(
            pnlSeat32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat32Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl32)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        pnlSeat33.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat33.setForeground(new java.awt.Color(255, 255, 255));

        lbl33.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat33Layout = new javax.swing.GroupLayout(pnlSeat33);
        pnlSeat33.setLayout(pnlSeat33Layout);
        pnlSeat33Layout.setHorizontalGroup(
            pnlSeat33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl33)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat33Layout.setVerticalGroup(
            pnlSeat33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat33Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl33)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        pnlSeat34.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat34.setForeground(new java.awt.Color(255, 255, 255));

        lbl34.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat34Layout = new javax.swing.GroupLayout(pnlSeat34);
        pnlSeat34.setLayout(pnlSeat34Layout);
        pnlSeat34Layout.setHorizontalGroup(
            pnlSeat34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl34)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat34Layout.setVerticalGroup(
            pnlSeat34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat34Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl34)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        pnlSeat35.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat35.setForeground(new java.awt.Color(255, 255, 255));

        lbl35.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat35Layout = new javax.swing.GroupLayout(pnlSeat35);
        pnlSeat35.setLayout(pnlSeat35Layout);
        pnlSeat35Layout.setHorizontalGroup(
            pnlSeat35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl35)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat35Layout.setVerticalGroup(
            pnlSeat35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat35Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl35)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat35, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, -1, -1));

        pnlSeat36.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat36.setForeground(new java.awt.Color(255, 255, 255));

        lbl36.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat36Layout = new javax.swing.GroupLayout(pnlSeat36);
        pnlSeat36.setLayout(pnlSeat36Layout);
        pnlSeat36Layout.setHorizontalGroup(
            pnlSeat36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl36)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat36Layout.setVerticalGroup(
            pnlSeat36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat36Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl36)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat36, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        pnlSeat37.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat37.setForeground(new java.awt.Color(255, 255, 255));

        lbl37.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat37Layout = new javax.swing.GroupLayout(pnlSeat37);
        pnlSeat37.setLayout(pnlSeat37Layout);
        pnlSeat37Layout.setHorizontalGroup(
            pnlSeat37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl37)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat37Layout.setVerticalGroup(
            pnlSeat37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat37Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl37)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        pnlSeat38.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat38.setForeground(new java.awt.Color(255, 255, 255));

        lbl38.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat38Layout = new javax.swing.GroupLayout(pnlSeat38);
        pnlSeat38.setLayout(pnlSeat38Layout);
        pnlSeat38Layout.setHorizontalGroup(
            pnlSeat38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl38)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat38Layout.setVerticalGroup(
            pnlSeat38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat38Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl38)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat38, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        pnlSeat39.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat39.setForeground(new java.awt.Color(255, 255, 255));

        lbl39.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat39Layout = new javax.swing.GroupLayout(pnlSeat39);
        pnlSeat39.setLayout(pnlSeat39Layout);
        pnlSeat39Layout.setHorizontalGroup(
            pnlSeat39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl39)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat39Layout.setVerticalGroup(
            pnlSeat39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat39Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl39)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat39, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, -1, -1));

        pnlSeat40.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat40.setForeground(new java.awt.Color(255, 255, 255));

        lbl40.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat40Layout = new javax.swing.GroupLayout(pnlSeat40);
        pnlSeat40.setLayout(pnlSeat40Layout);
        pnlSeat40Layout.setHorizontalGroup(
            pnlSeat40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl40)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat40Layout.setVerticalGroup(
            pnlSeat40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat40Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl40)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat40, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, -1, -1));

        pnlSeat41.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat41.setForeground(new java.awt.Color(255, 255, 255));

        lbl41.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat41Layout = new javax.swing.GroupLayout(pnlSeat41);
        pnlSeat41.setLayout(pnlSeat41Layout);
        pnlSeat41Layout.setHorizontalGroup(
            pnlSeat41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl41)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat41Layout.setVerticalGroup(
            pnlSeat41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat41Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl41)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat41, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        pnlSeat42.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat42.setForeground(new java.awt.Color(255, 255, 255));

        lbl42.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat42Layout = new javax.swing.GroupLayout(pnlSeat42);
        pnlSeat42.setLayout(pnlSeat42Layout);
        pnlSeat42Layout.setHorizontalGroup(
            pnlSeat42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl42)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat42Layout.setVerticalGroup(
            pnlSeat42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat42Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl42)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        pnlSeat43.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat43.setForeground(new java.awt.Color(255, 255, 255));

        lbl43.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat43Layout = new javax.swing.GroupLayout(pnlSeat43);
        pnlSeat43.setLayout(pnlSeat43Layout);
        pnlSeat43Layout.setHorizontalGroup(
            pnlSeat43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl43)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat43Layout.setVerticalGroup(
            pnlSeat43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat43Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl43)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat43, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        pnlSeat44.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat44.setForeground(new java.awt.Color(255, 255, 255));

        lbl44.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat44Layout = new javax.swing.GroupLayout(pnlSeat44);
        pnlSeat44.setLayout(pnlSeat44Layout);
        pnlSeat44Layout.setHorizontalGroup(
            pnlSeat44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl44)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat44Layout.setVerticalGroup(
            pnlSeat44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat44Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl44)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        pnlSeat45.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat45.setForeground(new java.awt.Color(255, 255, 255));

        lbl45.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat45Layout = new javax.swing.GroupLayout(pnlSeat45);
        pnlSeat45.setLayout(pnlSeat45Layout);
        pnlSeat45Layout.setHorizontalGroup(
            pnlSeat45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl45)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat45Layout.setVerticalGroup(
            pnlSeat45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat45Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl45)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat45, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, -1));

        pnlSeat46.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat46.setForeground(new java.awt.Color(255, 255, 255));

        lbl46.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat46Layout = new javax.swing.GroupLayout(pnlSeat46);
        pnlSeat46.setLayout(pnlSeat46Layout);
        pnlSeat46Layout.setHorizontalGroup(
            pnlSeat46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl46)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat46Layout.setVerticalGroup(
            pnlSeat46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat46Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl46)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        pnlSeat47.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat47.setForeground(new java.awt.Color(255, 255, 255));

        lbl47.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat47Layout = new javax.swing.GroupLayout(pnlSeat47);
        pnlSeat47.setLayout(pnlSeat47Layout);
        pnlSeat47Layout.setHorizontalGroup(
            pnlSeat47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl47)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat47Layout.setVerticalGroup(
            pnlSeat47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat47Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl47)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat47, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        pnlSeat48.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat48.setForeground(new java.awt.Color(255, 255, 255));

        lbl48.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat48Layout = new javax.swing.GroupLayout(pnlSeat48);
        pnlSeat48.setLayout(pnlSeat48Layout);
        pnlSeat48Layout.setHorizontalGroup(
            pnlSeat48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl48)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat48Layout.setVerticalGroup(
            pnlSeat48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat48Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl48)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat48, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        pnlSeat49.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat49.setForeground(new java.awt.Color(255, 255, 255));

        lbl49.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat49Layout = new javax.swing.GroupLayout(pnlSeat49);
        pnlSeat49.setLayout(pnlSeat49Layout);
        pnlSeat49Layout.setHorizontalGroup(
            pnlSeat49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl49)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat49Layout.setVerticalGroup(
            pnlSeat49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat49Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl49)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat49, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, -1, -1));

        pnlSeat50.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat50.setForeground(new java.awt.Color(255, 255, 255));

        lbl50.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat50Layout = new javax.swing.GroupLayout(pnlSeat50);
        pnlSeat50.setLayout(pnlSeat50Layout);
        pnlSeat50Layout.setHorizontalGroup(
            pnlSeat50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl50)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat50Layout.setVerticalGroup(
            pnlSeat50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat50Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl50)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat50, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, -1, -1));

        pnlSeat51.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat51.setForeground(new java.awt.Color(255, 255, 255));

        lbl51.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat51Layout = new javax.swing.GroupLayout(pnlSeat51);
        pnlSeat51.setLayout(pnlSeat51Layout);
        pnlSeat51Layout.setHorizontalGroup(
            pnlSeat51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl51)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat51Layout.setVerticalGroup(
            pnlSeat51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat51Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl51)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat51, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 210, -1, -1));

        pnlSeat52.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat52.setForeground(new java.awt.Color(255, 255, 255));

        lbl52.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat52Layout = new javax.swing.GroupLayout(pnlSeat52);
        pnlSeat52.setLayout(pnlSeat52Layout);
        pnlSeat52Layout.setHorizontalGroup(
            pnlSeat52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat52Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl52)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat52Layout.setVerticalGroup(
            pnlSeat52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat52Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl52)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat52, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        pnlSeat53.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat53.setForeground(new java.awt.Color(255, 255, 255));

        lbl53.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat53Layout = new javax.swing.GroupLayout(pnlSeat53);
        pnlSeat53.setLayout(pnlSeat53Layout);
        pnlSeat53Layout.setHorizontalGroup(
            pnlSeat53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat53Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl53)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat53Layout.setVerticalGroup(
            pnlSeat53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat53Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl53)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat53, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        pnlSeat54.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat54.setForeground(new java.awt.Color(255, 255, 255));

        lbl54.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat54Layout = new javax.swing.GroupLayout(pnlSeat54);
        pnlSeat54.setLayout(pnlSeat54Layout);
        pnlSeat54Layout.setHorizontalGroup(
            pnlSeat54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl54)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat54Layout.setVerticalGroup(
            pnlSeat54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat54Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl54)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat54, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        pnlSeat55.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat55.setForeground(new java.awt.Color(255, 255, 255));

        lbl55.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat55Layout = new javax.swing.GroupLayout(pnlSeat55);
        pnlSeat55.setLayout(pnlSeat55Layout);
        pnlSeat55Layout.setHorizontalGroup(
            pnlSeat55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl55)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat55Layout.setVerticalGroup(
            pnlSeat55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat55Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl55)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat55, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        pnlSeat56.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat56.setForeground(new java.awt.Color(255, 255, 255));

        lbl56.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat56Layout = new javax.swing.GroupLayout(pnlSeat56);
        pnlSeat56.setLayout(pnlSeat56Layout);
        pnlSeat56Layout.setHorizontalGroup(
            pnlSeat56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl56)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat56Layout.setVerticalGroup(
            pnlSeat56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat56Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl56)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat56, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        pnlSeat57.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat57.setForeground(new java.awt.Color(255, 255, 255));

        lbl57.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat57Layout = new javax.swing.GroupLayout(pnlSeat57);
        pnlSeat57.setLayout(pnlSeat57Layout);
        pnlSeat57Layout.setHorizontalGroup(
            pnlSeat57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl57)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat57Layout.setVerticalGroup(
            pnlSeat57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat57Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl57)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        pnlSeat58.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat58.setForeground(new java.awt.Color(255, 255, 255));

        lbl58.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat58Layout = new javax.swing.GroupLayout(pnlSeat58);
        pnlSeat58.setLayout(pnlSeat58Layout);
        pnlSeat58Layout.setHorizontalGroup(
            pnlSeat58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl58)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat58Layout.setVerticalGroup(
            pnlSeat58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat58Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl58)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat58, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        pnlSeat59.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat59.setForeground(new java.awt.Color(255, 255, 255));

        lbl59.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat59Layout = new javax.swing.GroupLayout(pnlSeat59);
        pnlSeat59.setLayout(pnlSeat59Layout);
        pnlSeat59Layout.setHorizontalGroup(
            pnlSeat59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl59)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat59Layout.setVerticalGroup(
            pnlSeat59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat59Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl59)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat59, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        pnlSeat60.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat60.setForeground(new java.awt.Color(255, 255, 255));

        lbl60.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat60Layout = new javax.swing.GroupLayout(pnlSeat60);
        pnlSeat60.setLayout(pnlSeat60Layout);
        pnlSeat60Layout.setHorizontalGroup(
            pnlSeat60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl60)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat60Layout.setVerticalGroup(
            pnlSeat60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat60Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl60)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat60, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        pnlSeat61.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat61.setForeground(new java.awt.Color(255, 255, 255));

        lbl61.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat61Layout = new javax.swing.GroupLayout(pnlSeat61);
        pnlSeat61.setLayout(pnlSeat61Layout);
        pnlSeat61Layout.setHorizontalGroup(
            pnlSeat61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl61)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat61Layout.setVerticalGroup(
            pnlSeat61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat61Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl61)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat61, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, -1, -1));

        pnlSeat62.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat62.setForeground(new java.awt.Color(255, 255, 255));

        lbl62.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat62Layout = new javax.swing.GroupLayout(pnlSeat62);
        pnlSeat62.setLayout(pnlSeat62Layout);
        pnlSeat62Layout.setHorizontalGroup(
            pnlSeat62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat62Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl62)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat62Layout.setVerticalGroup(
            pnlSeat62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat62Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl62)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat62, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, -1, -1));

        pnlSeat63.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat63.setForeground(new java.awt.Color(255, 255, 255));

        lbl63.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat63Layout = new javax.swing.GroupLayout(pnlSeat63);
        pnlSeat63.setLayout(pnlSeat63Layout);
        pnlSeat63Layout.setHorizontalGroup(
            pnlSeat63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat63Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl63)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat63Layout.setVerticalGroup(
            pnlSeat63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat63Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl63)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat63, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 280, -1, -1));

        pnlSeat64.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat64.setForeground(new java.awt.Color(255, 255, 255));

        lbl64.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat64Layout = new javax.swing.GroupLayout(pnlSeat64);
        pnlSeat64.setLayout(pnlSeat64Layout);
        pnlSeat64Layout.setHorizontalGroup(
            pnlSeat64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat64Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl64)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat64Layout.setVerticalGroup(
            pnlSeat64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat64Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl64)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat64, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, -1, -1));

        pnlSeat65.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat65.setForeground(new java.awt.Color(255, 255, 255));

        lbl65.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat65Layout = new javax.swing.GroupLayout(pnlSeat65);
        pnlSeat65.setLayout(pnlSeat65Layout);
        pnlSeat65Layout.setHorizontalGroup(
            pnlSeat65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat65Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl65)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat65Layout.setVerticalGroup(
            pnlSeat65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat65Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl65)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat65, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        pnlSeat66.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat66.setForeground(new java.awt.Color(255, 255, 255));

        lbl66.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat66Layout = new javax.swing.GroupLayout(pnlSeat66);
        pnlSeat66.setLayout(pnlSeat66Layout);
        pnlSeat66Layout.setHorizontalGroup(
            pnlSeat66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat66Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl66)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat66Layout.setVerticalGroup(
            pnlSeat66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat66Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl66)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat66, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        pnlSeat67.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat67.setForeground(new java.awt.Color(255, 255, 255));

        lbl67.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat67Layout = new javax.swing.GroupLayout(pnlSeat67);
        pnlSeat67.setLayout(pnlSeat67Layout);
        pnlSeat67Layout.setHorizontalGroup(
            pnlSeat67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat67Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl67)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat67Layout.setVerticalGroup(
            pnlSeat67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat67Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl67)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat67, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        pnlSeat68.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat68.setForeground(new java.awt.Color(255, 255, 255));

        lbl68.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat68Layout = new javax.swing.GroupLayout(pnlSeat68);
        pnlSeat68.setLayout(pnlSeat68Layout);
        pnlSeat68Layout.setHorizontalGroup(
            pnlSeat68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat68Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl68)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat68Layout.setVerticalGroup(
            pnlSeat68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat68Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl68)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat68, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        pnlSeat69.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat69.setForeground(new java.awt.Color(255, 255, 255));

        lbl69.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat69Layout = new javax.swing.GroupLayout(pnlSeat69);
        pnlSeat69.setLayout(pnlSeat69Layout);
        pnlSeat69Layout.setHorizontalGroup(
            pnlSeat69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat69Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl69)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat69Layout.setVerticalGroup(
            pnlSeat69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat69Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl69)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat69, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        pnlSeat70.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat70.setForeground(new java.awt.Color(255, 255, 255));

        lbl70.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat70Layout = new javax.swing.GroupLayout(pnlSeat70);
        pnlSeat70.setLayout(pnlSeat70Layout);
        pnlSeat70Layout.setHorizontalGroup(
            pnlSeat70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl70)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat70Layout.setVerticalGroup(
            pnlSeat70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat70Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl70)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat70, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        pnlSeat71.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat71.setForeground(new java.awt.Color(255, 255, 255));

        lbl71.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat71Layout = new javax.swing.GroupLayout(pnlSeat71);
        pnlSeat71.setLayout(pnlSeat71Layout);
        pnlSeat71Layout.setHorizontalGroup(
            pnlSeat71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl71)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat71Layout.setVerticalGroup(
            pnlSeat71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat71Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl71)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat71, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        pnlSeat72.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat72.setForeground(new java.awt.Color(255, 255, 255));

        lbl72.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat72Layout = new javax.swing.GroupLayout(pnlSeat72);
        pnlSeat72.setLayout(pnlSeat72Layout);
        pnlSeat72Layout.setHorizontalGroup(
            pnlSeat72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl72)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat72Layout.setVerticalGroup(
            pnlSeat72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat72Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl72)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat72, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, -1, -1));

        pnlSeat73.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat73.setForeground(new java.awt.Color(255, 255, 255));

        lbl73.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat73Layout = new javax.swing.GroupLayout(pnlSeat73);
        pnlSeat73.setLayout(pnlSeat73Layout);
        pnlSeat73Layout.setHorizontalGroup(
            pnlSeat73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl73)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat73Layout.setVerticalGroup(
            pnlSeat73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat73Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl73)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat73, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));

        pnlSeat74.setBackground(new java.awt.Color(51, 51, 51));
        pnlSeat74.setForeground(new java.awt.Color(255, 255, 255));

        lbl74.setText("jLabel3");

        javax.swing.GroupLayout pnlSeat74Layout = new javax.swing.GroupLayout(pnlSeat74);
        pnlSeat74.setLayout(pnlSeat74Layout);
        pnlSeat74Layout.setHorizontalGroup(
            pnlSeat74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl74)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlSeat74Layout.setVerticalGroup(
            pnlSeat74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeat74Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl74)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        roundPanel2.add(pnlSeat74, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Sell");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 135, 47));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Sell");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 135, 47));

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Sell");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 410, 135, 47));

        jButton1.setText("Clear All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        roundPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 130, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sala");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sala 1", "Sala 2", "Sala 3", "Sala 4", "Sala 5" }));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Horario");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15:30-17:00", "17:15-19:00", "19:00-20:30", "21:00-23:00", "23:00-00:30" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Client");

        jLabel4.setText("Product");

        jLabel5.setText("amount");

        jButton4.setText("add Product");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel3Layout = new javax.swing.GroupLayout(roundPanel3);
        roundPanel3.setLayout(roundPanel3Layout);
        roundPanel3Layout.setHorizontalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
        );
        roundPanel3Layout.setVerticalGroup(
            roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(roundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seat");

        lblCreate4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCreate4.setForeground(new java.awt.Color(255, 204, 0));
        lblCreate4.setText(">>add new client!!");
        lblCreate4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        lblCreate4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCreate4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreate4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE))
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCreate4)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreate4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String name = jComboBox4.getSelectedItem().toString();
        int amount=0;
        
        try {
            amount = Integer.parseInt(jTextField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        DAOProducto dao =  new DAOProductoImpl();
        Producto prod =  dao.getProduct(name);
        prod.setCantidadDECompra(amount);
        things.add(prod);
        prod.setCantidadDECompra(amount);
        dao.modifyProduct(prod);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sala = jComboBox1.getSelectedItem().toString();
        String hour = jComboBox2.getSelectedItem().toString();
        
        try {
            seat.setNumber(Integer.parseInt(jTextField2.getText()));
            voucher.setCosto(voucher.getCosto() + 10);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa un número en asiento", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        DAOCliente daooo= new DAOClienteImpl();
        String cll =  jComboBox3.getSelectedItem().toString();
        String cl = cll.substring(0,cll.indexOf(" "));
        client = daooo.getCliente(cl);
        voucher.setId(rand.nextInt(100));
        voucher.setProductos(things);
        voucher.calcCosto();
             

        Venta sell = new Venta(rand.nextInt(100),client,voucher);
        SaleDetails sale = new SaleDetails();
        sale.getSale(sell,sala,hour,seat.getNumber());
        sale.setVisible(true);
        sale.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lblCreate4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreate4MouseClicked
        RegisterForm ss = new RegisterForm();
        ss.setVisible(true);
        this.setVisible(false);
        ss.requestFocusInWindow();
    }//GEN-LAST:event_lblCreate4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modifySeatAll();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl36;
    private javax.swing.JLabel lbl37;
    private javax.swing.JLabel lbl38;
    private javax.swing.JLabel lbl39;
    private javax.swing.JLabel lbl40;
    private javax.swing.JLabel lbl41;
    private javax.swing.JLabel lbl42;
    private javax.swing.JLabel lbl43;
    private javax.swing.JLabel lbl44;
    private javax.swing.JLabel lbl45;
    private javax.swing.JLabel lbl46;
    private javax.swing.JLabel lbl47;
    private javax.swing.JLabel lbl48;
    private javax.swing.JLabel lbl49;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl50;
    private javax.swing.JLabel lbl51;
    private javax.swing.JLabel lbl52;
    private javax.swing.JLabel lbl53;
    private javax.swing.JLabel lbl54;
    private javax.swing.JLabel lbl55;
    private javax.swing.JLabel lbl56;
    private javax.swing.JLabel lbl57;
    private javax.swing.JLabel lbl58;
    private javax.swing.JLabel lbl59;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl60;
    private javax.swing.JLabel lbl61;
    private javax.swing.JLabel lbl62;
    private javax.swing.JLabel lbl63;
    private javax.swing.JLabel lbl64;
    private javax.swing.JLabel lbl65;
    private javax.swing.JLabel lbl66;
    private javax.swing.JLabel lbl67;
    private javax.swing.JLabel lbl68;
    private javax.swing.JLabel lbl69;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl70;
    private javax.swing.JLabel lbl71;
    private javax.swing.JLabel lbl72;
    private javax.swing.JLabel lbl73;
    private javax.swing.JLabel lbl74;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblCreate4;
    private com.GUI.RoundPanel pnlSeat1;
    private com.GUI.RoundPanel pnlSeat10;
    private com.GUI.RoundPanel pnlSeat11;
    private com.GUI.RoundPanel pnlSeat12;
    private com.GUI.RoundPanel pnlSeat13;
    private com.GUI.RoundPanel pnlSeat14;
    private com.GUI.RoundPanel pnlSeat15;
    private com.GUI.RoundPanel pnlSeat16;
    private com.GUI.RoundPanel pnlSeat17;
    private com.GUI.RoundPanel pnlSeat18;
    private com.GUI.RoundPanel pnlSeat19;
    private com.GUI.RoundPanel pnlSeat2;
    private com.GUI.RoundPanel pnlSeat20;
    private com.GUI.RoundPanel pnlSeat21;
    private com.GUI.RoundPanel pnlSeat22;
    private com.GUI.RoundPanel pnlSeat23;
    private com.GUI.RoundPanel pnlSeat24;
    private com.GUI.RoundPanel pnlSeat25;
    private com.GUI.RoundPanel pnlSeat26;
    private com.GUI.RoundPanel pnlSeat27;
    private com.GUI.RoundPanel pnlSeat28;
    private com.GUI.RoundPanel pnlSeat29;
    private com.GUI.RoundPanel pnlSeat30;
    private com.GUI.RoundPanel pnlSeat31;
    private com.GUI.RoundPanel pnlSeat32;
    private com.GUI.RoundPanel pnlSeat33;
    private com.GUI.RoundPanel pnlSeat34;
    private com.GUI.RoundPanel pnlSeat35;
    private com.GUI.RoundPanel pnlSeat36;
    private com.GUI.RoundPanel pnlSeat37;
    private com.GUI.RoundPanel pnlSeat38;
    private com.GUI.RoundPanel pnlSeat39;
    private com.GUI.RoundPanel pnlSeat40;
    private com.GUI.RoundPanel pnlSeat41;
    private com.GUI.RoundPanel pnlSeat42;
    private com.GUI.RoundPanel pnlSeat43;
    private com.GUI.RoundPanel pnlSeat44;
    private com.GUI.RoundPanel pnlSeat45;
    private com.GUI.RoundPanel pnlSeat46;
    private com.GUI.RoundPanel pnlSeat47;
    private com.GUI.RoundPanel pnlSeat48;
    private com.GUI.RoundPanel pnlSeat49;
    private com.GUI.RoundPanel pnlSeat5;
    private com.GUI.RoundPanel pnlSeat50;
    private com.GUI.RoundPanel pnlSeat51;
    private com.GUI.RoundPanel pnlSeat52;
    private com.GUI.RoundPanel pnlSeat53;
    private com.GUI.RoundPanel pnlSeat54;
    private com.GUI.RoundPanel pnlSeat55;
    private com.GUI.RoundPanel pnlSeat56;
    private com.GUI.RoundPanel pnlSeat57;
    private com.GUI.RoundPanel pnlSeat58;
    private com.GUI.RoundPanel pnlSeat59;
    private com.GUI.RoundPanel pnlSeat6;
    private com.GUI.RoundPanel pnlSeat60;
    private com.GUI.RoundPanel pnlSeat61;
    private com.GUI.RoundPanel pnlSeat62;
    private com.GUI.RoundPanel pnlSeat63;
    private com.GUI.RoundPanel pnlSeat64;
    private com.GUI.RoundPanel pnlSeat65;
    private com.GUI.RoundPanel pnlSeat66;
    private com.GUI.RoundPanel pnlSeat67;
    private com.GUI.RoundPanel pnlSeat68;
    private com.GUI.RoundPanel pnlSeat69;
    private com.GUI.RoundPanel pnlSeat7;
    private com.GUI.RoundPanel pnlSeat70;
    private com.GUI.RoundPanel pnlSeat71;
    private com.GUI.RoundPanel pnlSeat72;
    private com.GUI.RoundPanel pnlSeat73;
    private com.GUI.RoundPanel pnlSeat74;
    private com.GUI.RoundPanel pnlSeat8;
    private com.GUI.RoundPanel pnlSeat9;
    private com.GUI.RoundPanel roundPanel1;
    private com.GUI.RoundPanel roundPanel2;
    private com.GUI.RoundPanel roundPanel3;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Butaca> listaButacas(String sal) {
        ArrayList<Butaca> butacas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/DBText/seats.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 7) {
                    int num = Integer.parseInt(partes[0].trim());
                    String sala = partes[1].trim();
                    int ocupado1 = Integer.parseInt(partes[2].trim());
                    int ocupado2 = Integer.parseInt(partes[3].trim());
                    int ocupado3 = Integer.parseInt(partes[4].trim());
                    int ocupado4 = Integer.parseInt(partes[5].trim());
                    int ocupado5 = Integer.parseInt(partes[6].trim());
                     
                    if(sala.equals(sal)){
                        Butaca st = new Butaca(num,sala,ocupado1,ocupado2,ocupado3,ocupado4,ocupado5);
                        butacas.add(st);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return butacas;
    }
    
    public void modifySeatAll() {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/DBText/seats.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 7) {
                    int ocupado1 = Integer.parseInt(parts[2].trim());
                    int ocupado2 = Integer.parseInt(parts[3].trim());
                    int ocupado3 = Integer.parseInt(parts[4].trim());
                    int ocupado4 = Integer.parseInt(parts[5].trim());
                    int ocupado5 = Integer.parseInt(parts[6].trim());
                    
                    if (ocupado1==1 || ocupado2 ==1 || ocupado3 == 1 || ocupado4 ==1 || ocupado5 == 1) {
                        lineas.add(parts[0].trim() + "," +parts[1].trim() + "," + 0 + "," + 0+ "," + 0 +","+ 0 +","+0);
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

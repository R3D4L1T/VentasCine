
package com.DB;

import com.CODE.DAOVenta;
import com.CODE.Trabajador;
import com.CODE.Venta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DAOVentaImpl extends DBConnector implements DAOVenta {

    String txtSales = "src/main/resources/DBText/ventas.txt";
    String txtSaleHistory = "src/main/resources/DBText/saleHistory.txt";
    
    @Override
    public void register(Venta v) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtSales, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = v.getNumVenta() + "," + v.getCliente().getId() + "," + v.getVoleta().getId() + "," + v.getVoleta().getProductos().size() + "," + v.getVoleta().getCosto();
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("sale add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Venta> listSale() {
        ArrayList<Venta> sales = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(txtSaleHistory))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6) {
                    
                    int id = Integer.parseInt(partes[0].trim());
                    String client = partes[1].trim();
                    String sala = partes[2].trim();
                    String asiento = partes[3].trim();
                    String products = partes[4].trim();
                    double price = Double.parseDouble(partes[5].trim());
                    
                    Venta sl = new Venta(id,client,sala,asiento,products,price);
                    sales.add(sl);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sales;
    }

    @Override
    public boolean VerifyExist(String code) {
        boolean credentialsVerify = false;
        
        try (BufferedReader br = new BufferedReader(new FileReader(txtSales))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                
                if (parts.length == 5) {
                    String saleCode = parts[0].trim();


                    if (saleCode.equals(code)) {
                        credentialsVerify =  true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return credentialsVerify;
    }

    @Override
    public void registerHistory(Venta v) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtSaleHistory, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = v.getNumVenta() + "," + v.getCliente().getNombre()+" "+v.getCliente().getApellidos() + ","+ v.getAsiento().getLocation() +"," +v.getAsiento().getNumber()+","+ v.getVoleta().getProductos().size() + "," + v.getVoleta().getCosto() + ",";
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("sale add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeSale(String code) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtSales))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] partes = lines.split(",");
                if (partes.length == 5) {
                    String nom = partes[0].trim();

                    if (!nom.equals(code)) {
                        lineas.add(lines);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtSales))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

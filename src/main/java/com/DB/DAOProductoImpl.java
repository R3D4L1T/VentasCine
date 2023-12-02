
package com.DB;

import com.CODE.DAOProducto;
import com.CODE.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOProductoImpl extends DBConnector implements DAOProducto{
    String txtProductos = "src/main/resources/DBText/products.txt";
    
    @Override
    public void register(Producto product) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtProductos, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = product.getId() + "," + product.getNombre() + "," + product.getStock() + "," + product.getMeasure() + "," + product.getPrecio();
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("product add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList listProducts() {
        ArrayList<Producto> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtProductos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 5) {
                    
                    
                    String idd = partes[0].trim();
                    String name = partes[1].trim();
                    String sto = partes[2].trim();
                    String extent = partes[3].trim();
                    String pric = partes[4].trim();
                    
                    int id = Integer.parseInt(idd);
                    int stock =  Integer.parseInt(sto);
                    float price =  Float.parseFloat(pric);
                    
                    Producto pp = new Producto(id,name, stock, extent,price);
                    products.add(pp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    @Override
    public Producto getProduct(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(txtProductos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 5) {
                    String n = parts[1].trim();
                    
                    if (n.equals(name)) {
                        Producto p = new Producto();
                        int id = Integer.parseInt(parts[0].trim());
                        int stock =  Integer.parseInt(parts[2].trim());
                        float price =  Float.parseFloat(parts[4].trim());
                        
                        p.setId(id);
                        p.setNombre(parts[1].trim()); 
                        p.setStock(stock);
                        p.setMeasure(parts[3].trim());
                        p.setPrecio(price);
                        return p;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void modifyProduct(Producto product) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtProductos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 5) {
                    int id = Integer.parseInt(parts[0].trim());
                    int stock =  Integer.parseInt(parts[2].trim());
                    float price =  Float.parseFloat(parts[4].trim());
                    String name =  parts[1].trim();
                    String extent =  parts[3].trim();
                       
                    if (id == product.getId()) {
                        lineas.add(product.getId() + "," +product.getNombre() + "," + product.getStock() + "," + product.getMeasure()+ "," + product.getPrecio());
                    } else {
                        lineas.add(linea);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtProductos))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void removeProduct(String name) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtProductos))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] partes = lines.split(",");
                if (partes.length == 5) {
                    String nom = partes[1].trim();

                    if (!nom.equals(name)) {
                        lineas.add(lines);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtProductos))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

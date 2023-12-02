
package com.DB;

import com.CODE.Administrador;
import com.CODE.DAOAdministrador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DAOAdministradorImpl extends DBConnector implements DAOAdministrador {
    String txtAdmin = "src/main/resources/DBText/admin.txt";

    @Override
    public void remove(String name) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtAdmin))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] partes = lines.split(",");
                if (partes.length == 6) {
                    String nom = partes[1].trim();

                    if (!nom.equals(name)) {
                        lineas.add(lines);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtAdmin))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Administrador getAdmin(String name) {
        
        try (BufferedReader br = new BufferedReader(new FileReader(txtAdmin))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                
                if (parts.length == 7) {
                    String n = parts[1].trim();
                    if (name.equals(name)) {
                        Administrador a = new Administrador();
                        int id = Integer.parseInt(parts[0].trim());
                        a.setId(id);
                        a.setNombre(parts[1].trim());
                        a.setApellidos(parts[2].trim());
                        a.setIdCard(parts[3].trim());
                        a.setNumIdCard(parts[4].trim());
                        a.setRol(parts[5].trim());
                        return a;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public void modifyData(Administrador admin) {
       ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtAdmin))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 7) {
                    int id = Integer.parseInt(partes[0].trim());
                    
                    if (id == admin.getId()) {
                        System.out.println("eeeeeeeeeeeeeeeeeeeeee");
                        lineas.add(admin.getId() + "," +admin.getNombre() + "," +admin.getApellidos()+ "," +admin.getIdCard() + "," + admin.getNumIdCard()+ "," + admin.getRol()+","+admin.getPassword());
                    } else {
                        lineas.add(linea);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtAdmin))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public boolean loginVerify(String name, String pass, String rol) {
        boolean credentialsVerify = false;
        

        try (BufferedReader br = new BufferedReader(new FileReader(txtAdmin))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");

                if (parts.length == 7) {
                    String username = parts[1].trim();
                    String rl = parts[5].trim();
                    String passs = parts[6].trim();
                    if (username.equals(name) && passs.equals(pass) && rl.equals(rol)) {
                        credentialsVerify =  true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return credentialsVerify;
    }
}

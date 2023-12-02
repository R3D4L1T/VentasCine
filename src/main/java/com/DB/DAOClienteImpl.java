
package com.DB;


import com.CODE.Cliente;
import com.CODE.DAOCliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class DAOClienteImpl extends DBConnector implements DAOCliente {
    String txtClients = "src/main/resources/DBText/clients.txt";
    
    @Override
    public void register(Cliente client) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtClients, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = client.getId() + "," + client.getNombre() + "," + client.getApellidos() + "," + client.getIdCard() + "," + client.getNumIdCard() + ","+client.getPhone();
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("user add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(String name) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtClients))) {
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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtClients))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Cliente getCliente(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(txtClients))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 6) {
                    String n = parts[1].trim();
                    
                    if (name.equals(n)) {
                        
                        Cliente a = new Cliente();
                        int id = Integer.parseInt(parts[0].trim());
                        a.setId(id);
                        a.setNombre(parts[1].trim());
                        a.setApellidos(parts[2].trim());
                        a.setIdCard(parts[3].trim());
                        a.setNumIdCard(parts[4].trim());
                        a.setPhone(parts[5].trim());          
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
    public void modifyData(Cliente client) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtClients))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6) {
                    String id = partes[0].trim();
                    String name = partes[1].trim();
                    String apellidos = partes[2].trim();
                    String  idCard= partes[3].trim();
                    String numCard = partes[4].trim();
                    String rl = partes[5].trim();
                            
                    if (name.equals(client.getId())) {
                        lineas.add(client.getId() + "," +client.getNombre() + "," + client.getIdCard() + "," + client.getNumIdCard()+ "," + client.getRol());
                    } else {
                        lineas.add(linea);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtClients))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Cliente> listaCliente() {
        
        ArrayList<Cliente> clients = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtClients))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6) {
                    int id = Integer.parseInt(partes[0].trim());
                    String name = partes[1].trim();
                    String apellidos = partes[2].trim();
                    String  idCard= partes[3].trim();
                    String numCard = partes[4].trim();
                    String phone = partes[5].trim();

                    Cliente cl = new Cliente(id, name, apellidos, idCard, numCard, phone);
                    clients.add(cl);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return clients;
    }
}

package com.DB;


import com.CODE.DAOTrabajador;
import com.CODE.Trabajador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DAOTrabajadorImpl extends DBConnector implements DAOTrabajador {
    
    String txtWorkers = "src/main/resources/DBText/workers.txt";
    
    @Override
    public void register(Trabajador trabajador) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtWorkers, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = trabajador.getId() + "," + trabajador.getNombre() + "," + trabajador.getApellidos() + "," + trabajador.getIdCard() + "," + trabajador.getNumIdCard() +"," + trabajador.getRol() + "," + trabajador.getSalario() + "," + trabajador.getPassword();
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("worker add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Trabajador getTrabajador(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader(txtWorkers))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 8) {
                    String n = parts[1].trim();
                    if (name.equals(name)) {
                        Trabajador a = new Trabajador();
                        int id = Integer.parseInt(parts[0].trim());
                        a.setId(id);
                        a.setNombre(parts[1].trim());
                        a.setApellidos(parts[2].trim());
                        a.setIdCard(parts[3].trim());
                        a.setNumIdCard(parts[4].trim());
                        a.setRol(parts[5].trim());
                        a.setSalario(Integer.parseInt(parts[6].trim()));
                        a.setPassword(parts[7].trim());
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
    public void modifyData(Trabajador trabajador) {
        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtWorkers))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 8) {
                    int id = Integer.parseInt(partes[0].trim());
                            
                    if (id == trabajador.getId()) {
                        lineas.add(trabajador.getId() + "," + trabajador.getNombre() + "," + trabajador.getApellidos() + "," + trabajador.getIdCard() + "," + trabajador.getNumIdCard() +"," + trabajador.getRol() + "," + trabajador.getSalario() + "," + trabajador.getPassword());
                    } else {
                        lineas.add(linea);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtWorkers))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Trabajador> listaTrabajador() {
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(txtWorkers))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 8) {
                    
                    int id = Integer.parseInt(partes[0].trim());
                    String name = partes[1].trim();
                    String lasname = partes[2].trim();
                    String idCard = partes[3].trim();
                    String  numIDcard= partes[4].trim();
                    String rl = partes[5].trim();
                    int sal = Integer.parseInt(partes[6].trim());
                    String pass = partes[7].trim();
                    
                    Trabajador cl = new Trabajador(id, name,lasname, idCard, numIDcard, rl,sal,pass);
                    trabajadores.add(cl);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return trabajadores;
    }

    @Override
    public boolean loginVerify(String name, String pass, String rol) {
        boolean credentialsVerify = false;
        
        try (BufferedReader br = new BufferedReader(new FileReader(txtWorkers))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                
                if (parts.length == 8) {
                    String username = parts[1].trim();
                    String rl = parts[5].trim();
                    String passs = parts[7].trim();

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

    @Override
    public void remove(String name) {
        
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtWorkers))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] partes = lines.split(",");
                if (partes.length == 8) {
                    String nom = partes[1].trim();

                    if (!nom.equals(name)) {
                        lineas.add(lines);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtWorkers))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

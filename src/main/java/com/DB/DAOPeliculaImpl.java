
package com.DB;

import com.CODE.DAOPelicula;
import com.CODE.Pelicula;
import com.CODE.Trabajador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DAOPeliculaImpl extends DBConnector implements DAOPelicula {
    
    String txtMovies = "src/main/resources/DBText/pelis.txt";
    
    @Override
    public void register(Pelicula p) {
        this.initFiles();
        
        try (FileWriter fileWriter = new FileWriter(txtMovies, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String linea = p.getTitulo() + "," + p.getGenero() + "," + p.getDuracion();
            bufferedWriter.write(linea);
            bufferedWriter.newLine();
            System.out.println("movie add correct");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Pelicula> listMovies() {
        ArrayList<Pelicula> movies = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtMovies))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    
                    String title = partes[0].trim();
                    String gender = partes[1].trim();
                    String duration = partes[2].trim();
                    
                    Pelicula pp = new Pelicula(title, gender,duration);
                    movies.add(pp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return movies;
    }

    @Override
    public void removePelicula(String name) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(txtMovies))) {
            String lines;
            while ((lines = br.readLine()) != null) {
                String[] partes = lines.split(",");
                if (partes.length == 3) {
                    String title = partes[0].trim();

                    if (!title.equals(name)) {
                        lineas.add(lines);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(txtMovies))) {
            for (String line : lineas) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Pelicula getMovie(String title) {
        try (BufferedReader br = new BufferedReader(new FileReader(txtMovies))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] parts = linea.split(",");
                if (parts.length == 3) {
                    String n = parts[0].trim();
                    if (n.equals(title)) {
                        Pelicula pp = new Pelicula();
                        pp.setTitulo(parts[0].trim());
                        pp.setGenero(parts[1].trim());
                        pp.setDuracion(parts[2].trim());
                        return pp;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
}

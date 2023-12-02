
package com.CODE;

import java.util.ArrayList;

public interface DAOPelicula {
    public void register(Pelicula p);
    public ArrayList<Pelicula> listMovies();
    public void removePelicula(String name);
    public Pelicula getMovie(String title);
}

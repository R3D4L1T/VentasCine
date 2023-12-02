
package com.cineproyecto;

import com.CODE.Cliente;
import com.CODE.Producto;
import java.util.ArrayList;


public class Cine {
    
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;

    public Cine() {
    }

    public Cine(ArrayList<Producto> productos, ArrayList<Cliente> clientes) {
        this.productos = productos;
        this.clientes = clientes;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }





}


package com.CODE;

public class Producto {
    private int id;
    private String nombre;
    private int stock;
    private String measure;
    private float precio;
    private int cantidadDECompra;
    

    public Producto() {
    }

    public Producto(int id, String nombre, int stock, String extent, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.measure = extent;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void descontarStock(int num){
        this.stock = this.stock - num;
    }

    public int getCantidadDECompra() {
        return cantidadDECompra;
    }

    public void setCantidadDECompra(int cantidadDECompra) {
        this.cantidadDECompra = cantidadDECompra;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre  + "-cantidad: " + cantidadDECompra;
    }
}

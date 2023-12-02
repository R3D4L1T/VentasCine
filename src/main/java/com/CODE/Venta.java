
package com.CODE;

import java.util.ArrayList;


public class Venta {
    private int numVenta;
    private Cliente cliente;
    private Boleta boleta;
    private String extra1,extra2,extra3,extra5,extra6; private double extra4;
    private Butaca asiento;
    
    public Venta() {
    }

    public Venta(int num,String client, String sala, String asiento, String products, double costo){
        this.numVenta = num;
        this.extra2 = client;
        this.extra3=sala;
        this.extra5 = asiento;
        this.extra6 = products;
        this.extra4 = costo;
    }
    
    public Venta(int numVenta, Cliente cliente, Boleta boleta) {
        this.numVenta = numVenta;
        this.cliente = cliente;
        this.boleta = boleta;
    }

    
    public static class Boleta {
        private int id;
        private ArrayList<Producto> productos;
        private double costo;

        public Boleta() {
        }

        public Boleta(int id, ArrayList<Producto> productos) {
            this.id = id;
            this.productos = productos;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public ArrayList<Producto> getProductos() {
            return productos;
        }

        public void setProductos(ArrayList<Producto> productos) {
            this.productos = productos;
        }
        
        public void calcCosto(){
            double cost = 0;
            
            for(Producto p : productos){
                cost += p.getPrecio() * p.getCantidadDECompra();
                p.descontarStock(p.getCantidadDECompra());
            }
            this.costo = cost;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }
    }

    public int getNumVenta() {
        return numVenta;
    }

    public String getExtra5() {
        return extra5;
    }

    public String getExtra6() {
        return extra6;
    }

    public void setExtra6(String extra6) {
        this.extra6 = extra6;
    }

    public void setExtra5(String extra5) {
        this.extra5 = extra5;
    }
    

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boleta getVoleta() {
        return boleta;
    }

    public void setVoleta(Boleta voleta) {
        this.boleta = voleta;
    }

    public String getExtra1() {
        return extra1;
    }

    public void setExtra1(String extra1) {
        this.extra1 = extra1;
    }

    public String getExtra2() {
        return extra2;
    }

    public void setExtra2(String extra2) {
        this.extra2 = extra2;
    }

    public String getExtra3() {
        return extra3;
    }

    public void setExtra3(String extra3) {
        this.extra3 = extra3;
    }

    public double getExtra4() {
        return extra4;
    }

    public void setExtra4(double extra4) {
        this.extra4 = extra4;
    }

    public Butaca getAsiento() {
        return asiento;
    }

    public void setAsiento(Butaca asiento) {
        this.asiento = asiento;
    }

}

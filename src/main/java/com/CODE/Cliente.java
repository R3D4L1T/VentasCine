
package com.CODE;

import java.util.ArrayList;


public class Cliente extends Usuario{
    private String phone;
    private ArrayList<Venta.Boleta> boletas;

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellidos, String IdCard, String numIdCard,String phone) {
        super(id, nombre, apellidos, IdCard, numIdCard);
        this.phone = phone;
    }
    
    public Cliente(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Venta.Boleta> getBoletas() {
        return boletas;
    }

    public void setBoletas(ArrayList<Venta.Boleta> boletas) {
        this.boletas = boletas;
    }

    public int calNumVoletas(){
        return 0;
    }
}

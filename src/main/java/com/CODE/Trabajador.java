
package com.CODE;


public class Trabajador extends Usuario{
    private float salario;
    private Venta venta;

    public Trabajador() {
    }

    public Trabajador(int id, String nombre, String apellidos, String IdCard, String numIdCard, String rol, float salario, String password ) {
        super(id, nombre, apellidos, IdCard, numIdCard, rol, password);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    

    @Override
    public String toString() {
        return super.toString() + "Trabajador{" + "salario=" + salario + '}';
    }

}

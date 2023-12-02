
package com.CODE;

public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(int id, String nombre, String apellidos, String IdCard, String numIdCard, String rol, String password) {
        super(id, nombre, apellidos, IdCard, numIdCard, rol, password);
    }



    @Override
    public String toString() {
        return super.toString() + "Administrador{" + '}';
    }

}

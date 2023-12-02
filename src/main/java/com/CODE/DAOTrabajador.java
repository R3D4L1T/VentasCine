
package com.CODE;

import java.util.ArrayList;

public interface DAOTrabajador {
    public void register(Trabajador trabajador);
    public void remove(String name);
    public Trabajador getTrabajador(String name);
    public void modifyData(Trabajador trabajador);
    public ArrayList<Trabajador> listaTrabajador();
    public boolean loginVerify(String name, String pass, String rol);
}

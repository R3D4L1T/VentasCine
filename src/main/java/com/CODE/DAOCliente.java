
package com.CODE;

import java.util.ArrayList;

public interface DAOCliente {
    public void register(Cliente client);
    public void remove(String name);
    public Cliente getCliente(String name);
    public void modifyData(Cliente client);
    public ArrayList<Cliente> listaCliente();
}

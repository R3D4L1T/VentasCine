
package com.CODE;

public interface DAOAdministrador {
    public void remove(String name);
    public Administrador getAdmin(String name);
    public void modifyData(Administrador admin);
    public boolean loginVerify(String name, String pass, String rol);
}

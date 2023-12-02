
package com.CODE;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String IdCard;
    protected String numIdCard;
    protected String rol;
    protected String password;

    public Usuario() {
    }

    public Usuario(int id, String nombre,String apellidos, String IdCard, String numIdCard, String rol, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.apellidos = apellidos;
        this.IdCard = IdCard;
        this.numIdCard = numIdCard;
        this.rol = rol;
    }

    public Usuario(int id, String nombre, String apellidos, String IdCard, String numIdCard) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.IdCard = IdCard;
        this.numIdCard = numIdCard;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    public String getNumIdCard() {
        return numIdCard;
    }

    public void setNumIdCard(String numIdCard) {
        this.numIdCard = numIdCard;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", password=" + password + ", apellidos=" + apellidos + ", IdCard=" + IdCard + ", numIdCard=" + numIdCard + ", rol=" + rol + '}';
    }

}

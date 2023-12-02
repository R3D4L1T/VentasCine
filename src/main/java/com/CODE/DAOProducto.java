
package com.CODE;

import java.util.ArrayList;


public interface DAOProducto {
    public void register(Producto product);
    public ArrayList<Producto> listProducts();
    public Producto getProduct(String name);
    public void modifyProduct(Producto product);
    public void removeProduct(String name);
}

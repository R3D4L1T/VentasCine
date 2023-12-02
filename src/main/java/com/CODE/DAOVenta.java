
package com.CODE;

import java.util.ArrayList;

public interface DAOVenta {
    public void register(Venta v);
    public void registerHistory(Venta v);
    public ArrayList<Venta> listSale();
    public boolean VerifyExist(String code);
    public void removeSale(String code);
}

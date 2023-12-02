
package com.DB;

import java.io.File;
import java.io.IOException;

public class DBConnector {
    public void initFiles(){
        String admin = "src/main/resources/DBText/admin.txt";File archive1 = new File(admin);
        String workers = "src/main/resources/DBText/workers.txt";File archive2 = new File(workers);
        String products = "src/main/resources/DBText/products.txt";File archive3 = new File(products);
        String clients = "src/main/resources/DBText/clients.txt";File archive4 = new File(clients);
        String sales = "src/main/resources/DBText/ventas.txt";File archive5 = new File(sales);
        String movies = "src/main/resources/DBText/pelis.txt";File archive6 = new File(movies);
        String saleHistory = "src/main/resources/DBText/saleHistory.txt";File archive7 = new File(saleHistory);
        String seat = "src/main/resources/DBText/seats.txt";File archive8 = new File(seat);
        
        if(archive1.exists()  && archive2.exists() && archive3.exists() && archive4.exists() && archive5.exists()&& archive6.exists() && archive7.exists() && archive8.exists()){
            System.out.println("the file exist");
        }
        else{
            try{
                if(archive1.createNewFile()){
                    System.out.println("file to created");
                }
                else{
                    System.out.println("file1 cannot created");
                }
                if(archive2.createNewFile()){
                    System.out.println("file to created");
                }
                else{
                    System.out.println("file2 cannot created");
                }
                if(archive3.createNewFile()){
                    System.out.println("file to created");
                }
                else{
                    System.out.println("file3 can not created");
                }
                if(archive4.createNewFile()){
                    System.out.println("file4 to created");
                }
                else{
                    System.out.println("file4 can not created");
                }
                if(archive5.createNewFile()){
                    System.out.println("file5 to created");
                }
                else{
                    System.out.println("file5 can not created");
                }
                if(archive6.createNewFile()){
                    System.out.println("movies file created");
                }
                else{
                    System.out.println("movies file can not created");
                }
                if(archive7.createNewFile()){
                    System.out.println("sale history created");
                }else{
                    System.out.println("sale history can not created");
                }
                if(archive8.createNewFile()){
                    System.out.println("seat file created");
                }
                else{
                    System.out.println("seat file can not created");
                }
                
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
}

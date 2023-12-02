
package com.CODE;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WhatsappSend {
    
    public void sendInfo(String number, String file){
        try{
            WebDriver driver;
            //Obtenemos la ubicacion de nuestro programa
            String localPath=new File(".").getCanonicalPath();
            //Declaramos el buffer que almacenna cada linea del excel
            BufferedReader br = null;
            //Leemos el chromedriver que esta en la misma direccion del programa
            System.setProperty("webdriver.chrome.driver", localPath+"\\chromedriver.exe");
            //Inicializamos ls opciones de chrome
            ChromeOptions optionsGoo = new ChromeOptions();
            //Permitimos la propiedad no-sandbox para evitar problemas en linux
            optionsGoo.addArguments("--no-sandbox");
            //Deshabilitamos las notificaciones
            optionsGoo.addArguments("--disable-notifications");
            //Guardamos la sesion en la carpeta chromeWA
            optionsGoo.addArguments("--user-data-dir="+localPath+"\\chromeWA");
            //Instanciamos un nuevo chromedriver
            driver = new ChromeDriver(optionsGoo);
            
            
            try{
                //Abrimos whatsapp web con el numero de telefono a enviar
                driver.get("https://web.whatsapp.com/send/?phone="+number+"&text&type=phone_number&app_absent=0");
                //Declaramos el tiempo de espera
                Thread.sleep(10000);


                driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[2]/div/div")).click();
                pausa(3000);
                WebElement fileInput =driver.findElement(By.xpath("//*[@id=\"main\"]/footer/div[1]/div/span[2]/div/div[1]/div[2]/div/span/div/ul/div/div[2]/li/div/input"));
                fileInput.sendKeys(localPath+"\\src\\main\\resources\\QRCode\\"+file);
                pausa(3000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/span/div/span/div/div/div[2]/div/div[1]/div[3]/div/div/div[2]/div[1]/div[1]/p")).sendKeys("este es tu imagen para ingresar!!");                
                pausa(3000);
                driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[3]/div[2]/span/div/span/div/div/div[2]/div/div[1]/div[3]/div/div/div[2]/div[1]/div[1]/p")).sendKeys(Keys.ENTER);
                pausa(3000);
                driver.close();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }catch(IOException ex){
            Logger.getLogger(WhatsappSend.class.getName()).log(Level.SEVERE,null, ex);
        }
    }
    public static void pausa(long sleeptime) {
        try {
            Thread.sleep(sleeptime);
        } catch (InterruptedException ex) {
            
        }
    }
}

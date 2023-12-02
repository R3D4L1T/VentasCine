
package com.CODE;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRGeneration {
    
    // objeto venta
    public String name,sala,horario,butaca,boletaID="boletaID";
    private final String IMAGE_PATH = "src/main/resources/QRCode/"+boletaID+".png";
    
    
    private static void generateQRCodeImage(String text, int width, int height, String filePath)
        throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
    
    
    public void generateQR(int numventa,String name, String sala, String horario, String butaca) {
        String data = numventa+"\nName: " +name+ "\nsala: " +sala+ "\nhorario: " + horario+"\nbutaca: " + butaca;
        
        try {
            generateQRCodeImage(data, 350, 350, IMAGE_PATH);
        } catch (WriterException e) {
            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
        }
    }
}

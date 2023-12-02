
package com.CODE;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class QRReader {

    private String decodeQRCode(File qrCodeimage)throws IOException {
        
        BufferedImage bufferedImage = ImageIO.read(qrCodeimage);
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        try {
            Result result = new MultiFormatReader().decode(bitmap);
            return result.getText();
        } catch (NotFoundException e) {
            System.out.println("There is no QR code in the image");
            return null;
        }
    }
    
    public String decodeImagen(){
        try {
            File file = new File("src/main/resources/temp/"+"test"+".png");
            String decodedText = decodeQRCode(file);
            
            if(decodedText == null) {
               return "No QR Code found in the image";
            } else {
                return decodedText;
            }
        } catch (IOException e) {
            return "Could not decode QR Code, IOException :: " + e.getMessage();
        }
    }
}

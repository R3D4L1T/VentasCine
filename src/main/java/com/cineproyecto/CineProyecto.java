package com.cineproyecto;

import com.DB.DBConnector;
import com.GUI.PreLoginForm;
import com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme;


import javax.swing.UIManager;

public class CineProyecto {
    
    public static void main(String[] args) {
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        //styles
        try {
            UIManager.setLookAndFeel( new FlatMaterialDesignDarkIJTheme() );
            System.out.println("correct initialize FaltLaf");
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        UIManager.put( "Button.arc", 999 );
        
        DBConnector db = new DBConnector();
        db.initFiles();
        
        
        PreLoginForm n = new PreLoginForm();
        n.setVisible(true);
        n.setLocationRelativeTo(null);
    }
}

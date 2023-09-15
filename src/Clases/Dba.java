/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author nahim
 */
public class Dba {
        private String bd;
    private Connection bdcon;
    public Statement query;

    public Dba(String bd) {
        this.bd = bd;
        
    }
    
    public void conectar(){
           try {
            String controlador= "jdbc:ucanaccess://";
            bdcon= DriverManager.getConnection(controlador+bd, "", "");
            query= bdcon.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    }//Fin de conectar
    
    public void desconectar(){
        try {
            query.close();
            bdcon.close();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
       
        
    
    
    
    }
    
     public void commit(){
        
            try {
                bdcon.commit();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        
        }
    
}

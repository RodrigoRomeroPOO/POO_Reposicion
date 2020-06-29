/*
 * Esta clase servira para usarla cuando solicitemos datos por el teclado al usuario
 * Uso de excepciones 
 * 
 */
package main;

import java.util.Scanner;


public class Teclado {
    
    //1-Tipo de dato String 
    public static String dato(){
        String dato=null;
        
        try {
            Scanner leer=new Scanner(System.in);
            dato=leer.next();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dato;
    }
    
    //2-Tipo de dato entero
    public static int datoint(){
        
        try {
           return(Integer.parseInt(dato()));
        } catch (NumberFormatException error) {
            return (Integer.MIN_VALUE);
        }
        
    }
    
    //3-Tipo de dato flotante
    
    public static float datofloat(){
        try {
            return(Integer.parseInt(dato()));
        } catch (NumberFormatException error) {
            return(Integer.MIN_VALUE);
        }
    }
    
    //4-Tipo de dato double
    public static double datodouble(){
        try {
            Double f=new Double(dato());
            return(f.doubleValue());
        } catch (NumberFormatException error) {
            return(Double.NaN);
        }
    }
    
    //5-Tipo de dato char
    public static char datochar(){
        try {
            char respuesta=dato().charAt(0);
            return respuesta;
        } catch (Exception e) {
            return('z');
        }
    }
    
    //6-Tipo de dato boleano
    public static boolean datoBoolean(){
        try {
            return(Boolean.parseBoolean(dato()));
        } catch (NumberFormatException error) {
            return(false);
        }
    }
}

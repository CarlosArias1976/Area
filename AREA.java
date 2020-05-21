/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area;
import java.util.Scanner;
   
            
        
/**
 *
 * @author carlo
 */
public class AREA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float Base;
        float Altura;
        float Area;
        
        System.out.println("ingresar  Base");
        Base = entrada.nextFloat();
        
        System.out.println("ingresar  Altura");
        Altura = entrada.nextFloat();
        
        
        Area = (Base*Altura)/2;
        
        
        System.out.println ("El Area del triangulo es:"+""+Area);
        
                
        
        
        
        // TODO code application logic here
    }
    
}

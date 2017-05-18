/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prepa4;

import java.util.Scanner;

/**
 *
 * @author Sony
 */
public class Aplicacion {
    
    private Equipo[] vec_equipo = new Equipo[2];
    
    public Aplicacion(){
        //CONSTRUCTOR VACÍO
        CrearEquipo();
    }
    
    public void recorrerEquipo(){
        
        for (int i = 0; i < vec_equipo.length; i++) {
            vec_equipo[i].MostrarEquipo();
        }
      
    }
    
    public void CrearEquipo(){
        Scanner sc = new Scanner(System.in);
        
       
        for (int i = 0; i < vec_equipo.length; i++) {
             System.out.println("Ingrese el nombre del equipo");
             String nombre = sc.next();
         
            vec_equipo[i] = new Equipo(nombre);
            vec_equipo[i].LlenarEquipo();
        }
    }
  
  
}

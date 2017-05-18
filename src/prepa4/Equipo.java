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
public class Equipo {
    
    private String nombre;
    private Jugador[] vec_jugadores = new Jugador[2];
    
    public Equipo(String n){
        nombre = n;
    }
    
    public void MostrarEquipo(){
        
        for (int i = 0; i < vec_jugadores.length; i++) {
            
            if(vec_jugadores[i] != null){
                vec_jugadores[i].mostrarJugador();
            }
        }
    }
    
    public void LlenarEquipo(){
        
        for (int i = 0; i < vec_jugadores.length; i++) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserta un Nombre de jugador");
            String nombre = sc.next();
            System.out.println("Inserta un apellido ");
            String apellido = sc.next();
            System.out.println("Insertar la posicion del campo");
            String nombrec = sc.next();
            
            System.out.println("(1) para insertar bateador, (2) Para insertar lanzador");
            int rsp = sc.nextInt();
            
            if(rsp == 1){
                Bateador b = new Bateador(nombre,apellido,nombrec,true);
                incorporarJugador(b,i);
            }
            else{
                Lanzador l = new Lanzador(nombre,apellido,nombrec,true);
                incorporarJugador(l,i);
            }
            

        }
    }
    
    public void incorporarJugador(Jugador nuevo, int i){
  
            vec_jugadores[i] = nuevo;
        
    }
    
    public void recorrerJugar(){
        
        for (int i = 0; i < this.vec_jugadores.length; i++) {
            
            if(vec_jugadores[i] instanceof Lanzador && vec_jugadores[i].isActivo()){
                Lanzador l = (Lanzador) vec_jugadores[i];
                l.Ponchar();
            }
            else if(vec_jugadores[i] instanceof Bateador && vec_jugadores[i].isActivo()){
                Bateador b = (Bateador) vec_jugadores[i];
                b.batearJonrone();
            }
        }
    }
}

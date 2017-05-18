/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prepa4;

/**
 *
 * @author Sony
 */
public class Bateador extends Jugador{
    
    private int hits;
    private int jonerones;

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getJonerones() {
        return jonerones;
    }

    public void setJonerones(int jonerones) {
        this.jonerones = jonerones;
    }
    
    public Bateador(String nombre, String apellido, String nombreC, boolean activo){
        super(nombre,apellido,nombreC,activo);
        this.hits = 0;
        this.jonerones = 0;
    }
    
    public void mostrarJugador(){
        
       System.out.println("Nombre :"+nombre);
       System.out.println("Apellido "+apellido);
       System.out.println("Nombre campo "+this.posicionCampo);
       System.out.println("Activo :"+this.activo);
       System.out.println("Hits :"+this.hits);
        System.out.println("Jone rones "+this.jonerones);
        
    }
    
    public void batearJonrone(){
        this.hits++;
        this.jonerones++;
    }
}

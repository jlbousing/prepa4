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
public class Lanzador extends Jugador {
    
   private int ponchesTotales;

    public int getPonchesTotales() {
        return ponchesTotales;
    }

    public void setPonchesTotales(int ponchesTotales) {
        this.ponchesTotales = ponchesTotales;
    }
   
   public Lanzador(String nombre, String apellido, String nombreC, boolean activo){
       super(nombre,apellido,nombreC,activo);
   }
   
   public void mostrarJugador(){
       
       System.out.println("Nombre :"+nombre);
       System.out.println("Apellido "+apellido);
       System.out.println("Nombre campo "+this.posicionCampo);
       System.out.println("Activo :"+this.activo);
       System.out.println("Ponches totales "+this.ponchesTotales);
       
   }
   
   public void Ponchar(){
       
       ponchesTotales++;
   }
}

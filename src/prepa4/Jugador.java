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
public abstract class Jugador {
    
    protected String nombre;
    protected String apellido;
    protected String posicionCampo;
    protected boolean activo;
    
    public Jugador(String nombre, String apellido, String posicionC, boolean activo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicionCampo = posicionC;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicionCampo() {
        return posicionCampo;
    }

    public void setPosicionCampo(String posicionCampo) {
        this.posicionCampo = posicionCampo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public abstract void mostrarJugador();
    
    
}

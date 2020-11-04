
package com.midas.entity;
/**
 *
 * @author david roco
 */
/*
La función de esta clase es saber si el mensaje es de tipo:
                                    -Mensaje
                                    -Error
                                    -Adventerncia
*/
public class TipoMensaje {
       private int idTipoMensaje;
       private String nombreTipoMensaje;

    public TipoMensaje() {
    }

    public TipoMensaje(int idTipoMensaje, String nombreTipoMensaje) {
        this.idTipoMensaje = idTipoMensaje;
        this.nombreTipoMensaje = nombreTipoMensaje;
    }

    public int getIdTipoMensaje() {
        return idTipoMensaje;
    }

    public void setIdTipoMensaje(int idTipoMensaje) {
        this.idTipoMensaje = idTipoMensaje;
    }

    public String getNombreTipoMensaje() {
        return nombreTipoMensaje;
    }

    public void setNombreTipoMensaje(String nombreTipoMensaje) {
        this.nombreTipoMensaje = nombreTipoMensaje;
    }
        
        
}

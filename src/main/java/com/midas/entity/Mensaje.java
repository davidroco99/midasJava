

package com.midas.entity;
/**
 *
 * @author david roco
 */
public class Mensaje {
        
    private int idMensaje;
    private String mensajeText;
    private TipoMensaje tipoMensaje;

    public Mensaje(int idMensaje, String mensajeText, TipoMensaje tipoMensaje) {
        this.idMensaje = idMensaje;
        this.mensajeText = mensajeText;
        this.tipoMensaje = tipoMensaje;
    }

    public Mensaje() {
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensajeText() {
        return mensajeText;
    }

    public void setMensajeText(String mensajeText) {
        this.mensajeText = mensajeText;
    }

    public TipoMensaje getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(TipoMensaje tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
    
        
}


package com.midas.entity;
/**
 *
 * @author david roco
 */
/*
La función de esta clase es saber si vamos a registrar  mensajes de: 
                                    -Error.
                                    -Adventerncia.
                                    -Error y advertencias.
*/


public class TipoDeMensajeARegistrar {
        private int idTipoDeMensajeARegistrar;
        private String nombreTipoDeMensajeARegistrar;

    public TipoDeMensajeARegistrar(int idTipoDeMensajeARegistrar, String nombreTipoDeMensajeARegistrar) {
        this.idTipoDeMensajeARegistrar = idTipoDeMensajeARegistrar;
        this.nombreTipoDeMensajeARegistrar = nombreTipoDeMensajeARegistrar;
    }

    public TipoDeMensajeARegistrar() {
    }

    public int getIdTipoDeMensajeARegistrar() {
        return idTipoDeMensajeARegistrar;
    }

    public void setIdTipoDeMensajeARegistrar(int idTipoDeMensajeARegistrar) {
        this.idTipoDeMensajeARegistrar = idTipoDeMensajeARegistrar;
    }

    public String getNombreTipoDeMensajeARegistrar() {
        return nombreTipoDeMensajeARegistrar;
    }

    public void setNombreTipoDeMensajeARegistrar(String nombreTipoDeMensajeARegistrar) {
        this.nombreTipoDeMensajeARegistrar = nombreTipoDeMensajeARegistrar;
    }
             
    
    
}

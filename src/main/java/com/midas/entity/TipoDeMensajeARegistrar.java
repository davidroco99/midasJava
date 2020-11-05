
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
        private static TipoDeMensajeARegistrar instancia;

//singleton
     public static TipoDeMensajeARegistrar getInstance() {
        if (instancia == null) {
            instancia = new TipoDeMensajeARegistrar();
        }
        return instancia;
    }
        
    public TipoDeMensajeARegistrar(int idTipoDeMensajeARegistrar, String nombreTipoDeMensajeARegistrar) {
        this.idTipoDeMensajeARegistrar = idTipoDeMensajeARegistrar;
        /* esta sería la línea de código pero voy a instanciar solo el error para el caso de prueba
        this.nombreTipoDeMensajeARegistrar = nombreTipoDeMensajeARegistrar;
        */
        this.nombreTipoDeMensajeARegistrar = "error";
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

package com.midas.init;

/**
 *
 * @author david roco
 */
public class FactoryAdaptadorDeRegistro {

    private static FactoryAdaptadorDeRegistro instancia;

    //singleton
    public static FactoryAdaptadorDeRegistro getInstance() {
        if (instancia == null) {
            instancia = new FactoryAdaptadorDeRegistro();
        }
        return instancia;
    }

    public Object optenerAdaptadorDeRegistro(String t) {
        switch (t) {
            case "file":
                AdaptadorRegistroFileTxt newRegistrarMensaje = new AdaptadorRegistroFileTxt();
                return newRegistrarMensaje;

            case "console":
               AdaptadorRegistroConsola newRegistrarMensajeConsole = new AdaptadorRegistroConsola();
                return newRegistrarMensajeConsole;

            case "db":
                AdaptadorRegistroBaseDatos  newRegistrarMensajeDB = new AdaptadorRegistroBaseDatos();
                return newRegistrarMensajeDB;

            default:
                return null;

        }
    }
}

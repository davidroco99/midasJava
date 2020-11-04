
package com.midas.entity;

import java.util.Map;
import java.util.logging.Logger;



/**
 *
 * @author david roco
 */
/*
La función de esta clase es el seteo y la configuraricion de la base de datos, consola y el archivo
                                    
*/
public class ParametrosConfiguracion {

    private static ParametrosConfiguracion instancia;

    private static boolean logToFile;
    private static boolean logToConsole;
    private static boolean logMessage;
    private static boolean logWarning;
    private static boolean logError;
    private static boolean logToDatabase;
    private boolean initialized;
    private static Map dbParams;
  // private static final Logger logger;
   private TipoDeMensajeARegistrar tipoDeMensajeARegistrar;
   
   
    //singleton
    public static ParametrosConfiguracion getInstance() {
        if (instancia == null) {
            instancia = new ParametrosConfiguracion();
        }
        return instancia;
    }
    
    
    
}

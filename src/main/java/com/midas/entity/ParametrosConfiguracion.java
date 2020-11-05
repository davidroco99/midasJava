
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

    public ParametrosConfiguracion() {
         if (tipoDeMensajeARegistrar == null) {
            tipoDeMensajeARegistrar = new TipoDeMensajeARegistrar();
        }
    }

    public static boolean isLogToFile() {
        return logToFile;
    }

    public static void setLogToFile(boolean logToFile) {
        ParametrosConfiguracion.logToFile = logToFile;
    }

    public static boolean isLogToConsole() {
        return logToConsole;
    }

    public static void setLogToConsole(boolean logToConsole) {
        ParametrosConfiguracion.logToConsole = logToConsole;
    }

    public static boolean isLogMessage() {
        return logMessage;
    }

    public static void setLogMessage(boolean logMessage) {
        ParametrosConfiguracion.logMessage = logMessage;
    }

    public static boolean isLogWarning() {
        return logWarning;
    }

    public static void setLogWarning(boolean logWarning) {
        ParametrosConfiguracion.logWarning = logWarning;
    }

    public static boolean isLogError() {
        return logError;
    }

    public static void setLogError(boolean logError) {
        ParametrosConfiguracion.logError = logError;
    }

    public static boolean isLogToDatabase() {
        return logToDatabase;
    }

    public static void setLogToDatabase(boolean logToDatabase) {
        ParametrosConfiguracion.logToDatabase = logToDatabase;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setInitialized(boolean initialized) {
        this.initialized = initialized;
    }

    public static Map getDbParams() {
        return dbParams;
    }

    public static void setDbParams(Map dbParams) {
        ParametrosConfiguracion.dbParams = dbParams;
    }

    public TipoDeMensajeARegistrar getTipoDeMensajeARegistrar() {
        return tipoDeMensajeARegistrar;
    }

    public void setTipoDeMensajeARegistrar(TipoDeMensajeARegistrar tipoDeMensajeARegistrar) {
        this.tipoDeMensajeARegistrar = tipoDeMensajeARegistrar;
        
               
    }
    
    
}


package com.midas.init;

import java.text.DateFormat;
import java.util.Date;


/**
 *
 * @author david roco
 */
public class ControladorRegistrarMensaje {
           private final ExpertoRegistrarMensaje experto = (ExpertoRegistrarMensaje) FactoryExperto.getInstance().obtenerExperto("ExpertoRegistrarMensaje");
              
    public static void ControladorRegistrarMensaje(String messageText, boolean message, boolean warning, boolean error) {
      /*
            try Exception {
            if  (!messageText && !warning && !error) {
               catch (Exception e){
                       System.out.println("Error or Warning or Message must be specified");
                       }
               
            }
            */
        DTOLogMensage mensaje = new DTOLogMensage();
        mensaje.menssageText = messageText.trim();

        if (message) {
            mensaje.tipoMensaje = "mensaje";
            mensaje.menssageText = "message " +DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
        }
        if (warning) {
            mensaje.tipoMensaje = "advertencia";
            mensaje.menssageText ="advertencia"+DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
        }
        if (error) {
            mensaje.tipoMensaje = "error";
            mensaje.menssageText ="error"+DateFormat.getDateInstance(DateFormat.LONG).format(new Date()) + messageText;
        }
          
               
        
        
    }
}


package com.midas.init;


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
        }
        if (warning) {
            mensaje.tipoMensaje = "advertencia";
        }
        if (error) {
            mensaje.tipoMensaje = "error";
        }
          
               
        
        
    }
}

package com.midas.init;

import com.midas.entity.Mensaje;
import com.midas.entity.ParametrosConfiguracion;
import com.midas.entity.TipoDeMensajeARegistrar;
import com.midas.entity.TipoMensaje;

public class ExpertoRegistrarMensaje {

    private static ParametrosConfiguracion parametros;

    public ExpertoRegistrarMensaje() {
        if (parametros == null) {
            parametros = new ParametrosConfiguracion();
        }

    }

    public boolean analizarMensaje(DTOLogMensage mensaje) {
            //este es el Método donde se registra el mensaje
            String nombreTipoDeRegistroARegistrarExperto;
            nombreTipoDeRegistroARegistrarExperto = parametros.getTipoDeMensajeARegistrar().getNombreTipoDeMensajeARegistrar();
            
            
            
            
        return true;
    }

    public Mensaje createMensaje(DTOLogMensage DTOmensaje) {
        // este método crea tipo de mensaje
        TipoMensaje tipoMensajeNuevo = new TipoMensaje();
        tipoMensajeNuevo.setNombreTipoMensaje(DTOmensaje.getTipoMensaje());

        //crea el mensaje y le asigna el tipo de mensaje creado
        Mensaje mensajeNuevo = new Mensaje();
        mensajeNuevo.setMensajeText(DTOmensaje.getMenssageText());
        mensajeNuevo.setTipoMensaje(tipoMensajeNuevo);

        return mensajeNuevo;
    }
}

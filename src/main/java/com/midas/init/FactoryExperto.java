

package com.midas.init;

/**
 *
 * @author david roco
 */
public class FactoryExperto {

    private static FactoryExperto instancia;

    //singleton
    public static FactoryExperto getInstance() {
        if (instancia == null) {
            instancia = new FactoryExperto();
        }
        return instancia;
    }

    public Object obtenerExperto(String experto) {
        switch (experto) {
            case "ExpertoRegistrarMensaje":
                ExpertoRegistrarMensaje newExpertoRegistrarMensaje = new DecoradorExpertoRegistrarMensaje();
                return newExpertoRegistrarMensaje;
            default:
                return null;

        }
    }
}

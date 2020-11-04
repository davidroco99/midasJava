
package com.midas.init;

public class DTOLogMensage {
                
                String  menssageText;
                String tipoMensaje;

    public DTOLogMensage(String menssageText, String tipoMensaje) {
        this.menssageText = menssageText;
        this.tipoMensaje = tipoMensaje;
    }

    public DTOLogMensage() {
    }

    public String getMenssageText() {
        return menssageText;
    }

    public void setMenssageText(String menssageText) {
        this.menssageText = menssageText;
    }

    public String getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(String tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
    
                
}

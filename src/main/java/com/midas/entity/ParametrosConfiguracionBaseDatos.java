
package com.midas.entity;


/**
 *
 * @author david roco
 */


public class ParametrosConfiguracionBaseDatos {
    private String pass;
    private String serverName;
    private String user;
    private int nroPuerto;
    /*Falta la asociación de estos valores con los parametros*/
    
    
    public ParametrosConfiguracionBaseDatos() {
    }

    public ParametrosConfiguracionBaseDatos(String pass, String serverName, String user, int nroPuerto) {
        this.pass = pass;
        this.serverName = serverName;
        this.user = user;
        this.nroPuerto = nroPuerto;
    }

    public int getNroPuerto() {
        return nroPuerto;
    }

    public void setNroPuerto(int nroPuerto) {
        this.nroPuerto = nroPuerto;
    }

  
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
          
    
}

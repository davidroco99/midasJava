
package com.midas.init;

/**
 * 
 * @author david roco
 */
/*
La función de esta clase es la configuracion a nuestra base de datos;
*/


public class ParametrosConexionBaseDeDatos {
        private String pass;
        private String ServerName;
        private String user;
          
    public ParametrosConexionBaseDeDatos() {
    }

    public ParametrosConexionBaseDeDatos(String pass, String ServerName, String user) {
        this.pass = pass;
        this.ServerName = ServerName;
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getServerName() {
        return ServerName;
    }

    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
        
        
        
}

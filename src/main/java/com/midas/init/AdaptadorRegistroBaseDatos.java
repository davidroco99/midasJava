
package com.midas.init;

import java.sql.Connection;
import java.util.Properties;
import com.midas.entity.ParametrosConfiguracionBaseDatos;

public class AdaptadorRegistroBaseDatos {
    ParametrosConfiguracionBaseDatos config = new ParametrosConfiguracionBaseDatos();  
    private String password = config.getPass();
    private String userName = config.getUser();
    private String serverName = config.getServerName();
    private int portNumber = config.getNroPuerto();
            
    Connection connection = null;
   Properties connectionProps = new Properties();
   connectionProps.put("user", dbParams.get("userName"));
   connectionProps.put("password", dbParams.get("password"));
   connection = DriverManager.getConnection("jdbc:" + dbParams.get("dbms") + "://" + dbParams.get("serverName")+ ":" + dbParams.get("portNumber") + "/", connectionProps);

    
    Statement stmt = connection.createStatement();
    stmt.executeUpdate("insert into Log_Values('" + message + "', " + String.valueOf(t) + ")");
}

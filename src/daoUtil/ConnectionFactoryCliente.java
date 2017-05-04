package daoUtil;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Ritchely on 04/05/2017.
 */
public class ConnectionFactoryCliente {
    private Connection con = null;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/auditorio", "root", "root");
            return con;
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
        return con;
    }

    public void setClose() {
        try {
            con.close();
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }
    }

}


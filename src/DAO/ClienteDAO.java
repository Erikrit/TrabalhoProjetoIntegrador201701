package DAO;

import daoUtil.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Created by lucas.pereira on 06/04/2017.
 */
public class ClienteDAO {

    private Connection con;
    private Statement stmt;
    private PreparedStatement stm;


    private String sqlLogin = "Select * from login";

    public ClienteDAO() throws SQLException {

        ConnectionFactory factory = new ConnectionFactory();
        con = factory.getConnection();

    }


}

package daoUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by lucas.pereira on 06/04/2017.
 */
public class ConnectionFactory {

        private String connectionStr = "jdbc:sqlserver://localhost:1433;user=sa;password=1Qaz2Wsx;databaseName=PooProjeto";
        private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";



        private static ConnectionFactory connectionFactory = null;

        public Connection getConnection() throws SQLException{
            Connection conn = null;
            try{
                Class.forName(driver);
                conn = DriverManager.getConnection(connectionStr);
            }catch(SQLException e){
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            return conn;
        }

        public static ConnectionFactory getInstance(){
            if(connectionFactory == null)
                connectionFactory = new ConnectionFactory();

            return connectionFactory;
        }

        public void closeConnection()throws SQLException{
            try{
                getConnection().close();
            }catch (Exception e){
                System.out.println(" Erro na conexão " + e.getMessage() );
            }
        }
}


package BD;

import java.sql.*;

/**
 * BD
 * Nombre_project: JDBC
 * Conexion
 * Created by: MarcosRa
 * Date : 28/04/2021
 * Description:
 **/
public class Conexion {
    private static final String userName = "grup6";
    private static final String password = "Cesar";
    private static final String url = "jdbc:MySQL://194.224.79.42:43306/grup6";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, userName, password);

    }
    public static void close(ResultSet r) throws SQLException {
        r.close();
    }
    public static void close(Statement s) throws SQLException {
        s.close();
    }
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}

/**
 * PACKAGE_NAME
 * Nombre_project: JDBC
 * TestMySql
 * Created by: MarcosRa
 * Date : 21/04/2021
 * Description:
 **/
package test;

import java.sql.*;

public class Test1 {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:MySQL://localhost:3306/ejercicionominas";
        try {
            String userName = "root";
            String password = "";
            Connection conexion = DriverManager.getConnection(url, userName, password);
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM Trabajador";
            ResultSet r = instruccion.executeQuery(sql);

            while(r.next()){
                System.out.println("DNI_TRABAJADOR: " + r.getString("DNI_Trabajador"));
                System.out.println("NOMBRE: " + r.getString("nombre"));
                System.out.println("apellido: " + r.getString("apellido"));
                System.out.println("EDAD: " + r.getInt("edad"));
                System.out.println(" ");
            }
            r.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

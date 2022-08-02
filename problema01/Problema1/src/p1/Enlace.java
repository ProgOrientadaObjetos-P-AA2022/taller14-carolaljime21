package p1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/Trabajadores.db";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarTrabajador(Sueldos c) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO trabajadores (cedula, "
                    + "nombre, correo, sueldo, mes ) "
                    + "values ('%s', '%s', '%s', '%.2f', '%s')",
                    c.obtenerCedula(), c.obtenerNombre(),
                    c.obtenerCorreo(), c.obtenerSueldo(),
                    c.obtenerMes());
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<Sueldos> obtenerDataSueldos() {
        ArrayList<Sueldos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from Sueldos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                Sueldos s = new Sueldos(rs.getString("cedula"),
                        rs.getString("nombre"), rs.getString("correo"),
                        rs.getDouble("sueldo"), rs.getString("mes"));
                lista.add(s);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarTrabajador");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}

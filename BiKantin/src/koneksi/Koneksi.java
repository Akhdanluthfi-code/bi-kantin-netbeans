package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    private static final String URL =
            "jdbc:mysql://localhost:3306/db_bikantin";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    URL, USER, PASSWORD
            );

        } catch (ClassNotFoundException e) {
            System.out.println(
                    "Driver MySQL tidak ditemukan: "
                    + e.getMessage()
            );

        } catch (SQLException e) {
            System.out.println(
                    "Koneksi database gagal: "
                    + e.getMessage()
            );
        }

        return conn;
    }

    public static void main(String[] args) {
        Connection conn = getConnection();

        if (conn != null) {
            System.out.println(
                    "Koneksi database BI-KANTIN berhasil!"
            );

            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println(
                    "Koneksi database BI-KANTIN gagal!"
            );
        }
    }
}

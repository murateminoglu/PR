package de.gastev.beispiel.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class DataMigrationTool {
    public static void main(String[] args) {
        String sourceDbUrl = "jdbc:mysql://localhost:3000/gitea";
        String destDbUrl = "jdbc:mysql://localhost:3306/gitea";
        String query = "SELECT * FROM PullRequests"; // Örnek bir sorgu

        try (Connection sourceConn = DriverManager.getConnection(sourceDbUrl, "root", "1907Fb.1907.");
             Connection destConn = DriverManager.getConnection(destDbUrl, "root", "1907Fb.1907.");
             PreparedStatement stmt = sourceConn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                // Veri aktarımı için kayıt okuma
                Long id = rs.getLong("id");
                String title = rs.getString("title");
                // Diğer alanlar...

                // Hedef veritabanına kayıt yazma
                PreparedStatement insertStmt = destConn.prepareStatement("INSERT INTO PullRequests (id, title) VALUES (?, ?)");
                insertStmt.setLong(1, id);
                insertStmt.setString(2, title);
                // Diğer alanlar...
                insertStmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

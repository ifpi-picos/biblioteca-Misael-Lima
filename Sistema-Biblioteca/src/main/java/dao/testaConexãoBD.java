package dao;

import java.sql.*;

public class testaConexãoBD{
    public static void main(String[] args) {
        try {
            Connection conexcao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco", "postgres",
                    "19182400Lm##");

            if (conexcao != null) {
                System.out.println("Banco de dados conectado com sucesso!");
            } else {
                System.out.println("Conexão falhou");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
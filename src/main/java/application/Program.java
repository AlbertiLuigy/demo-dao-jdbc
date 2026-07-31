package application;

import java.sql.Connection;

import db.DB;

public class Program {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DB.getConnection();
            System.out.println("Infraestrutura JDBC pronta. Conexao com o banco estabelecida.");
        } finally {
            DB.closeConnection();
        }
    }
}

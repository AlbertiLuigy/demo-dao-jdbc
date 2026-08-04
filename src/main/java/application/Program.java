package application;

import java.sql.Connection;

import db.DB;
import model.entities.Departament;

public class Program {

    public static void main(String[] args) {
        
        Departament obj = new Departament(1, "Oloco");
        System.out.println(obj);
    }
}

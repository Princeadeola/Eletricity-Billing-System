package Electricity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;

    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root", "");
            System.out.print("Database is connected !");
            s = c.createStatement();
//            c.close();

        }catch (Exception e){
            System.out.print("Database was unable to connect");
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        new Conn();
//    }
}

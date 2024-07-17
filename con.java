package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {


    Connection connection;
    Statement statement;


    public con(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/employeemanagementsystem","root","Ayush010404");
            statement =connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

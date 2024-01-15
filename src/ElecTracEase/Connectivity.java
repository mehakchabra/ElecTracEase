package ElecTracEase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectivity {
    Connection connection;
    Statement statement;
    Connectivity(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/billing_system","root","Mehak@33Chabra");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

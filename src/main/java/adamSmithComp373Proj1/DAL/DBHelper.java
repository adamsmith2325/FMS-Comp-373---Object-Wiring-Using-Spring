package adamSmithComp373Proj1.DAL;
import java.sql.*;


/*

Database Username: epiz_28236332!
Database Password: Comp373MySQL


*/

public class DBHelper {
    
    public static Connection formConnection(){  
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/facilitymanagementsystem", "root", "root");
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return con;
    }

    public static void main(String[] args) {
        formConnection();
    }

}


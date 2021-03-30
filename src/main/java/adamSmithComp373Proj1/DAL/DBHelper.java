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
            con = DriverManager.getConnection("jdbc:mysql://sql5.freemysqlhosting.net/sql5402364", "sql5402364", "Dpxi9gtdS5");
        } catch(Exception e){
            System.out.println(e.toString());
        }
        return con;
    }

    public static void main(String[] args) {
        formConnection();
    }

}


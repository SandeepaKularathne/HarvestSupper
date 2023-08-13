import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CommonDao {

    public static ResultSet get(String qry) {

        ResultSet rslt = null;

        try {
            Connection dbcon = DriverManager.getConnection("jdbc:mysql://localhost/harvest", "root", "12345678");
            Statement stm = dbcon.createStatement();
            rslt = stm.executeQuery(qry);

        } catch (SQLException e) {
            System.out.println("Can't Get Results as : " + e.getMessage());
        }

        return rslt;

    }

}

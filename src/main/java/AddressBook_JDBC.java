import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddressBook_JDBC {
    public static void preparedStatement(String name , int basePay) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_servicedb","root","mysql@1234");
        String q="update  emp_service set salary=?  where name=?";
        PreparedStatement pstm = con.prepareStatement(q);
         pstm.setLong(1,basePay);
         pstm.setString(2,name);
       pstm.executeUpdate();
       boolean result = true;
    }

    public static void main(String[] args) throws SQLException {
        preparedStatement("Terisa",300000);
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class AddressBook_JDBC {
    public static void main(String[] args) {
        System.out.println("Welcome To Java DataBase Connectivity");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_servicedb","root","mysql@1234");
            Statement stm = con.createStatement();
           stm.execute("update emp_service set salary = 300000.00 where name = 'terisa'");
            stm.execute("select * from emp_service");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

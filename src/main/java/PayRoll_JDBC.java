import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class PayRoll_JDBC {
    public static void main(String[] args) {
        System.out.println("Welcome To Java DataBase Connectivity");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_servicedb","root","mysql@1234");
            Statement stm = con.createStatement();
           stm.execute("select * from emp_service");
           stm.execute("insert into emp_service values(134,'amol',15000,29,'male');");
           stm.execute("update emp_service set date = 21 where name = 'ashutosh'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

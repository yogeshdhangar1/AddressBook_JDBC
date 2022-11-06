import java.sql.*;

public class AddressBook_JDBC {
    public static void CreateConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payroll_servicedb","root","mysql@1234");
             Statement stm = con.createStatement();
             stm.execute("select sum(salary) from emp_service");
            stm.execute("select Avg(salary) from emp_service");
            stm.execute("select min(salary) from emp_service");
            stm.execute("select Avg(salary) from emp_service");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CreateConnection();
    }
}

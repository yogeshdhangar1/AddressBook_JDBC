import java.sql.*;

public class Payroll_JDBC {
    public static void main(String[] args) {
        System.out.println("Welcome to java database connectivity");
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306//payroll_service","root","mysql@1234");
            System.out.println("Driver loaded");
            System.out.println("Successfully Connect MyhSql Database");
            Statement stm = con.createStatement();
           ResultSet res = stm.executeQuery("select * from emp_service");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


import java.sql.*;

public class AddressBook_JDBC {
    public static void CreateConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Payroll_servicedb","root","mysql@1234");
            String select = "select * from emp_service";
          PreparedStatement pstm = con.prepareStatement(select);
           ResultSet res = pstm.executeQuery();
           while(res.next()){
               String name = res.getString("name");
               String Date = res.getString("Date");
               System.out.println("Data"+name+","+Date);
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CreateConnection();
    }
}

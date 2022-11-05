import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

public class JDBCQueryTest {
    @Test
    public void UpdateQueryTest(){
     AddressBook_JDBC obj = new AddressBook_JDBC();
     String q = "update emp_service set salary = 30000 where name = 'Terisa'";
        Assert.assertEquals(false,obj.CreateConnection(q));
    }
    @Test
    public void CheckUpdateQuery() throws SQLException {
        AddressBook_JDBC obj = new AddressBook_JDBC();
        Assert.assertEquals(true,obj.preparedStatement("Terisa",300000));
    }
}

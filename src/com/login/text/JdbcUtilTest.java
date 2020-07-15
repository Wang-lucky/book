package com.login.text;

import com.login.utils.JdbcUtils;
import org.junit.Test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static com.login.utils.JdbcUtils.getConnection;

public class JdbcUtilTest {
    @Test
    public void testJdbcUtils(){
        System.out.println(getConnection());
        /*String sql="update employees set employee_id";
        try {
            PreparedStatement st=getConnection().prepareStatement(sql);
            int update=st.executeUpdate();
            System.out.println(update>0?"y":"n");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}

package cn.itcast.travel;

import cn.itcast.travel.domain.User;
import cn.itcast.travel.util.JDBCUtils;
import com.alibaba.druid.util.JdbcUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-04-12 14:16
 */
public class TextJDBC {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    public void text() {
        //获取 id=4 的 customers 数据表的记录, 并打印

        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            //1. 获取 Connection
            conn = JDBCUtils.getConnection();
            System.out.println(conn);

            //2. 获取 Statement
            statement = conn.createStatement();
            System.out.println(statement);

            //3. 准备 SQL
            String sql = "SELECT * FROM tab_user";

            //4. 执行查询, 得到 ResultSet
            rs = statement.executeQuery(sql);
            System.out.println(rs);



        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            //6. 关闭数据库资源.
            JDBCUtils.close(conn, statement, rs);
        }



    }
}

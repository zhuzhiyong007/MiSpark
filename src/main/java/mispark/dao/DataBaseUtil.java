package mispark.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 *给js或者一般的类用的database
 */
@Component
public class DataBaseUtil {
	
	public void getConnection(){
		//GloableSqlSessionFactory sqlSessionFactory = new GloableSqlSessionFactory();
		//Connection conn = sqlSessionFactory.getConnection();
		
		Connection conn = new ConnectionUtil().getConnection();
		
		try {
			System.out.println(conn);

			String sql = "select * from citys where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, 2);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}

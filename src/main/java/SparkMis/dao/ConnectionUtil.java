package SparkMis.dao;


import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionUtil {

	//public static String MYBATISCONTENT="/mybatis-config2.xml";
	public static String MYBATISCONTENT="/mybatis-config2.xml";
	
	public Connection getConnection(){
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(MYBATISCONTENT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		//SqlSessionFactory factory = sqlSessionFactoryBuilder.build(reader, environment);
		//SqlSessionFactory factory = sqlSessionFactoryBuilder.build(reader, environment,properties);
		
		SqlSession session = factory.openSession();
		Connection conn = session.getConnection();
		return conn;
	}
	 
	
}

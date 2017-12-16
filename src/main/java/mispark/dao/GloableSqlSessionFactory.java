package mispark.dao;

import java.io.IOException;
import java.sql.Connection;

import javax.sql.DataSource;

import mispark.utils.MyException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

public class GloableSqlSessionFactory extends SqlSessionFactoryBean{
	
	@Override
	protected SqlSessionFactory buildSqlSessionFactory() throws IOException {
		return super.buildSqlSessionFactory();
	}
	
	public SqlSessionFactory getSqlSessionFactory(){
		SqlSessionFactory sqlSessionFactory = null;
		try {
			
			sqlSessionFactory = buildSqlSessionFactory();
			if(sqlSessionFactory==null){
				throw new MyException("没有获取到sqlSessionFactory");
			}
			
		} catch (MyException e) {
			System.out.println(e);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	
	public SqlSession getSession(){
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession session = null;
		if(sqlSessionFactory!=null){
			session =sqlSessionFactory.openSession();
		}
		return session;
	}
	
	public Connection getConnection(){
		SqlSession session = getSession();
		Connection conn = null;
		if(session!=null){
			conn = session.getConnection();
		}
		return conn;
	}
	
}

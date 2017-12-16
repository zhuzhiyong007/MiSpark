package mispark.dao;

import java.util.List;

import mispark.model.User;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

//@MapperScan
public interface IUserDao {
	 /*@Select("SELECT * FROM Mybatis WHERE NAME = #{name}")
	 User findByName(@Param("name") String name);
	    
	 @Insert("INSERT INTO Mybatis(NAME, AGE) VALUES(#{name}, #{age})")
	 int insert(@Param("name") String name, @Param("age") Integer age);*/
	    
	public User getById(int userId);
	public List<User> getAll();
}

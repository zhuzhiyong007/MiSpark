package SparkMis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import SparkMis.model.Student;

/**
 * StudentMapper，映射SQL语句的接口，无逻辑实现
 */
//public interface StudentMapper extends MyMapper<Student> {

//@Mapper
/*public interface IStudentDao{

	//具体实现写在mapper中

    Student getById(int id);
    
    void insertStudent(Student stu);
    
    //实现写在DAO中的形式
    
  //使用@Select注解指明getAll方法要执行的SQL
    @Select("select * from student")
    List<Student> getAll();
     
    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into Student(name) values(#{name})")
    public int add(Student user);
     
    //使用@Update注解指明update方法要执行的SQL
    @Update("update Student set name=#{name} where id=#{id}")
    public int update(Student user);
     
    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from Student where id=#{id}")
    public int deleteById(int id);
}*/
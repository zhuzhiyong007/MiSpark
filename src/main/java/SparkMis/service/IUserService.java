package SparkMis.service;  

import java.util.List;

import SparkMis.model.User;
 
  
public interface IUserService {  
	
    /*public User getUserById(int userId);  
    public User findByName(String name);
    public int insert(String name,Integer age);*/
	
	public User getById(int userId);
	public List<User> getAll();
}  
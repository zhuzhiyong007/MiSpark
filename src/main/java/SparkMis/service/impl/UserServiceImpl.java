package SparkMis.service.impl;  
  
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import SparkMis.dao.IUserDao;
import SparkMis.model.User;
import SparkMis.service.IUserService;
  
@Service("userService")  
public class UserServiceImpl implements IUserService {  
    @Resource  
    private IUserDao userDao;  

   /* public User getUserById(int userId) {  
        return this.userDao.selectByPrimaryKey(userId);  
    }

	public User findByName(String name) {
		
		return userDao.findByName(name);
	}

	public int insert(String name, Integer age) {
		return userDao.insert(name, age);
	}*/

	public User getById(int userId) {
		
		return userDao.getById(userId);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}  
  
}  
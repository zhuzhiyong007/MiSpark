package SparkMis.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;

import SparkMis.dao.IBlogDao;
import SparkMis.model.Blog;
import SparkMis.service.IBlogService;
 
  
public class BlogServiceImpl implements IBlogService {  
	
	@Autowired
	private IBlogDao blogMapper;

	public void addBlog(){
		Blog blog=new Blog("title","content","owner");
		blogMapper.addBlog(blog);
	}
}  
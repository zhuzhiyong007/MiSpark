package mispark.service.impl;  

import mispark.dao.IBlogDao;
import mispark.model.Blog;
import mispark.service.IBlogService;

import org.springframework.beans.factory.annotation.Autowired;
 
  
public class BlogServiceImpl implements IBlogService {  
	
	@Autowired
	private IBlogDao blogMapper;

	public void addBlog(){
		Blog blog=new Blog("title","content","owner");
		blogMapper.addBlog(blog);
	}
}  
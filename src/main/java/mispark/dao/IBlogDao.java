package mispark.dao;

import mispark.model.Blog;

//@Mapper
public interface IBlogDao{
	public void addBlog(Blog blog);
	public Blog selectBlog(int id);
}

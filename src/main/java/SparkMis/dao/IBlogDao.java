package SparkMis.dao;

import SparkMis.model.Blog;

//@Mapper
public interface IBlogDao{
	public void addBlog(Blog blog);
	public Blog selectBlog(int id);
}

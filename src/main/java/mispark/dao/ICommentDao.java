package mispark.dao;

import mispark.model.Comment;

//@Mapper
public interface ICommentDao{
	public void addComment(Comment comment);
	public Comment selectComment(int id);
}

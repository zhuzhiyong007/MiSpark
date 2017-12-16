package mispark.service.impl;  

import mispark.dao.IBlogDao;
import mispark.dao.ICommentDao;
import mispark.model.Blog;
import mispark.model.Comment;
import mispark.service.ICommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service  
public class CommentServiceImpl implements ICommentService {  
	
	@Autowired
	private ICommentDao commentMapper;
	@Autowired
	private IBlogDao blogMapper;
	
	//一对一
	public void addComment(){
		Comment comment=new Comment();
		comment.setContent("zzzy");
		//Blog blog=new Blog("title","content","owner");
		Blog blog=blogMapper.selectBlog(3);
		comment.setBlog(blog);
		commentMapper.addComment(comment);
	}
	
	
	public Comment findComment(){
		Comment comment=commentMapper.selectComment(3);
		System.out.println(comment);
		return comment;
	}
}  
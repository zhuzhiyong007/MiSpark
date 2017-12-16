package mispark.service;  

import mispark.model.Comment;

import org.springframework.stereotype.Service;
 
@Service  
public interface ICommentService {  
	
	//一对一
	public void addComment();
	
	public Comment findComment();
}  
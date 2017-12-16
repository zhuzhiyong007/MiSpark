package SparkMis.service;  

import org.springframework.stereotype.Service;

import SparkMis.model.Comment;
 
@Service  
public interface ICommentService {  
	
	//一对一
	public void addComment();
	
	public Comment findComment();
}  
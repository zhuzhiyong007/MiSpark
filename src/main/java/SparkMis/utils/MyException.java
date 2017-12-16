package SparkMis.utils;

public class MyException extends Exception{
	
	private static final long serialVersionUID =1L;
	public String content =null;
	
	public MyException(String content){
		this.content = content;
	}

	@Override
	public String toString() {
		return "MyException [error=" + content + "]";
	}
	
	
}

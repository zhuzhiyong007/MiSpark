package SparkMis.model;

public class User {
	long id;
	String name;
	String password;
	int age;
	
	public User() {
	}
	
	public User(long id,String name, String password) {
		super();
		this.id=id;
		this.name = name;
		this.password = password;
	}
	
	public User(long id,String name, String password, int age) {
		super();
		this.id=id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id +"name=" + name + ", password=" + password + ", age=" + age
				+ "]";
	}
	
}

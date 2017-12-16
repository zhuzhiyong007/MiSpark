package mispark.service;  

import java.util.List;

import mispark.model.City;

import org.springframework.stereotype.Service;
 
@Service  
public interface ICityService {  
	
	public void add();
	
	public City find(int id);
	
	public List<City> list();
}  
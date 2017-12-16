package SparkMis.service;  

import java.util.List;

import org.springframework.stereotype.Service;

import SparkMis.model.City;
 
@Service  
public interface ICityService {  
	
	public void add();
	
	public City find(int id);
	
	public List<City> list();
}  
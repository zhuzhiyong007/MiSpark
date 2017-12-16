package SparkMis.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SparkMis.dao.ICityDao;
import SparkMis.model.City;
import SparkMis.service.ICityService;
 
@Service  
public class CityServiceImpl implements ICityService{  
	
	@Autowired
	private ICityDao dao;
	
	public void add(){
		City city=new City("anqing","123");
		dao.addCity(city);
	}
	
	public City find(int id){
		//int id=6;
		City city=dao.findCityById(id);
		return city;
	}
	
	public List<City> list(){
		List<City> citys=dao.findAll();
		return citys;
	}
}  
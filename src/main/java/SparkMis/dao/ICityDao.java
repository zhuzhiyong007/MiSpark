package SparkMis.dao;

import java.util.List;

import SparkMis.model.City;

//@Mapper
public interface ICityDao {
	public void addCity(City city);
	public City findCityById(int id);
	public List<City> findAll();
}

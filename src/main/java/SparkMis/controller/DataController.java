package SparkMis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import SparkMis.dao.DataBaseUtil;
import SparkMis.model.City;
import SparkMis.service.impl.CityServiceImpl;
@Controller
public class DataController {
	@Autowired
	private CityServiceImpl cityService;

	@RequestMapping(value = "/city")
	public String login() {
		List<City> citys = cityService.list();
		for(City city: citys){
			System.out.println(city);
		}
		return "showUser";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		DataBaseUtil database = new DataBaseUtil();
		database.getConnection();
		return "index";
	}
}

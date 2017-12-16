package mispark.model;

import org.springframework.stereotype.Component;
 
public class City {
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityPwd() {
		return cityPwd;
	}
	public void setCityPwd(String cityPwd) {
		this.cityPwd = cityPwd;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", cityPwd="
				+ cityPwd + "]";
	}

	public City(){
		
	}
	
	public City( String cityName, String cityPwd) {
		super();
		this.cityName = cityName;
		this.cityPwd = cityPwd;
	}
	
	private int id;
	private String cityName;
	private String cityPwd;
}

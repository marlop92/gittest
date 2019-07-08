package pl.mlopatka.model;

/**
 * Created by marcin.lopatka on 05-07-2019
 */
public class Animal {
	
	private String name;
	private String type;
	private String color;
	
	public Animal(final String name, final String type, final String color) {
		this.name = name;
		this.type = type;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}
}

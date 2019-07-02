package pl.mlopatka.model;

/**
 * Created by marcin.lopatka on 02-07-2019
 */
public class Person {
	
	private String name;
	
	public Person(final String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
}

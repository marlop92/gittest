package pl.mlopatka.model;

/**
 * Created by marcin.lopatka on 02-07-2019
 */
public class Person {
	
	private String name;
	private int age;
	
	public Person(final String name, final int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(final int age) {
		this.age = age;
	}
}

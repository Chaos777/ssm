package dao;

import java.util.List;

import model.Person;

public interface PersonMapper {
	
	public void insert(Person person);
	
	
	public List<Person> queryAll();

}

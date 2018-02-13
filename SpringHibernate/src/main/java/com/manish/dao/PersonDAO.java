package com.manish.dao;

import java.util.List;

import com.manish.model.Person;

public interface PersonDAO {

	public void save(Person p);
	
	public List<Person> list();
	
}

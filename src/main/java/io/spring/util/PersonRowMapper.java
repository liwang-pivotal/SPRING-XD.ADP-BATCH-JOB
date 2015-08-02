package io.spring.util;

import io.spring.domain.Person;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {
	
	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
 
		Person person = new Person();
 
		person.setPersonID(rs.getInt("PersonID"));
		person.setLastName(rs.getString("LastName"));
		person.setFirstName(rs.getString("FirstName"));
 
		return person;
	}

}

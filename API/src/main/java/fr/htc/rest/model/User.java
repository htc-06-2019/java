package fr.htc.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private Integer id;
	private String name;
	private Integer yearOfBirth;

	public User() {

	}

	public User(Integer id, String name, Integer yearOfBirth) {
		super();
		this.id = id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}

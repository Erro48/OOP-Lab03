package oop.lab03.acme;

import java.util.Arrays;

public class Professor implements User {
	
	final static String DOT = ".";
	
	private final int id;
	private final String name;
	private final String surname;
	private String password;
	private String[] courses;
	
	public Professor(final int id, final String name, final String surname, String password, String[] courses) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.courses = courses;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}

	public String[] getCourses() {
		return this.courses;
	}

	public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getDescription() {
		return this.toString();
	}
	
	private boolean checkIndex(int index) {
		return (index > 0) && (index < this.courses.length);
	}
	
	public void replaceCourse(String course, int index) {
		if(checkIndex(index)) {
			this.courses[index] = course;
		}
	}
	
	public void replaceAllCourses(String[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", courses=" + Arrays.toString(courses) + "]";
	}
}

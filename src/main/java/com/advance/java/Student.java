package com.advance.java;

public class Student {
	
    private long id;
    private String name;
    private int age;
    private String gender;
    private String course;
    private int enrollmentYear;
    
	public Student(long id, String name, int age, String gender, String course, int enrollmentYear) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.course = course;
		this.enrollmentYear = enrollmentYear;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getEnrollmentYear() {
		return enrollmentYear;
	}
	public void setEnrollmentYear(int enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
    }
    
}
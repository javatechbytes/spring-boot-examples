package com.student.rest.model;

public class Greetings {
private String name;
private String wish;
public String getName() {
	return name;
}
public Greetings(String name, String wish) {
	super();
	this.name = name;
	this.wish = wish;
}
public void setName(String name) {
	this.name = name;
}
public String getWish() {
	return wish;
}
public void setWish(String wish) {
	this.wish = wish;
}
}

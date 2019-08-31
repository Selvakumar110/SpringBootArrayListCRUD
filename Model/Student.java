package com.student.Model;

public class Student {

	private int id;
	private String name;
	private int rollno;
	private float mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ",name=" + name + ", rollno=" + rollno + ", mark=" + mark + "]";
	}
}
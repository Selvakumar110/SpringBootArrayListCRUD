package com.student.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.student.Model.Student;


@Component
public  class StudentDao {
	
	static ArrayList<Student> school = new ArrayList<>();
	
	public Student create(Student student) {
		
		school.add(student);
		return student; 
	}
	
	public static ArrayList<Student>getall(){
		return school;  
		
	}	
	public static Student get(int rollno) {
//		for(Iterator<Student> i = school.iterator(); i.hasNext(); ) {
//			Student item = i.next();
		    //handle 'item'
//		    System.out.println(item);
//		}
//		for(int i=0; i < school.size(); i++) {
//	        String s = school.get(i).getName();
//	        System.out.println("for ---->"+s);
	        //search the string
//	        if(get.equals(s)) {
//	            return i
//	        }
		return school.get(rollno);
		}
//	}	

	public static void delete(int rollno) {
		school.remove(rollno);
	}
	
	public static void update(int rollno,Student student) {
		school.set(rollno, student);
	
		
	}


}
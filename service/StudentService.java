package com.student.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.student.Model.Student;
import com.student.dao.StudentDao;

@Component
public class StudentService {
	
	@Autowired
	StudentDao studentdao;
	
	public Student create(Student student) {
		return studentdao.create(student);
	}
	public ArrayList<Student> getall(){
		return StudentDao.getall();
		
	}
	
	public void get(int rollno) {
//		 Iterator<Student> iter =null;
//	      while (iter.hasNext()) {
//	         System.out.println(iter.next());
//	      }
		StudentDao.get(rollno);
	}
	
	public void delete(int rollno) {
		StudentDao.delete(rollno);
	}
		
	public void update(int rollno,Student student) {
		StudentDao.update(rollno,student);
	}

}
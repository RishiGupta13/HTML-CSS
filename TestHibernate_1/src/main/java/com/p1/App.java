package com.p1;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao=new StudentDao();
    	Student student=new Student("Ramesh","Fadatare","rameshfadatare@gmail.com");
    	studentDao.saveStudent(student);
    	
    	List<Student> students=studentDao.getStudents();
    	students.forEach(s->System.out.println(s.getFirstName()));
    	
    	
    }
}

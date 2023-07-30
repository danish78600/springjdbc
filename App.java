package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
  StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//       Student student=new Student();
//       student.setId(120);
//       student.setName("kanishk");
//       student.setCity("utrakhadn");
//       
//       int res=studentDao.insert(student);
//       System.out.println(res);
       
  //update
//  
//  Student student=new Student();
//  student.setId(2);
//  student.setName("princess");
//  student.setCity("dehradun");
//  int r=studentDao.change(student);
//  System.out.println(r);
  
  //delete
//  int result=studentDao.delete(11);
//  System.out.println(result);
//       
  
  //select
// Student student= studentDao.getStudent(21);
// System.out.println(student);
  
 
  //select all
  
 List<Student> students=studentDao.getallStudents();
 for(Student s:students)
 {
	 System.out.println(s);
 }
  
    }
}

package com.spring.jdbc.dao;

import java.lang.invoke.StringConcatFactory;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
	return jdbcTemplate;
}
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}
	@Override
	public int insert(Student student) {
		 String query="insert into student(id,name,city)values(?,?,?)";
		 int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		// TODO Auto-generated method stub
		return r;
	}
	@Override
	public int change(Student student) {
		String query="update student set name=? ,city=? where id=?";
		this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		
		return 0;
	}
	@Override
	public int delete(int studentID) {
		String query="delete from student where id=?";
	int r=	this.jdbcTemplate.update(query,studentID);
		return r;
	}
	@Override
	public Student getStudent(int studentID) {
	String query="select * from student where id=?";
	RowMapper<Student> rowMapper=new rowmapperimpl();
 Student student= this.jdbcTemplate.queryForObject(query,rowMapper,studentID);
return student;
	}
	@Override
	public List<Student> getallStudents() {
		String query="select * from student";
	List<Student> students=	this.jdbcTemplate.query(query, new rowmapperimpl());
		
		return students;
	}

}

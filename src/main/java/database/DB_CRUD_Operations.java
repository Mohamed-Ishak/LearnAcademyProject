package database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;



import entities.Student;
import entities.Subject;
import entities.Teacher;
import entities.Class;

public class DB_CRUD_Operations {
	
	private DataSource dataSource;
	
	
	public DB_CRUD_Operations(DataSource dataSource) {
		this.dataSource = dataSource ;
	}

	
	
	
	/********************************************GET METHODS********************************************************/
	
	
	//to retrieve all students
	public List<Student>  getAllStudents(){
		
		List<Student> students = new ArrayList<>();
		
		Connection conn = null;
		Statement stet = null;
		ResultSet reSet = null;
		
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM student" ;
			stet = conn.createStatement();
			reSet = stet.executeQuery(sql);
			
			    while(reSet.next()) {
				int id = reSet.getInt("studentID");
				int classid = reSet.getInt("classID");
				String stName= reSet.getString("studentName");
				String stEmail= reSet.getString("stEmail");
				int stPhone = reSet.getInt("stPhone");
				
				Student st = new Student(id,classid,stName,stEmail,stPhone);
				students.add(st);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Close JDBC
			close(conn,stet,reSet);
		}
		
		return students ;
	}
	
	
	//to retrieve all teachers
	public List<Teacher>  getAllTeachers(){
		
		List<Teacher> teachers = new ArrayList<>();
		
		Connection conn = null;
		Statement stet = null;
		ResultSet reSet = null;
		
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM teacher" ;
			stet = conn.createStatement();
			reSet = stet.executeQuery(sql);
			
			while(reSet.next()) {
				int teachID = reSet.getInt("teacherID");
				String teachName= reSet.getString("teacherName");
				

				
				Teacher te = new Teacher(teachID, teachName);
				teachers.add(te);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Close JDBC
			close(conn,stet,reSet);
		}
		
		return teachers ;
	}
	
	//to retrieve all subjects
	public List<Subject>  getAllSubjects(){
		
		List<Subject> subjects = new ArrayList<>();
		
		Connection conn = null;
		Statement stet = null;
		ResultSet reSet = null;
		
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM subject" ;
			stet = conn.createStatement();
			reSet = stet.executeQuery(sql);
			
			while(reSet.next()) {
				int subID = reSet.getInt("subjectID");
				String subName= reSet.getString("subName");

				
				Subject sub = new Subject(subID,subName);
				subjects.add(sub);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Close JDBC
			close(conn,stet,reSet);
		}
		
		return subjects ;
	}
	
	//to retrieve all classes
	public List<Class>  getAllClasses(){
		
		List<Class> classes = new ArrayList<>();
		
		Connection conn = null;
		Statement stet = null;
		ResultSet reSet = null;
		
		try {
			conn = dataSource.getConnection();
			
			String sql = "SELECT * FROM CLASS" ;
			stet = conn.createStatement();
			reSet = stet.executeQuery(sql);
			
			while(reSet.next()) {
				int classid = reSet.getInt("classID");
				String teachName = reSet.getString("teacher_Name");
				String subjectName = reSet.getString("subject_Name");
				int techID = reSet.getInt("teacher_id");
				int subID = reSet.getInt("subject_id");
				

				
				Class myClass = new Class(classid,teachName,subjectName,techID,subID) ;
				classes.add(myClass);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//Close JDBC
			close(conn,stet,reSet);
		}
		
		return classes ;
		
	}
	
	
	/*****************************************************LOAD METHODS***************************************************/
	
	public Teacher loadTeacher(int teacherID) {

		Teacher teacher = null;

		Connection Conn = null;
		Statement stet = null;
		ResultSet reSet = null;

		try {

			// get a connection
			Conn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM teachers WHERE id = " + teacherID;
			stet = Conn.createStatement();

			// execute query
			reSet = stet.executeQuery(sql);

			// process result
			while (reSet.next()) {

				// retrieve data from result set row
				int teachID = reSet.getInt("teacherID");
				String teachName= reSet.getString("teacherName");
				String subjName= reSet.getString("subjectName");
				teacher = new Teacher(teachID,teachName);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(Conn, stet, reSet);
		}
		return teacher;

	}
	
	
	public List<Student> loadClassStudents(int classID) {

		List<Student> students = new ArrayList<>();

		Connection Conn = null;
		Statement stet = null;
		ResultSet reSet = null;

		try {

			// get a connection
			Conn = dataSource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM student WHERE classID = " + classID;
			stet = Conn.createStatement();

			// execute query
			reSet = stet.executeQuery(sql);

			// process result
			while (reSet.next()) {

				// retrieve data from result set row
				int stdid = reSet.getInt("studentID");
				int classid = reSet.getInt("classID");
				String stdName = reSet.getString("studentName");
				String stdEmail = reSet.getString("stEmail");
				int stdPhone = reSet.getInt("stPhone");

				// create new student object
				Student stu = new Student(stdid, classid, stdName, stdEmail, stdPhone);
				students.add(stu);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(Conn, stet, reSet);
		}
		return students;

	}
	
	
	private void close(Connection conn, Statement stet, ResultSet reSet) {

		try {
			if (reSet != null) {
				reSet.close();
			}
			if (stet != null) {
				stet.close();
			}
			if (conn != null) {
				conn.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
    
}

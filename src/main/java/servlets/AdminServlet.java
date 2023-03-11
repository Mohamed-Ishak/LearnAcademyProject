package servlets;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


import entities.Class;
import entities.Student;
import entities.Subject;
import database.DB_CRUD_Operations;
import entities.Teacher;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    

	private DB_CRUD_Operations operations ;
	
	@Resource(name = "jdbc")
    private DataSource dataSource;
    
  
	public void init() throws ServletException {
    	try {
			operations = new DB_CRUD_Operations(dataSource);
		} catch (Exception e) {
			throw new ServletException(e);
		}
    }
    /** 
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		doGet(request, response);
		
	}
	
    
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String category = request.getParameter("category");
			if(category == null) {
				category = "CLASSES";
			}
			
			if(!getCookies(request, response) && !category.equals("LOGIN")) {
				response.sendRedirect("login.jsp");
				
			}
			else {
				//if there is no category  
				switch (category) {
				case "TEACHERS": 
					teacherList(request, response);
					break;
				case "STUDENTS":
					studentList(request, response);
				case "SUBJECTS":
					subjectList(request, response);
					break;
				case "CLASSES":
					classesList(request,response);
				case "LOGIN":
					login(request, response);
					break;
				default:
					teacherList(request, response);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

    
	public void teacherList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Teacher> teachers = operations.getAllTeachers();
		
		//Add Teacher to the request
		request.setAttribute("TeacherList", teachers);
		//Send the request to teacher.jsp page 
		RequestDispatcher dispatcher = request.getRequestDispatcher("teacher.jsp");
		dispatcher.forward(request, response);
	}
	
	
	public void studentList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get students from db util
		List<Student> students = operations.getAllStudents();

		// add students to the request
		request.setAttribute("StudentList", students);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("studentList.jsp");
		dispatcher.forward(request, response);

	}
	
	public void subjectList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// get subjects from db util
		List<Subject> subjects = operations.getAllSubjects();

		// add students to the request
		request.setAttribute("SubjectList", subjects);

		// send it to the jsp view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("subject.jsp");
		dispatcher.forward(request, response);

	}
	
	
	public void classesList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Class> classes = operations.getAllClasses();
		
		request.setAttribute("ClassesList", classes);
		RequestDispatcher dispatcher = request.getRequestDispatcher("classesList.jsp");
		dispatcher.forward(request, response);
		
	}

	

	

	
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		if(email.toLowerCase().equals("admin") && password.toLowerCase().equals("admin")) {
			Cookie cookie = new Cookie(email, password);
		    cookie.setMaxAge(86400);
		    
		    
		    response.addCookie(cookie);
		    teacherList(request, response);
		}else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
	}


	
	
	private boolean getCookies(HttpServletRequest request, HttpServletResponse response) throws Exception {

		boolean validate = false;
		Cookie[] cookies = request.getCookies();
		// Find the cookie of interest in arrays of cookies
		for (Cookie cookie : cookies) {
			 
			if (cookie.getName().equals("admin") && cookie.getValue().equals("admin")) {
				validate = true;
				break;
			} 

		}
		
		
		return validate;

	}

}

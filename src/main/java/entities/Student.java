package entities;

public class Student {
	
	private int studentID;
	private int classID;
	private String studentName;
	private String stEmail;	
	private int stPhone;
	
	
	public Student() {
		super();
	}


	public Student(int studentID, int classID, String studentName, String stEmail, int stPhone) {
		super();
		this.studentID = studentID;
		this.classID = classID;
		this.studentName = studentName;
		this.stEmail = stEmail;
		this.stPhone = stPhone;
	}


	public int getStudentID() {
		return studentID;
	}


	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStEmail() {
		return stEmail;
	}


	public void setStEmail(String stEmail) {
		this.stEmail = stEmail;
	}


	public int getClassID() {
		return classID;
	}


	public void setClassID(int classID) {
		this.classID = classID;
	}


	public int getStPhone() {
		return stPhone;
	}


	public void setStPhone(int stPhone) {
		this.stPhone = stPhone;
	}


	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", classID=" + classID + 
				         ", studentName=" + studentName + ", stEmail=" + stEmail
				           +", stPhone=" + stPhone + "]";
	}
	
	
	
	

}

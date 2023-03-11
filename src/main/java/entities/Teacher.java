package entities;

public class Teacher {
	
	private int teacherID;
	private String teacherName;

	

	public Teacher() {
		super();
	}



	public Teacher(int teacherID, String teacherName) {
		super();
		this.teacherID = teacherID;
		this.teacherName = teacherName;
	
	}


	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", teacherName=" + teacherName + ", numOfSubjects=" + "]";
	}




	public int getTeacherID() {
		return teacherID;
	}



	public void setTeacherID(int teacherID) {
		this.teacherID = teacherID;
	}



	public String getTeacherName() {
		return teacherName;
	}



	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}


}

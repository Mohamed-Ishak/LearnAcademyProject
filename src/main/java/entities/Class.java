package entities;

public class Class {

	
	private int classID;
	private String teacher_Name ;
	private String subject_Name ;
	private int teacher_id ;
	private int subject_id ;
    

	
	public Class() {
		super();
	}


	
	
	
	public Class(int classID, String teacher_Name, String subject_Name, int teacher_id, int subject_id) {
		super();
		this.classID = classID;
		this.teacher_Name = teacher_Name;
		this.subject_Name = subject_Name;
		this.teacher_id = teacher_id;
		this.subject_id = subject_id;
	}





	public int getClassID() {
		return classID;
	}



	public void setClassID(int classID) {
		this.classID = classID;
	}



	public String getTeacher_Name() {
		return teacher_Name;
	}



	public void setTeacher_Name(String teacher_Name) {
		this.teacher_Name = teacher_Name;
	}



	public String getSubject_Name() {
		return subject_Name;
	}



	public void setSubject_Name(String subject_Name) {
		this.subject_Name = subject_Name;
	}



	public int getTeacher_id() {
		return teacher_id;
	}



	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}



	public int getSubject_id() {
		return subject_id;
	}



	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}





	


	
	
	
}

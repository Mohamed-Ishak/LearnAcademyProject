package entities;

public class Subject {

	
	private int subjectID;
	private String subName;

	
	
	
	public Subject() {
		super();
	}



	public Subject(int subjectID, String subName) {
		super();
		this.subjectID = subjectID;
		this.subName = subName;
	}



	public int getSubjectID() {
		return subjectID;
	}



	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}



	public String getSubjectName() {
		return subName;
	}



	public void setSubjectName(String subjectName) {
		this.subName = subjectName;
	}





	@Override
	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectName=" + subName+"]";
	}
	
	
	
	
	
}

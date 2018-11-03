import java.util.ArrayList;

public class CourseWithArrayList {
	private String courseName;
	private ArrayList<String> students = new ArrayList<String>();
	
	public CourseWithArrayList(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
	}

	public String getCourseName() {
		return courseName;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void dropStudent(String student) {
		students.remove(student);
	}

}

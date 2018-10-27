import java.util.Arrays;

public class Course {
	private String courseName;
	private String[] students = new String[30];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		
		if(numberOfStudents >= students.length) {
			String [] newStudents = new String[students.length * 2];
			System.arraycopy(students, 0, newStudents, 0, students.length);
			students = newStudents;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String string) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(string)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
	}
}
		public String increaseStudents() {
		    if (numberOfStudents >= students.length) {
		        String[] temp = new String[students.length * 2];
		        System.arraycopy(students, 0, temp, 0, students.length);
		        students = temp;
		    }
}

	public int clear(){
		for (int i1 = 0; i1 < numberOfStudents; i1 ++){
			students [i1] = null;
			    }
			    numberOfStudents = 0;
			    return;
	}
		}
}
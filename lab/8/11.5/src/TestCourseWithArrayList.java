import java.util.ArrayList;

public class TestCourseWithArrayList {
	public static void main(String[] args) {
		CourseWithArrayList course1 = new CourseWithArrayList("Software Dev");
		course1.addStudent("Jason Wilson");
		course1.addStudent("James Grant");
		course1.addStudent("Mary Sue");
		System.out.print("The students in the" +course1.getCourseName() + "are: " + course1.getStudents());
		System.out.print("\n");
		System.out.print("The size of the class is: " + course1.getNumberOfStudents());
		
		course1.dropStudent("Jason Wilson");
		System.out.print("\n");
		System.out.print("The students in "+ course1.getCourseName()  +" are: " + course1.getStudents());
		System.out.print("\n");
		System.out.print("The size of the class is: " + course1.getNumberOfStudents());
	}
}

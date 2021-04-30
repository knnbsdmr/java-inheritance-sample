package inheritance2;

public class StudentManager {
	public void JoinCourse(User student, Course course) {
		System.out.println("Joined " + course.getCourseName() + " by " + student.getFullName());
	}
}

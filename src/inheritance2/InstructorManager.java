package inheritance2;

public class InstructorManager {
	
	public void tellCource(User instructor, Course course) {
		if (course.getLevel() < course.getStage()) {
			course.setLevel(course.getLevel() + 1);
			System.out.println(instructor.getFullName() + " told to " + course.getCourseName());
		} else {
			System.out.println("Course already completed");
		}
	}
	
}

package inheritance2;

public class Main {

	public static void main(String[] args) {
		Course javaCourse = new Course(1, "Java", "Java Kampı", 10);
		
		UserManager userManager = new UserManager();
		User kenan = userManager.Add(new User(1, "Kenan", "Başdemir"));
		User engin = userManager.Add(new User(2, "Engin", "Demiroğ"));

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.tellCource(engin, javaCourse);
		
		StudentManager studentManager = new StudentManager();
		studentManager.JoinCourse(kenan, javaCourse);
	}

}

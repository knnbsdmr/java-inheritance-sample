package inheritance2;

public class Instructor extends User {
	@Override
	public void sayWelcome() {
		System.out.println("Welcome Instructor: " + getFullName());
	}
}

package inheritance2;

public class Student extends User {
	@Override
	public void sayWelcome() {
		System.out.println("Welcome Student: " + getFullName());
	}
}

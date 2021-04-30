package inheritance2;

public class Course {
	private int id;
	private String courseName;
	private String description;
	private int stage;
	private int level;
	
	public Course(int id, String courseName, String description, int stage) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.description = description;
		this.stage = stage;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int stage) {
		this.stage = stage;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}

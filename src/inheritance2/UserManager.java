package inheritance2;

public class UserManager {
	
	User[] users;
	
	public UserManager() {
		users = new User[100];
	}
	
	public User GetById(int id) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].getId() == id) {
				return users[i];
			}
		}
		return null;
	}
	
	public User Add(User addedUser) {
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				users[i] = addedUser;
				break;
			}
		}
		return addedUser;
	}
	
	public void Delete(User deletedUser) {
		for (int i = 0; i < users.length; i++) {
			if (users[i].getId() == deletedUser.getId()) {
				users[i] = null;
				break;
			}
		}
	}
	
}

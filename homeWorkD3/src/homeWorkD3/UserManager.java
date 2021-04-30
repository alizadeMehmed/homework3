package homeWorkD3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getName() + "eklendi");
	}

	public void multipleAdd(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
}

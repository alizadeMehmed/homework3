package homeWorkD3;

public class StudentManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getName() + " isimli öðrenci eklendi");
	}

	public void List() {
		System.out.println("Öðrenciler Listelendi");
	}

}

package homeWorkD3;

public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getName() + " isimli e�itmen eklendi");

	}

	public void dersBelirle(Instructor instructor) {
		System.out.println(instructor.getName() + " i�in ders olu�turuldu");
	}

	public void topluDersBelirle(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			dersBelirle(instructor);
		}
	}
}

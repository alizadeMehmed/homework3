package homeWorkD3;

public class InstructorManager extends UserManager {

	public void add(User user) {
		System.out.println(user.getName() + " isimli eðitmen eklendi");

	}

	public void dersBelirle(Instructor instructor) {
		System.out.println(instructor.getName() + " için ders oluþturuldu");
	}

	public void topluDersBelirle(Instructor[] instructors) {
		for (Instructor instructor : instructors) {
			dersBelirle(instructor);
		}
	}
}

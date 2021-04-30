package homeWorkD3;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Mehmet");
		student1.setEmail("abc@email.com");
		student1.setAlinanDers("C#- ANGULAR");

		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setName("Engin Demiroð");
		instructor1.setEmail("cd@email.com");
		instructor1.setVerilenDers("C#- ANGULAR");
		

		Instructor instructor2 = new Instructor();
		instructor2.setId(3);
		instructor2.setName("Ahmet");
		instructor2.setEmail("cd@email.com");
		instructor2.setVerilenDers("C#- ANGULAR");
		

		Student student2 = new Student();
		student2.setId(4);
		student2.setName("Ayþe");
		student2.setEmail("ayse@email.com");
		student2.setAlinanDers("C#- ANGULAR");
		
		
		Student[] students = { student1, student2 };
		Instructor[] instructors = { instructor1, instructor2 };

		StudentManager studentManager = new StudentManager();
		studentManager.List();
		studentManager.multipleAdd(students);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.multipleAdd(instructors);
		instructorManager.topluDersBelirle(instructors);

	}

}

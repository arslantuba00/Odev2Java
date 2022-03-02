package homework_two;

public class Client {

	public static void main(String[] args) {
		
		Instructor user1 = new Instructor();
		user1.set_id(1);
		user1.set_userName("Mahmut Tuncer");
		user1.set_userPassword("HalayaGel_63");
		
		String[] avaiableCourses = {"Delilo","Raks","Lolo"};
		
		user1.set_courses(avaiableCourses);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(user1);
		instructorManager.giveCourse(user1,avaiableCourses);
		
		
		
		Student user2 = new Student();
		user2.set_id(2);
		user2.set_userName("Eti Popkek");
		user2.set_courses(avaiableCourses);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(user2);
		studentManager.training(user2,avaiableCourses);
		
	
		
		
	
	}

}

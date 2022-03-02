package homework_two;

public class InstructorManager  extends UserManager
{
	
	public void giveCourse(Instructor instructor,String[] courses)
	{
		System.out.println(instructor.get_userName() + " isimli eðitmen ders verdi.");
		
		for (String course : courses) 
		{
			System.out.println(course + " dersi verildi.");
			
		}
	}
	

}

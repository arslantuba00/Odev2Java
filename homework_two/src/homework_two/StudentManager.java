package homework_two;

public class StudentManager extends UserManager 
{
	public void training(Student student,String[] course)
	{
		System.out.println(student.get_userName() + " isimli �grenci ders ald�.");
		
		for (String kurs : course) 
		{
			System.out.println(kurs + " dersi al�nd�.");
			
		}
	}

}

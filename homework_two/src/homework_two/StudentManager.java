package homework_two;

public class StudentManager extends UserManager 
{
	public void training(Student student,String[] course)
	{
		System.out.println(student.get_userName() + " isimli ögrenci ders aldı.");
		
		for (String kurs : course) 
		{
			System.out.println(kurs + " dersi alındı.");
			
		}
	}

}

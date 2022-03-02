package homework_two;

public class User 
{
	 protected int _id;
	 protected String _userName;
	 
	 protected String _userPassword;
	 protected String[] _courses;
	 
	public String[] get_courses() {
		
		return _courses;
	}
	public void set_courses(String[] _courses) {
		
		this._courses = _courses;
	}
	public int get_id() {
		
		return _id;
	}
	public void set_id(int id) {
		
		_id = id;
	}
	public String get_userName() {
		
		return _userName;
	}
	public void set_userName(String userName) {
		
		_userName = userName;
	}
	
	public void set_userPassword(String userPassword) {
		
		_userPassword = userPassword;
	}
	

		
	}
	 
	 
	



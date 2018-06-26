package test.oop.student;
import java.util.Date;
public class Student {
	int id;
	String Fname;
	String Lname;
	Date DOB;
	
	Student ()
	{
		id = 0;
		Fname = null;
		Lname = null;
		DOB = null;
	}
	
	Student (int idd, String Fnamee, String Lnamee, Date DOBe)
	{
		id = idd;
		Fname = Fnamee;
		Lname = Lnamee;
		DOB = DOBe;
	}
	
	
	
	public void enrollment()
	{
		System.out.println("This the Enrollment Method");
	}
	
	public void withdraw()
	{
		
		System.out.println("This the Withdraw Method");
	}
	
	public void payment()
	{
		
		System.out.println("This the Payment Method");
	}
}

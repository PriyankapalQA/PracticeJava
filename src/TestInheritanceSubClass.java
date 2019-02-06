
public class TestInheritanceSubClass extends TestInheritanceSuperClass implements TestInterface
{
	String empname;
	String empDetails;
	String ratignComments;
	int rating;
	
	TestInheritanceSubClass()
	{
		System.out.println("In Super class Constructor");
				
	}
	
	TestInheritanceSubClass(int a)
	{
		super(a);
		System.out.println("In Super class Constructor: "+a);
	}
	
	TestInheritanceSubClass(String aa, String bb,String cc,int r)
	{
		empname =aa;
		empDetails=bb;
		ratignComments=cc;
		rating=r;
	}
	
	
	
	public void Test()
	{
	//	super.Test();
		System.out.println("In super class");
	}  
	
	public void printRating()
	{
		System.out.println("Rating for "+empname+" is: "+rating);
		System.out.println("Rating comments: "+ratignComments);
		System.out.println("Rating help: ");
		System.out.println("First Rating is :"+First);
		System.out.println("Second Rating is :"+Second);
		System.out.println("Third Rating is :"+Third);
		System.out.println("Fouth Rating is :"+Fouth);
		System.out.println("Fifth Rating is :"+Fifth);
	}
	

}


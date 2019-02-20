
public class compareString {
	public static void main(String args[])
	{
	
	String a = "Geoos";
	String b = "Geobbbs";

	if (a.length() != b.length())
		System.out.println("The strings "+a+" and "+b+" are not equal in size");
	/*	System.out.println("The strings "+a+" is bigger than "+b+" by "+(a.length()-b.length())+" characters");
	else if (a.length() < b.length())
		System.out.println("The strings "+b+" is bigger than "+a+" by "+(b.length()-a.length())+" characters"); */
	else
	{
		boolean flagEqual = true;
	for (int i=0; i<a.length() && i<b.length();i++)
	{
		if(a.charAt(i)==(b.charAt(i)))
			continue;
		else
		{
			System.out.println("The strings "+a+" and "+b+"  are not equal");
			flagEqual=false;
			break;
		}
		
	}
	if (flagEqual==true)
		System.out.println("The strings "+a+" and "+b+"  are equal");
	
	}

	}
}

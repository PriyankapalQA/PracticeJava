
public class Practice {

	public static void main(String args[])
	{
	/*	int a[] = {98,88,99,18,32,43,94,75};
		Practice1 obj= new Practice1();
		obj.printArray(a,"Before Sort");
		int b[] = obj.sortArrayElement(a);
		obj.printArray(b,"After Sort");
		
			System.out.println("Minimum number in array: "+b[0]);
			System.out.println("2nd Minimum number in array: "+b[1]);
			System.out.println("Maximum number in array: "+b[a.length-1]);  */
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

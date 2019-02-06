import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {

	public static void main(String args[])
	{
		ArrayList <String> a = new ArrayList<String>(Arrays.asList("HEllo","Bye","Hi","jungle"));
		System.out.println("Before Reverse: "+a);
		ArrayList <String> rev1 = new ArrayList<String>();
//		ArrayList <String> rev2 = new ArrayList<String>();
		
	for(int i=a.size()-1;i>=0;i--)
	{
	   String aa = a.get(i);
		String rev="";
		for(int j=aa.length()-1;j>=0;j--)
		{
			rev=rev+aa.charAt(j);
			
		}
		rev1.add(rev);
	}
	
	System.out.println("After full Reverse2: "+rev1);
		
	}
	
}

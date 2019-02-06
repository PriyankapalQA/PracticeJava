import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test2 {

	public static void main(String args[])
	{
		Integer a[] = new Integer[10];
		Integer b[] = new Integer[10];
		for (int i=0;i<10;i++)
		{
			a[i]=i+1;
			b[i]=i*2;
		}
		System.out.println(a);
		System.out.println(b);
		
	ArrayList<Integer> al = new ArrayList(Arrays.asList(a));
	ArrayList<Integer> bl = new ArrayList(Arrays.asList(b));
	
	//hello hello  hello
		
	System.out.println(al);
	System.out.println(bl);
	
	for(int aaa : al)
	{
		for(int bbb:bl)
		{
			if (aaa==bbb)
				System.out.println("value matched "+aaa);
		}
	}
	
	Integer element = al.get(0);
	System.out.println("First element: "+element);

	ArrayList<Integer> ab = new ArrayList<Integer>();
	ab.addAll(al);
	ab.addAll(bl);
	System.out.println(ab);
	



	
	}
}

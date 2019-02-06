import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Sort {

	public static void main(String args[])
	{
		//Bubble sort

	//	Integer a[] = {10,16,78,66,22,11,99,91,01,7};
		Integer a[]={2,0,2,0,1,0,1,2,2,0};
		System.out.println("Before sorting: ");
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+",");

		int flag=1;
	while(flag>0)
	{
		flag=0;
		for(int i=0;i<a.length-1;i++)
		{
			if (a[i]>a[i+1])
			{
				flag++;
				int c = a[i];
				a[i]= a[i+1];
				a[i+1]= c;
			}
				
		}
	}
		System.out.println("\nAfter Bubble sorting: ");	
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+","); 
	
		
	//sort with collection 
		
	ArrayList <Integer> al = new ArrayList(Arrays.asList(a));
	
	System.out.println("\nBefore sorting: "+ al);
	
	Collections.sort(al);
		
	System.out.println("After sorting: "+ al);
	
	}

}

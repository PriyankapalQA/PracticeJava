import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class PracticeArrayProblems {

	public static void main(String[] args) {

Integer a[] = new Integer[100];

for (int i=0;i<100;i++)
	a[i]=i+1;
	
ArrayList<Integer> al= new ArrayList<Integer>(Arrays.asList(a));
	Collections.sort(al);
	
	

Integer	aa[]= (Integer[])al.toArray(new Integer[100]);

aa[91]=0;
	
//	for (int i=0;i<100;i++)
//		System.out.println("the array is: "+a[i]);
	
	for (int j=0;j<100;j++)
	{
			if(a[j]!=aa[j])
			{
				System.out.println("the first missing number is: "+a[j]);
				break;
			}
		
	}
	

	}

}

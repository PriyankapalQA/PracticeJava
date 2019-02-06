
public class SortArrayByNumbers {
	
	public static void main(String args[])
	{
		int a[]={27,05,20,70,41,99,10,26,21,01};
		
		System.out.println("Before sorting: ");
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+",");
	
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j]= a[i];
					a[i]= temp;
				//	break;
				}
			}

		}
		
		System.out.println("\nAfter sorting: ");	
		for(int j=0;j<a.length;j++)
			System.out.print(a[j]+","); 
	}

}

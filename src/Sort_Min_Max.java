
public class Sort_Min_Max {

	public static void main(String args[])
	{

		int a[] = {8,88,99,18,32,43,94,75};
		System.out.print("Array before: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");	


		for (int j=0;j<a.length;j++)
		{

			for(int i=j+1;i<a.length;i++)
			{
				if(a[j]>a[i])
				{
					int c = a[j];
					a[j] = a[i];
					a[i]=c;
				}
			}
		}
		System.out.println("\nMinimum number in array: "+a[0]);
		System.out.println("\n2nd Minimum number in array: "+a[1]);
		System.out.println("\nMaximum number in array: "+a[a.length-1]);

		System.out.print("\nArray after: ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");

	}
}



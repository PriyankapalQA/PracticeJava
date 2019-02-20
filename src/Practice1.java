
public class Practice1 {

		
	public void printArray(int a[],String b)
	{
		System.out.print("\n"+b+": ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");	
		System.out.print("\n");

	}
	
	public int[] sortArrayElement(int a[])
	{
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
		
		return a;
	}
	
}


public class Array_LeftRotation {

public int[] leftRotation(int [] a, int d)
{
	
//	int a[] = {1,2,3,4,5};
//	int d= 4 ;// no of rotation
	System.out.print("Array before left rotation: ");
	for(int i=0;i<a.length;i++)
	   System.out.print(a[i]+" ");
	
	int b;
	
	for (int j=0;j<d;j++)
	{
		int c = a[a.length-1];
	for(int i=a.length-1;i>0;i--)
	{
		b=a[i-1];
		a[i-1]=c;
		c=b;
	}
	a[a.length-1]=c;
	}
	System.out.print("\nArray after left rotation: ");
	for(int i=0;i<a.length;i++)	
		System.out.print(a[i]+" ");

	return a;
	
}
}



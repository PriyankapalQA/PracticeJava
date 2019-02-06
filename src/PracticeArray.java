
public class PracticeArray {

	public static void main(String[] args) {
		int a[]={10,5,8,8,9,10,6,5,4};
for(int j=0;j<a.length-1;j++)		
{	
for(int i=j+1;i<a.length;i++)
{
	if(a[j]==a[i])
	System.out.println(a[j]+" is duplicate");
	
}
}
	
	
	
}

}


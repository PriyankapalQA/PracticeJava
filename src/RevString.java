
public class RevString {
	
	public static void main(String args[])
	{
		String a = "apple.love.push.orange";
		String finalstring ="";
		String[] parts = a.split("\\.");
		for(int i=0; i<parts.length;i++)
		{
			finalstring=finalstring+ reverse(parts[i])+".";
		}
		
		String str = finalstring.substring(0,finalstring.length()-1);
		System.out.println("Brfore reverse: "+ a);
		
		System.out.println("Reversed string: "+ str);
	}
	
	
	public static String reverse(String s)
	{
		//char c[]=s.toCharArray();  
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			//rev=rev+c[i];
			rev=rev+s.charAt(i);
		}
//		System.out.println("Reversed : "+ rev);
		return rev;
		
	}
}

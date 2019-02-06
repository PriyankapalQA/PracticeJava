
public class TestString {
	public static void main(String args[])
	{
		String ss = "A quick brown fox jumps over a lazy dog";
	//	char cc[] = new char[ss.length()];
		
	char[] cc= ss.toCharArray();

	System.out.println("String is: ");
	for(int i=0; i<cc.length;i++)
		System.out.print(cc[i]);
	
//	System.out.println("\n Contains vowels: ");
//	int flag=0;
	int flagA = 0; int flagE = 0; int flagI = 0; int flagO = 0; int flagU = 0;
	
	for (int i=0;i<cc.length;i++)
	{
	/*	if (cc[i]=='a'||cc[i]=='e'||cc[i]=='i'||cc[i]=='o'||cc[i]=='u')
		{
			System.out.print(cc[i]);
			flag++;
		}  */
		
		
	
		switch(cc[i])
		{
			case 'a' : flagA++;
			case 'e' : flagE++;
			case 'i' : flagI++;
			case 'O' : flagO++;
			case 'U' : flagU++;
		}
		
	
	}
	
	System.out.println("\nVowel a present: "+flagA+" times");
	System.out.println("Vowel e present: "+flagE+" times");
	System.out.println("Vowel i present: "+flagI+" times");
	System.out.println("Vowel o present: "+flagO+" times");
	System.out.println("Vowel u present: "+flagU+" times");
	
	}
	

}

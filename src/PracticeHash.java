import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class PracticeHash {

	public static void main(String[] args) {
		
	
	ArrayList<Integer> l1= new ArrayList<Integer>(Arrays.asList(20,88,199,77,20,88,7,55,7));
	System.out.println("duplicate l1 is: "+l1);
	HashSet<Integer> hInt= new HashSet<Integer>(l1);
	System.out.println("non duplicate l1 is: "+hInt);
	///////////OR
	
	int a[]={10,8,199,77,10,8,7,55,7};
	ArrayList<Integer> l2= new ArrayList<Integer>();
	for(int i:a)
		l2.add(i);
	System.out.println("duplicate l2 is: "+l2);
	HashSet<Integer> hInt2= new HashSet<Integer>(l2);
	System.out.println("non duplicate l1 is: "+hInt2);
    
	///////////OR
    String[] data = { "A", "C", "B", "D", "A", "B", "E", "D", "B", "C" };
    List<String> list = Arrays.asList(data);
    
	HashSet<String> hStr= new HashSet<String>(list);
	System.out.println("non duplicate data is: "+hStr);
	
	///////////OR
	 Integer arr[] = { 5, 6, 7, 8, 1, 2, 3, 4, 3 };
	 HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(arr));
	
	 System.out.println("non duplicate set is: "+set);
	}

}

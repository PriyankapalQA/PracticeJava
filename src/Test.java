import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1= new ArrayList<Integer>(Arrays.asList(100,110,500,300,180));
	//	l1.add(10);
		System.out.println(l1);
		
		ArrayList<Integer> l2= new ArrayList<Integer>(Arrays.asList(10,30,50,30,18));
	//	l2.add(20);
		System.out.println(l2);
		
		ArrayList<Integer> l3= new ArrayList<Integer>(Arrays.asList(9,3,4,9,4,5));
	//	l3.add(30);
		System.out.println(l3);

//HEll0
		
	Collections.sort(l1);
	
	System.out.println("sorted"+l1);
	Collections.reverse(l1);
	
	System.out.println("reversed"+l1);
	
	//Swapping 1st(index 0) element with the 3rd(index 2) element
	Collections.swap(l1, 0, 2);
	
	System.out.println("swaped"+l1);
	
	}

}

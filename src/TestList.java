import java.util.List;
import java.util.*;
import java.util.Arrays;


public class TestList {

	public static void main(String[] args) {
	
		
		ArrayList<Integer> li = new ArrayList<Integer>();
	
		li.add(99);
		li.add(88);
		li.add(1,77);  // add 77 at the 1st position
		System.out.println(li);
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(99);
		ll.add(88);
		ll.add(1,77);
				
		
  //boolean y = li.contains(100);
		
//	int a=	li.indexOf(0);
//	li.remove(2);


ll.push(55);
System.out.println(ll);
ll.pop();
System.out.println(ll);


	}

}

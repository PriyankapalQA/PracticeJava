import java.util.HashMap;


public class PracticeMap {

	public static void main(String[] args) {
	
		HashMap<Integer, String>map= new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "cde");
		map.put(3, "efg");
		
		 System.out.println(map.size()); 
		 
		 for (Integer name: map.keySet())
		 {
		     System.out.println(name + " " + map.get(name)); 
		 }
		 
		// for (String a:map.values())
			

}
}
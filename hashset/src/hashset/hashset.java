package hashset;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> mp=new HashMap<>();
		mp.put("China", 180);
		mp.put("India", 120);
		mp.put("London", 80);
		System.out.println(mp);
		
		// keys contains search
		if(mp.containsKey("Indonesia")) {
			System.out.println("Exists");
		}
		else {
			System.out.println("Doesn't exists");
		}
 //value against given key
		System.out.println(mp.get("India"));
		System.out.println(mp.get("Indonesia"));
		
		//iteration
		for(Map.Entry <String,Integer> m: mp.entrySet()) {
		System.out.println(m.getKey());
		System.out.println(m.getValue());
		}
		mp.remove("China");
		
		System.out.println(mp);
	}

}

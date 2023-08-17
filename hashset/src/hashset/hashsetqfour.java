package hashset;
import java.util.*;
public class hashsetqfour {
public static String printStart(HashMap<String,String> tick) {
	HashMap<String,String>revMap=new HashMap<>();
	for(String key : tick.keySet()) {
	//tick hashmap=> key->key , value->tick.get(key)
		revMap.put(tick.get(key),key);
	}
	//for printing starting
	for(String key : tick.keySet()) {
		if(!revMap.containsKey(key)) {
			return key;
		}
	}
	return null;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map=new HashMap<>();
		map.put("Chennai", "Bengaluru");
		map.put("Mumbai", "Delhi");
		map.put("Goa", "Chennai");
		map.put("Delhi", "Goa");
		
		String start = printStart(map);
		while(map.containsKey(start)) {
			System.out.print(start + "->");
			start=map.get(start);
		}
System.out.print(start);
	}

}

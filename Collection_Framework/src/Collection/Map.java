package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		//1. HashMap(key,vaue)
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1, "Ajay");
		System.out.println(hm.get(1));//return value
		
		//2. LinkedHashMap(key,value)
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(1, "Ajay");
		System.out.println(lhm);
		System.out.println(lhm.get(1));
		
		//3. TreeMap(key,value)
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "Ajay");
		System.out.println(tm);
		System.out.println(tm.get(1));
	}
}

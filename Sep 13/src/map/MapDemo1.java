package map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo1 {

	public static void main(String[] args) {
			
		Map<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(121, "java");
		hm.put(121, "updated"); // will be updated to the latest one due to the put
		hm.put(null, "testnull");
		hm.put(null, "testnull");
		hm.put(144, null);
		hm.put(244, null);
		hm.put(777, "jam");
		
		System.out.println("hm ="+hm);
	
		Map<Integer, String> lhm=new LinkedHashMap<Integer, String>(); // Maintains order of insetion
		lhm.put(121, "java");
		lhm.put(121, "updated"); // will be updated to the latest one due to the put
		lhm.put(null, "testnull");
		lhm.put(null, "testnull");
		lhm.put(144, null);
		lhm.put(244, null);
		lhm.put(777, "jam");
		
		System.out.println("lhm ="+lhm);
	
		Map<Integer, String> tm=new TreeMap<Integer, String>(); // sorting to ascending 
		tm.put(121, "java");
		tm.put(121, "updated"); // will be updated to the latest one due to the put
//		tm.put(null, "testnull");
//		tm.put(null, "testnull");
		tm.put(144, null);
		tm.put(244, null);
		tm.put(777, "jam");
		
		System.out.println("tm ="+tm);	
	
		Map<Integer, String> ht=new Hashtable<>();
		ht.put(121, "java");
		ht.put(121, "updated"); // will be updated to the latest one due to the put
//		ht.put(null, "testnull");
//		ht.put(null, "testnull");
//		ht.put(144, null);
//		ht.put(244, null);
		ht.put(777, "jam");
		
		System.out.println("ht ="+ht);
	
		System.out.println(ht.get(144));
		
		System.out.println(hm.containsKey(144));
		System.out.println(ht.containsKey(999));
		System.out.println(ht.containsValue("jam"));
		
		ht.remove(121);
		System.out.println();
		System.out.println(ht.size());
		
		
		System.out.println("Iterating map using keySet()");
		Set<Integer> set=hm.keySet();
		for (Integer i:set) {
			System.out.println("key is" +i+ "value is "+hm.get(i));
		}
		
		System.out.println("Iterating map using entrySet()");
		for(Entry<Integer, String> e:hm.entrySet()) {
			System.out.println("Key -> "+e.getKey() + "Value -> " +e.getValue());
		}
		
	}
}

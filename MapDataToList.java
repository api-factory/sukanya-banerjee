package test;

import java.util.*;


public class MapDataToList {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Delhi");
		map.put(2, "Washington");
		map.put(3, "London");
		
		List<Integer> keyList = new ArrayList(map.keySet());
		List<Integer> valueList = new ArrayList(map.values());
		
		System.out.println("key List:" + keyList);
		System.out.println("Value List:" + valueList);
	}

}

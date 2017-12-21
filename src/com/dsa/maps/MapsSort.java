package com.dsa.maps;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapsSort {

	public static void main(String args[]) {
	      Map<Integer, String> sampleMap = new ConcurrentHashMap<Integer, String>();
	      sampleMap.put(120, "Orange");
	      sampleMap.put(85, "Mango");
	      sampleMap.put(35, "banana");
	      sampleMap.put(98, "Berry");
	      sampleMap.put(44, "Pines");
	     
	      Set<Entry<Integer, String>> set = sampleMap.entrySet();
	      Iterator<Entry<Integer, String>> itr = set.iterator();
	      while(itr.hasNext()){
	    	  Map.Entry<Integer, String> entrySet = (Entry<Integer, String>) itr.next();
	    	  System.out.println(entrySet.getKey());
	    	  System.out.println(entrySet.getValue());
	      }
	      
	      System.out.println("After Sorting: ");
	      
	      sortWithKeys(sampleMap);
	      sortWithValues(sampleMap);
	     
	}

	private static void sortWithValues(Map<Integer, String> sampleMap) {
		LinkedList<Entry<Integer, String>> list = new LinkedList<Entry<Integer, String>>(sampleMap.entrySet());
	      Collections.sort(list, new MapValuesComparator());
	      System.out.println("WRT Values: ");
	      for(Map.Entry<Integer, String> entry: list){
	    	  System.out.println(entry.getKey());
	    	  System.out.println(entry.getValue());
	      }
	}

	private static void sortWithKeys(Map<Integer, String> sampleMap) {
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(sampleMap);
	      
	      Set<Entry<Integer, String>> set2 = treeMap.entrySet();
	      Iterator<Entry<Integer, String>> itr2 = set2.iterator();
	      System.out.println("WRT Keys: ");
	      while(itr2.hasNext()){
	    	  Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr2.next();
	    	  System.out.println(entry.getKey());
	    	  System.out.println(entry.getValue());
	      }
	}
}
package com.dsa.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class MapValuesComparator implements Comparator<Map.Entry<Integer, String>>{

	@Override
	public int compare(Entry<Integer, String> arg0, Entry<Integer, String> arg1) {
		// TODO Auto-generated method stub
		return arg0.getValue().compareTo(arg1.getValue());
	}
	

}

package com.hand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMap implements Way{

	public Map<Integer,List> listToMap(List<Integer> list){

		Map<Integer,List> map = new HashMap<>();
		for(Integer i : list){
			boolean tag = true;
			int key = i / 10;
			for(Map.Entry entry : map.entrySet()){
				int temp = (int) entry.getKey();
				if(temp == key){
					List list1 = map.get(entry.getKey());
					if(!list1.contains(new Integer(i))){
						list1.add(i);
					}
					tag = false;
				}
			}
			if(tag == true){
				List list1 = new ArrayList();
				list1.add(i);
				map.put(key,list1);
			}
		}
		return map;
	}
}

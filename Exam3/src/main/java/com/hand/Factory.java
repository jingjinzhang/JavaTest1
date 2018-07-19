package com.hand;

public class Factory {

	public Way getWays(String way){

		if(way == null){
			return null;
		}
		if(way.equalsIgnoreCase("listToMap")){
			return new ListToMap();
		}else if(way.equalsIgnoreCase("sort")){
			return new Sort();
		}
		return null;
	}
}

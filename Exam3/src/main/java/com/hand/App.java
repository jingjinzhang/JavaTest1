package com.hand;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class App
{
    public static void main( String[] args )
    {
        // 工厂
        Factory factory = new Factory();
        ListToMap listToMap = (ListToMap) factory.getWays("listToMap");
        Sort sort = (Sort) factory.getWays("sort");
        sort.sort(getRandomInteger());
        Map<Integer,List> map = listToMap.listToMap(sort.sort(getRandomInteger()));
        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey()+"=>"+entry.getValue());
        }
    }

    public static List<Integer> getRandomInteger(){

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        random.ints(0,100)
                .limit(50).sorted().forEach((i)-> list.add(i));
        return list;
    }
}

package com.hand;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Integer> lists = new ArrayList<>();
        for(int i = 101; i <= 200; i++){
            boolean temp = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    temp = false;
                }
            }
            if(temp){
                lists.add(i);
            }
        }
        System.out.print("101-200间总共有"+lists.size()+"个素数，分别是:");
        for(int i : lists){
            System.out.print(i+",");
        }
        System.out.println();
    }
}

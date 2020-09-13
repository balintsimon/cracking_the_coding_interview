package com.codecool.tryout;

import java.lang.reflect.Field;
import java.util.*;

public class FindValue {

    public static void main(String[] args) {
//        HashMap<Integer, String> myOwn = new HashMap<Integer, String>(5);
//        myOwn.put(1, "apple");
//        myOwn.put(2, null);
//        myOwn.put(new Integer(3), "peach");
//        myOwn.put(3, "orange");
//        myOwn.put(4, "peach");
//
//        for (String v: myOwn.values()) {
//            if ("orange".equals(v)) {
//                myOwn.put(5, "banana");
//            }
//        }
//        System.out.println(myOwn.get(5));
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 5, 2, 3, 7, 3, 8, 9);

        Integer pos = Integer.valueOf(3);
        list.remove(pos);
        System.out.println(list);
}


}

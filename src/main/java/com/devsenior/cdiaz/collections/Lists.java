package com.devsenior.cdiaz.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Lists {

    public void performDemo() {
        List<Number> list = new LinkedList<>();
        list.add(1);
        list.add(10.0);
        list.add(35L);
        list.add(1, 55f);

        for (var number : list) {
            System.out.println(number);
        }





        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }

        // for (var element : list) {
        //     System.out.println(element);
        // }


        // var list2 = new ArrayList();
        // list2.add("Esto es un nuevo elemento");
        // list2.addAll(list);

        // list.remove(10.0);
        // System.out.println("Eliminando elementos");
        // while (!list.isEmpty()) {
        //     System.out.println(list.removeFirst());
        // }

        // System.out.println("Imprimiendo la lista");
        // System.out.println(list);
        // System.out.println(list2);
    

    }

}

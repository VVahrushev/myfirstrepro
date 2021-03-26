package eu.senla.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main (String[] args)
    {
     /*   MyList<Integer> arr = new MyArrayList<Integer>(10);
        arr.add(1,37);

        arr.add(35,37);
        System.out.println(arr.lastIndexOf(37));
        arr.print();
        Integer i = arr.get(1);
        System.out.println(i);
        i = arr.set(0, 10);
        arr.print();
        System.out.println(i);
        System.out.println(arr.getSize());      */
        MyList<Integer> arr1= new MyArrayList<>(5);
        arr1.add(22);
        arr1.add(3);
        arr1.add(66);
        arr1.add(9);
        arr1.print();
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                if (o1==o2)
                return 0;
                else if (o1>o2) return 1;
                else return -1;
            }
        };
        arr1.sort(comp);
        Iterator<Integer> itr = arr1.Iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }











    }
}

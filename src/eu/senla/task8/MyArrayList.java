package eu.senla.task8;

import java.util.*;

public class MyArrayList<E> implements MyList<E> {
    private final int SIZE = 16;
    private  Object[] ARR=new Object[SIZE];
    private Object TEMP=null;
    public void growARR()
    {
              Object[] ARR1 = new Object[ARR.length*2];
              for (int j = 0; j < ARR.length; j ++)
              ARR1[j]=ARR[j];
              ARR = ARR1;
    }
    public void print()
    {
        for (int i = 0; i < ARR.length; i ++ )
        {
            if(ARR[i]!=null)
            System.out.println("Object : "+ARR[i]+" Position : " + i);
        }
    }
    public int getSize()
    {
        return ARR.length;
    }
    public void add(E obj) {
        if (ARR[ARR.length-1]!=null) growARR();
        for (int i = 0; i < ARR.length; i++) {
            if (ARR[i] == null) {
                ARR[i] = obj;
                return;
            }
        }
    }
    public void add(int index, E obj) {

          while(index>= ARR.length) growARR();
          ARR[index] = obj;
    }

    public boolean addAll(int index, MyList<? extends E> col) {
        TEMP = ARR;
        ARR[index]=col;
        if (TEMP==ARR)
        return true;
        else return false;
    }

    public E get(int index) {
        return (E) ARR[index];
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < ARR.length; i++)
        {
            if (ARR[i]==obj) return i;
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        for (int i = ARR.length-1; i >=0; i--)
        {
            if (ARR[i]==obj) return i;
        }
        return -1;

    }

    public Iterator<E> Iterator() {
        return new Iterator<E>() {
            private int index;
            @Override
            public boolean hasNext() {
                return index != ARR.length-1;
            }
            @Override
            public E next() {
                return (E)ARR[index++];
            }
        };
    }



    static <E> List<E> of(Object[] ARR) {
        List<E> list = new ArrayList<>();
        for(int i = 0; i<ARR.length; i++)
        {
           list.add((E)ARR[i]);
        }
        return list;
    }

    public E remove(int index) {
        TEMP = ARR[index];
        ARR[index]=null;
        return (E)TEMP;
    }

    public E set(int index, E obj) {
        TEMP=ARR[index];
        ARR[index]=obj;
        return (E)TEMP;
    }

    public void sort(Comparator<? super E> comp) {
        Arrays.sort((E[]) ARR, 0, ARR.length-1, comp);
    }

    public List<E> subList(int start, int end) {
        List<E> newARR = new ArrayList<E>();

        for (int i = start,j=0; i <=end; i++,j++)
        {
            newARR.set(j, (E) ARR[i]);
        }
        return newARR;
    }
    public Object[] toArray() {

        return Arrays.copyOf(ARR, ARR.length);
    }

    MyArrayList() {

        ARR = new Object[SIZE];
    }// создает пустой список

    MyArrayList(MyList<? extends E> col) {
        ARR = new Object[col.getSize()];
        for(int i = 0; i<ARR.length; i++)
        {
            ARR[i]=col.toArray()[i];
        }

    } //создает список, в который добавляются всеэлементы коллекции col.

    MyArrayList(int capacity) {
        ARR = new Object[capacity];
    }// создает список, который имеет начальную емкость capacity

}
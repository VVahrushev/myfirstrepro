package eu.senla.task8;

import java.util.*;

public interface MyList<E> {
    void add(int index, E obj);// добавляет в список по индексу index объект obj
    boolean addAll(int index, MyList<? extends E> col);// добавляет в список по индексу index всеэлементы коллекции col. Если в результате добавления список был изменен, товозвращается true, иначе возвращается false
    E get(int index);// возвращает объект из списка по индексу index
    int indexOf(Object obj);// возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
    int lastIndexOf(Object obj);// возвращает индекс последнего вхождения объекта obj в список.Если объект не найден, то возвращается -1
    Iterator<E> Iterator ();// возвращает объект ListIterator для обхода элементов списка
    public int getSize();
    static <E> List<E> of()// создает из набора элементов объект List
    {
        return null;
    }
    public Object[] toArray() ;

    E remove(int index);// удаляет объект из списка по индексу index, возвращая при этомудаленный объект
    E set(int index, E obj);// присваивает значение объекта obj элементу, который находится поиндексу index
    void sort(Comparator<? super E> comp);// сортирует список с помощью компаратора comp
    List<E> subList(int start, int end);
    void print();

    void add(E i);
}

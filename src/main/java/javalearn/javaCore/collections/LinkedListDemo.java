package javalearn.javaCore.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public final int COUNT = 5_000_000;

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        System.out.println("get index 5-- " + linkedList.get(5));
        linkedList.add(5,99);
        System.out.println("Size of list " + linkedList.size());
        System.out.println("get index 5-- " + linkedList.get(5));
        linkedList.set(5,88);
        System.out.println("get index 5-- " + linkedList.get(5));
        linkedList.remove(5);
        System.out.println("Size " + linkedList.size());
        fillList(linkedList,9);
    }

    static public void fillList(List<Integer> list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(i);
        }
    }
}

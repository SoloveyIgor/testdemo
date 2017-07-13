package javaCore.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Igor on 11.07.2017.
 */
public class MyDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.add(1);
        deque.offer(4);
        System.out.println(deque.getLast());
    }
}
